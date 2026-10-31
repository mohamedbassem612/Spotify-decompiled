package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dtc extends ftc {
    public final s9l1 a;

    public dtc(s9l1 s9l1Var) {
        this.a = s9l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtc) && this.a.equals(((dtc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
