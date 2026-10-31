package p;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.spotify.login.adaptiveauthentication.challenge.smscode.HiddenOtpEditText;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i860 extends InputConnectionWrapper {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i860(HiddenOtpEditText hiddenOtpEditText, h4x h4xVar) {
        super(h4xVar, true);
        this.b = hiddenOtpEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        switch (this.a) {
            case 0:
                Objects.toString(charSequence);
                tym0 tym0Var = ((HiddenOtpEditText) this.b).h;
                if (tym0Var != null) {
                    String strValueOf = String.valueOf(charSequence);
                    OtpInputView otpInputView = (OtpInputView) tym0Var.b;
                    int i2 = OtpInputView.N0;
                    otpInputView.e(strValueOf);
                }
                break;
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        switch (this.a) {
            case 0:
                tym0 tym0Var = ((HiddenOtpEditText) this.b).h;
                if (tym0Var == null || i <= 0) {
                    return false;
                }
                tym0Var.i();
                return true;
            default:
                return super.deleteSurroundingText(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        Object[] objArr;
        ResultReceiver resultReceiver;
        switch (this.a) {
            case 1:
                gi80 gi80Var = (gi80) this.b;
                boolean zG = false;
                zG = false;
                zG = false;
                zG = false;
                if (bundle != null) {
                    if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                        objArr = false;
                    } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                        objArr = true;
                    }
                    try {
                        resultReceiver = (ResultReceiver) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                        try {
                            Uri uri = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                            Uri uri2 = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                            int i = bundle.getInt(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                            Bundle bundle2 = (Bundle) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                            if (uri != null && clipDescription != null) {
                                zG = gi80Var.g(new jl00(uri, clipDescription, uri2), i, bundle2);
                            }
                            if (resultReceiver != null) {
                                resultReceiver.send(zG ? 1 : 0, null);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (resultReceiver != null) {
                                resultReceiver.send(0, null);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        resultReceiver = null;
                    }
                    break;
                }
                if (zG) {
                    return true;
                }
                return super.performPrivateCommand(str, bundle);
            default:
                return super.performPrivateCommand(str, bundle);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        tym0 tym0Var;
        switch (this.a) {
            case 0:
                if (keyEvent.getAction() == 0) {
                    HiddenOtpEditText hiddenOtpEditText = (HiddenOtpEditText) this.b;
                    int keyCode = keyEvent.getKeyCode();
                    String[] strArr = HiddenOtpEditText.i;
                    if ((keyCode == 67 && (tym0Var = hiddenOtpEditText.h) != null) ? tym0Var.i() : false) {
                        return true;
                    }
                }
                return super.sendKeyEvent(keyEvent);
            default:
                return super.sendKeyEvent(keyEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i860(InputConnection inputConnection, gi80 gi80Var) {
        super(inputConnection, false);
        this.b = gi80Var;
    }
}
