package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qxs0 implements sxs0 {
    public static final Parcelable.Creator<qxs0> CREATOR = new bis0((byte) 15);
    public final wol a;

    public qxs0(wol wolVar) {
        this.a = wolVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxs0) && u890.j(this.a, ((qxs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
