package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nzz extends g700 {
    public static final Parcelable.Creator<nzz> CREATOR = new dez((byte) 21);
    public final ou80 a;

    public nzz(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final ou80 a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzz) && u890.j(this.a, ((nzz) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return super.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }
}
