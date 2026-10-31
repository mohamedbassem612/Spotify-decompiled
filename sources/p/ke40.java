package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ke40 implements Parcelable {
    public static final ke40 a = new ke40();
    public static final Parcelable.Creator<ke40> CREATOR = new fd40((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ke40);
    }

    public final int hashCode() {
        return 607048060;
    }

    public final String toString() {
        return "GenerateWithoutAnalysisResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
