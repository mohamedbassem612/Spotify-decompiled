package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wg2 extends yg2 {
    public static final Parcelable.Creator<wg2> CREATOR = new ue2((byte) 6);
    public final zb90 a;

    public wg2(zb90 zb90Var) {
        this.a = zb90Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg2) && u890.j(this.a, ((wg2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
