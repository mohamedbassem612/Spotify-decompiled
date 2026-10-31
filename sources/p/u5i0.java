package p;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u5i0 implements Parcelable {
    public static final Parcelable.Creator<u5i0> CREATOR = new cyh0((byte) 11);
    public final boolean N0;
    public final String O0;
    public final long P0;
    public final long Q0;
    public final Bitmap R0;
    public final boolean S0;
    public final t5i0 T0;
    public final boolean X;
    public final boolean Y;
    public final int Z;
    public final v5i0 a;
    public final List b;
    public final p5i0 c;
    public final String d;
    public final o5i0 e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public /* synthetic */ u5i0(v5i0 v5i0Var, List list, p5i0 p5i0Var, String str, o5i0 o5i0Var, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, long j, long j2, t5i0 t5i0Var, int i3) {
        this(v5i0Var, list, p5i0Var, str, o5i0Var, i, i2, z, z2, z3, z4, z5, 1, true, (i3 & 16384) != 0 ? null : str2, (32768 & i3) != 0 ? 0L : j, (65536 & i3) != 0 ? Long.MAX_VALUE : j2, null, false, (i3 & 524288) != 0 ? s5i0.a : t5i0Var);
    }

    public static u5i0 a(u5i0 u5i0Var, v5i0 v5i0Var, ArrayList arrayList, o5i0 o5i0Var, boolean z, int i, boolean z2, Bitmap bitmap, boolean z3, t5i0 t5i0Var, int i2) {
        return new u5i0((i2 & 1) != 0 ? u5i0Var.a : v5i0Var, (i2 & 2) != 0 ? u5i0Var.b : arrayList, u5i0Var.c, u5i0Var.d, (i2 & 16) != 0 ? u5i0Var.e : o5i0Var, u5i0Var.f, u5i0Var.g, u5i0Var.h, u5i0Var.i, u5i0Var.t, u5i0Var.X, (i2 & 2048) != 0 ? u5i0Var.Y : z, (i2 & 4096) != 0 ? u5i0Var.Z : i, (i2 & 8192) != 0 ? u5i0Var.N0 : z2, u5i0Var.O0, u5i0Var.P0, u5i0Var.Q0, (i2 & 131072) != 0 ? u5i0Var.R0 : bitmap, (i2 & 262144) != 0 ? u5i0Var.S0 : z3, (i2 & 524288) != 0 ? u5i0Var.T0 : t5i0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5i0)) {
            return false;
        }
        u5i0 u5i0Var = (u5i0) obj;
        return u890.j(this.a, u5i0Var.a) && u890.j(this.b, u5i0Var.b) && u890.j(this.c, u5i0Var.c) && u890.j(this.d, u5i0Var.d) && u890.j(this.e, u5i0Var.e) && this.f == u5i0Var.f && this.g == u5i0Var.g && this.h == u5i0Var.h && this.i == u5i0Var.i && this.t == u5i0Var.t && this.X == u5i0Var.X && this.Y == u5i0Var.Y && this.Z == u5i0Var.Z && this.N0 == u5i0Var.N0 && u890.j(this.O0, u5i0Var.O0) && this.P0 == u5i0Var.P0 && this.Q0 == u5i0Var.Q0 && u890.j(this.R0, u5i0Var.R0) && this.S0 == u5i0Var.S0 && u890.j(this.T0, u5i0Var.T0);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        this.c.getClass();
        int iG = xcg1.g(ab80.k(this.Z, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.g, ab80.k(this.f, (this.e.hashCode() + cy30.d((iB + 146765443) * 31, 31, this.d)) * 31, 31), 31), 31, this.h), 31, this.i), 31, this.t), 31, this.X), 31, this.Y), 31), 31, this.N0);
        String str = this.O0;
        int iF = cy30.f(cy30.f((iG + (str == null ? 0 : str.hashCode())) * 31, this.P0, 31), this.Q0, 31);
        Bitmap bitmap = this.R0;
        return this.T0.hashCode() + xcg1.g((iF + (bitmap != null ? bitmap.hashCode() : 0)) * 31, 31, this.S0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        this.a.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeInt(((Number) itM.next()).intValue());
        }
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        this.e.writeToParcel(parcel, i);
        int i2 = this.f;
        if (i2 == 1) {
            str = "START_ONLY";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "DRAGGABLE";
        }
        parcel.writeString(str);
        int i3 = this.g;
        if (i3 == 1) {
            str2 = "SHARE_CLIP";
        } else if (i3 == 2) {
            str2 = "CREATE_CLIP";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "EDIT_CLIP";
        }
        parcel.writeString(str2);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeString(this.O0);
        parcel.writeLong(this.P0);
        parcel.writeLong(this.Q0);
        parcel.writeParcelable(this.T0, i);
    }

    public u5i0(v5i0 v5i0Var, List list, p5i0 p5i0Var, String str, o5i0 o5i0Var, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, boolean z6, String str2, long j, long j2, Bitmap bitmap, boolean z7, t5i0 t5i0Var) {
        this.a = v5i0Var;
        this.b = list;
        this.c = p5i0Var;
        this.d = str;
        this.e = o5i0Var;
        this.f = i;
        this.g = i2;
        this.h = z;
        this.i = z2;
        this.t = z3;
        this.X = z4;
        this.Y = z5;
        this.Z = i3;
        this.N0 = z6;
        this.O0 = str2;
        this.P0 = j;
        this.Q0 = j2;
        this.R0 = bitmap;
        this.S0 = z7;
        this.T0 = t5i0Var;
    }
}
