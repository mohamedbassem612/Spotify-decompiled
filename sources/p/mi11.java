package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mi11 implements wpw {
    public static final Set i = Collections.singleton("mft_disallow");
    public final Flowable a;
    public final xbu0 b;
    public final kvs0 c;
    public final t8r0 d;
    public final poy0 f;
    public final PublishProcessor e = new PublishProcessor();
    public final nsw g = jch0.j(new ki11(this, (byte) 1));
    public final ia00 h = n3o1.q(this).a(rw01.U0, rw01.V0);

    public mi11(Flowable flowable, xbu0 xbu0Var, kvs0 kvs0Var, t8r0 t8r0Var) {
        this.a = flowable;
        this.b = xbu0Var;
        this.c = kvs0Var;
        this.d = t8r0Var;
        this.f = y3o1.Y(flowable, fd11.V0, new fk01(this, (byte) 4), new ak01(this, (byte) 15), 8);
    }

    public final rqw a() {
        return this.h;
    }

    public final rsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
