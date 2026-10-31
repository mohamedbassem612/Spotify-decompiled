package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jbl implements kbl {
    public final int a;
    public final String b;

    public jbl(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbl)) {
            return false;
        }
        jbl jblVar = (jbl) obj;
        return this.a == jblVar.a && u890.j(this.b, jblVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
