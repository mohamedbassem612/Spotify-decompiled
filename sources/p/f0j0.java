package p;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f0j0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MessageInputView b;

    public /* synthetic */ f0j0(MessageInputView messageInputView, byte b) {
        this.a = b;
        this.b = messageInputView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        MessageInputView messageInputView = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                InputMethodManager inputMethodManager = (InputMethodManager) messageInputView.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(messageInputView.getWindowToken(), 0);
                }
                break;
            default:
                InputMethodManager inputMethodManager2 = (InputMethodManager) messageInputView.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager2 != null) {
                    inputMethodManager2.showSoftInput((EditText) messageInputView.T0.b, 1);
                }
                break;
        }
    }
}
