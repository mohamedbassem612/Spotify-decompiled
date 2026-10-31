package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jhw implements giw {
    public final k12 a;

    public jhw(k12 k12Var) {
        this.a = k12Var;
    }

    public final k12 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhw) && this.a == ((jhw) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
