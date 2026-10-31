package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class irr0 implements Parcelable {
    public static final Parcelable.Creator<irr0> CREATOR = new elr0((byte) 25);
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    public irr0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irr0)) {
            return false;
        }
        irr0 irr0Var = (irr0) obj;
        return u890.j(this.a, irr0Var.a) && this.b == irr0Var.b && u890.j(this.c, irr0Var.c) && u890.j(this.d, irr0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
