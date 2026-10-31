package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pal extends val {
    public static final Parcelable.Creator<pal> CREATOR = new txk((byte) 4);
    public final int a;

    public pal(int i) {
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
        return (obj instanceof pal) && this.a == ((pal) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "FORCED_OFFLINE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "NO_INTERNET";
        }
        parcel.writeString(str);
    }
}
