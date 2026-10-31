package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l12 implements n12 {
    public static final Parcelable.Creator<l12> CREATOR = new ev1((byte) 12);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public l12(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final String D() {
        return this.c;
    }

    public final int M0() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0024  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof l12) {
                l12 l12Var = (l12) obj;
                if (this.a == l12Var.a && this.b == l12Var.b) {
                    String str = l12Var.c;
                    String str2 = this.c;
                    if (str2 == null) {
                        if (str == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str == null) {
                        zEquals = false;
                    } else {
                        zEquals = str2.equals(str);
                    }
                    if (zEquals && u890.j(this.d, l12Var.d) && u890.j(this.e, l12Var.e)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, l1d.C(this.a) * 31, 31);
        String str = this.c;
        return this.e.hashCode() + cy30.d((iK + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final int u() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(kk0.x(this.a));
        parcel.writeString(kk0.w(this.b));
        String str = this.c;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
