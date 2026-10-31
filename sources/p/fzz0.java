package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fzz0 implements izz0 {
    public final String a;

    public fzz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzz0) && u890.j(this.a, ((fzz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
