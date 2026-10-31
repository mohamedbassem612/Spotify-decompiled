package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jyz implements k700 {
    public final String a;
    public final String b;

    public jyz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyz)) {
            return false;
        }
        jyz jyzVar = (jyz) obj;
        return u890.j(this.a, jyzVar.a) && u890.j(this.b, jyzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
