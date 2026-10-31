package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vo20 extends wo20 {
    public static final Parcelable.Creator<vo20> CREATOR = new qe20((byte) 15);
    public final int a;

    public vo20(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo20) && this.a == ((vo20) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a != 1) {
            throw null;
        }
        parcel.writeString("MOST_RECENT");
    }
}
