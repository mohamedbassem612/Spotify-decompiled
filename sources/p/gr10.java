package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gr10 implements Parcelable {
    public static final gr10 a = new gr10();
    public static final Parcelable.Creator<gr10> CREATOR = new no10((byte) 9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gr10);
    }

    public final int hashCode() {
        return -958338014;
    }

    public final String toString() {
        return "ReportSuccessResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
