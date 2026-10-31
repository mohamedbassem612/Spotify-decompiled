package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b361 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ r35 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ iu30 c;

    public b361(r35 r35Var, Context context, iu30 iu30Var) {
        this.a = r35Var;
        this.b = context;
        this.c = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        a361 a361Var;
        g361 g361Var;
        if (onmVar instanceof a361) {
            a361Var = (a361) onmVar;
            int i = a361Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                a361Var.b = i - Integer.MIN_VALUE;
            } else {
                a361Var = new a361(this, onmVar);
            }
        } else {
            a361Var = new a361(this, onmVar);
        }
        a361 a361Var2 = a361Var;
        Object obj2 = a361Var2.a;
        int i2 = a361Var2.b;
        if (i2 == 0) {
            hm5.M(obj2);
            g361Var = (g361) obj;
            s361 s361Var = g361Var.c;
            String strConcat = s361Var.a.concat(g361Var.a);
            String str = s361Var.b;
            xkg0 xkg0Var = new xkg0();
            xkg0Var.put("pt", g361Var.b);
            xkg0Var.put("locale", this.b.getResources().getConfiguration().getLocales().get(0).getLanguage());
            xkg0Var.putAll(s361Var.f);
            a6j0 a6j0Var = new a6j0(strConcat, str, (String) null, (String) null, (dqi1) null, xkg0Var.b(), (o371) null, 92);
            String str2 = s361Var.c;
            String str3 = s361Var.d;
            String str4 = s361Var.e;
            String str5 = g361Var.d;
            a361Var2.d = g361Var;
            a361Var2.b = 1;
            Object objA = this.a.a(this.b, a6j0Var, str2, str3, str4, str5, a361Var2);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g361Var = a361Var2.d;
            hm5.M(obj2);
        }
        this.c.invoke(g361Var.b);
        return rih1.a;
    }
}
