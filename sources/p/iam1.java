package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iam1 implements pam1 {
    public static final iam1 a = new iam1();
    public static final Parcelable.Creator<iam1> CREATOR = new w8m1((byte) 18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iam1);
    }

    public final int hashCode() {
        return -1510236021;
    }

    public final String toString() {
        return "ScreenshotEvent";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
