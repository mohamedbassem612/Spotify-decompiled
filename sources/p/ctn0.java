package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ctn0 implements Parcelable {
    public static final Parcelable.Creator<ctn0> CREATOR = new dan0((byte) 12);
    public final hux a;
    public final int b;
    public final lik1 c;
    public final boolean d;
    public final boolean e;

    public ctn0(hux huxVar, int i, lik1 lik1Var, boolean z, boolean z2) {
        this.a = huxVar;
        this.b = i;
        this.c = lik1Var;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctn0)) {
            return false;
        }
        ctn0 ctn0Var = (ctn0) obj;
        return u890.j(this.a, ctn0Var.a) && this.b == ctn0Var.b && u890.j(this.c, ctn0Var.c) && this.d == ctn0Var.d && this.e == ctn0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c.a), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
