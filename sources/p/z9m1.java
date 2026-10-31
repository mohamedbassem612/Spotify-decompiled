package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z9m1 implements pam1 {
    public static final z9m1 a = new z9m1();
    public static final Parcelable.Creator<z9m1> CREATOR = new w8m1((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z9m1);
    }

    public final int hashCode() {
        return 380846579;
    }

    public final String toString() {
        return "HideProgressBarRequested";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
