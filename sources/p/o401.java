package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o401 implements n401 {
    public final vmq a;
    public final wmq b;
    public final x981 c;
    public final xmq d;
    public final ymq e;
    public final f601 f;
    public final frd1 g;
    public final sxz0 h;

    public o401(vmq vmqVar, wmq wmqVar, x981 x981Var, xmq xmqVar, ymq ymqVar, f601 f601Var, frd1 frd1Var, sxz0 sxz0Var) {
        this.a = vmqVar;
        this.b = wmqVar;
        this.c = x981Var;
        this.d = xmqVar;
        this.e = ymqVar;
        this.f = f601Var;
        this.g = frd1Var;
        this.h = sxz0Var;
    }

    public final ObservableTransformer a() {
        ak1 ak1Var;
        ak1 ak1Var2;
        ak1 ak1Var3;
        zd1 zd1Var;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        byte b = this.a.a;
        sxz0 sxz0Var = this.h;
        frd1 frd1Var = this.g;
        switch (b) {
            case 0:
                ak1Var = new ak1(sxz0Var, frd1Var, (byte) 0);
                break;
            default:
                ak1Var = new ak1(sxz0Var, frd1Var, (byte) 0);
                break;
        }
        subtypeEffectHandlerBuilderC.g(g401.class, ak1Var);
        subtypeEffectHandlerBuilderC.a(h401.class, new ruz0(this, (byte) 3));
        switch (this.b.a) {
            case 0:
                ak1Var2 = new ak1(sxz0Var, frd1Var, (byte) 1);
                break;
            default:
                ak1Var2 = new ak1(sxz0Var, frd1Var, (byte) 1);
                break;
        }
        subtypeEffectHandlerBuilderC.g(i401.class, ak1Var2);
        switch (this.d.a) {
            case 0:
                ak1Var3 = new ak1(sxz0Var, frd1Var, (byte) 3);
                break;
            default:
                ak1Var3 = new ak1(sxz0Var, frd1Var, (byte) 3);
                break;
        }
        subtypeEffectHandlerBuilderC.g(k401.class, ak1Var3);
        ymq ymqVar = this.e;
        switch (ymqVar.a) {
            case 0:
                Observable observable = (Observable) ((e101) ((f0a) ymqVar.b.c).c).g.get();
                c8o.l(observable);
                zd1Var = new zd1(observable, sxz0Var, frd1Var, (byte) 9);
                break;
            default:
                Observable observable2 = (Observable) ((v001) ((uw0) ymqVar.b.c).d).p.get();
                c8o.l(observable2);
                zd1Var = new zd1(observable2, sxz0Var, frd1Var, (byte) 9);
                break;
        }
        subtypeEffectHandlerBuilderC.g(j401.class, zd1Var);
        subtypeEffectHandlerBuilderC.g(m401.class, this.c);
        return subtypeEffectHandlerBuilderC.h();
    }
}
