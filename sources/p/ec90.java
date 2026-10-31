package p;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ec90 {
    public final en31 a;
    public final bvg1 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final el70 e;
    public final el70 f;
    public final ro30 g;
    public final Object h;

    public ec90(en31 en31Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = en31Var;
        bvg1 bvg1Var = new bvg1(en31Var, linkedHashMap, linkedHashMap2, strArr, en31Var.k, new v6a(1, this, ec90.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 5));
        this.b = bvg1Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new el70(this, (byte) 3);
        this.f = new el70(this, (byte) 4);
        this.g = new ro30(en31Var);
        this.h = new Object();
        bvg1Var.k = new g030(this, (byte) 10);
    }

    public final Object a(a8d1 a8d1Var) throws Throwable {
        Object objF = this.b.f(a8d1Var);
        return objF == d9n.a ? objF : rih1.a;
    }
}
