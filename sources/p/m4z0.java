package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m4z0 implements kvb1 {
    public static final Parcelable.Creator<m4z0> CREATOR = new j1z0((byte) 8);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final ArrayList f;
    public final String g;
    public final List h;
    public final int i;
    public final int t;

    public m4z0(String str, String str2, String str3, Integer num, boolean z, ArrayList arrayList, String str4, List list, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = z;
        this.f = arrayList;
        this.g = str4;
        this.h = list;
        this.i = i;
        this.t = i2;
    }

    @Override // p.kvb1
    public final boolean K0(mvb1 mvb1Var) {
        return mvb1Var instanceof n4z0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4z0)) {
            return false;
        }
        m4z0 m4z0Var = (m4z0) obj;
        return u890.j(this.a, m4z0Var.a) && u890.j(this.b, m4z0Var.b) && u890.j(this.c, m4z0Var.c) && u890.j(this.d, m4z0Var.d) && this.e == m4z0Var.e && this.f.equals(m4z0Var.f) && u890.j(this.g, m4z0Var.g) && this.h.equals(m4z0Var.h) && this.i == m4z0Var.i && this.t == m4z0Var.t;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iF = p3d1.f(this.f, xcg1.g((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31);
        String str = this.g;
        return Integer.hashCode(this.t) + kaa0.f(this.i, f4i1.b((iF + (str != null ? str.hashCode() : 0)) * 31, 31, this.h), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.e ? 1 : 0);
        Iterator itO = xvj1.o(this.f, parcel);
        while (itO.hasNext()) {
            ((b4z0) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
        parcel.writeStringList(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.t);
    }
}
