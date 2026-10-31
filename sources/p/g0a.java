package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g0a extends c871 {
    public static final Parcelable.Creator<g0a> CREATOR = new ux9((byte) 12);
    public final oz9 X;
    public final dmt Y;
    public final ArrayList a;
    public final jlw0 b;
    public final String c;
    public final String d;
    public final String e;
    public final dqi1 f;
    public final LinkedHashMap g;
    public final String h;
    public final Boolean i;
    public final pz9 t;

    public g0a(ArrayList arrayList, jlw0 jlw0Var, String str, String str2, String str3, dqi1 dqi1Var, LinkedHashMap linkedHashMap, String str4, Boolean bool, pz9 pz9Var, oz9 oz9Var, dmt dmtVar) {
        this.a = arrayList;
        this.b = jlw0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = dqi1Var;
        this.g = linkedHashMap;
        this.h = str4;
        this.i = bool;
        this.t = pz9Var;
        this.X = oz9Var;
        this.Y = dmtVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0a)) {
            return false;
        }
        g0a g0aVar = (g0a) obj;
        return this.a.equals(g0aVar.a) && u890.j(this.b, g0aVar.b) && u890.j(this.c, g0aVar.c) && u890.j(this.d, g0aVar.d) && u890.j(this.e, g0aVar.e) && u890.j(this.f, g0aVar.f) && this.g.equals(g0aVar.g) && u890.j(this.h, g0aVar.h) && u890.j(this.i, g0aVar.i) && u890.j(this.t, g0aVar.t) && u890.j(this.X, g0aVar.X) && u890.j(this.Y, g0aVar.Y);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jlw0 jlw0Var = this.b;
        int iHashCode2 = (iHashCode + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        dqi1 dqi1Var = this.f;
        int iHashCode6 = (this.g.hashCode() + ((iHashCode5 + (dqi1Var == null ? 0 : dqi1Var.hashCode())) * 31)) * 31;
        String str4 = this.h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        pz9 pz9Var = this.t;
        int iHashCode9 = (iHashCode8 + (pz9Var == null ? 0 : pz9Var.hashCode())) * 31;
        oz9 oz9Var = this.X;
        return this.Y.hashCode() + ((iHashCode9 + (oz9Var != null ? oz9Var.hashCode() : 0)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        LinkedHashMap linkedHashMap = this.g;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.h);
        Boolean bool = this.i;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        pz9 pz9Var = this.t;
        if (pz9Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pz9Var.writeToParcel(parcel, i);
        }
        oz9 oz9Var = this.X;
        if (oz9Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oz9Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.Y, i);
    }
}
