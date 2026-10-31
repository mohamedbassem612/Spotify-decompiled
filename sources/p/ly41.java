package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ly41 {
    public final yon a;
    public final yon b;
    public final k4e0 c;
    public final o4e0 d;
    public final cz1 e;
    public final phi0 f;
    public final cz1 g;
    public final cz1 h;
    public final cz1 i;
    public final o4e0 j;
    public final bk1 k;
    public final qn1 l;
    public final bk1 m;
    public final yon n;
    public final so o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yon f22p;
    public final g2x0 q;
    public final od30 r;

    public ly41(yon yonVar, yon yonVar2, k4e0 k4e0Var, o4e0 o4e0Var, cz1 cz1Var, phi0 phi0Var, cz1 cz1Var2, cz1 cz1Var3, cz1 cz1Var4, o4e0 o4e0Var2, bk1 bk1Var, qn1 qn1Var, bk1 bk1Var2, yon yonVar3, so soVar, yon yonVar4, g2x0 g2x0Var, od30 od30Var) {
        this.a = yonVar;
        this.b = yonVar2;
        this.c = k4e0Var;
        this.d = o4e0Var;
        this.e = cz1Var;
        this.f = phi0Var;
        this.g = cz1Var2;
        this.h = cz1Var3;
        this.i = cz1Var4;
        this.j = o4e0Var2;
        this.k = bk1Var;
        this.l = qn1Var;
        this.m = bk1Var2;
        this.n = yonVar3;
        this.o = soVar;
        this.f22p = yonVar4;
        this.q = g2x0Var;
        this.r = od30Var;
    }

    public final ObservableTransformer a(Consumer consumer) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        phi0 phi0Var = this.f;
        subtypeEffectHandlerBuilderC.g(sx41.class, (o4e0) phi0Var.d);
        subtypeEffectHandlerBuilderC.c(lx41.class, (vrk1) phi0Var.e);
        subtypeEffectHandlerBuilderC.c(wx41.class, (jkt0) phi0Var.f);
        subtypeEffectHandlerBuilderC.c(gx41.class, this.r);
        subtypeEffectHandlerBuilderC.c(hd51.class, new k1p0(consumer, (byte) 8));
        subtypeEffectHandlerBuilderC.g(ax41.class, this.g);
        subtypeEffectHandlerBuilderC.g(hx41.class, this.c);
        subtypeEffectHandlerBuilderC.g(rx41.class, this.a);
        subtypeEffectHandlerBuilderC.g(qx41.class, this.b);
        subtypeEffectHandlerBuilderC.g(nx41.class, this.n);
        subtypeEffectHandlerBuilderC.g(ex41.class, this.o);
        subtypeEffectHandlerBuilderC.g(mx41.class, this.f22p);
        subtypeEffectHandlerBuilderC.g(px41.class, this.d);
        subtypeEffectHandlerBuilderC.g(ux41.class, this.h);
        subtypeEffectHandlerBuilderC.g(dx41.class, this.i);
        subtypeEffectHandlerBuilderC.g(bx41.class, this.e);
        subtypeEffectHandlerBuilderC.g(ox41.class, this.j);
        subtypeEffectHandlerBuilderC.g(cx41.class, this.k);
        subtypeEffectHandlerBuilderC.g(zw41.class, this.l);
        subtypeEffectHandlerBuilderC.g(yw41.class, this.m);
        subtypeEffectHandlerBuilderC.g(vx41.class, this.q);
        return subtypeEffectHandlerBuilderC.h();
    }
}
