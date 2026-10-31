package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class njb implements ojb {
    public final ug41 a;

    public njb(ug41 ug41Var) {
        this.a = ug41Var;
    }

    public final ug41 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njb) && this.a.equals(((njb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
