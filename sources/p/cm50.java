package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cm50 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final byte e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public cm50(String str, int i, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = z;
    }

    public static cm50 a(cm50 cm50Var, boolean z) {
        return new cm50(cm50Var.a, cm50Var.e, cm50Var.b, cm50Var.c, z, cm50Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm50)) {
            return false;
        }
        cm50 cm50Var = (cm50) obj;
        return u890.j(this.a, cm50Var.a) && u890.j(this.b, cm50Var.b) && u890.j(this.c, cm50Var.c) && u890.j(this.d, cm50Var.d) && this.e == cm50Var.e && this.f == cm50Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.f) + kaa0.f(this.e, cy30.d(cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
