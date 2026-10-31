package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iqe0 extends qqe0 {
    public final czo1 a;

    public iqe0(czo1 czo1Var) {
        this.a = czo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqe0) && this.a.equals(((iqe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
