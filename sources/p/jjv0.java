package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jjv0 implements wpw {
    public final /* synthetic */ byte a;
    public final poy0 b;
    public final ia00 c;
    public final nsw d;

    public jjv0(String str, yfx yfxVar, a1q a1qVar, kdy0 kdy0Var, kv00 kv00Var, pzn0 pzn0Var, d78 d78Var, ef4 ef4Var) {
        this.a = (byte) 0;
        this.b = c2p1.n(new hzu0(kdy0Var, a1qVar, (byte) 12), o5v0.e1, vbv0.g, new gdv(a1qVar, ef4Var.c(), d78Var, kv00Var, str, pzn0Var), 8);
        this.c = n3o1.q(this).a(gou0.a1, new pm6(str, (byte) 5));
        this.d = jch0.j(new ixt0(yfxVar, (byte) 5));
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public jjv0(Flowable flowable, FlowableMap flowableMap) {
        this.a = (byte) 1;
        this.b = y3o1.X(new hf31(flowableMap, flowable, (byte) 25), th51.P0, jh31.b1, (iu30) null, 24);
        this.c = n3o1.q(this).a(v451.X0, v451.Y0);
        this.d = jch0.j(new z821(this, (byte) 20));
    }
}
