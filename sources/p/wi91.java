package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wi91 extends zi91 {
    public final nl91 a;

    public wi91(nl91 nl91Var) {
        this.a = nl91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi91) && this.a.equals(((wi91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
