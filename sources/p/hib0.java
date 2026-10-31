package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hib0 implements Parcelable {
    public static final Parcelable.Creator<hib0> CREATOR = new jca0((byte) 26);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public hib0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hib0)) {
            return false;
        }
        hib0 hib0Var = (hib0) obj;
        return u890.j(this.a, hib0Var.a) && u890.j(this.b, hib0Var.b) && u890.j(this.c, hib0Var.c) && u890.j(this.d, hib0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
