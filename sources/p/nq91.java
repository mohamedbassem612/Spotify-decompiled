package p;

import android.view.View;
import android.widget.Button;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nq91 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qq91 b;

    public /* synthetic */ nq91(qq91 qq91Var, byte b) {
        this.a = b;
        this.b = qq91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qq91 qq91Var = this.b;
        switch (b) {
            case 0:
                kt91 kt91Var = qq91Var.G1;
                if (kt91Var == null) {
                    u890.C("snackbarManager");
                    throw null;
                }
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962607});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131962607, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 1:
                ((OtpInputView) qq91Var.Y0().f).b();
                return;
            default:
                if (((Button) qq91Var.Y0().i).isEnabled()) {
                    lj30 lj30VarN0 = qq91Var.n0();
                    lj30VarN0.b();
                    if (lj30VarN0.e.i.a(w8c0.d)) {
                        ((Button) qq91Var.Y0().i).performClick();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
