package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kca0 implements Parcelable {
    public static final Parcelable.Creator<kca0> CREATOR = new jca0((byte) 0);
    public final hqr0 a;
    public final xea0 b;

    public kca0(hqr0 hqr0Var, xea0 xea0Var) {
        this.a = hqr0Var;
        this.b = xea0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kca0)) {
            return false;
        }
        kca0 kca0Var = (kca0) obj;
        return u890.j(this.a, kca0Var.a) && this.b == kca0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b.name());
    }
}
