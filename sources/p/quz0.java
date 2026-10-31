package p;

import android.content.Context;
import android.view.View;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class quz0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t01 b;

    public /* synthetic */ quz0(t01 t01Var, byte b) {
        this.a = b;
        this.b = t01Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        t01 t01Var = this.b;
        switch (b) {
            case 0:
                zuz0 zuz0Var = (zuz0) obj;
                if (!zuz0Var.b) {
                    n830 n830VarU = t01Var.u();
                    PrimaryButtonView primaryButtonView = (PrimaryButtonView) n830VarU.h;
                    n830VarU.b = false;
                    n830VarU.c(zuz0Var, false);
                    primaryButtonView.setOnClickListener(new nuz0((fsl) n830VarU.i, (byte) 0));
                    primaryButtonView.setText(((Context) n830VarU.d).getString(2131960843));
                    primaryButtonView.setVisibility(0);
                } else {
                    n830 n830VarU2 = t01Var.u();
                    PrimaryButtonView primaryButtonView2 = (PrimaryButtonView) n830VarU2.h;
                    n830VarU2.b = true;
                    n830VarU2.c(zuz0Var, true);
                    fsl fslVar = (fsl) n830VarU2.i;
                    primaryButtonView2.setOnClickListener(new nuz0(fslVar, (byte) 1));
                    primaryButtonView2.setText(((Context) n830VarU2.d).getString(2131960855));
                    Integer num = ((muz0) fslVar.c).d;
                    if (!((num != null ? num.intValue() : zuz0Var.c) > 0)) {
                        primaryButtonView2.setVisibility(8);
                    } else {
                        primaryButtonView2.setVisibility(0);
                    }
                }
                break;
            default:
                n830 n830VarU3 = t01Var.u();
                ((kt91) ((fsl) n830VarU3.i).e).k(new er91((fs91) null, ((Context) n830VarU3.d).getString(2131960842), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }
}
