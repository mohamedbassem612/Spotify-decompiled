package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z3a1 implements h4a1 {
    public final hr90 a;

    public z3a1(hr90 hr90Var) {
        this.a = hr90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3a1) && this.a == ((z3a1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
