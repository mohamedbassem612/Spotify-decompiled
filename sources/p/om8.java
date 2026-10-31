package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class om8 extends pm8 {
    public final ug8 a;

    public om8(ug8 ug8Var) {
        this.a = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om8) && this.a.equals(((om8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
