package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kvv implements Parcelable {
    public static final Parcelable.Creator<kvv> CREATOR = new s5v((byte) 17);
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public final boolean R0;
    public final boolean S0;
    public final Map T0;
    public final w10 U0;
    public final gne V0;
    public final gne W0;
    public final boolean X;
    public final boolean X0;
    public final String Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final boolean t;

    public kvv(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, boolean z7, boolean z8, String str4, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Map map, w10 w10Var, gne gneVar, gne gneVar2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = str3;
        this.t = z7;
        this.X = z8;
        this.Y = str4;
        this.Z = z9;
        this.N0 = z10;
        this.O0 = z11;
        this.P0 = z12;
        this.Q0 = z13;
        this.R0 = z14;
        this.S0 = z15;
        this.T0 = map;
        this.U0 = w10Var;
        this.V0 = gneVar;
        this.W0 = gneVar2;
        this.X0 = !map.isEmpty();
    }

    public static kvv a(kvv kvvVar, boolean z, boolean z2, boolean z3, boolean z4, Map map, w10 w10Var, gne gneVar, int i) {
        String str = kvvVar.a;
        String str2 = kvvVar.b;
        boolean z5 = kvvVar.c;
        boolean z6 = kvvVar.d;
        boolean z7 = kvvVar.e;
        boolean z8 = kvvVar.f;
        boolean z9 = (i & 64) != 0 ? kvvVar.g : z;
        boolean z10 = kvvVar.h;
        boolean z11 = z9;
        String str3 = kvvVar.i;
        boolean z12 = kvvVar.t;
        boolean z13 = kvvVar.X;
        String str4 = kvvVar.Y;
        boolean z14 = kvvVar.Z;
        boolean z15 = kvvVar.N0;
        boolean z16 = (i & 16384) != 0 ? kvvVar.O0 : true;
        boolean z17 = (i & 32768) != 0 ? kvvVar.P0 : z2;
        boolean z18 = (i & 65536) != 0 ? kvvVar.Q0 : z3;
        boolean z19 = (i & 131072) != 0 ? kvvVar.R0 : z4;
        boolean z20 = (i & 262144) != 0 ? kvvVar.S0 : true;
        Map map2 = (i & 524288) != 0 ? kvvVar.T0 : map;
        w10 w10Var2 = (i & 1048576) != 0 ? kvvVar.U0 : w10Var;
        gne gneVar2 = kvvVar.V0;
        gne gneVar3 = (i & 4194304) != 0 ? kvvVar.W0 : gneVar;
        kvvVar.getClass();
        return new kvv(str, str2, z5, z6, z7, z8, z11, z10, str3, z12, z13, str4, z14, z15, z16, z17, z18, z19, z20, map2, w10Var2, gneVar2, gneVar3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvv)) {
            return false;
        }
        kvv kvvVar = (kvv) obj;
        return u890.j(this.a, kvvVar.a) && u890.j(this.b, kvvVar.b) && this.c == kvvVar.c && this.d == kvvVar.d && this.e == kvvVar.e && this.f == kvvVar.f && this.g == kvvVar.g && this.h == kvvVar.h && u890.j(this.i, kvvVar.i) && this.t == kvvVar.t && this.X == kvvVar.X && u890.j(this.Y, kvvVar.Y) && this.Z == kvvVar.Z && this.N0 == kvvVar.N0 && this.O0 == kvvVar.O0 && this.P0 == kvvVar.P0 && this.Q0 == kvvVar.Q0 && this.R0 == kvvVar.R0 && this.S0 == kvvVar.S0 && u890.j(this.T0, kvvVar.T0) && u890.j(this.U0, kvvVar.U0) && u890.j(this.V0, kvvVar.V0) && u890.j(this.W0, kvvVar.W0);
    }

    public final int hashCode() {
        int iE = cy30.e(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(xcg1.g(xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X), 31, this.Y), 31, this.Z), 31, this.N0), 31, this.O0), 31, this.P0), 31, this.Q0), 31, this.R0), 31, this.S0), 31, this.T0);
        w10 w10Var = this.U0;
        return this.W0.hashCode() + ((this.V0.hashCode() + ((iE + (w10Var == null ? 0 : w10Var.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeInt(this.Q0 ? 1 : 0);
        parcel.writeInt(this.R0 ? 1 : 0);
        parcel.writeInt(this.S0 ? 1 : 0);
        Iterator itJ = xcg1.j(parcel, this.T0);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeSerializable((Serializable) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeParcelable(this.U0, i);
        parcel.writeParcelable(this.V0, i);
        parcel.writeParcelable(this.W0, i);
    }
}
