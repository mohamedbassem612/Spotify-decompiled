package p;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class krq0 implements ActionMode.Callback {
    public final /* synthetic */ OtpInputView a;

    public krq0(OtpInputView otpInputView) {
        this.a = otpInputView;
    }

    public final String a() {
        ClipData.Item itemAt;
        OtpInputView otpInputView = this.a;
        ClipboardManager clipboardManager = otpInputView.g;
        CharSequence text = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null) {
            text = itemAt.getText();
        }
        return otpInputView.i(String.valueOf(text));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        String strA = a();
        if (strA == null) {
            return false;
        }
        OtpInputView otpInputView = this.a;
        otpInputView.a(otpInputView.h - 1);
        int i = otpInputView.h;
        for (int i2 = 0; i2 < i; i2++) {
            otpInputView.h(i2, String.valueOf(strA.charAt(i2)));
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (a() == null) {
            return false;
        }
        menu.clear();
        menu.add(R.string.paste);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
