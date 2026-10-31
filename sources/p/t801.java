package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t801 extends hab0 implements vu30 {
    public final /* synthetic */ u801 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t801(u801 u801Var) {
        super(2);
        this.a = u801Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        k8g1 k8g1Var = ((r801) obj).X;
        pim pimVar = new pim(k8g1Var.b, k8g1Var.t);
        u801 u801Var = this.a;
        l901 l901Var = u801Var.e;
        d0r d0rVar = u801Var.d;
        z9p z9pVar = (z9p) l901Var.g.a.c;
        b5s0 b5s0Var = (b5s0) ((v801) z9pVar.k).m.get();
        c8o.l(b5s0Var);
        zuf zufVar = (zuf) ((v801) z9pVar.k).n.get();
        c8o.l(zufVar);
        q8n q8nVar = (q8n) ((v801) z9pVar.k).f.get();
        c8o.l(q8nVar);
        s5s0 s5s0Var = new s5s0(k8g1Var, b5s0Var, zufVar, q8nVar);
        z9p z9pVar2 = (z9p) l901Var.h.a.c;
        tag1 tag1Var = (tag1) ((jly0) z9pVar2.c).get();
        luk lukVarA = ((v801) z9pVar2.k).a();
        c8o.l(lukVarA);
        boolean zC = new j55(lukVarA).c();
        q8n q8nVar2 = (q8n) ((v801) z9pVar2.k).e.get();
        c8o.l(q8nVar2);
        gng1 gng1Var = new gng1(k8g1Var, d0rVar, tag1Var, zC, q8nVar2);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        k901 k901Var = new k901(l901Var, (byte) 0);
        Scheduler scheduler = l901Var.d;
        subtypeEffectHandlerBuilderC.d(x801.class, k901Var, scheduler);
        subtypeEffectHandlerBuilderC.d(y801.class, new z0u0(l901Var, pimVar, (byte) 7), scheduler);
        subtypeEffectHandlerBuilderC.d(z801.class, new k901(l901Var, (byte) 1), scheduler);
        return Mobius.d(j901.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).c(s5s0Var, new EventSource[]{gng1Var});
    }
}
