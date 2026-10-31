package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lqa extends nqa {
    public static final Parcelable.Creator<lqa> CREATOR = new ux9(26);
    public final List N0;
    public final cuu0 O0;
    public final String X;
    public final int Y;
    public final llw0 Z;
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final String e;
    public final String f;
    public final String g;
    public final wkt h;
    public final String i;
    public final String t;

    public /* synthetic */ lqa(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, String str, String str2, String str3, String str4, String str5, String str6, int i2, llw0 llw0Var, ArrayList arrayList, cuu0 cuu0Var, int i3) {
        this(i, z771Var, ez61Var, wa71Var, str, str2, str3, (wkt) null, str4, str5, str6, i2, llw0Var, (i3 & 8192) != 0 ? z6x.a : arrayList, cuu0Var);
    }

    public static lqa n(lqa lqaVar, int i, String str, wkt wktVar, String str2, String str3, String str4, int i2, llw0 llw0Var, List list, cuu0 cuu0Var, int i3) {
        return new lqa((i3 & 1) != 0 ? lqaVar.a : i, lqaVar.b, lqaVar.c, lqaVar.d, (i3 & 16) != 0 ? lqaVar.e : str, lqaVar.f, lqaVar.g, (i3 & 128) != 0 ? lqaVar.h : wktVar, (i3 & 256) != 0 ? lqaVar.i : str2, (i3 & 512) != 0 ? lqaVar.t : str3, (i3 & 1024) != 0 ? lqaVar.X : str4, (i3 & 2048) != 0 ? lqaVar.Y : i2, (i3 & 4096) != 0 ? lqaVar.Z : llw0Var, (i3 & 8192) != 0 ? lqaVar.N0 : list, (i3 & 16384) != 0 ? lqaVar.O0 : cuu0Var);
    }

    public final ez61 a() {
        return this.c;
    }

    public final String b() {
        return this.g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqa)) {
            return false;
        }
        lqa lqaVar = (lqa) obj;
        return this.a == lqaVar.a && u890.j(this.b, lqaVar.b) && u890.j(this.c, lqaVar.c) && u890.j(this.d, lqaVar.d) && u890.j(this.e, lqaVar.e) && u890.j(this.f, lqaVar.f) && u890.j(this.g, lqaVar.g) && u890.j(this.h, lqaVar.h) && u890.j(this.i, lqaVar.i) && u890.j(this.t, lqaVar.t) && u890.j(this.X, lqaVar.X) && this.Y == lqaVar.Y && u890.j(this.Z, lqaVar.Z) && u890.j(this.N0, lqaVar.N0) && u890.j(this.O0, lqaVar.O0);
    }

    public final String g() {
        return this.e;
    }

    public final String getDescription() {
        return this.f;
    }

    public final z771 h() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d((this.d.hashCode() + pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31)) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        wkt wktVar = this.h;
        int iB = f4i1.b((this.Z.hashCode() + kaa0.f(this.Y, cy30.d(cy30.d(cy30.d((iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31, 31, this.i), 31, this.t), 31, this.X), 31)) * 31, 31, this.N0);
        cuu0 cuu0Var = this.O0;
        return iB + (cuu0Var != null ? cuu0Var.hashCode() : 0);
    }

    public final int j() {
        return this.a;
    }

    public final wa71 k() {
        return this.d;
    }

    public final wkt l() {
        return this.h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y);
        parcel.writeParcelable(this.Z, i);
        Iterator itM = kk0.m(parcel, this.N0);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.O0, i);
    }

    public lqa(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, String str, String str2, String str3, wkt wktVar, String str4, String str5, String str6, int i2, llw0 llw0Var, List list, cuu0 cuu0Var) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = wktVar;
        this.i = str4;
        this.t = str5;
        this.X = str6;
        this.Y = i2;
        this.Z = llw0Var;
        this.N0 = list;
        this.O0 = cuu0Var;
    }
}
