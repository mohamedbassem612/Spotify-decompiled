package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mgo0 implements Parcelable {
    public static final Parcelable.Creator<mgo0> CREATOR = new b4o0((byte) 8);
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public mgo0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgo0)) {
            return false;
        }
        mgo0 mgo0Var = (mgo0) obj;
        return u890.j(this.a, mgo0Var.a) && u890.j(this.b, mgo0Var.b) && this.c == mgo0Var.c && u890.j(this.d, mgo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(cfm0.r(this.c));
        parcel.writeString(this.d);
    }
}
