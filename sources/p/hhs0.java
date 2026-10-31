package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hhs0 implements Parcelable {
    public static final Parcelable.Creator<hhs0> CREATOR = new ybs0((byte) 26);
    public final String a;
    public final String b;
    public final int c;

    public hhs0(int i, String str, String str2) {
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
        if (!(obj instanceof hhs0)) {
            return false;
        }
        hhs0 hhs0Var = (hhs0) obj;
        return u890.j(this.a, hhs0Var.a) && u890.j(this.b, hhs0Var.b) && this.c == hhs0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        int i2 = this.c;
        if (i2 == 1) {
            str = "CHECK_ALT";
        } else if (i2 == 2) {
            str = "UNDO";
        } else if (i2 == 3) {
            str = "EXTERNAL_LINK";
        } else if (i2 == 4) {
            str = "CAMERA";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "MESSAGES";
        }
        parcel.writeString(str);
    }
}
