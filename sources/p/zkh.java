package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zkh implements hlh {
    public final int a;
    public final String b;

    public zkh(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkh)) {
            return false;
        }
        zkh zkhVar = (zkh) obj;
        return this.a == zkhVar.a && this.b.equals(zkhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + xcg1.g(Integer.hashCode(this.a) * 31, 31, false);
    }
}
