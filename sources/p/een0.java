package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class een0 extends gen0 implements xla0 {
    public een0(Class cls, String str, String str2, int i) {
        super(lyc.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // p.xla0
    public void X(Object obj, Object obj2) {
        c().call(obj, obj2);
    }

    @Override // p.mma0
    public final jma0 b() {
        return ((xla0) getReflected()).b();
    }

    @Override // p.zla0
    public final wla0 c() {
        return ((xla0) getReflected()).c();
    }

    @Override // p.lyc
    public final qka0 computeReflected() {
        return rc11.a.f(this);
    }

    @Override // p.kma0
    public Object get(Object obj) {
        return b().call(obj);
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
