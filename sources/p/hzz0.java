package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hzz0 implements izz0 {
    public final String a;

    public hzz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzz0) && u890.j(this.a, ((hzz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
