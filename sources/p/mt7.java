package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mt7 extends c871 {
    public static final Parcelable.Creator<mt7> CREATOR = new f67((byte) 29);
    public final String X;
    public final jlw0 a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final s171 f;
    public final String g;
    public final String h;
    public final vve1 i;
    public final vve1 t;

    public mt7(jlw0 jlw0Var, int i, int i2, String str, String str2, s171 s171Var, String str3, String str4, vve1 vve1Var, vve1 vve1Var2, String str5) {
        this.a = jlw0Var;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = s171Var;
        this.g = str3;
        this.h = str4;
        this.i = vve1Var;
        this.t = vve1Var2;
        this.X = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt7)) {
            return false;
        }
        mt7 mt7Var = (mt7) obj;
        return u890.j(this.a, mt7Var.a) && this.b == mt7Var.b && this.c == mt7Var.c && u890.j(this.d, mt7Var.d) && u890.j(this.e, mt7Var.e) && u890.j(this.f, mt7Var.f) && u890.j(this.g, mt7Var.g) && u890.j(this.h, mt7Var.h) && u890.j(this.i, mt7Var.i) && u890.j(this.t, mt7Var.t) && u890.j(this.X, mt7Var.X);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + cy30.d(cy30.d(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e)) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        vve1 vve1Var = this.i;
        int iHashCode4 = (iHashCode3 + (vve1Var == null ? 0 : Long.hashCode(vve1Var.a))) * 31;
        vve1 vve1Var2 = this.t;
        int iHashCode5 = (iHashCode4 + (vve1Var2 == null ? 0 : Long.hashCode(vve1Var2.a))) * 31;
        String str3 = this.X;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeString(this.X);
    }

    public /* synthetic */ mt7(jlw0 jlw0Var, int i, int i2, String str, String str2, s171 s171Var) {
        this(jlw0Var, i, i2, str, str2, s171Var, null, null, null, null, null);
    }
}
