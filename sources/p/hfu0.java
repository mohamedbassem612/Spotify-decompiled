package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hfu0 implements Parcelable {
    public static final Parcelable.Creator<hfu0> CREATOR = new brt0((byte) 15);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public hfu0(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof hfu0)) {
            return false;
        }
        hfu0 hfu0Var = (hfu0) obj;
        return u890.j(this.a, hfu0Var.a) && u890.j(this.b, hfu0Var.b) && u890.j(this.c, hfu0Var.c) && u890.j(this.d, hfu0Var.d) && u890.j(this.e, hfu0Var.e);
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
