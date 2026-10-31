package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vwe0 implements xwe0 {
    public static final Parcelable.Creator<vwe0> CREATOR = new lbe0((byte) 28);
    public final uwe0 a;

    public vwe0(uwe0 uwe0Var) {
        this.a = uwe0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwe0) && u890.j(this.a, ((vwe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
