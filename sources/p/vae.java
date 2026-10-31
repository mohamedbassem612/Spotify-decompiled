package p;

import android.app.Dialog;
import android.content.DialogInterface;
import android.webkit.JsResult;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import io.reactivex.rxjava3.subjects.SingleSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vae implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public vae(o0g1 o0g1Var, wcr wcrVar) {
        this.a = (byte) 5;
        this.b = o0g1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        p521 p521Var = p521.b;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((db) obj).invoke(yae.b);
                break;
            case 1:
                ((y0o) ((goq) obj).c).invoke(brg0.a);
                break;
            case 2:
                ((AuthorizationActivity) ((hur) obj).b).o0(new dr8(nhz.N0, (String) null, (String) null));
                break;
            case 3:
                q2u.a((ohd) obj, g621.c);
                break;
            case 4:
                t2u t2uVar = (t2u) obj;
                Dialog dialog = t2uVar.Q1;
                if (dialog != null) {
                    t2uVar.onCancel(dialog);
                }
                break;
            case 5:
                o0g1 o0g1Var = (o0g1) obj;
                i8h1 i8h1Var = (i8h1) o0g1Var.d;
                rrk0 rrk0Var = (rrk0) o0g1Var.e;
                rrk0Var.getClass();
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), rrk0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 6:
                ((k2v0) obj).invoke();
                break;
            case 7:
                ez01 ez01Var = (ez01) obj;
                ez01Var.c.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), ez01Var.g.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 8:
                ((i521) obj).invoke(p521Var);
                break;
            case 9:
                ((i521) obj).invoke(p521Var);
                break;
            case 10:
                ((Function0) obj).invoke();
                break;
            case 11:
                ((wgb) ((mzr0) obj).g).c();
                break;
            case 12:
                ((SingleSubject) obj).onSuccess(qc31.c);
                break;
            case 13:
                ((yt91) obj).d = null;
                break;
            case 14:
                ((hij1) obj).invoke(h331.c);
                break;
            default:
                ((JsResult) obj).cancel();
                break;
        }
    }

    public /* synthetic */ vae(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
