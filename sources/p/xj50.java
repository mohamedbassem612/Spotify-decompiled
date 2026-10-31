package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xj50 implements Parcelable {
    public static final Parcelable.Creator<xj50> CREATOR = new n750((byte) 26);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Long e;
    public final String f;

    public xj50(Long l, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = l;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj50)) {
            return false;
        }
        xj50 xj50Var = (xj50) obj;
        return u890.j(this.a, xj50Var.a) && u890.j(this.b, xj50Var.b) && u890.j(this.c, xj50Var.c) && this.d == xj50Var.d && u890.j(this.e, xj50Var.e) && u890.j(this.f, xj50Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Long l = this.e;
        return this.f.hashCode() + ((iG + (l != null ? l.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Long l = this.e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        parcel.writeString(this.f);
    }
}
