package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y8k0 implements a9k0 {
    public static final y8k0 a = new y8k0();
    public static final c9k0 b = new c9k0("reorder_confirmation");
    public static final Parcelable.Creator<y8k0> CREATOR = new ohj0((byte) 16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y8k0);
    }

    public final int hashCode() {
        return -104075194;
    }

    public final String toString() {
        return "ReorderConfirmation";
    }

    @Override // p.a9k0
    public final d9k0 v() {
        return b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
