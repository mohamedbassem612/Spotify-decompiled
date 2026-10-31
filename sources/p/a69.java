package p;

import android.content.ClipData;
import android.util.Pair;
import android.view.View;
import com.spotify.login.adaptiveauthentication.challenge.smscode.HiddenOtpEditText;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a69 implements y7q0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ a69(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final ful a(View view, ful fulVar) {
        ful fulVar2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (fulVar.a.getSource() == 4 && (fulVar2 = (ful) fulVar.b(mm10.Q0).first) != null) {
                    ClipData clipDataE = fulVar2.a.e();
                    if (clipDataE.getItemCount() > 0) {
                        ((iu30) obj).invoke(clipDataE.getItemAt(0).getText().toString());
                    }
                }
                break;
            default:
                Pair pairB = fulVar.b(b610.e);
                pairB.toString();
                ful fulVar3 = (ful) pairB.first;
                if (fulVar3 != null) {
                    ClipData clipDataE2 = fulVar3.a.e();
                    if (clipDataE2.getItemCount() > 0) {
                        CharSequence text = clipDataE2.getItemAt(0).getText();
                        Objects.toString(text);
                        tym0 tym0Var = ((HiddenOtpEditText) obj).h;
                        if (tym0Var != null) {
                            String string = text.toString();
                            OtpInputView otpInputView = (OtpInputView) tym0Var.b;
                            int i = OtpInputView.N0;
                            otpInputView.e(string);
                        }
                    }
                }
                break;
        }
        return fulVar;
    }
}
