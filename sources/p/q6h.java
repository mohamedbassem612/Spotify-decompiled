package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q6h extends s6h {
    public static final Parcelable.Creator<q6h> CREATOR = new i8g((byte) 28);
    public final int N0;
    public final List O0;
    public final sxq0 P0;
    public final cuu0 Q0;
    public final llw0 X;
    public final llw0 Y;
    public final List Z;
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final Set d;
    public final wa71 e;
    public final wkt f;
    public final String g;
    public final String h;
    public final String i;
    public final int t;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q6h(int i, z771 z771Var, ez61 ez61Var, Set set, wa71 wa71Var, String str, String str2, String str3, int i2, llw0 llw0Var, llw0 llw0Var2, ArrayList arrayList, int i3, ArrayList arrayList2, sxq0 sxq0Var, cuu0 cuu0Var, int i4) {
        int i5 = i4 & 4096;
        ArrayList arrayList3 = z6x.a;
        this(i, z771Var, ez61Var, set, wa71Var, (wkt) null, str, str2, str3, i2, llw0Var, llw0Var2, i5 != 0 ? arrayList3 : arrayList, (i4 & 8192) != 0 ? 0 : i3, (i4 & 16384) != 0 ? arrayList3 : arrayList2, (i4 & 32768) != 0 ? qxq0.a : sxq0Var, cuu0Var);
    }

    public static q6h l(q6h q6hVar, int i, wkt wktVar, String str, String str2, String str3, int i2, llw0 llw0Var, ilw0 ilw0Var, List list, int i3, ArrayList arrayList, sxq0 sxq0Var, cuu0 cuu0Var, int i4) {
        return new q6h((i4 & 1) != 0 ? q6hVar.a : i, q6hVar.b, q6hVar.c, q6hVar.d, q6hVar.e, (i4 & 32) != 0 ? q6hVar.f : wktVar, (i4 & 64) != 0 ? q6hVar.g : str, (i4 & 128) != 0 ? q6hVar.h : str2, (i4 & 256) != 0 ? q6hVar.i : str3, (i4 & 512) != 0 ? q6hVar.t : i2, (i4 & 1024) != 0 ? q6hVar.X : llw0Var, (i4 & 2048) != 0 ? q6hVar.Y : ilw0Var, (i4 & 4096) != 0 ? q6hVar.Z : list, (i4 & 8192) != 0 ? q6hVar.N0 : i3, (i4 & 16384) != 0 ? q6hVar.O0 : arrayList, (32768 & i4) != 0 ? q6hVar.P0 : sxq0Var, (i4 & 65536) != 0 ? q6hVar.Q0 : cuu0Var);
    }

    public final Set a() {
        return this.d;
    }

    public final ez61 b() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6h)) {
            return false;
        }
        q6h q6hVar = (q6h) obj;
        return this.a == q6hVar.a && u890.j(this.b, q6hVar.b) && u890.j(this.c, q6hVar.c) && u890.j(this.d, q6hVar.d) && u890.j(this.e, q6hVar.e) && u890.j(this.f, q6hVar.f) && u890.j(this.g, q6hVar.g) && u890.j(this.h, q6hVar.h) && u890.j(this.i, q6hVar.i) && this.t == q6hVar.t && u890.j(this.X, q6hVar.X) && u890.j(this.Y, q6hVar.Y) && u890.j(this.Z, q6hVar.Z) && this.N0 == q6hVar.N0 && u890.j(this.O0, q6hVar.O0) && u890.j(this.P0, q6hVar.P0) && u890.j(this.Q0, q6hVar.Q0);
    }

    public final z771 g() {
        return this.b;
    }

    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + gvg.c(pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31), 31, this.d)) * 31;
        wkt wktVar = this.f;
        int iHashCode2 = (this.P0.hashCode() + f4i1.b(kaa0.f(this.N0, f4i1.b((this.Y.hashCode() + ((this.X.hashCode() + kaa0.f(this.t, cy30.d(cy30.d(cy30.d((iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31)) * 31)) * 31, 31, this.Z), 31), 31, this.O0)) * 31;
        cuu0 cuu0Var = this.Q0;
        return iHashCode2 + (cuu0Var != null ? cuu0Var.hashCode() : 0);
    }

    public final wa71 j() {
        return this.e;
    }

    public final wkt k() {
        return this.f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        Iterator itH = k4s0.h(this.d, parcel);
        while (itH.hasNext()) {
            parcel.writeString(((a7h) itH.next()).name());
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.t);
        parcel.writeParcelable(this.X, i);
        parcel.writeParcelable(this.Y, i);
        Iterator itM = kk0.m(parcel, this.Z);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.N0);
        Iterator itM2 = kk0.m(parcel, this.O0);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
        parcel.writeParcelable(this.P0, i);
        parcel.writeParcelable(this.Q0, i);
    }

    public q6h(int i, z771 z771Var, ez61 ez61Var, Set set, wa71 wa71Var, wkt wktVar, String str, String str2, String str3, int i2, llw0 llw0Var, llw0 llw0Var2, List list, int i3, List list2, sxq0 sxq0Var, cuu0 cuu0Var) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = set;
        this.e = wa71Var;
        this.f = wktVar;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.t = i2;
        this.X = llw0Var;
        this.Y = llw0Var2;
        this.Z = list;
        this.N0 = i3;
        this.O0 = list2;
        this.P0 = sxq0Var;
        this.Q0 = cuu0Var;
    }
}
