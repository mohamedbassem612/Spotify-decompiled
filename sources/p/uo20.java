package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uo20 extends wo20 {
    public static final Parcelable.Creator<uo20> CREATOR = new qe20((byte) 14);
    public final int a;

    public uo20(int i) {
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
        return (obj instanceof uo20) && this.a == ((uo20) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.a) {
            case 1:
                str = "ALBUM";
                break;
            case 2:
                str = "ARTIST";
                break;
            case 3:
                str = "AUDIOBOOK";
                break;
            case 4:
                str = "GENRE";
                break;
            case 5:
                str = "PLAYLIST";
                break;
            case 6:
                str = "PROFILE";
                break;
            case 7:
                str = "TRACK";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }
}
