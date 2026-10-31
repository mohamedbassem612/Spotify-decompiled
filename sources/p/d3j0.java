package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d3j0 implements Parcelable {
    public static final Parcelable.Creator<d3j0> CREATOR = new rqi0((byte) 6);
    public final c3j0 a;
    public final y2j0 b;

    public d3j0(c3j0 c3j0Var, y2j0 y2j0Var) {
        this.a = c3j0Var;
        this.b = y2j0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3j0)) {
            return false;
        }
        d3j0 d3j0Var = (d3j0) obj;
        return u890.j(this.a, d3j0Var.a) && u890.j(this.b, d3j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
