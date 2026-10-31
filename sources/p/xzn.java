package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xzn implements a0o {
    public final String a;

    public xzn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzn) && u890.j(this.a, ((xzn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
