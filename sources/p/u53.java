package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u53 {
    public final myv0 a;

    public u53(myv0 myv0Var) {
        this.a = myv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u53) && this.a.equals(((u53) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
