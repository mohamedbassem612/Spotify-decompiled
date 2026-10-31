package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cia1 implements Parcelable {
    public static final Parcelable.Creator<cia1> CREATOR = new yx81((byte) 24);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final rha1 e;

    public cia1(String str, String str2, String str3, boolean z, rha1 rha1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = rha1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cia1)) {
            return false;
        }
        cia1 cia1Var = (cia1) obj;
        return u890.j(this.a, cia1Var.a) && u890.j(this.b, cia1Var.b) && u890.j(this.c, cia1Var.c) && this.d == cia1Var.d && this.e == cia1Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        rha1 rha1Var = this.e;
        return iG + (rha1Var != null ? rha1Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        rha1 rha1Var = this.e;
        if (rha1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rha1Var.name());
        }
    }
}
