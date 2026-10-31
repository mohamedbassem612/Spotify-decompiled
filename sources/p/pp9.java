package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pp9 implements vp9 {
    public final op9 a;

    public pp9(op9 op9Var) {
        this.a = op9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pp9) && this.a.equals(((pp9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
