package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bi70 extends hj70 {
    public static final Parcelable.Creator<bi70> CREATOR = new ai70((byte) 0);
    public final int c;

    public bi70(int i) {
        super(7, 3);
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi70) && this.c == ((bi70) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.c;
        if (i2 == 1) {
            str = "PHONE_SPEAKERS";
        } else if (i2 == 2) {
            str = "EXTERNAL_SPEAKER";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "OTHER_DEVICE";
        }
        parcel.writeString(str);
    }
}
