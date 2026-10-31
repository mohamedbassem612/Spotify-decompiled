package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class art0 implements vrt0 {
    public static final Parcelable.Creator<art0> CREATOR = new r7t0((byte) 29);
    public final zbe0 a;

    public art0(zbe0 zbe0Var) {
        this.a = zbe0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof art0) && u890.j(this.a, ((art0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
