package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wm2 implements Parcelable {
    public static final Parcelable.Creator<wm2> CREATOR = new ue2((byte) 18);
    public final int a;
    public final int b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final t2j1 g;

    public wm2(int i, int i2, List list, boolean z, boolean z2, int i3, t2j1 t2j1Var) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = i3;
        this.g = t2j1Var;
    }

    public static wm2 a(wm2 wm2Var, boolean z, boolean z2, t2j1 t2j1Var, int i) {
        int i2 = wm2Var.a;
        int i3 = wm2Var.b;
        List list = wm2Var.c;
        if ((i & 8) != 0) {
            z = wm2Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = wm2Var.e;
        }
        boolean z4 = z2;
        int i4 = wm2Var.f;
        if ((i & 64) != 0) {
            t2j1Var = wm2Var.g;
        }
        return new wm2(i2, i3, list, z3, z4, i4, t2j1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm2)) {
            return false;
        }
        wm2 wm2Var = (wm2) obj;
        return this.a == wm2Var.a && this.b == wm2Var.b && u890.j(this.c, wm2Var.c) && this.d == wm2Var.d && this.e == wm2Var.e && this.f == wm2Var.f && this.g == wm2Var.g;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.f, xcg1.g(xcg1.g(f4i1.b(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31);
        t2j1 t2j1Var = this.g;
        return iF + (t2j1Var == null ? 0 : t2j1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        t2j1 t2j1Var = this.g;
        if (t2j1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(t2j1Var.name());
        }
    }
}
