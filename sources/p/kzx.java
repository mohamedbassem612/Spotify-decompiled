package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class kzx {
    public static final jzx Companion = new jzx();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ kzx(int i, String str, String str2, String str3, String str4) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, izx.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "cenc";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "/widevine-license/v1/video/license";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzx)) {
            return false;
        }
        kzx kzxVar = (kzx) obj;
        return u890.j(this.a, kzxVar.a) && u890.j(this.b, kzxVar.b) && u890.j(this.c, kzxVar.c) && u890.j(this.d, kzxVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
