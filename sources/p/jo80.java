package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jo80 implements jly0, ynb0 {
    public final Object a;

    public jo80(Object obj) {
        this.a = obj;
    }

    public static jo80 a(Object obj) {
        c8o.j(obj, "instance cannot be null");
        return new jo80(obj);
    }

    @Override // p.kly0
    public final Object get() {
        return this.a;
    }
}
