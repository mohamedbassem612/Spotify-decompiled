package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tja1 implements Parcelable {
    public static final Parcelable.Creator<tja1> CREATOR = new nja1((byte) 1);
    public final fw80 a;
    public final oja1 b;

    public tja1(fw80 fw80Var, oja1 oja1Var) {
        this.a = fw80Var;
        this.b = oja1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tja1)) {
            return false;
        }
        tja1 tja1Var = (tja1) obj;
        return this.a == tja1Var.a && u890.j(this.b, tja1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        this.b.writeToParcel(parcel, i);
    }
}
