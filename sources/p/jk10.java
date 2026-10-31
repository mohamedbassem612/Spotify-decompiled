package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jk10 implements Parcelable {
    public static final Parcelable.Creator<jk10> CREATOR = new qn00((byte) 22);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;

    public jk10(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk10)) {
            return false;
        }
        jk10 jk10Var = (jk10) obj;
        return u890.j(this.a, jk10Var.a) && u890.j(this.b, jk10Var.b) && this.c == jk10Var.c && this.d == jk10Var.d && u890.j(this.e, jk10Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        return iK + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        int i2 = this.d;
        if (i2 == 1) {
            str = "HUB_SECTION";
        } else if (i2 == 2) {
            str = "DEEPLINK";
        } else if (i2 == 3) {
            str = "NOTIFICATION";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "UNKNOWN";
        }
        parcel.writeString(str);
        parcel.writeString(this.e);
    }
}
