package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class emb1 implements pnb1 {
    public static final emb1 a = new emb1();
    public static final Parcelable.Creator<emb1> CREATOR = new olb1((byte) 5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof emb1);
    }

    public final int hashCode() {
        return -1946900664;
    }

    public final String toString() {
        return "InviteLinkFailedAfterAgeAssuranceCompleted";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
