package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n4n {
    public final int a;
    public final String b;

    public n4n(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4n)) {
            return false;
        }
        n4n n4nVar = (n4n) obj;
        return this.a == n4nVar.a && u890.j(this.b, n4nVar.b);
    }

    public final int hashCode() {
        int i = this.a;
        int iC = (i == 0 ? 0 : l1d.C(i)) * 31;
        String str = this.b;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
