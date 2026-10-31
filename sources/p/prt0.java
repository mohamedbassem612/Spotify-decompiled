package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class prt0 implements vrt0 {
    public static final Parcelable.Creator<prt0> CREATOR = new brt0((byte) 7);
    public final vp31 a;

    public prt0(vp31 vp31Var) {
        this.a = vp31Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prt0) && u890.j(this.a, ((prt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
