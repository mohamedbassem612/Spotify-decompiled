package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sn1 implements qvy0 {
    public static final Parcelable.Creator<sn1> CREATOR = new d41((byte) 18);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public sn1(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn1)) {
            return false;
        }
        sn1 sn1Var = (sn1) obj;
        return this.a == sn1Var.a && u890.j(this.b, sn1Var.b) && u890.j(this.c, sn1Var.c) && u890.j(this.d, sn1Var.d) && u890.j(this.e, sn1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // p.qvy0
    public final int t0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
