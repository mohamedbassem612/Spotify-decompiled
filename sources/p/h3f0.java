package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h3f0 extends l3f0 {
    public static final Parcelable.Creator<h3f0> CREATOR = new rwe0((byte) 26);
    public final j4s0 a;

    public h3f0(j4s0 j4s0Var) {
        this.a = j4s0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3f0) && u890.j(this.a, ((h3f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
