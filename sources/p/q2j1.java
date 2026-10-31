package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q2j1 extends d0p1 {
    public final zb90 c;

    public q2j1(zb90 zb90Var) {
        this.c = zb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2j1) && this.c.equals(((q2j1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
