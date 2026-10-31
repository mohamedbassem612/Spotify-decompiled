package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k1c1 implements Parcelable {
    public static final Parcelable.Creator<k1c1> CREATOR = new yub1((byte) 15);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Long d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final lax h;

    public k1c1(String str, int i, boolean z) {
        this(str, z, false, null, false, null, null, new gax(2131961690, (String) null));
    }

    public static k1c1 a(k1c1 k1c1Var, boolean z, Long l, boolean z2, Long l2, Long l3, lax laxVar, int i) {
        String str = k1c1Var.a;
        boolean z3 = k1c1Var.b;
        if ((i & 4) != 0) {
            z = k1c1Var.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            l = k1c1Var.d;
        }
        Long l4 = l;
        if ((i & 16) != 0) {
            z2 = k1c1Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            l2 = k1c1Var.f;
        }
        Long l5 = l2;
        if ((i & 64) != 0) {
            l3 = k1c1Var.g;
        }
        Long l6 = l3;
        lax laxVar2 = (i & 128) != 0 ? k1c1Var.h : laxVar;
        k1c1Var.getClass();
        return new k1c1(str, z3, z4, l4, z5, l5, l6, laxVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1c1)) {
            return false;
        }
        k1c1 k1c1Var = (k1c1) obj;
        return u890.j(this.a, k1c1Var.a) && this.b == k1c1Var.b && this.c == k1c1Var.c && u890.j(this.d, k1c1Var.d) && this.e == k1c1Var.e && u890.j(this.f, k1c1Var.f) && u890.j(this.g, k1c1Var.g) && u890.j(this.h, k1c1Var.h);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iG2 = xcg1.g((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.e);
        Long l2 = this.f;
        int iHashCode = (iG2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.g;
        return this.h.hashCode() + ((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        parcel.writeInt(this.e ? 1 : 0);
        Long l2 = this.f;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l2);
        }
        Long l3 = this.g;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l3);
        }
        parcel.writeParcelable(this.h, i);
    }

    public k1c1(String str, boolean z, boolean z2, Long l, boolean z3, Long l2, Long l3, lax laxVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = l;
        this.e = z3;
        this.f = l2;
        this.g = l3;
        this.h = laxVar;
    }
}
