package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h7q0 extends t7q0 {
    public static final Parcelable.Creator<h7q0> CREATOR = new qxp0((byte) 23);
    public final apl a;

    public h7q0(apl aplVar) {
        this.a = aplVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7q0) && u890.j(this.a, ((h7q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
