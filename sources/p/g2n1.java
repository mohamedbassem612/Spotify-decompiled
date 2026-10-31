package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g2n1 implements Parcelable {
    public static final Parcelable.Creator<g2n1> CREATOR = new ynm1((byte) 15);
    public final String a;
    public final r2n1 b;
    public final dce0 c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;

    public g2n1(String str, r2n1 r2n1Var, dce0 dce0Var, List list, boolean z, boolean z2, boolean z3, List list2) {
        this.a = str;
        this.b = r2n1Var;
        this.c = dce0Var;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = list2;
    }

    public static g2n1 a(g2n1 g2n1Var, dce0 dce0Var, List list, boolean z, boolean z2, boolean z3, ArrayList arrayList, int i) {
        String str = g2n1Var.a;
        r2n1 r2n1Var = g2n1Var.b;
        if ((i & 4) != 0) {
            dce0Var = g2n1Var.c;
        }
        dce0 dce0Var2 = dce0Var;
        if ((i & 8) != 0) {
            list = g2n1Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = g2n1Var.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = g2n1Var.f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = g2n1Var.g;
        }
        boolean z6 = z3;
        List list3 = (i & 128) != 0 ? g2n1Var.h : arrayList;
        g2n1Var.getClass();
        return new g2n1(str, r2n1Var, dce0Var2, list2, z4, z5, z6, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2n1)) {
            return false;
        }
        g2n1 g2n1Var = (g2n1) obj;
        return u890.j(this.a, g2n1Var.a) && u890.j(this.b, g2n1Var.b) && u890.j(this.c, g2n1Var.c) && this.d.equals(g2n1Var.d) && this.e == g2n1Var.e && this.f == g2n1Var.f && this.g == g2n1Var.g && u890.j(this.h, g2n1Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(f4i1.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeValue(this.b);
        parcel.writeParcelable(this.c, i);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            ((wro0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        Iterator itM2 = kk0.m(parcel, this.h);
        while (itM2.hasNext()) {
            ((q9t) itM2.next()).writeToParcel(parcel, i);
        }
    }
}
