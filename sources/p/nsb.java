package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nsb implements qsb {
    public final ta0 a;

    public nsb(ta0 ta0Var) {
        this.a = ta0Var;
    }

    public final ta0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nsb) && u890.j(this.a, ((nsb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
