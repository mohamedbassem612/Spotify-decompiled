package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cp90 {
    public final String a;
    public final String b;
    public final String c;

    public cp90(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp90)) {
            return false;
        }
        cp90 cp90Var = (cp90) obj;
        return u890.j(this.a, cp90Var.a) && u890.j(this.b, cp90Var.b) && u890.j(this.c, cp90Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
