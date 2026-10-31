package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fwd {
    public final String a;

    public fwd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwd) && u890.j(this.a, ((fwd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
