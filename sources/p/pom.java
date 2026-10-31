package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pom implements rom {
    public static final Parcelable.Creator<pom> CREATOR = new ezl((byte) 23);
    public final boolean a;

    public pom(boolean z) {
        this.a = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pom) && this.a == ((pom) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
    }
}
