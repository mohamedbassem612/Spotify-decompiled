package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class li70 extends oi70 {
    public static final Parcelable.Creator<li70> CREATOR = new ai70((byte) 9);
    public final String c;

    public li70(String str) {
        super(28, 2);
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
        return (obj instanceof li70) && u890.j(this.c, ((li70) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
    }
}
