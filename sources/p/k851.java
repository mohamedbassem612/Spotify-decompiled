package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k851 implements Parcelable {
    public static final Parcelable.Creator<k851> CREATOR = new uo41((byte) 14);
    public final String a;
    public final z2g0 b;

    public k851(String str, z2g0 z2g0Var) {
        this.a = str;
        this.b = z2g0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k851)) {
            return false;
        }
        k851 k851Var = (k851) obj;
        return u890.j(this.a, k851Var.a) && u890.j(this.b, k851Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
