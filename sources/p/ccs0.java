package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ccs0 implements ecs0 {
    public static final Parcelable.Creator<ccs0> CREATOR = new ybs0((byte) 3);
    public final String N0;
    public final t2c0 O0;
    public final String P0;
    public final String Q0;
    public final hes0 R0;
    public final imr0 S0;
    public final i3g1 X;
    public final c380 Y;
    public final v7u Z;
    public final tcs0 a;
    public final String b;
    public final ee30 c;
    public final tqw0 d;
    public final String e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public ccs0(tcs0 tcs0Var, String str, ee30 ee30Var, tqw0 tqw0Var, String str2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, i3g1 i3g1Var, c380 c380Var, v7u v7uVar, String str3, t2c0 t2c0Var, String str4, String str5, hes0 hes0Var, imr0 imr0Var) {
        this.a = tcs0Var;
        this.b = str;
        this.c = ee30Var;
        this.d = tqw0Var;
        this.e = str2;
        this.f = num;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.t = z4;
        this.X = i3g1Var;
        this.Y = c380Var;
        this.Z = v7uVar;
        this.N0 = str3;
        this.O0 = t2c0Var;
        this.P0 = str4;
        this.Q0 = str5;
        this.R0 = hes0Var;
        this.S0 = imr0Var;
    }

    public static ccs0 a(ccs0 ccs0Var, tcs0 tcs0Var, String str, ee30 ee30Var, tqw0 tqw0Var, String str2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, i3g1 i3g1Var, c380 c380Var, v7u v7uVar, String str3, t2c0 t2c0Var, String str4, String str5, hes0 hes0Var, imr0 imr0Var, int i) {
        tcs0 tcs0Var2 = (i & 1) != 0 ? ccs0Var.a : tcs0Var;
        String str6 = (i & 2) != 0 ? ccs0Var.b : str;
        ee30 ee30Var2 = (i & 4) != 0 ? ccs0Var.c : ee30Var;
        tqw0 tqw0Var2 = (i & 8) != 0 ? ccs0Var.d : tqw0Var;
        String str7 = (i & 16) != 0 ? ccs0Var.e : str2;
        Integer num2 = (i & 32) != 0 ? ccs0Var.f : num;
        boolean z5 = (i & 64) != 0 ? ccs0Var.g : z;
        boolean z6 = (i & 128) != 0 ? ccs0Var.h : z2;
        boolean z7 = (i & 256) != 0 ? ccs0Var.i : z3;
        boolean z8 = (i & 512) != 0 ? ccs0Var.t : z4;
        i3g1 i3g1Var2 = (i & 1024) != 0 ? ccs0Var.X : i3g1Var;
        c380 c380Var2 = (i & 2048) != 0 ? ccs0Var.Y : c380Var;
        v7u v7uVar2 = (i & 4096) != 0 ? ccs0Var.Z : v7uVar;
        String str8 = (i & 8192) != 0 ? ccs0Var.N0 : str3;
        tcs0 tcs0Var3 = tcs0Var2;
        t2c0 t2c0Var2 = (i & 16384) != 0 ? ccs0Var.O0 : t2c0Var;
        String str9 = (i & 32768) != 0 ? ccs0Var.P0 : str4;
        String str10 = (i & 65536) != 0 ? ccs0Var.Q0 : str5;
        hes0 hes0Var2 = (i & 131072) != 0 ? ccs0Var.R0 : hes0Var;
        imr0 imr0Var2 = (i & 262144) != 0 ? ccs0Var.S0 : imr0Var;
        ccs0Var.getClass();
        return new ccs0(tcs0Var3, str6, ee30Var2, tqw0Var2, str7, num2, z5, z6, z7, z8, i3g1Var2, c380Var2, v7uVar2, str8, t2c0Var2, str9, str10, hes0Var2, imr0Var2);
    }

    public final String L() {
        return this.N0;
    }

    public final ee30 b() {
        tqw0 tqw0VarG = g();
        if (tqw0VarG instanceof ee30) {
            return (ee30) tqw0VarG;
        }
        return null;
    }

    public final boolean b0() {
        if (this.i) {
            return true;
        }
        tqw0 tqw0VarG = g();
        return tqw0VarG != null ? tqw0VarG.b0() : false;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccs0)) {
            return false;
        }
        ccs0 ccs0Var = (ccs0) obj;
        if (!u890.j(this.a, ccs0Var.a)) {
            return false;
        }
        String str = ccs0Var.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        if (!zEquals || !u890.j(this.c, ccs0Var.c) || !u890.j(this.d, ccs0Var.d) || !u890.j(this.e, ccs0Var.e) || !u890.j(this.f, ccs0Var.f) || this.g != ccs0Var.g || this.h != ccs0Var.h || this.i != ccs0Var.i || this.t != ccs0Var.t || !u890.j(this.X, ccs0Var.X) || !u890.j(this.Y, ccs0Var.Y) || !u890.j(this.Z, ccs0Var.Z)) {
            return false;
        }
        String str3 = ccs0Var.N0;
        String str4 = this.N0;
        if (str4 == null) {
            if (str3 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (str3 == null) {
            zEquals2 = false;
        } else {
            zEquals2 = str4.equals(str3);
        }
        if (!zEquals2 || !u890.j(this.O0, ccs0Var.O0)) {
            return false;
        }
        String str5 = ccs0Var.P0;
        String str6 = this.P0;
        if (str6 == null) {
            if (str5 == null) {
                zEquals3 = true;
            } else {
                zEquals3 = false;
            }
        } else if (str5 == null) {
            zEquals3 = false;
        } else {
            nl7 nl7Var = v4t.b;
            zEquals3 = str6.equals(str5);
        }
        if (!zEquals3) {
            return false;
        }
        String str7 = ccs0Var.Q0;
        String str8 = this.Q0;
        if (str8 == null) {
            if (str7 == null) {
                zEquals4 = true;
            } else {
                zEquals4 = false;
            }
        } else if (str7 == null) {
            zEquals4 = false;
        } else {
            nl7 nl7Var2 = bp21.b;
            zEquals4 = str8.equals(str7);
        }
        return zEquals4 && u890.j(this.R0, ccs0Var.R0) && u890.j(this.S0, ccs0Var.S0);
    }

    public final tqw0 g() {
        tqw0 tqw0Var = this.d;
        return tqw0Var == null ? this.c : tqw0Var;
    }

    public final xbs0 h() {
        Object next;
        Iterator it = this.a.f.iterator();
        while (it.hasNext()) {
            next = it.next();
            String str = ((xbs0) next).a;
            String str2 = this.b;
            if (str2 == null ? false : u890.j(str, str2)) {
                return (xbs0) next;
            }
        }
        next = null;
        return (xbs0) next;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ee30 ee30Var = this.c;
        int iHashCode5 = (iHashCode4 + (ee30Var == null ? 0 : ee30Var.hashCode())) * 31;
        tqw0 tqw0Var = this.d;
        int iHashCode6 = (iHashCode5 + (tqw0Var == null ? 0 : tqw0Var.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int iF = kk0.f(this.Y, (this.X.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode7 + (num == null ? 0 : num.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.t)) * 31, 31);
        v7u v7uVar = this.Z;
        int iHashCode8 = (iF + (v7uVar == null ? 0 : v7uVar.a.hashCode())) * 31;
        String str3 = this.N0;
        int iHashCode9 = (this.O0.hashCode() + ((iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.P0;
        if (str4 == null) {
            iHashCode = 0;
        } else {
            nl7 nl7Var = v4t.b;
            iHashCode = str4.hashCode();
        }
        int i = (iHashCode9 + iHashCode) * 31;
        String str5 = this.Q0;
        if (str5 == null) {
            iHashCode2 = 0;
        } else {
            nl7 nl7Var2 = bp21.b;
            iHashCode2 = str5.hashCode();
        }
        int i2 = (i + iHashCode2) * 31;
        hes0 hes0Var = this.R0;
        int iHashCode10 = (i2 + (hes0Var == null ? 0 : hes0Var.hashCode())) * 31;
        imr0 imr0Var = this.S0;
        return iHashCode10 + (imr0Var != null ? imr0Var.hashCode() : 0);
    }

    public final String j() {
        return this.b;
    }

    public final String q() {
        return this.a.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        String str = this.b;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        ee30 ee30Var = this.c;
        if (ee30Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ee30Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        this.X.writeToParcel(parcel, i);
        Iterator itL = x0d.l(this.Y, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
        parcel.writeParcelable(this.Z, i);
        String str2 = this.N0;
        parcel.writeParcelable(str2 != null ? new ei31(str2) : null, i);
        this.O0.writeToParcel(parcel, i);
        String str3 = this.P0;
        if (str3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nl7 nl7Var = v4t.b;
            parcel.writeString(str3);
        }
        String str4 = this.Q0;
        if (str4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nl7 nl7Var2 = bp21.b;
            parcel.writeString(str4);
        }
        hes0 hes0Var = this.R0;
        if (hes0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hes0Var.writeToParcel(parcel, i);
        }
        imr0 imr0Var = this.S0;
        if (imr0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imr0Var.writeToParcel(parcel, i);
        }
    }
}
