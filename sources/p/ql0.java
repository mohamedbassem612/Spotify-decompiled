package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ql0 implements rl0 {
    public final gax a;

    public ql0(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql0) && this.a.equals(((ql0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
