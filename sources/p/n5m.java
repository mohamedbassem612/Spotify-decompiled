package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n5m extends g6m {
    public final String a;
    public final String b;

    public n5m(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5m)) {
            return false;
        }
        n5m n5mVar = (n5m) obj;
        return this.a.equals(n5mVar.a) && this.b.equals(n5mVar.b);
    }

    public final int hashCode() {
        return cy30.d(this.a.hashCode() * 31, 961, this.b);
    }
}
