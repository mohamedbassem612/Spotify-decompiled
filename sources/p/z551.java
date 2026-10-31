package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z551 implements Parcelable {
    public static final Parcelable.Creator<z551> CREATOR = new uo41((byte) 10);
    public static final z551 P0 = new z551("", "", 0, y851.a, ral.a, fw41.h, jlr0.a, se20.a, drt0.a, 1, new m131(false, false, false, false), new e7r0(null, null, null, 31), false, new h1z0(null), false);
    public final h1z0 N0;
    public final boolean O0;
    public final m131 X;
    public final e7r0 Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final int c;
    public final f951 d;
    public final val e;
    public final fw41 f;
    public final llr0 g;
    public final ue20 h;
    public final xrt0 i;
    public final int t;

    public z551(String str, String str2, int i, f951 f951Var, val valVar, fw41 fw41Var, llr0 llr0Var, ue20 ue20Var, xrt0 xrt0Var, int i2, m131 m131Var, e7r0 e7r0Var, boolean z, h1z0 h1z0Var, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = f951Var;
        this.e = valVar;
        this.f = fw41Var;
        this.g = llr0Var;
        this.h = ue20Var;
        this.i = xrt0Var;
        this.t = i2;
        this.X = m131Var;
        this.Y = e7r0Var;
        this.Z = z;
        this.N0 = h1z0Var;
        this.O0 = z2;
    }

    public static z551 a(z551 z551Var, String str, String str2, int i, f951 f951Var, val valVar, fw41 fw41Var, llr0 llr0Var, ue20 ue20Var, xrt0 xrt0Var, int i2, m131 m131Var, e7r0 e7r0Var, boolean z, h1z0 h1z0Var, boolean z2, int i3) {
        String str3 = (i3 & 1) != 0 ? z551Var.a : str;
        String str4 = (i3 & 2) != 0 ? z551Var.b : str2;
        int i4 = (i3 & 4) != 0 ? z551Var.c : i;
        f951 f951Var2 = (i3 & 8) != 0 ? z551Var.d : f951Var;
        val valVar2 = (i3 & 16) != 0 ? z551Var.e : valVar;
        fw41 fw41Var2 = (i3 & 32) != 0 ? z551Var.f : fw41Var;
        llr0 llr0Var2 = (i3 & 64) != 0 ? z551Var.g : llr0Var;
        ue20 ue20Var2 = (i3 & 128) != 0 ? z551Var.h : ue20Var;
        xrt0 xrt0Var2 = (i3 & 256) != 0 ? z551Var.i : xrt0Var;
        int i5 = (i3 & 512) != 0 ? z551Var.t : i2;
        m131 m131Var2 = (i3 & 1024) != 0 ? z551Var.X : m131Var;
        e7r0 e7r0Var2 = (i3 & 2048) != 0 ? z551Var.Y : e7r0Var;
        boolean z3 = (i3 & 4096) != 0 ? z551Var.Z : z;
        h1z0 h1z0Var2 = (i3 & 8192) != 0 ? z551Var.N0 : h1z0Var;
        boolean z4 = (i3 & 16384) != 0 ? z551Var.O0 : z2;
        z551Var.getClass();
        return new z551(str3, str4, i4, f951Var2, valVar2, fw41Var2, llr0Var2, ue20Var2, xrt0Var2, i5, m131Var2, e7r0Var2, z3, h1z0Var2, z4);
    }

    public final f951 B() {
        return this.d;
    }

    public final boolean F() {
        return this.Z;
    }

    public final String b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z551)) {
            return false;
        }
        z551 z551Var = (z551) obj;
        return u890.j(this.a, z551Var.a) && u890.j(this.b, z551Var.b) && this.c == z551Var.c && u890.j(this.d, z551Var.d) && u890.j(this.e, z551Var.e) && u890.j(this.f, z551Var.f) && u890.j(this.g, z551Var.g) && u890.j(this.h, z551Var.h) && u890.j(this.i, z551Var.i) && this.t == z551Var.t && u890.j(this.X, z551Var.X) && u890.j(this.Y, z551Var.Y) && this.Z == z551Var.Z && u890.j(this.N0, z551Var.N0) && this.O0 == z551Var.O0;
    }

    public final fw41 g() {
        return this.f;
    }

    public final val h() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.O0) + ((this.N0.hashCode() + xcg1.g((this.Y.hashCode() + ((this.X.hashCode() + ab80.k(this.t, (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31, this.Z)) * 31);
    }

    public final ue20 j() {
        return this.h;
    }

    public final int k() {
        return this.t;
    }

    public final int l() {
        return this.c;
    }

    public final e7r0 n() {
        return this.Y;
    }

    public final llr0 r() {
        return this.g;
    }

    public final xrt0 s() {
        return this.i;
    }

    public final h1z0 t() {
        return this.N0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        this.f.writeToParcel(parcel, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        int i2 = this.t;
        if (i2 == 1) {
            str = "None";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Dismissed";
        }
        parcel.writeString(str);
        this.X.writeToParcel(parcel, i);
        this.Y.writeToParcel(parcel, i);
        parcel.writeInt(this.Z ? 1 : 0);
        this.N0.writeToParcel(parcel, i);
        parcel.writeInt(this.O0 ? 1 : 0);
    }

    public final m131 x() {
        return this.X;
    }
}
