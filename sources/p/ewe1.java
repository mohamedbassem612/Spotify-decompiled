package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ewe1 implements fwe1 {
    public final String a;
    public final String b;
    public final int c;

    public ewe1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewe1)) {
            return false;
        }
        ewe1 ewe1Var = (ewe1) obj;
        return this.a.equals(ewe1Var.a) && u890.j(this.b, ewe1Var.b) && this.c == ewe1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
