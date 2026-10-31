package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uae0 implements zbe0 {
    public static final Parcelable.Creator<uae0> CREATOR = new qod0((byte) 16);
    public final vp31 a;

    public uae0(vp31 vp31Var) {
        this.a = vp31Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uae0) && u890.j(this.a, ((uae0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
