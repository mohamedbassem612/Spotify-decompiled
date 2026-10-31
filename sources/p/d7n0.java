package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7n0 implements Parcelable {
    public static final Parcelable.Creator<d7n0> CREATOR = new fgm0((byte) 25);
    public final ela1 a;
    public final u771 b;
    public final int c;

    public d7n0(ela1 ela1Var, u771 u771Var, int i) {
        this.a = ela1Var;
        this.b = u771Var;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7n0)) {
            return false;
        }
        d7n0 d7n0Var = (d7n0) obj;
        return u890.j(this.a, d7n0Var.a) && u890.j(this.b, d7n0Var.b) && this.c == d7n0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cfm0.g(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(lf51.q(this.c));
    }
}
