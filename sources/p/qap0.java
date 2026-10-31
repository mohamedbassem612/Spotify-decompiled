package p;

import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qap0 extends hab0 implements Function0 {
    public final /* synthetic */ rbp0 N0;
    public final /* synthetic */ rbp0 O0;
    public final /* synthetic */ vcp0 P0;
    public final /* synthetic */ vcp0 Q0;
    public final /* synthetic */ rbp0 X;
    public final /* synthetic */ rbp0 Y;
    public final /* synthetic */ vcp0 Z;
    public final /* synthetic */ y52 a;
    public final /* synthetic */ vcp0 b;
    public final /* synthetic */ vcp0 c;
    public final /* synthetic */ vcp0 d;
    public final /* synthetic */ vcp0 e;
    public final /* synthetic */ rbp0 f;
    public final /* synthetic */ vcp0 g;
    public final /* synthetic */ vcp0 h;
    public final /* synthetic */ vcp0 i;
    public final /* synthetic */ rbp0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qap0(y52 y52Var, vcp0 vcp0Var, vcp0 vcp0Var2, vcp0 vcp0Var3, vcp0 vcp0Var4, rbp0 rbp0Var, vcp0 vcp0Var5, vcp0 vcp0Var6, vcp0 vcp0Var7, rbp0 rbp0Var2, rbp0 rbp0Var3, rbp0 rbp0Var4, vcp0 vcp0Var8, rbp0 rbp0Var5, rbp0 rbp0Var6, vcp0 vcp0Var9, vcp0 vcp0Var10) {
        super(0);
        this.a = y52Var;
        this.b = vcp0Var;
        this.c = vcp0Var2;
        this.d = vcp0Var3;
        this.e = vcp0Var4;
        this.f = rbp0Var;
        this.g = vcp0Var5;
        this.h = vcp0Var6;
        this.i = vcp0Var7;
        this.t = rbp0Var2;
        this.X = rbp0Var3;
        this.Y = rbp0Var4;
        this.Z = vcp0Var8;
        this.N0 = rbp0Var5;
        this.O0 = rbp0Var6;
        this.P0 = vcp0Var9;
        this.Q0 = vcp0Var10;
    }

    public final Object invoke() {
        Set set = (Set) this.a.invoke();
        mw7 mw7Var = (mw7) this.b.invoke();
        this.c.invoke();
        this.d.invoke();
        c3s c3sVar = (c3s) this.e.invoke();
        this.f.invoke();
        return zso1.B(new uw0(set, mw7Var, c3sVar, (Observable) this.g.invoke(), (Scheduler) this.h.invoke(), (fnh0) this.i.invoke(), (v5u0) this.t.invoke(), (muz) this.X.invoke(), (tau0) this.Y.invoke(), (Flowable) this.Z.invoke(), (RxRouter) this.N0.invoke(), (inh0) this.O0.invoke(), (sf0) this.P0.invoke(), (m54) this.Q0.invoke()));
    }
}
