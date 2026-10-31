package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s7t0 implements Parcelable {
    public static final Parcelable.Creator<s7t0> CREATOR = new r7t0((byte) 0);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public s7t0(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = i;
        this.b = str;
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
        if (!(obj instanceof s7t0)) {
            return false;
        }
        s7t0 s7t0Var = (s7t0) obj;
        return this.a == s7t0Var.a && u890.j(this.b, s7t0Var.b) && u890.j(this.c, s7t0Var.c) && u890.j(this.d, s7t0Var.d) && u890.j(this.e, s7t0Var.e) && u890.j(this.f, s7t0Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iD = cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
