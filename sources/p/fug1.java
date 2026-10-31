package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fug1 implements Parcelable {
    public static final Parcelable.Creator<fug1> CREATOR = new h3g1((byte) 28);
    public final hsg1 a;
    public final int b;

    public fug1(hsg1 hsg1Var, int i) {
        this.a = hsg1Var;
        this.b = i;
    }

    public final hsg1 a() {
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
        if (!(obj instanceof fug1)) {
            return false;
        }
        fug1 fug1Var = (fug1) obj;
        return u890.j(this.a, fug1Var.a) && this.b == fug1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
    }
}
