package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nj60 extends rj60 {
    public static final Parcelable.Creator<nj60> CREATOR = new ij60((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nj60(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj60)) {
            return false;
        }
        nj60 nj60Var = (nj60) obj;
        return u890.j(this.a, nj60Var.a) && u890.j(this.b, nj60Var.b) && u890.j(this.c, nj60Var.c) && u890.j(this.d, nj60Var.d);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
