package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qlc0 {
    public final Object a;
    public final Object b;
    public final Object c;

    public qlc0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean a() {
        return this.c != wdu0.P0;
    }

    public final boolean b() {
        return this.b != wdu0.P0;
    }

    public final Object c() {
        return this.c;
    }

    public final Object d() {
        return this.b;
    }

    public final Object e() {
        return this.a;
    }

    public final qlc0 f(Object obj) {
        return new qlc0(this.a, this.b, obj);
    }

    public final qlc0 g(Object obj) {
        return new qlc0(this.a, obj, this.c);
    }

    public final qlc0 h(Object obj) {
        return new qlc0(obj, this.b, this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qlc0(Object obj) {
        wdu0 wdu0Var = wdu0.P0;
        this(obj, wdu0Var, wdu0Var);
    }

    public qlc0(Object obj, Object obj2) {
        this(obj, obj2, wdu0.P0);
    }
}
