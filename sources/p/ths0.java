package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ths0 implements tqw0 {
    public static final ths0 a = new ths0();
    public static final Parcelable.Creator<ths0> CREATOR = new ybs0((byte) 28);

    @Override // p.tqw0
    public final boolean b0() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ths0);
    }

    public final int hashCode() {
        return 329412237;
    }

    public final String toString() {
        return "PendingState";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
