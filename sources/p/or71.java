package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class or71 implements pr71 {
    public final sr71 a;

    public or71(sr71 sr71Var) {
        this.a = sr71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof or71) && this.a.equals(((or71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
