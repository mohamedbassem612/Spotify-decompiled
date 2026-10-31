package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qau implements Parcelable {
    public static final oau CREATOR = new oau();
    public static final qau U0 = new qau(null, null, null, false, false, null, null, null, true, false, false, false, false, null, true, false, null, "", false, false);
    public final abu N0;
    public final boolean O0;
    public final boolean P0;
    public final pau Q0;
    public final String R0;
    public final boolean S0;
    public final boolean T0;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final Integer a;
    public final Integer b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;
    public final s9l1 g;
    public final k9u h;
    public final boolean i;
    public final boolean t;

    public qau(Integer num, Integer num2, String str, boolean z, boolean z2, Boolean bool, s9l1 s9l1Var, k9u k9uVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, abu abuVar, boolean z8, boolean z9, pau pauVar, String str2, boolean z10, boolean z11) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = bool;
        this.g = s9l1Var;
        this.h = k9uVar;
        this.i = z3;
        this.t = z4;
        this.X = z5;
        this.Y = z6;
        this.Z = z7;
        this.N0 = abuVar;
        this.O0 = z8;
        this.P0 = z9;
        this.Q0 = pauVar;
        this.R0 = str2;
        this.S0 = z10;
        this.T0 = z11;
    }

    public static qau a(qau qauVar, Integer num, Integer num2, String str, boolean z, boolean z2, Boolean bool, s9l1 s9l1Var, k9u k9uVar, boolean z3, boolean z4, boolean z5, boolean z6, abu abuVar, boolean z7, boolean z8, pau pauVar, String str2, boolean z9, int i) {
        Integer num3 = (i & 1) != 0 ? qauVar.a : num;
        Integer num4 = (i & 2) != 0 ? qauVar.b : num2;
        String str3 = (i & 4) != 0 ? qauVar.c : str;
        boolean z10 = (i & 8) != 0 ? qauVar.d : z;
        boolean z11 = (i & 16) != 0 ? qauVar.e : z2;
        Boolean bool2 = (i & 32) != 0 ? qauVar.f : bool;
        s9l1 s9l1Var2 = (i & 64) != 0 ? qauVar.g : s9l1Var;
        k9u k9uVar2 = (i & 128) != 0 ? qauVar.h : k9uVar;
        boolean z12 = (i & 256) != 0 ? qauVar.i : z3;
        boolean z13 = (i & 512) != 0 ? qauVar.t : z4;
        boolean z14 = (i & 1024) != 0 ? qauVar.X : z5;
        boolean z15 = (i & 2048) != 0 ? qauVar.Y : z6;
        boolean z16 = (i & 4096) != 0 ? qauVar.Z : true;
        abu abuVar2 = (i & 8192) != 0 ? qauVar.N0 : abuVar;
        boolean z17 = (i & 16384) != 0 ? qauVar.O0 : z7;
        boolean z18 = (32768 & i) != 0 ? qauVar.P0 : z8;
        pau pauVar2 = (65536 & i) != 0 ? qauVar.Q0 : pauVar;
        String str4 = (131072 & i) != 0 ? qauVar.R0 : str2;
        boolean z19 = (262144 & i) != 0 ? qauVar.S0 : true;
        boolean z20 = (i & 524288) != 0 ? qauVar.T0 : z9;
        qauVar.getClass();
        return new qau(num3, num4, str3, z10, z11, bool2, s9l1Var2, k9uVar2, z12, z13, z14, z15, z16, abuVar2, z17, z18, pauVar2, str4, z19, z20);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qau)) {
            return false;
        }
        qau qauVar = (qau) obj;
        return u890.j(this.a, qauVar.a) && u890.j(this.b, qauVar.b) && u890.j(this.c, qauVar.c) && this.d == qauVar.d && this.e == qauVar.e && u890.j(this.f, qauVar.f) && u890.j(this.g, qauVar.g) && u890.j(this.h, qauVar.h) && this.i == qauVar.i && this.t == qauVar.t && this.X == qauVar.X && this.Y == qauVar.Y && this.Z == qauVar.Z && u890.j(this.N0, qauVar.N0) && this.O0 == qauVar.O0 && this.P0 == qauVar.P0 && u890.j(this.Q0, qauVar.Q0) && this.R0.equals(qauVar.R0) && this.S0 == qauVar.S0 && this.T0 == qauVar.T0;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iG = xcg1.g(xcg1.g((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        Boolean bool = this.f;
        int iHashCode3 = (iG + (bool == null ? 0 : bool.hashCode())) * 31;
        s9l1 s9l1Var = this.g;
        int iHashCode4 = (iHashCode3 + (s9l1Var == null ? 0 : s9l1Var.hashCode())) * 31;
        k9u k9uVar = this.h;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode4 + (k9uVar == null ? 0 : k9uVar.hashCode())) * 31, 31, this.i), 31, this.t), 31, this.X), 31, this.Y), 31, this.Z);
        abu abuVar = this.N0;
        int iG3 = xcg1.g(xcg1.g((iG2 + (abuVar == null ? 0 : abuVar.hashCode())) * 31, 31, this.O0), 31, this.P0);
        pau pauVar = this.Q0;
        return Boolean.hashCode(this.T0) + xcg1.g(cy30.d((iG3 + (pauVar != null ? pauVar.hashCode() : 0)) * 31, 31, this.R0), 31, this.S0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        gho1.s(parcel, this.a);
        gho1.s(parcel, this.b);
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        Boolean bool = this.f;
        gho1.s(parcel, bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null);
        parcel.writeParcelable(this.h, i);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.X ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.N0, i);
        parcel.writeByte(this.O0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.P0 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.Q0, i);
        parcel.writeString(this.R0);
        parcel.writeByte(this.S0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.T0 ? (byte) 1 : (byte) 0);
    }
}
