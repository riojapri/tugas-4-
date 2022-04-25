package id.ac.uinsgd.springbootforgotpw.forgotPW.service.implementation;

import id.ac.uinsgd.springbootforgotpw.forgotPW.entity.PasswordResetToken;
import id.ac.uinsgd.springbootforgotpw.forgotPW.repository.PasswordResetTokenRepository;
import id.ac.uinsgd.springbootforgotpw.forgotPW.service.framework.PasswordResetTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordResetTokenServiceImpl implements PasswordResetTokenService {
    public final PasswordResetTokenRepository passwordResetTokenRepository;

    @Autowired
    public PasswordResetTokenServiceImpl (PasswordResetTokenRepository passwordResetTokenRepository) {
        this.passwordResetTokenRepository = passwordResetTokenRepository;
    }

    @Override
    public PasswordResetToken findByToken(String token) {
        return passwordResetTokenRepository.findByToken(token).orElse(null);
    }

    @Override
    public PasswordResetToken save(PasswordResetToken passwordResetToken) {
        return passwordResetTokenRepository.save(passwordResetToken);
    }
}
