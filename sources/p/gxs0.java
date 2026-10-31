package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gxs0 extends jxs0 {
    public static final Parcelable.Creator<gxs0> CREATOR = new bis0((byte) 11);
    public final String a;
    public final int b;
    public final xl81 c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final boolean g;

    public gxs0(String str, int i, xl81 xl81Var, boolean z, boolean z2, List list, boolean z3) {
        this.a = str;
        this.b = i;
        this.c = xl81Var;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = z3;
    }

    public static gxs0 a(gxs0 gxs0Var, boolean z, ArrayList arrayList, boolean z2, int i) {
        String str = gxs0Var.a;
        int i2 = gxs0Var.b;
        xl81 xl81Var = gxs0Var.c;
        if ((i & 8) != 0) {
            z = gxs0Var.d;
        }
        boolean z3 = z;
        boolean z4 = (i & 16) != 0 ? gxs0Var.e : true;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = gxs0Var.f;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            z2 = gxs0Var.g;
        }
        gxs0Var.getClass();
        return new gxs0(str, i2, xl81Var, z3, z4, list2, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxs0)) {
            return false;
        }
        gxs0 gxs0Var = (gxs0) obj;
        return u890.j(this.a, gxs0Var.a) && this.b == gxs0Var.b && u890.j(this.c, gxs0Var.c) && this.d == gxs0Var.d && this.e == gxs0Var.e && u890.j(this.f, gxs0Var.f) && this.g == gxs0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + f4i1.b(xcg1.g(xcg1.g((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeStringList(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public /* synthetic */ gxs0(String str, int i, xl81 xl81Var, boolean z, List list, int i2) {
        this(str, i, xl81Var, z, false, list, false);
    }
}
