package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xo2 implements Parcelable {
    public static final Parcelable.Creator<xo2> CREATOR = new ue2((byte) 20);
    public final String a;
    public final String b;
    public final String c;

    public xo2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo2)) {
            return false;
        }
        xo2 xo2Var = (xo2) obj;
        return u890.j(this.a, xo2Var.a) && u890.j(this.b, xo2Var.b) && u890.j(this.c, xo2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
