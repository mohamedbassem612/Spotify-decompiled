package p;

import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sl60 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public sl60(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sl60.class == obj.getClass()) {
            sl60 sl60Var = (sl60) obj;
            if (this.a == sl60Var.a && this.b == sl60Var.b && TextUtils.equals(this.c, sl60Var.c) && TextUtils.equals(this.d, sl60Var.d) && TextUtils.equals(this.e, sl60Var.e) && TextUtils.equals(this.f, sl60Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
