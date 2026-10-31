package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e6q0 extends f6q0 {
    public static final Parcelable.Creator<e6q0> CREATOR = new qxp0((byte) 14);
    public final int a;
    public final int b;
    public final String c;
    public final boolean d;
    public final int e;

    public e6q0(int i, int i2, int i3, String str, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = z;
        this.e = i3;
    }

    public final String a() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6q0)) {
            return false;
        }
        e6q0 e6q0Var = (e6q0) obj;
        return this.a == e6q0Var.a && this.b == e6q0Var.b && u890.j(this.c, e6q0Var.c) && this.d == e6q0Var.d && this.e == e6q0Var.e;
    }

    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        return l1d.C(this.e) + xcg1.g(cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final int j() {
        return this.a;
    }

    public final int k() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(fd21.n(this.e));
    }
}
