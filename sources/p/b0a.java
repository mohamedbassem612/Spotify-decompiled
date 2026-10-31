package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b0a implements Parcelable {
    public static final Parcelable.Creator<b0a> CREATOR = new ux9(11);
    public final cqs0 N0;
    public final String O0;
    public final Boolean P0;
    public final z771 Q0;
    public final dmt R0;
    public final wkt S0;
    public final String X;
    public final String Y;
    public final dqi1 Z;
    public final String a;
    public final int b;
    public final c380 c;
    public final jlw0 d;
    public final int e;
    public final pz9 f;
    public final oz9 g;
    public final ez61 h;
    public final ela1 i;
    public final String t;

    public b0a(String str, int i, c380 c380Var, jlw0 jlw0Var, int i2, pz9 pz9Var, oz9 oz9Var, ez61 ez61Var, ela1 ela1Var, String str2, String str3, String str4, dqi1 dqi1Var, cqs0 cqs0Var, String str5, Boolean bool, z771 z771Var, dmt dmtVar, wkt wktVar) {
        this.a = str;
        this.b = i;
        this.c = c380Var;
        this.d = jlw0Var;
        this.e = i2;
        this.f = pz9Var;
        this.g = oz9Var;
        this.h = ez61Var;
        this.i = ela1Var;
        this.t = str2;
        this.X = str3;
        this.Y = str4;
        this.Z = dqi1Var;
        this.N0 = cqs0Var;
        this.O0 = str5;
        this.P0 = bool;
        this.Q0 = z771Var;
        this.R0 = dmtVar;
        this.S0 = wktVar;
    }

    public static b0a a(b0a b0aVar, int i, wkt wktVar, int i2) {
        return new b0a(b0aVar.a, (i2 & 2) != 0 ? b0aVar.b : i, b0aVar.c, b0aVar.d, b0aVar.e, b0aVar.f, b0aVar.g, b0aVar.h, b0aVar.i, b0aVar.t, b0aVar.X, b0aVar.Y, b0aVar.Z, b0aVar.N0, b0aVar.O0, b0aVar.P0, b0aVar.Q0, b0aVar.R0, (i2 & 262144) != 0 ? b0aVar.S0 : wktVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0a)) {
            return false;
        }
        b0a b0aVar = (b0a) obj;
        return u890.j(this.a, b0aVar.a) && this.b == b0aVar.b && u890.j(this.c, b0aVar.c) && u890.j(this.d, b0aVar.d) && this.e == b0aVar.e && u890.j(this.f, b0aVar.f) && u890.j(this.g, b0aVar.g) && u890.j(this.h, b0aVar.h) && u890.j(this.i, b0aVar.i) && u890.j(this.t, b0aVar.t) && u890.j(this.X, b0aVar.X) && u890.j(this.Y, b0aVar.Y) && u890.j(this.Z, b0aVar.Z) && u890.j(this.N0, b0aVar.N0) && u890.j(this.O0, b0aVar.O0) && u890.j(this.P0, b0aVar.P0) && u890.j(this.Q0, b0aVar.Q0) && u890.j(this.R0, b0aVar.R0) && u890.j(this.S0, b0aVar.S0);
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
        jlw0 jlw0Var = this.d;
        int iK = ab80.k(this.e, (iF + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31, 31);
        pz9 pz9Var = this.f;
        int iHashCode = (iK + (pz9Var == null ? 0 : pz9Var.hashCode())) * 31;
        oz9 oz9Var = this.g;
        int iHashCode2 = (this.i.hashCode() + pze0.f(this.h, (iHashCode + (oz9Var == null ? 0 : oz9Var.hashCode())) * 31, 31)) * 31;
        String str = this.t;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.X;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.Y;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        dqi1 dqi1Var = this.Z;
        int iHashCode6 = (this.N0.hashCode() + ((iHashCode5 + (dqi1Var == null ? 0 : dqi1Var.hashCode())) * 31)) * 31;
        String str4 = this.O0;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.P0;
        int iHashCode8 = (this.R0.hashCode() + xvj1.j(this.Q0.a, (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31, 31)) * 31;
        wkt wktVar = this.S0;
        return iHashCode8 + (wktVar != null ? wktVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        Iterator itL = x0d.l(this.c, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeString(lf51.q(this.e));
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeParcelable(this.Z, i);
        m7 m7Var = this.N0;
        parcel.writeInt(m7Var.c());
        for (Map.Entry entry : m7Var.a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.O0);
        Boolean bool = this.P0;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeParcelable(this.Q0, i);
        parcel.writeParcelable(this.R0, i);
    }
}
