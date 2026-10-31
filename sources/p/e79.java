package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e79 implements f79 {
    public static final Parcelable.Creator<e79> CREATOR = new so8((byte) 22);
    public final int a;

    public e79(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e79) && this.a == ((e79) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "Bypass";
        } else if (i2 == 2) {
            str = "Off";
        } else if (i2 == 3) {
            str = "Mute";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "Kill";
        }
        parcel.writeString(str);
    }
}
