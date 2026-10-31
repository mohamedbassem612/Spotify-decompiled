package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p8z0 extends z8z0 {
    public final String a;

    public p8z0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8z0) && u890.j(this.a, ((p8z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
