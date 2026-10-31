package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class as7 {
    public final sr7 a;

    public as7(sr7 sr7Var) {
        this.a = sr7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as7) && this.a.equals(((as7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
