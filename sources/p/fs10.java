package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fs10 implements hs10 {
    public static final fs10 a = new fs10();
    public static final Parcelable.Creator<fs10> CREATOR = new no10((byte) 16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fs10);
    }

    public final int hashCode() {
        return -51467442;
    }

    public final String toString() {
        return "ThumbsDown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
