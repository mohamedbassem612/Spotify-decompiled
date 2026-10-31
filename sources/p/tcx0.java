package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tcx0 implements Parcelable {
    public static final Parcelable.Creator<tcx0> CREATOR = new agm0((byte) 10);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tcx0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcx0)) {
            return false;
        }
        tcx0 tcx0Var = (tcx0) obj;
        return u890.j(this.a, tcx0Var.a) && u890.j(this.b, tcx0Var.b) && u890.j(this.c, tcx0Var.c) && u890.j(this.d, tcx0Var.d) && u890.j(this.e, tcx0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
