package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p6e implements q6e {
    public final String a;

    public p6e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6e) && u890.j(this.a, ((p6e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
