package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z081 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public z081(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z081)) {
            return false;
        }
        z081 z081Var = (z081) obj;
        return this.a.equals(z081Var.a) && this.b.equals(z081Var.b) && this.c.equals(z081Var.c) && this.d.equals(z081Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
