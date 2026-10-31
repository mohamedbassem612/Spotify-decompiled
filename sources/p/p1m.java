package p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p1m {
    public final nzl a;
    public final Scheduler b;
    public final Scheduler c;
    public final bpb1 d;
    public final xe01 e;
    public final bbc f;
    public final mfe g;
    public final Handler h;
    public MobiusLoop i;

    public p1m(nzl nzlVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = nzlVar;
        this.b = scheduler;
        this.c = scheduler2;
        bpb1 bpb1VarB = gio1.b(ro41.O0);
        this.d = bpb1VarB;
        this.e = d5p1.h(bpb1VarB);
        bbc bbcVarA = mno1.a(Integer.MAX_VALUE, 0, 6);
        this.f = bbcVarA;
        this.g = k4p1.B(bbcVarA);
        this.h = new Handler(Looper.getMainLooper());
    }

    public final void a(zzl zzlVar) {
        MobiusLoop mobiusLoop = this.i;
        if (mobiusLoop == null) {
            Logger.k("Content picker event dropped, loop is not running: %s", new Object[]{zzlVar.getClass().getSimpleName()});
        } else {
            mobiusLoop.a(zzlVar);
        }
    }
}
