package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a0a implements Parcelable {
    public static final Parcelable.Creator<a0a> CREATOR = new ux9((byte) 10);
    public final oz9 N0;
    public final z771 O0;
    public final ez61 P0;
    public final dmt Q0;
    public final String X;
    public final Boolean Y;
    public final pz9 Z;
    public final String a;
    public final ArrayList b;
    public final jlw0 c;
    public final int d;
    public final ela1 e;
    public final String f;
    public final String g;
    public final String h;
    public final dqi1 i;
    public final cqs0 t;

    public a0a(String str, ArrayList arrayList, jlw0 jlw0Var, int i, ela1 ela1Var, String str2, String str3, String str4, dqi1 dqi1Var, cqs0 cqs0Var, String str5, Boolean bool, pz9 pz9Var, oz9 oz9Var, z771 z771Var, ez61 ez61Var, dmt dmtVar) {
        this.a = str;
        this.b = arrayList;
        this.c = jlw0Var;
        this.d = i;
        this.e = ela1Var;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = dqi1Var;
        this.t = cqs0Var;
        this.X = str5;
        this.Y = bool;
        this.Z = pz9Var;
        this.N0 = oz9Var;
        this.O0 = z771Var;
        this.P0 = ez61Var;
        this.Q0 = dmtVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0a)) {
            return false;
        }
        a0a a0aVar = (a0a) obj;
        return u890.j(this.a, a0aVar.a) && this.b.equals(a0aVar.b) && u890.j(this.c, a0aVar.c) && this.d == a0aVar.d && u890.j(this.e, a0aVar.e) && u890.j(this.f, a0aVar.f) && u890.j(this.g, a0aVar.g) && u890.j(this.h, a0aVar.h) && u890.j(this.i, a0aVar.i) && u890.j(this.t, a0aVar.t) && u890.j(this.X, a0aVar.X) && u890.j(this.Y, a0aVar.Y) && u890.j(this.Z, a0aVar.Z) && u890.j(this.N0, a0aVar.N0) && u890.j(this.O0, a0aVar.O0) && u890.j(this.P0, a0aVar.P0) && u890.j(this.Q0, a0aVar.Q0);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        jlw0 jlw0Var = this.c;
        int iHashCode = (this.e.hashCode() + ab80.k(this.d, (iF + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31, 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        dqi1 dqi1Var = this.i;
        int iHashCode5 = (this.t.hashCode() + ((iHashCode4 + (dqi1Var == null ? 0 : dqi1Var.hashCode())) * 31)) * 31;
        String str4 = this.X;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.Y;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        pz9 pz9Var = this.Z;
        int iHashCode8 = (iHashCode7 + (pz9Var == null ? 0 : pz9Var.hashCode())) * 31;
        oz9 oz9Var = this.N0;
        return this.Q0.hashCode() + pze0.f(this.P0, xvj1.j(this.O0.a, (iHashCode8 + (oz9Var != null ? oz9Var.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        parcel.writeParcelable(this.c, i);
        parcel.writeString(lf51.q(this.d));
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        m7 m7Var = this.t;
        parcel.writeInt(m7Var.c());
        for (Map.Entry entry : m7Var.a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.X);
        Boolean bool = this.Y;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeParcelable(this.Z, i);
        parcel.writeParcelable(this.N0, i);
        parcel.writeParcelable(this.O0, i);
        parcel.writeParcelable(this.P0, i);
        parcel.writeParcelable(this.Q0, i);
    }
}
