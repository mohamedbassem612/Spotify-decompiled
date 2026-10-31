package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t0o0 implements y0o0 {
    public static final Parcelable.Creator<t0o0> CREATOR = new dan0((byte) 20);
    public final int a;

    public t0o0(int i) {
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
        return (obj instanceof t0o0) && this.a == ((t0o0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.a) {
            case 1:
                str = "CAST";
                break;
            case 2:
                str = "SPEAKER";
                break;
            case 3:
                str = "GAME_CONSOLE";
                break;
            case 4:
                str = "TV";
                break;
            case 5:
                str = "AVR";
                break;
            case 6:
                str = "HOME_THING";
                break;
            case 7:
                str = "AUTOMOBILE";
                break;
            case 8:
                str = "HEADPHONES";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }
}
