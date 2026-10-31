package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class kjo0 implements Parcelable {
    public final String a;
    public final mxe1 b;
    public final String c;
    public final pjo0 d;
    public final vmo0 e;
    public final boolean f;
    public final String g;
    public final bdj0 h;
    public final String i;
    public static final fjo0 Companion = new fjo0();
    public static final Parcelable.Creator<kjo0> CREATOR = new agm0((byte) 2);
    public static final znb0[] t = {null, dm5.S(2, fsm0.Y0), null, null, dm5.S(2, fsm0.Z0), null, null, null, null};

    public /* synthetic */ kjo0(int i, String str, mxe1 mxe1Var, String str2, pjo0 pjo0Var, vmo0 vmo0Var, boolean z, String str3, bdj0 bdj0Var, String str4) {
        if (511 != (i & 511)) {
            o6p1.t(i, 511, djo0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = mxe1Var;
        this.c = str2;
        this.d = pjo0Var;
        this.e = vmo0Var;
        this.f = z;
        this.g = str3;
        this.h = bdj0Var;
        this.i = str4;
    }

    public static kjo0 a(kjo0 kjo0Var) {
        String str = kjo0Var.a;
        mxe1 mxe1Var = kjo0Var.b;
        String str2 = kjo0Var.c;
        pjo0 pjo0Var = kjo0Var.d;
        vmo0 vmo0Var = kjo0Var.e;
        String str3 = kjo0Var.g;
        bdj0 bdj0Var = kjo0Var.h;
        String str4 = kjo0Var.i;
        kjo0Var.getClass();
        return new kjo0(str, mxe1Var, str2, pjo0Var, vmo0Var, false, str3, bdj0Var, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjo0)) {
            return false;
        }
        kjo0 kjo0Var = (kjo0) obj;
        return u890.j(this.a, kjo0Var.a) && u890.j(this.b, kjo0Var.b) && u890.j(this.c, kjo0Var.c) && u890.j(this.d, kjo0Var.d) && u890.j(this.e, kjo0Var.e) && this.f == kjo0Var.f && u890.j(this.g, kjo0Var.g) && u890.j(this.h, kjo0Var.h) && u890.j(this.i, kjo0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + cy30.d(xcg1.g((this.e.hashCode() + ((this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        this.h.writeToParcel(parcel, i);
        parcel.writeString(this.i);
    }

    public kjo0(String str, mxe1 mxe1Var, String str2, pjo0 pjo0Var, vmo0 vmo0Var, boolean z, String str3, bdj0 bdj0Var, String str4) {
        this.a = str;
        this.b = mxe1Var;
        this.c = str2;
        this.d = pjo0Var;
        this.e = vmo0Var;
        this.f = z;
        this.g = str3;
        this.h = bdj0Var;
        this.i = str4;
    }
}
