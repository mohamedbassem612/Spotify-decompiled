package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vef0 implements Parcelable {
    public static final Parcelable.Creator<vef0> CREATOR = new j7f0((byte) 11);
    public final boolean N0;
    public final boolean X;
    public final c380 Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final String c;
    public final cqs0 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final chf0 t;

    public vef0(String str, String str2, String str3, cqs0 cqs0Var, int i, int i2, int i3, int i4, int i5, c380 c380Var, boolean z, boolean z2, int i6) {
        this(str, str2, str3, cqs0Var, i, i2, i3, i4, i5, chf0.a, false, (i6 & 2048) != 0 ? fg91.b : c380Var, (i6 & 4096) != 0 ? false : z, (i6 & 8192) != 0 ? false : z2);
    }

    public static vef0 a(vef0 vef0Var, cqs0 cqs0Var, int i, int i2, int i3, int i4, chf0 chf0Var, boolean z, c380 c380Var, int i5) {
        String str = vef0Var.a;
        String str2 = vef0Var.b;
        String str3 = vef0Var.c;
        cqs0 cqs0Var2 = (i5 & 8) != 0 ? vef0Var.d : cqs0Var;
        int i6 = (i5 & 16) != 0 ? vef0Var.e : i;
        int i7 = (i5 & 32) != 0 ? vef0Var.f : i2;
        int i8 = (i5 & 64) != 0 ? vef0Var.g : i3;
        int i9 = vef0Var.h;
        int i10 = (i5 & 256) != 0 ? vef0Var.i : i4;
        chf0 chf0Var2 = (i5 & 512) != 0 ? vef0Var.t : chf0Var;
        boolean z2 = (i5 & 1024) != 0 ? vef0Var.X : z;
        c380 c380Var2 = (i5 & 2048) != 0 ? vef0Var.Y : c380Var;
        boolean z3 = vef0Var.Z;
        boolean z4 = vef0Var.N0;
        vef0Var.getClass();
        return new vef0(str, str2, str3, cqs0Var2, i6, i7, i8, i9, i10, chf0Var2, z2, c380Var2, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vef0)) {
            return false;
        }
        vef0 vef0Var = (vef0) obj;
        return u890.j(this.a, vef0Var.a) && u890.j(this.b, vef0Var.b) && u890.j(this.c, vef0Var.c) && u890.j(this.d, vef0Var.d) && this.e == vef0Var.e && this.f == vef0Var.f && this.g == vef0Var.g && this.h == vef0Var.h && this.i == vef0Var.i && this.t == vef0Var.t && this.X == vef0Var.X && u890.j(this.Y, vef0Var.Y) && this.Z == vef0Var.Z && this.N0 == vef0Var.N0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.N0) + xcg1.g(kk0.f(this.Y, xcg1.g((this.t.hashCode() + ab80.k(this.i, kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31), 31), 31), 31), 31)) * 31, 31, this.X), 31), 31, this.Z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        m7 m7Var = this.d;
        parcel.writeInt(m7Var.c());
        for (Map.Entry entry : m7Var.a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(pze0.r(this.i));
        parcel.writeString(this.t.name());
        parcel.writeInt(this.X ? 1 : 0);
        Iterator itL = x0d.l(this.Y, parcel);
        while (itL.hasNext()) {
            ((opf0) itL.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.N0 ? 1 : 0);
    }

    public vef0(String str, String str2, String str3, cqs0 cqs0Var, int i, int i2, int i3, int i4, int i5, chf0 chf0Var, boolean z, c380 c380Var, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cqs0Var;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.t = chf0Var;
        this.X = z;
        this.Y = c380Var;
        this.Z = z2;
        this.N0 = z3;
    }
}
