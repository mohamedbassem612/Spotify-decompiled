package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k6g implements p6g {
    public final String a;
    public final int b;

    public k6g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6g)) {
            return false;
        }
        k6g k6gVar = (k6g) obj;
        return u890.j(this.a, k6gVar.a) && this.b == k6gVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
