package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sxk implements Parcelable {
    public static final Parcelable.Creator<sxk> CREATOR = new v6h((byte) 29);
    public final int a;
    public final int b;

    public sxk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxk)) {
            return false;
        }
        sxk sxkVar = (sxk) obj;
        return this.a == sxkVar.a && this.b == sxkVar.b;
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        int i = this.b;
        return iC + (i == 0 ? 0 : l1d.C(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int i2 = this.a;
        if (i2 == 1) {
            str = "NEVER";
        } else if (i2 == 2) {
            str = "DAILY";
        } else if (i2 == 3) {
            str = "WEEKLY";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "MONTHLY";
        }
        parcel.writeString(str);
        int i3 = this.b;
        if (i3 == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        switch (i3) {
            case 1:
                str2 = "SUNDAY";
                break;
            case 2:
                str2 = "MONDAY";
                break;
            case 3:
                str2 = "TUESDAY";
                break;
            case 4:
                str2 = "WEDNESDAY";
                break;
            case 5:
                str2 = "THURSDAY";
                break;
            case 6:
                str2 = "FRIDAY";
                break;
            case 7:
                str2 = "SATURDAY";
                break;
            default:
                throw null;
        }
        parcel.writeString(str2);
    }
}
