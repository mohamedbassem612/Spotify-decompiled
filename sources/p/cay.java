package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cay implements Parcelable {
    public static final Parcelable.Creator<cay> CREATOR = new utx((byte) 16);
    public static final dt71 X;
    public static final dt71 Y;
    public final String a;
    public final cqs0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final String i;
    public final ArrayList t;

    static {
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        X = dt71VarE;
        Y = dt71VarE;
    }

    public cay(String str, cqs0 cqs0Var, int i, int i2, int i3, int i4, int i5, boolean z, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = cqs0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = str2;
        this.t = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cay)) {
            return false;
        }
        cay cayVar = (cay) obj;
        return u890.j(this.a, cayVar.a) && u890.j(this.b, cayVar.b) && this.c == cayVar.c && this.d == cayVar.d && this.e == cayVar.e && this.f == cayVar.f && this.g == cayVar.g && this.h == cayVar.h && u890.j(this.i, cayVar.i) && this.t.equals(cayVar.t);
    }

    public final int hashCode() {
        int iG = xcg1.g(ab80.k(this.g, ab80.k(this.f, kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31, this.h);
        String str = this.i;
        return this.t.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeString(this.a);
        m7 m7Var = this.b;
        parcel.writeInt(m7Var.c());
        for (Map.Entry entry : m7Var.a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        int i2 = this.f;
        if (i2 == 1) {
            str = "CLASSIC";
        } else if (i2 == 2) {
            str = "WIDE";
        } else if (i2 == 3) {
            str = "NARROW";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "SLANTED";
        }
        parcel.writeString(str);
        int i3 = this.g;
        if (i3 == 1) {
            str2 = "LEFT";
        } else if (i3 == 2) {
            str2 = "CENTER";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "RIGHT";
        }
        parcel.writeString(str2);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        Iterator itO = xvj1.o(this.t, parcel);
        while (itO.hasNext()) {
            ((v5t0) itO.next()).writeToParcel(parcel, i);
        }
    }
}
