package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nlw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qlw a;
    public final /* synthetic */ String b;
    public final /* synthetic */ iu30 c;

    public nlw(qlw qlwVar, String str, iu30 iu30Var) {
        this.a = qlwVar;
        this.b = str;
        this.c = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        llw llwVar;
        if (onmVar instanceof llw) {
            llwVar = (llw) onmVar;
            int i = llwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                llwVar.b = i - Integer.MIN_VALUE;
            } else {
                llwVar = new llw(this, onmVar);
            }
        } else {
            llwVar = new llw(this, onmVar);
        }
        Object obj2 = llwVar.a;
        int i2 = llwVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            Set set = ((gip0) obj).a;
            qlw qlwVar = this.a;
            tf2 tf2Var = new tf2(hu20.e(h4p1.l(new plw(set, qlwVar, this.c, null)), new qd0((byte) 16, qlwVar, this.b, (lnm) null)), (byte) 9);
            mlw mlwVar = new mlw(r261Var, (byte) 0);
            llwVar.b = 1;
            Object objCollect = tf2Var.collect(mlwVar, llwVar);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
