package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hux0 implements Parcelable {
    public static final Parcelable.Creator<hux0> CREATOR = new wvw0((byte) 27);
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ hux0(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this(str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 4) != 0 ? false : z, (i & 32) != 0 ? false : z2);
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
        if (!(obj instanceof hux0)) {
            return false;
        }
        hux0 hux0Var = (hux0) obj;
        return u890.j(this.a, hux0Var.a) && u890.j(this.b, hux0Var.b) && this.c == hux0Var.c && u890.j(this.d, hux0Var.d) && u890.j(this.e, hux0Var.e) && this.f == hux0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iG = xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        int iHashCode2 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public hux0(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = z2;
    }
}
