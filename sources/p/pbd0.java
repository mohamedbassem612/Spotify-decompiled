package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pbd0 implements Parcelable {
    public static final Parcelable.Creator<pbd0> CREATOR = new lad0((byte) 12);
    public final String a;
    public final nbd0 b;

    public pbd0(String str, nbd0 nbd0Var) {
        this.a = str;
        this.b = nbd0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbd0)) {
            return false;
        }
        pbd0 pbd0Var = (pbd0) obj;
        return u890.j(this.a, pbd0Var.a) && u890.j(this.b, pbd0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nbd0 nbd0Var = this.b;
        return iHashCode + (nbd0Var == null ? 0 : nbd0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        nbd0 nbd0Var = this.b;
        if (nbd0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nbd0Var.writeToParcel(parcel, i);
        }
    }
}
