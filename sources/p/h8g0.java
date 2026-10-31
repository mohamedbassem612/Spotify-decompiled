package p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h8g0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8g0 a;

    public h8g0(q8g0 q8g0Var) {
        this.a = q8g0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ur00 ur00Var = this.a.b;
        String str = ((d8g0) obj).e;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-gen-alpha-parental-control-managed-account-allowlisting-requests";
        x6h1VarI.f = "1.1.1";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        List listSingletonList = Collections.singletonList("parental-control/review-allowlisting-requests");
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("allowlisting_action_succeeded_snackbar", "decline_request", (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        i8h1 i8h1Var = (i8h1) ((idd1) ur00Var.f).getValue();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA2;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = listSingletonList;
        i8h1Var.f(k7h1Var.a(), (Set) null);
        ((kt91) ur00Var.d).k(new er91((fs91) null, ((Resources) ur00Var.c).getString(2131952316), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
