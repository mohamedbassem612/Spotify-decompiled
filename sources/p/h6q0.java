package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h6q0 extends b6q0 {
    public static final Parcelable.Creator<h6q0> CREATOR;
    public final w4i1 a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
        CREATOR = new qxp0((byte) 16);
    }

    public h6q0(w4i1 w4i1Var, String str, boolean z, int i, int i2, int i3) {
        this.a = w4i1Var;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final String a() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6q0)) {
            return false;
        }
        h6q0 h6q0Var = (h6q0) obj;
        return u890.j(this.a, h6q0Var.a) && u890.j(this.b, h6q0Var.b) && this.c == h6q0Var.c && this.d == h6q0Var.d && this.e == h6q0Var.e && this.f == h6q0Var.f;
    }

    public final int g() {
        return this.f;
    }

    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        return l1d.C(this.f) + ab80.k(this.e, ab80.k(this.d, xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final int j() {
        return this.e;
    }

    public final int k() {
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(h4b1.m(this.d));
        parcel.writeString(ywx0.q(this.e));
        parcel.writeString(fd21.n(this.f));
    }
}
