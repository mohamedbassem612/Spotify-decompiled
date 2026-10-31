package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ox71 implements vx71 {
    public final String a;
    public final String b;
    public final boolean c;

    public ox71(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox71)) {
            return false;
        }
        ox71 ox71Var = (ox71) obj;
        return this.a.equals(ox71Var.a) && u890.j(this.b, ox71Var.b) && this.c == ox71Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
