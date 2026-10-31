package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qcb1 implements Parcelable {
    public static final Parcelable.Creator<qcb1> CREATOR = new nja1((byte) 20);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final pcb1 i;
    public final iy50 t;

    public qcb1(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, pcb1 pcb1Var, iy50 iy50Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = pcb1Var;
        this.t = iy50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcb1)) {
            return false;
        }
        qcb1 qcb1Var = (qcb1) obj;
        return u890.j(this.a, qcb1Var.a) && u890.j(this.b, qcb1Var.b) && u890.j(this.c, qcb1Var.c) && this.d == qcb1Var.d && this.e == qcb1Var.e && this.f == qcb1Var.f && this.g == qcb1Var.g && this.h == qcb1Var.h && u890.j(this.i, qcb1Var.i) && this.t == qcb1Var.t;
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeParcelable(this.i, i);
        parcel.writeString(this.t.name());
    }
}
