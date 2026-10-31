package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ki70 extends oi70 {
    public static final Parcelable.Creator<ki70> CREATOR = new ai70((byte) 8);
    public final String c;

    public ki70(String str) {
        super(26, 2);
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
        return (obj instanceof ki70) && u890.j(this.c, ((ki70) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
    }
}
