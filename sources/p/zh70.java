package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zh70 extends hj70 {
    public static final Parcelable.Creator<zh70> CREATOR = new ij60((byte) 29);
    public final String c;

    public zh70(String str) {
        super(18, 2);
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh70) && u890.j(this.c, ((zh70) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
    }
}
