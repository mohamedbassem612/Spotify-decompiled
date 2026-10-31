package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x980 extends t380 {
    public final int c(int i, Object[] objArr) {
        return b().c(i, objArr);
    }

    public abstract Object get(int i);

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final mjh1 iterator() {
        return b().r(0);
    }

    public final b380 r() {
        return new w980(this);
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
