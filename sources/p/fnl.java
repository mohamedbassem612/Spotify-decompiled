package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fnl {
    public final int a;
    public final String b;

    public fnl(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnl)) {
            return false;
        }
        fnl fnlVar = (fnl) obj;
        return this.a == fnlVar.a && u890.j(this.b, fnlVar.b);
    }

    public final int hashCode() {
        int i = this.a;
        int iC = (i == 0 ? 0 : l1d.C(i)) * 31;
        String str = this.b;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
