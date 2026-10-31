package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mx91 implements ox91 {
    public final rx91 a;

    public mx91(rx91 rx91Var) {
        this.a = rx91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mx91) && this.a.equals(((mx91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
