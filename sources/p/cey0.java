package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class cey0 extends eey0 implements kma0 {
    public cey0(Class cls, String str, String str2, int i) {
        super(lyc.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // p.mma0
    public final jma0 b() {
        return ((kma0) getReflected()).b();
    }

    @Override // p.lyc
    public final qka0 computeReflected() {
        return rc11.a.i(this);
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
