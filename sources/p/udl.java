package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class udl implements Parcelable {
    public static final udl a = new udl();
    public static final Parcelable.Creator<udl> CREATOR = new txk((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof udl);
    }

    public final int hashCode() {
        return -2125335168;
    }

    public final String toString() {
        return "ConnectorAppsAuthenticationResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
