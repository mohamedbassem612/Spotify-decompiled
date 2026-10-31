package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rkk1 implements Parcelable {
    public static final Parcelable.Creator<rkk1> CREATOR = new tfk1((byte) 26);
    public final cae1 a;
    public final int b;

    public rkk1(cae1 cae1Var, int i) {
        this.a = cae1Var;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkk1)) {
            return false;
        }
        rkk1 rkk1Var = (rkk1) obj;
        return u890.j(this.a, rkk1Var.a) && this.b == rkk1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
    }
}
