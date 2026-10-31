package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k9y implements s9y {
    public final ax70 a;

    public k9y(ax70 ax70Var) {
        this.a = ax70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9y) && this.a.equals(((k9y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
