package git.artdeell.cubic.authenticator;

import androidx.annotation.NonNull;

import git.artdeell.cubic.authenticator.listener.LoginListener;
import git.artdeell.cubic.authenticator.accounts.Account;

public interface BackgroundLogin {
    void createAccount(@NonNull LoginListener loginListener, String code);
    void refreshAccount(@NonNull LoginListener loginListener, Account account);
    interface Creator {
        BackgroundLogin create();
    }
}
