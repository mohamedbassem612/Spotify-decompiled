package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class sgp0 {
    public Object a;

    public sgp0(Object obj) {
        this.a = obj;
    }

    public final void c(mma0 mma0Var, Object obj, Object obj2) {
        Object obj3 = this.a;
        b();
        this.a = obj2;
        a(mma0Var, obj3, obj2);
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }

    public void b() {
    }

    public void a(mma0 mma0Var, Object obj, Object obj2) {
    }
}
