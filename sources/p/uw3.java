package p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uw3 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ax3 a;

    public uw3(ax3 ax3Var) {
        this.a = ax3Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        View.OnClickListener cg1Var;
        er91 er91Var;
        tw3 tw3Var = (tw3) obj;
        int iR = cbp1.r(tw3Var.j);
        String str2 = tw3Var.i;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-gen-alpha-parental-control-make-allowlisting-request-bottom-sheet";
        x6h1VarI.f = "1.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = s7l0.g(iR);
        x6h1VarI.d = str2;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("parental-control/make-allowlisting-request");
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
        boolean z = tw3Var.k;
        wqk0 wqk0Var = new wqk0(z ? 1 : 2, str2, r6h1Var2, (byte) 17);
        ax3 ax3Var = this.a;
        Resources resources = ax3Var.e;
        if (z) {
            er91Var = new er91((fs91) null, resources.getString(2131952299), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        } else {
            String string = resources.getString(2131952300);
            if (ax3Var.g.b.i()) {
                String string2 = resources.getString(2131952301);
                cg1Var = new cg1(ax3Var, wqk0Var, (byte) 5);
                str = string2;
            } else {
                str = null;
                cg1Var = null;
            }
            er91Var = new er91((fs91) null, string, (Integer) null, str, (Integer) null, cg1Var, (cvr) null, (xq91) null, false);
        }
        ax3Var.d.d.c.getLifecycle().a(new zw3(ax3Var, er91Var, wqk0Var, (byte) 0));
        ax3Var.c.a(ixb.c);
        return rih1.a;
    }
}
