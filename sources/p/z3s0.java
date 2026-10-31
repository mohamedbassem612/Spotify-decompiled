package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z3s0 implements b4s0 {
    public final String a;

    public z3s0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3s0) && this.a.equals(((z3s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
