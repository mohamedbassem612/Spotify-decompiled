package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class od8 implements Parcelable {
    public static final Parcelable.Creator<od8> CREATOR = new bu7((byte) 16);
    public final String a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public od8(String str, double d, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = d;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od8)) {
            return false;
        }
        od8 od8Var = (od8) obj;
        return u890.j(this.a, od8Var.a) && Double.compare(this.b, od8Var.b) == 0 && u890.j(this.c, od8Var.c) && u890.j(this.d, od8Var.d) && u890.j(this.e, od8Var.e) && u890.j(this.f, od8Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(xcg1.e(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeDouble(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
