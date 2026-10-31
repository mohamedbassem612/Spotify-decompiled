package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tm71 extends xm71 {
    public static final tm71 b = new tm71("context_menu");
    public static final Parcelable.Creator<tm71> CREATOR = new ff71((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tm71);
    }

    public final int hashCode() {
        return -121073978;
    }

    public final String toString() {
        return "ContextMenu";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
