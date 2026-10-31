package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pnd implements wpw {
    public static final blc0[] Z = {blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6};
    public final Context a;
    public final kt91 b;
    public final Flowable c;
    public final pqc1 d;
    public final a7z e;
    public final nqc1 f;
    public final yge0 g;
    public final BehaviorProcessor h = new BehaviorProcessor();
    public final LinkedHashMap i = new LinkedHashMap();
    public final poy0 t = y3o1.X(new nnd(this, (byte) 0), fjd.h, wnb.P0, new nnd(this, (byte) 1), 8);
    public final nsw X = jch0.j(emd.d);
    public final ia00 Y = n3o1.q(this).a(new v08(this, (byte) 5), emd.c);

    public pnd(Context context, kt91 kt91Var, Flowable flowable, pqc1 pqc1Var, a7z a7zVar, nqc1 nqc1Var, yge0 yge0Var) {
        this.a = context;
        this.b = kt91Var;
        this.c = flowable;
        this.d = pqc1Var;
        this.e = a7zVar;
        this.f = nqc1Var;
        this.g = yge0Var;
    }

    public final rqw a() {
        return this.Y;
    }

    public final rsw c() {
        return this.X;
    }

    public final mqw getBehavior() {
        return this.t;
    }
}
