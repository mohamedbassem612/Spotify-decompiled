package p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ks3 implements hs3 {
    public final om3 a;
    public final Scheduler b;
    public final Scheduler c;
    public final bpb1 d;
    public final xe01 e;
    public final Handler f;
    public final bpb1 g;
    public final xe01 h;
    public MobiusLoop i;
    public volatile fn3 j;
    public volatile ro41 k;
    public volatile String l;

    public ks3(om3 om3Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = om3Var;
        this.b = scheduler;
        this.c = scheduler2;
        fn3 fn3Var = fn3.e;
        bpb1 bpb1VarB = gio1.b(new ls3(fn3Var.a, fn3Var.b, fn3Var.c));
        this.d = bpb1VarB;
        this.e = d5p1.h(bpb1VarB);
        this.f = new Handler(Looper.getMainLooper());
        bpb1 bpb1VarB2 = gio1.b((Object) null);
        this.g = bpb1VarB2;
        this.h = d5p1.h(bpb1VarB2);
    }

    public final void a(ip41 ip41Var) {
        MobiusLoop mobiusLoop = this.i;
        if (mobiusLoop != null) {
            mobiusLoop.a(new sm3(ip41Var));
        }
    }

    public final xe01 b() {
        return this.h;
    }

    public final xe01 c() {
        return this.e;
    }

    public final void d(String str) {
        MobiusLoop mobiusLoop = this.i;
        if (mobiusLoop != null) {
            mobiusLoop.a(new xm3(str));
        }
    }
}
