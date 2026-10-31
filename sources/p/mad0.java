package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mad0 implements pad0 {
    public static final Parcelable.Creator<mad0> CREATOR = new lad0((byte) 0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public mad0(Long l, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    public final Long C() {
        return this.e;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mad0)) {
            return false;
        }
        mad0 mad0Var = (mad0) obj;
        return u890.j(this.a, mad0Var.a) && u890.j(this.b, mad0Var.b) && u890.j(this.c, mad0Var.c) && u890.j(this.d, mad0Var.d) && u890.j(this.e, mad0Var.e);
    }

    public final String getContextUri() {
        return this.d;
    }

    public final String getEntityUri() {
        return this.c;
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final boolean i() {
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Long l = this.e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }
}
