package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tft0 extends egt0 {
    public static final Parcelable.Creator<tft0> CREATOR = new r7t0((byte) 16);
    public final int a;
    public final boolean b;
    public final boolean c;

    public tft0(int i) {
        this.a = i;
        this.b = i == 1;
        this.c = i == 4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tft0) && this.a == ((tft0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "LOCKED";
        } else if (i2 == 2) {
            str = "PLAYING";
        } else if (i2 == 3) {
            str = "PAUSED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "LOADING";
        }
        parcel.writeString(str);
    }
}
