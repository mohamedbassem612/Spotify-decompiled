package p;

import android.view.View;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import io.reactivex.rxjava3.processors.UnicastProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oja implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oja(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                pja pjaVar = (pja) obj;
                String str = ((hja) pjaVar.d.get(i)).f;
                m0o m0oVar = pjaVar.f;
                if (m0oVar != null) {
                    m0oVar.invoke(str);
                    return;
                }
                return;
            case 1:
                p1f0 p1f0Var = ((zug0) obj).U0;
                cvg0 cvg0Var = (cvg0) p1f0Var.b;
                if (i != 0) {
                    if (i != 1) {
                        hhg1.n("Unsupported view type");
                        return;
                    } else {
                        bvg0 bvg0Var = (bvg0) cvg0Var;
                        bvg0Var.j1(3, new avg0(bvg0Var, (byte) 0));
                        return;
                    }
                }
                yge0 yge0Var = (yge0) p1f0Var.a;
                String str2 = (String) p1f0Var.c;
                String str3 = (String) p1f0Var.d;
                ((cyg0) yge0Var.c).d((String) null, (String) p1f0Var.e);
                yge0Var.j("optout_artist", "", str2, str3);
                bvg0 bvg0Var2 = (bvg0) cvg0Var;
                bvg0Var2.V();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958196});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131958196, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                kt91 kt91Var = bvg0Var2.X1;
                if (kt91Var != null) {
                    kt91Var.o(er91Var);
                    return;
                } else {
                    u890.C("snackbarManager");
                    throw null;
                }
            case 2:
                int i2 = OtpInputView.N0;
                ((OtpInputView) obj).a(i);
                return;
            default:
                qmr qmrVar = (qmr) ((an) obj).g;
                if (qmrVar != null) {
                    mxr mxrVar = (mxr) qmrVar.b;
                    my71 my71Var = (my71) mxrVar.d;
                    if (my71Var != null) {
                        my71Var.invoke(new iwa1(i));
                    }
                    mxr mxrVar2 = (mxr) mxrVar.a;
                    ((UnicastProcessor) mxrVar2.d).onNext(new vss(mxrVar2, i, (byte) 0));
                    return;
                }
                return;
        }
    }
}
