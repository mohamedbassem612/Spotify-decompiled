package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kam1 implements pam1 {
    public static final kam1 a = new kam1();
    public static final Parcelable.Creator<kam1> CREATOR = new w8m1((byte) 20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kam1);
    }

    public final int hashCode() {
        return -152156790;
    }

    public final String toString() {
        return "ShowAudioPreviewChipRequested";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
