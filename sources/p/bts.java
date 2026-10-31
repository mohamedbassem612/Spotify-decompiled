package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bts {
    public final iyr0 a;

    public bts(iyr0 iyr0Var) {
        this.a = iyr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bts) && this.a == ((bts) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
