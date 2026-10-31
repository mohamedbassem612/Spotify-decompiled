package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fab0 implements Parcelable {
    public static final Parcelable.Creator<fab0> CREATOR = new jca0((byte) 16);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final eab0 f;

    public /* synthetic */ fab0(String str, String str2, int i, String str3) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, false, (i & 16) == 0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fab0)) {
            return false;
        }
        fab0 fab0Var = (fab0) obj;
        return u890.j(this.a, fab0Var.a) && u890.j(this.b, fab0Var.b) && u890.j(this.c, fab0Var.c) && this.d == fab0Var.d && this.e == fab0Var.e && u890.j(this.f, fab0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iG = xcg1.g(xcg1.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d), 31, this.e);
        eab0 eab0Var = this.f;
        return iG + (eab0Var != null ? eab0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        eab0 eab0Var = this.f;
        if (eab0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eab0Var.writeToParcel(parcel, i);
        }
    }

    public fab0(String str, String str2, String str3, boolean z, boolean z2, eab0 eab0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = eab0Var;
    }
}
