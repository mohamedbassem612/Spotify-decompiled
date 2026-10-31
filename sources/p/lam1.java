package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lam1 implements pam1 {
    public static final lam1 a = new lam1();
    public static final Parcelable.Creator<lam1> CREATOR = new w8m1((byte) 21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lam1);
    }

    public final int hashCode() {
        return 1920142403;
    }

    public final String toString() {
        return "ShowCenterActionButton";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
