package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bam1 implements pam1 {
    public static final bam1 a = new bam1();
    public static final Parcelable.Creator<bam1> CREATOR = new w8m1((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bam1);
    }

    public final int hashCode() {
        return -528758749;
    }

    public final String toString() {
        return "NudgeButtonClicked";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
