package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r4u {
    public final qiw a;

    public r4u(g4u g4uVar, qiw qiwVar) {
        this.a = new ajn(new AtomicReference(), g4uVar, qiwVar);
    }

    public static r4u a(qiw qiwVar) {
        return new r4u(new jah((byte) 12), qiwVar);
    }

    public static r4u b(List list) {
        return new r4u(new ofr((byte) 27), new p4u(new ArrayList(list)));
    }

    public static r4u c(r4u... r4uVarArr) {
        return b(Arrays.asList(r4uVarArr));
    }

    public static r4u d(av30 av30Var, r4u r4uVar) {
        return new r4u(new uk4(r4uVar, av30Var, (byte) 21));
    }

    public final synchronized void e(Object obj) {
        this.a.v(obj);
    }

    public r4u(uk4 uk4Var) {
        this.a = uk4Var;
    }
}
