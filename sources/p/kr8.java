package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class kr8 {
    public static final jr8 Companion = new jr8();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ kr8(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, ir8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = "wearables_secure_data_layer";
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr8)) {
            return false;
        }
        kr8 kr8Var = (kr8) obj;
        return u890.j(this.a, kr8Var.a) && u890.j(this.b, kr8Var.b) && u890.j(this.c, kr8Var.c) && u890.j(this.d, kr8Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public kr8(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = "wearables_secure_data_layer";
    }
}
