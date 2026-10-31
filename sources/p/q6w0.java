package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q6w0 implements Parcelable {
    public static final Parcelable.Creator<q6w0> CREATOR = new g0v0(28);
    public final ox30 N0;
    public final ox30 O0;
    public final x6b P0;
    public final gez X;
    public final r920 Y;
    public final r920 Z;
    public final b8w0 a;
    public final buk1 b;
    public final hez c;
    public final fa20 d;
    public final px30 e;
    public final taa0 f;
    public final k7f0 g;
    public final s69 h;
    public final s69 i;
    public final gez t;

    public q6w0(b8w0 b8w0Var, buk1 buk1Var, hez hezVar, fa20 fa20Var, px30 px30Var, taa0 taa0Var, k7f0 k7f0Var, s69 s69Var, s69 s69Var2, gez gezVar, gez gezVar2, r920 r920Var, r920 r920Var2, ox30 ox30Var, ox30 ox30Var2, x6b x6bVar) {
        this.a = b8w0Var;
        this.b = buk1Var;
        this.c = hezVar;
        this.d = fa20Var;
        this.e = px30Var;
        this.f = taa0Var;
        this.g = k7f0Var;
        this.h = s69Var;
        this.i = s69Var2;
        this.t = gezVar;
        this.X = gezVar2;
        this.Y = r920Var;
        this.Z = r920Var2;
        this.N0 = ox30Var;
        this.O0 = ox30Var2;
        this.P0 = x6bVar;
    }

    public static q6w0 a(q6w0 q6w0Var, buk1 buk1Var, hez hezVar, fa20 fa20Var, px30 px30Var, taa0 taa0Var, k7f0 k7f0Var, s69 s69Var, s69 s69Var2, gez gezVar, gez gezVar2, r920 r920Var, r920 r920Var2, ox30 ox30Var, ox30 ox30Var2, x6b x6bVar, int i) {
        b8w0 b8w0Var = q6w0Var.a;
        buk1 buk1Var2 = (i & 2) != 0 ? q6w0Var.b : buk1Var;
        hez hezVar2 = (i & 4) != 0 ? q6w0Var.c : hezVar;
        fa20 fa20Var2 = (i & 8) != 0 ? q6w0Var.d : fa20Var;
        px30 px30Var2 = (i & 16) != 0 ? q6w0Var.e : px30Var;
        taa0 taa0Var2 = (i & 32) != 0 ? q6w0Var.f : taa0Var;
        k7f0 k7f0Var2 = (i & 64) != 0 ? q6w0Var.g : k7f0Var;
        s69 s69Var3 = (i & 128) != 0 ? q6w0Var.h : s69Var;
        s69 s69Var4 = (i & 256) != 0 ? q6w0Var.i : s69Var2;
        gez gezVar3 = (i & 512) != 0 ? q6w0Var.t : gezVar;
        gez gezVar4 = (i & 1024) != 0 ? q6w0Var.X : gezVar2;
        r920 r920Var3 = (i & 2048) != 0 ? q6w0Var.Y : r920Var;
        r920 r920Var4 = (i & 4096) != 0 ? q6w0Var.Z : r920Var2;
        ox30 ox30Var3 = (i & 8192) != 0 ? q6w0Var.N0 : ox30Var;
        ox30 ox30Var4 = (i & 16384) != 0 ? q6w0Var.O0 : ox30Var2;
        x6b x6bVar2 = (i & 32768) != 0 ? q6w0Var.P0 : x6bVar;
        q6w0Var.getClass();
        return new q6w0(b8w0Var, buk1Var2, hezVar2, fa20Var2, px30Var2, taa0Var2, k7f0Var2, s69Var3, s69Var4, gezVar3, gezVar4, r920Var3, r920Var4, ox30Var3, ox30Var4, x6bVar2);
    }

    public final k7f0 B() {
        return this.g;
    }

    public final s69 F() {
        return this.i;
    }

    public final s69 H() {
        return this.h;
    }

    public final buk1 K() {
        return this.b;
    }

    public final gez b() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6w0)) {
            return false;
        }
        q6w0 q6w0Var = (q6w0) obj;
        return this.a == q6w0Var.a && u890.j(this.b, q6w0Var.b) && u890.j(this.c, q6w0Var.c) && u890.j(this.d, q6w0Var.d) && u890.j(this.e, q6w0Var.e) && u890.j(this.f, q6w0Var.f) && u890.j(this.g, q6w0Var.g) && u890.j(this.h, q6w0Var.h) && u890.j(this.i, q6w0Var.i) && u890.j(this.t, q6w0Var.t) && u890.j(this.X, q6w0Var.X) && u890.j(this.Y, q6w0Var.Y) && u890.j(this.Z, q6w0Var.Z) && u890.j(this.N0, q6w0Var.N0) && u890.j(this.O0, q6w0Var.O0) && u890.j(this.P0, q6w0Var.P0);
    }

    public final gez g() {
        return this.t;
    }

    public final hez h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        buk1 buk1Var = this.b;
        int iHashCode2 = (iHashCode + (buk1Var == null ? 0 : buk1Var.a.hashCode())) * 31;
        hez hezVar = this.c;
        int iHashCode3 = (iHashCode2 + (hezVar == null ? 0 : hezVar.a.hashCode())) * 31;
        fa20 fa20Var = this.d;
        int iHashCode4 = (iHashCode3 + (fa20Var == null ? 0 : fa20Var.a.hashCode())) * 31;
        px30 px30Var = this.e;
        int iHashCode5 = (iHashCode4 + (px30Var == null ? 0 : px30Var.a.hashCode())) * 31;
        taa0 taa0Var = this.f;
        int iHashCode6 = (iHashCode5 + (taa0Var == null ? 0 : taa0Var.a.hashCode())) * 31;
        k7f0 k7f0Var = this.g;
        int iHashCode7 = (iHashCode6 + (k7f0Var == null ? 0 : k7f0Var.a.hashCode())) * 31;
        s69 s69Var = this.h;
        int iHashCode8 = (iHashCode7 + (s69Var == null ? 0 : s69Var.hashCode())) * 31;
        s69 s69Var2 = this.i;
        int iHashCode9 = (iHashCode8 + (s69Var2 == null ? 0 : s69Var2.hashCode())) * 31;
        gez gezVar = this.t;
        int iHashCode10 = (iHashCode9 + (gezVar == null ? 0 : gezVar.hashCode())) * 31;
        gez gezVar2 = this.X;
        int iHashCode11 = (iHashCode10 + (gezVar2 == null ? 0 : gezVar2.hashCode())) * 31;
        r920 r920Var = this.Y;
        int iHashCode12 = (iHashCode11 + (r920Var == null ? 0 : r920Var.hashCode())) * 31;
        r920 r920Var2 = this.Z;
        int iHashCode13 = (iHashCode12 + (r920Var2 == null ? 0 : r920Var2.hashCode())) * 31;
        ox30 ox30Var = this.N0;
        int iHashCode14 = (iHashCode13 + (ox30Var == null ? 0 : ox30Var.hashCode())) * 31;
        ox30 ox30Var2 = this.O0;
        int iHashCode15 = (iHashCode14 + (ox30Var2 == null ? 0 : ox30Var2.hashCode())) * 31;
        x6b x6bVar = this.P0;
        return iHashCode15 + (x6bVar != null ? x6bVar.a.hashCode() : 0);
    }

    public final fa20 j() {
        return this.d;
    }

    public final r920 k() {
        return this.Z;
    }

    public final r920 l() {
        return this.Y;
    }

    public final ox30 n() {
        return this.O0;
    }

    public final ox30 r() {
        return this.N0;
    }

    public final px30 s() {
        return this.e;
    }

    public final taa0 t() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        buk1 buk1Var = this.b;
        if (buk1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buk1Var.writeToParcel(parcel, i);
        }
        hez hezVar = this.c;
        if (hezVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hezVar.writeToParcel(parcel, i);
        }
        fa20 fa20Var = this.d;
        if (fa20Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fa20Var.writeToParcel(parcel, i);
        }
        px30 px30Var = this.e;
        if (px30Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            px30Var.writeToParcel(parcel, i);
        }
        taa0 taa0Var = this.f;
        if (taa0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            taa0Var.writeToParcel(parcel, i);
        }
        k7f0 k7f0Var = this.g;
        if (k7f0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            k7f0Var.writeToParcel(parcel, i);
        }
        s69 s69Var = this.h;
        if (s69Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s69Var.writeToParcel(parcel, i);
        }
        s69 s69Var2 = this.i;
        if (s69Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s69Var2.writeToParcel(parcel, i);
        }
        gez gezVar = this.t;
        if (gezVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gezVar.writeToParcel(parcel, i);
        }
        gez gezVar2 = this.X;
        if (gezVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gezVar2.writeToParcel(parcel, i);
        }
        r920 r920Var = this.Y;
        if (r920Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r920Var.writeToParcel(parcel, i);
        }
        r920 r920Var2 = this.Z;
        if (r920Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r920Var2.writeToParcel(parcel, i);
        }
        ox30 ox30Var = this.N0;
        if (ox30Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ox30Var.writeToParcel(parcel, i);
        }
        ox30 ox30Var2 = this.O0;
        if (ox30Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ox30Var2.writeToParcel(parcel, i);
        }
        x6b x6bVar = this.P0;
        if (x6bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            x6bVar.writeToParcel(parcel, i);
        }
    }

    public final x6b x() {
        return this.P0;
    }

    public /* synthetic */ q6w0(b8w0 b8w0Var, int i) {
        this((i & 1) != 0 ? b8w0.Unknown : b8w0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
