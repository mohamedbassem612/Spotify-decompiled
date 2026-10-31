package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j8x0 implements Parcelable {
    public static final Parcelable.Creator<j8x0> CREATOR = new agm0((byte) 9);
    public static final j8x0 h;
    public final int a;
    public final List b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    static {
        j8x0 j8x0Var = new j8x0(1, z6x.a, null, false, 124);
        h = j8x0Var;
        a(j8x0Var, 2, null, null, false, false, 0, 0, 126);
        a(j8x0Var, 4, null, null, false, false, 0, 0, 126);
    }

    public /* synthetic */ j8x0(int i, List list, String str, boolean z, int i2) {
        this(i, list, (i2 & 4) != 0 ? null : str, false, (i2 & 16) != 0 ? false : z, 50, 1);
    }

    public static j8x0 a(j8x0 j8x0Var, int i, List list, String str, boolean z, boolean z2, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = j8x0Var.a;
        }
        int i5 = i;
        if ((i4 & 2) != 0) {
            list = j8x0Var.b;
        }
        List list2 = list;
        if ((i4 & 4) != 0) {
            str = j8x0Var.c;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            z = j8x0Var.d;
        }
        boolean z3 = z;
        if ((i4 & 16) != 0) {
            z2 = j8x0Var.e;
        }
        boolean z4 = z2;
        if ((i4 & 32) != 0) {
            i2 = j8x0Var.f;
        }
        int i6 = i2;
        if ((i4 & 64) != 0) {
            i3 = j8x0Var.g;
        }
        j8x0Var.getClass();
        return new j8x0(i5, list2, str2, z3, z4, i6, i3);
    }

    public final int b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8x0)) {
            return false;
        }
        j8x0 j8x0Var = (j8x0) obj;
        return this.a == j8x0Var.a && u890.j(this.b, j8x0Var.b) && u890.j(this.c, j8x0Var.c) && this.d == j8x0Var.d && this.e == j8x0Var.e && this.f == j8x0Var.f && this.g == j8x0Var.g;
    }

    public final int hashCode() {
        int iB = f4i1.b(l1d.C(this.a) * 31, 31, this.b);
        String str = this.c;
        return l1d.C(this.g) + kaa0.f(this.f, xcg1.g(xcg1.g((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int i2 = this.a;
        if (i2 == 1) {
            str = "NOT_LOADED";
        } else if (i2 == 2) {
            str = "LOADING";
        } else if (i2 == 3) {
            str = "LOADED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "FAILED";
        }
        parcel.writeString(str);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        int i3 = this.g;
        if (i3 == 1) {
            str2 = "PRIMARY";
        } else if (i3 == 2) {
            str2 = "SECONDARY";
        } else if (i3 == 3) {
            str2 = "TERTIARY";
        } else {
            if (i3 != 4) {
                throw null;
            }
            str2 = "QUATERNARY";
        }
        parcel.writeString(str2);
    }

    public j8x0(int i, List list, String str, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = i3;
    }
}
