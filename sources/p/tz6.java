package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tz6 implements wz6 {
    public final hg10 a;

    public tz6(hg10 hg10Var) {
        this.a = hg10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz6) && this.a == ((tz6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
