package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sco implements Parcelable {
    public static final Parcelable.Creator<sco> CREATOR = new rco((byte) 0);
    public final String a;
    public final String b;
    public final int c;

    public sco(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof sco)) {
            return false;
        }
        sco scoVar = (sco) obj;
        return u890.j(this.a, scoVar.a) && u890.j(this.b, scoVar.b) && this.c == scoVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.c;
        return iHashCode2 + (i != 0 ? l1d.C(i) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        int i2 = this.c;
        if (i2 == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        if (i2 == 1) {
            str = "EXTERNAL_URL";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "SPOTIFY_URI";
        }
        parcel.writeString(str);
    }
}
