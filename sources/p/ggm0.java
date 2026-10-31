package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ggm0 implements nhm0 {
    public static final ggm0 a = new ggm0();
    public static final Parcelable.Creator<ggm0> CREATOR = new fgm0((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ggm0);
    }

    public final int hashCode() {
        return 1805749128;
    }

    public final String toString() {
        return "LoadError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
