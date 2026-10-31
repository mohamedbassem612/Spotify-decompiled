package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hje1 {
    public final y1t0 a;

    public hje1(y1t0 y1t0Var) {
        this.a = y1t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hje1) && this.a == ((hje1) obj).a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1920357533;
    }
}
