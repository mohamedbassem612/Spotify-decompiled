package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tq31 implements uq31 {
    public static final Parcelable.Creator<tq31> CREATOR = new s231((byte) 27);
    public final k1z0 a;

    public tq31(k1z0 k1z0Var) {
        this.a = k1z0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq31) && u890.j(this.a, ((tq31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
