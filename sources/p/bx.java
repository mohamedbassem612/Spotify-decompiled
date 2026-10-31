package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bx extends dx {
    public static final Parcelable.Creator<bx> CREATOR = new gp((byte) 9);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final d850 g;

    public bx(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, d850 d850Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = d850Var;
    }

    public static bx a(bx bxVar, boolean z, boolean z2, boolean z3, int i) {
        String str = bxVar.a;
        String str2 = bxVar.b;
        if ((i & 4) != 0) {
            z = bxVar.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = bxVar.d;
        }
        boolean z5 = z2;
        boolean z6 = bxVar.e;
        if ((i & 32) != 0) {
            z3 = bxVar.f;
        }
        d850 d850Var = bxVar.g;
        bxVar.getClass();
        return new bx(str, str2, z4, z5, z6, z3, d850Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        return u890.j(this.a, bxVar.a) && u890.j(this.b, bxVar.b) && this.c == bxVar.c && this.d == bxVar.d && this.e == bxVar.e && this.f == bxVar.f && u890.j(this.g, bxVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeParcelable(this.g, i);
    }
}
