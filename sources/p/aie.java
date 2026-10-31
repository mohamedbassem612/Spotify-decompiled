package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aie implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kl1 a;

    public aie(kl1 kl1Var) {
        this.a = kl1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        zhe zheVar;
        mr20 ld2Var;
        if (onmVar instanceof zhe) {
            zheVar = (zhe) onmVar;
            int i = zheVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zheVar.b = i - Integer.MIN_VALUE;
            } else {
                zheVar = new zhe(this, onmVar);
            }
        } else {
            zheVar = new zhe(this, onmVar);
        }
        Object obj2 = zheVar.a;
        int i2 = zheVar.b;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        String str = ((she) obj).a;
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        blc0 blc0Var2 = blc0.ed;
        kl1 kl1Var = this.a;
        if (blc0Var == blc0Var2 || blc0Var == blc0.M3) {
            ld2Var = new ld2(kl1Var.w(new o3r(Collections.singletonList(new l4r(new wlu(rc11.a.b(jo70.class)), 1, dt3.b1, new j4r(new wk3(str, (byte) 4)), dt3.c1)), dt3.d1, false), rih1Var), str, (byte) 2);
        } else {
            ld2Var = new huz(str, (byte) 10);
        }
        lt20 lt20Var = new lt20(new tf2(hu20.e(ld2Var, new g64((lnm) null, kl1Var, (byte) 0)), (byte) 5), new rf2(3, (lnm) null, (byte) 11), (byte) 0);
        k91 k91Var = new k91(r261Var, (byte) 9);
        zheVar.b = 1;
        Object objCollect = lt20Var.collect(k91Var, zheVar);
        d9n d9nVar = d9n.a;
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
