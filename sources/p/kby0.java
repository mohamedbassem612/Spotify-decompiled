package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kby0 extends mby0 {
    public static final Parcelable.Creator<kby0> CREATOR = new zzx0((byte) 13);
    public final int a;
    public final z771 b;
    public final wa71 c;
    public final wkt d;
    public final String e;
    public final String f;
    public final String g;
    public final llw0 h;
    public final List i;
    public final int t;

    public kby0(int i, z771 z771Var, wa71 wa71Var, wkt wktVar, String str, String str2, String str3, llw0 llw0Var, List list, int i2) {
        this.a = i;
        this.b = z771Var;
        this.c = wa71Var;
        this.d = wktVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = llw0Var;
        this.i = list;
        this.t = i2;
    }

    public static kby0 h(kby0 kby0Var, int i, wkt wktVar, llw0 llw0Var, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = kby0Var.a;
        }
        return new kby0(i, kby0Var.b, kby0Var.c, (i3 & 8) != 0 ? kby0Var.d : wktVar, kby0Var.e, kby0Var.f, kby0Var.g, (i3 & 128) != 0 ? kby0Var.h : llw0Var, kby0Var.i, (i3 & 512) != 0 ? kby0Var.t : i2);
    }

    public final z771 a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kby0)) {
            return false;
        }
        kby0 kby0Var = (kby0) obj;
        return this.a == kby0Var.a && u890.j(this.b, kby0Var.b) && u890.j(this.c, kby0Var.c) && u890.j(this.d, kby0Var.d) && u890.j(this.e, kby0Var.e) && u890.j(this.f, kby0Var.f) && u890.j(this.g, kby0Var.g) && u890.j(this.h, kby0Var.h) && u890.j(this.i, kby0Var.i) && this.t == kby0Var.t;
    }

    public final wa71 g() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xvj1.j(this.b.a, l1d.C(this.a) * 31, 31)) * 31;
        wkt wktVar = this.d;
        return Integer.hashCode(this.t) + f4i1.b((this.h.hashCode() + cy30.d(cy30.d(cy30.d((iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        Iterator itM = kk0.m(parcel, this.i);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.t);
    }
}
