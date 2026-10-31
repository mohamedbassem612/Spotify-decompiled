package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xq {
    public final String a;

    public xq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq) && u890.j(this.a, ((xq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
