package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dh61 {
    public final ahv0 a;

    public dh61(ahv0 ahv0Var) {
        this.a = ahv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh61) && this.a == ((dh61) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
