package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ca41 implements qvy0 {
    public static final Parcelable.Creator<ca41> CREATOR = new xw31((byte) 19);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ca41(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca41)) {
            return false;
        }
        ca41 ca41Var = (ca41) obj;
        return this.a == ca41Var.a && u890.j(this.b, ca41Var.b) && u890.j(this.c, ca41Var.c) && u890.j(this.d, ca41Var.d) && u890.j(this.e, ca41Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final int t0() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
