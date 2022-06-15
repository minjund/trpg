package com.trpg.trpg.user.service

import com.trpg.trpg.user.model.UserModel
import com.trpg.trpg.user.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class UserServiceimpl constructor(@Autowired private val userRepository: UserRepository) : UserService {

    override fun getAllUser(): List<UserModel>? =
        userRepository.findAllBy()

//    override fun getTemplate(id: Int): UserModel? =
//        templateRepository.findById(id).orElse(null)
//
//    override fun getTemplateByName(name: String): UserModel? {
//        return templateRepository.findByTemplateName(name)
//    }

    @Transactional
    override fun saveUser(userModel: UserModel): UserModel =
        userRepository.save(userModel)
}