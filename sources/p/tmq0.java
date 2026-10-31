package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tmq0 implements Parcelable {
    public static final Parcelable.Creator<tmq0> CREATOR = new p7q0((byte) 13);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tmq0(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof tmq0)) {
            return false;
        }
        tmq0 tmq0Var = (tmq0) obj;
        return u890.j(this.a, tmq0Var.a) && u890.j(this.b, tmq0Var.b) && u890.j(this.c, tmq0Var.c) && u890.j(this.d, tmq0Var.d) && u890.j(this.e, tmq0Var.e);
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
