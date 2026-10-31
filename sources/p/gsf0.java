package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gsf0 implements Parcelable {
    public static final Parcelable.Creator<gsf0> CREATOR = new ipf0((byte) 10);
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public final float R0;
    public final boolean S0;
    public final boolean T0;
    public final boolean U0;
    public final iu30 V0;
    public final iu30 W0;
    public final csf0 X;
    public final srf0 Y;
    public final int Z;
    public final String a;
    public final String b;
    public final dhf0 c;
    public final bef0 d;
    public final boolean e;
    public final int f;
    public final List g;
    public final fsf0 h;
    public final boolean i;
    public final vrf0 t;

    public gsf0(String str, String str2, dhf0 dhf0Var, bef0 bef0Var, boolean z, int i, List list, fsf0 fsf0Var, boolean z2, vrf0 vrf0Var, csf0 csf0Var, srf0 srf0Var, int i2, boolean z3, boolean z4, boolean z5, boolean z6, float f, boolean z7, boolean z8, boolean z9, iu30 iu30Var, iu30 iu30Var2) {
        this.a = str;
        this.b = str2;
        this.c = dhf0Var;
        this.d = bef0Var;
        this.e = z;
        this.f = i;
        this.g = list;
        this.h = fsf0Var;
        this.i = z2;
        this.t = vrf0Var;
        this.X = csf0Var;
        this.Y = srf0Var;
        this.Z = i2;
        this.N0 = z3;
        this.O0 = z4;
        this.P0 = z5;
        this.Q0 = z6;
        this.R0 = f;
        this.S0 = z7;
        this.T0 = z8;
        this.U0 = z9;
        this.V0 = iu30Var;
        this.W0 = iu30Var2;
    }

    public static gsf0 a(gsf0 gsf0Var, vrf0 vrf0Var, csf0 csf0Var, srf0 srf0Var, float f, iu30 iu30Var, iu30 iu30Var2, int i) {
        return new gsf0(gsf0Var.a, gsf0Var.b, gsf0Var.c, gsf0Var.d, gsf0Var.e, gsf0Var.f, gsf0Var.g, gsf0Var.h, gsf0Var.i, (i & 512) != 0 ? gsf0Var.t : vrf0Var, (i & 1024) != 0 ? gsf0Var.X : csf0Var, (i & 2048) != 0 ? gsf0Var.Y : srf0Var, gsf0Var.Z, gsf0Var.N0, gsf0Var.O0, gsf0Var.P0, gsf0Var.Q0, (i & 131072) != 0 ? gsf0Var.R0 : f, gsf0Var.S0, gsf0Var.T0, gsf0Var.U0, (i & 2097152) != 0 ? gsf0Var.V0 : iu30Var, (i & 4194304) != 0 ? gsf0Var.W0 : iu30Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsf0)) {
            return false;
        }
        gsf0 gsf0Var = (gsf0) obj;
        return u890.j(this.a, gsf0Var.a) && u890.j(this.b, gsf0Var.b) && this.c == gsf0Var.c && u890.j(this.d, gsf0Var.d) && this.e == gsf0Var.e && this.f == gsf0Var.f && this.g.equals(gsf0Var.g) && u890.j(this.h, gsf0Var.h) && this.i == gsf0Var.i && u890.j(this.t, gsf0Var.t) && u890.j(this.X, gsf0Var.X) && u890.j(this.Y, gsf0Var.Y) && this.Z == gsf0Var.Z && this.N0 == gsf0Var.N0 && this.O0 == gsf0Var.O0 && this.P0 == gsf0Var.P0 && this.Q0 == gsf0Var.Q0 && Float.compare(this.R0, gsf0Var.R0) == 0 && this.S0 == gsf0Var.S0 && this.T0 == gsf0Var.T0 && this.U0 == gsf0Var.U0 && u890.j(this.V0, gsf0Var.V0) && u890.j(this.W0, gsf0Var.W0);
    }

    public final int hashCode() {
        return this.W0.hashCode() + ktd.g(this.V0, xcg1.g(xcg1.g(xcg1.g(x0d.f(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.Z, (this.Y.hashCode() + ((this.X.hashCode() + ((this.t.hashCode() + xcg1.g((this.h.hashCode() + f4i1.b(ab80.k(this.f, xcg1.g((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31), 31, this.g)) * 31, 31, this.i)) * 31)) * 31)) * 31, 31), 31, this.N0), 31, this.O0), 31, this.P0), 31, this.Q0), 31, this.R0), 31, this.S0), 31, this.T0), 31, this.U0), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeParcelable(new r1g1(this.a), i);
        parcel.writeParcelable(new l0u0(this.b), i);
        parcel.writeString(this.c.name());
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(pze0.q(this.f));
        Iterator itM = kk0.m(parcel, this.g);
        while (itM.hasNext()) {
            ((xlf0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.h, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeParcelable(this.t, i);
        parcel.writeParcelable(this.X, i);
        this.Y.writeToParcel(parcel, i);
        int i2 = this.Z;
        if (i2 == 1) {
            str = "TITLE_MEDIUM";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "TITLE_SMALL";
        }
        parcel.writeString(str);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeInt(this.Q0 ? 1 : 0);
        parcel.writeFloat(this.R0);
        parcel.writeInt(this.S0 ? 1 : 0);
        parcel.writeInt(this.T0 ? 1 : 0);
        parcel.writeInt(this.U0 ? 1 : 0);
    }
}
