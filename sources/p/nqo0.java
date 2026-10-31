package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nqo0 implements rqo0 {
    public final String a;

    public nqo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqo0) && u890.j(this.a, ((nqo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
