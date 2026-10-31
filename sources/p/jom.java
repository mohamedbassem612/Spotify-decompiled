package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jom implements nom {
    public static final Parcelable.Creator<jom> CREATOR = new ezl((byte) 18);
    public final int a;

    public jom(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jom) && this.a == ((jom) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "PAIRING_NEEDED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "RE_PAIRING_NEEDED";
        }
        parcel.writeString(str);
    }

    public /* synthetic */ jom() {
        this(1);
    }
}
