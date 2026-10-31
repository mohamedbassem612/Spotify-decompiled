package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gi8 extends hi8 {
    public final ug8 a;

    public gi8(ug8 ug8Var) {
        this.a = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi8) && this.a.equals(((gi8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
