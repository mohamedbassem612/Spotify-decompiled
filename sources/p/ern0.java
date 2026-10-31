package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ern0 extends irn0 {
    public final s4b1 a;

    public ern0(s4b1 s4b1Var) {
        this.a = s4b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ern0) && u890.j(this.a, ((ern0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
