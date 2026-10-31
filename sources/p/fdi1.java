package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fdi1 implements Parcelable {
    public static final Parcelable.Creator<fdi1> CREATOR = new xbi1((byte) 2);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final yxa0 g;

    public fdi1(String str, String str2, String str3, String str4, int i, int i2, yxa0 yxa0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = yxa0Var;
    }

    public final yxa0 a() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdi1)) {
            return false;
        }
        fdi1 fdi1Var = (fdi1) obj;
        return u890.j(this.a, fdi1Var.a) && u890.j(this.b, fdi1Var.b) && u890.j(this.c, fdi1Var.c) && u890.j(this.d, fdi1Var.d) && this.e == fdi1Var.e && this.f == fdi1Var.f && u890.j(this.g, fdi1Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.g.hashCode() + kaa0.f(this.f, kaa0.f(this.e, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeParcelable(this.g, i);
    }
}
