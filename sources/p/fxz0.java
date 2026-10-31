package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fxz0 implements Parcelable {
    public static final Parcelable.Creator<fxz0> CREATOR = new erz0((byte) 9);
    public final int a;
    public final lfi1 b;

    public fxz0(int i, lfi1 lfi1Var) {
        this.a = i;
        this.b = lfi1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxz0)) {
            return false;
        }
        fxz0 fxz0Var = (fxz0) obj;
        return this.a == fxz0Var.a && u890.j(this.b, fxz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
