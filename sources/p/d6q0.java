package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d6q0 extends b6q0 {
    public static final Parcelable.Creator<d6q0> CREATOR;
    public final List a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
        CREATOR = new qxp0((byte) 13);
    }

    public d6q0(List list, String str, boolean z, String str2, boolean z2, int i, int i2, int i3) {
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final String a() {
        return this.d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6q0)) {
            return false;
        }
        d6q0 d6q0Var = (d6q0) obj;
        return this.a.equals(d6q0Var.a) && u890.j(this.b, d6q0Var.b) && this.c == d6q0Var.c && u890.j(this.d, d6q0Var.d) && this.e == d6q0Var.e && this.f == d6q0Var.f && this.g == d6q0Var.g && this.h == d6q0Var.h;
    }

    public final int g() {
        return this.h;
    }

    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        return l1d.C(this.h) + ab80.k(this.g, ab80.k(this.f, xcg1.g(cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    public final int j() {
        return this.g;
    }

    public final int k() {
        return this.f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(h4b1.m(this.f));
        parcel.writeString(ywx0.q(this.g));
        parcel.writeString(fd21.n(this.h));
    }
}
