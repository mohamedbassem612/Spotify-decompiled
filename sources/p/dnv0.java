package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dnv0 extends env0 {
    public static final Parcelable.Creator<dnv0> CREATOR = new g0v0((byte) 10);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dnv0(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof dnv0)) {
            return false;
        }
        dnv0 dnv0Var = (dnv0) obj;
        return u890.j(this.a, dnv0Var.a) && u890.j(this.b, dnv0Var.b) && u890.j(this.c, dnv0Var.c) && u890.j(this.d, dnv0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
