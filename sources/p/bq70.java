package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class bq70 {
    public static final rp70 Companion = new rp70();
    public final String a;
    public final String b;
    public final uga0 c;

    public /* synthetic */ bq70(int i, String str, String str2, uga0 uga0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = uga0Var;
        }
    }

    public final ld70 a() {
        Parcelable.Creator<ld70> creator = ld70.CREATOR;
        return eyo1.i(this.a, this.b, kyo1.v(this.c, true));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq70)) {
            return false;
        }
        bq70 bq70Var = (bq70) obj;
        return u890.j(this.a, bq70Var.a) && u890.j(this.b, bq70Var.b) && u890.j(this.c, bq70Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        uga0 uga0Var = this.c;
        return iHashCode2 + (uga0Var != null ? uga0Var.a.hashCode() : 0);
    }
}
