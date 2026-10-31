package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fl01 implements hl01 {
    public static final Parcelable.Creator<fl01> CREATOR = new sj01((byte) 13);
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;

    public fl01(String str, List list, String str2, String str3, List list2, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = list2;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
    }

    public static fl01 a(fl01 fl01Var, int i, boolean z, int i2, int i3, int i4) {
        String str = fl01Var.a;
        List list = fl01Var.b;
        String str2 = fl01Var.c;
        String str3 = fl01Var.d;
        List list2 = fl01Var.e;
        if ((i4 & 32) != 0) {
            i = fl01Var.f;
        }
        int i5 = i;
        if ((i4 & 64) != 0) {
            z = fl01Var.g;
        }
        boolean z2 = z;
        if ((i4 & 128) != 0) {
            i2 = fl01Var.h;
        }
        int i6 = i2;
        if ((i4 & 256) != 0) {
            i3 = fl01Var.i;
        }
        return new fl01(str, list, str2, str3, list2, i5, z2, i6, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl01)) {
            return false;
        }
        fl01 fl01Var = (fl01) obj;
        return u890.j(this.a, fl01Var.a) && this.b.equals(fl01Var.b) && u890.j(this.c, fl01Var.c) && u890.j(this.d, fl01Var.d) && this.e.equals(fl01Var.e) && this.f == fl01Var.f && this.g == fl01Var.g && this.h == fl01Var.h && this.i == fl01Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + kaa0.f(this.h, xcg1.g(kaa0.f(this.f, f4i1.b(cy30.d(cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator itM2 = kk0.m(parcel, this.e);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }
}
