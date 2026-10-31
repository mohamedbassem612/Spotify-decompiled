package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nar0 implements Parcelable {
    public static final Parcelable.Creator<nar0> CREATOR = new p7q0((byte) 27);
    public final r6h1 a;
    public final nsn0 b;

    public nar0(n8h1 n8h1Var) {
        this(n8h1Var.b(), null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nar0)) {
            return false;
        }
        nar0 nar0Var = (nar0) obj;
        return u890.j(this.a, nar0Var.a) && u890.j(this.b, nar0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nsn0 nsn0Var = this.b;
        return iHashCode + (nsn0Var == null ? 0 : nsn0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeSerializable(this.b);
    }

    public nar0(r6h1 r6h1Var, nsn0 nsn0Var) {
        this.a = r6h1Var;
        this.b = nsn0Var;
    }
}
