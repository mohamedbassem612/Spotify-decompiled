package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mw3 implements Parcelable {
    public static final Parcelable.Creator<mw3> CREATOR = new i93((byte) 16);
    public final String a;
    public final String b;
    public final int c;

    public mw3(int i, String str, String str2) {
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
        if (!(obj instanceof mw3)) {
            return false;
        }
        mw3 mw3Var = (mw3) obj;
        return u890.j(this.a, mw3Var.a) && u890.j(this.b, mw3Var.b) && this.c == mw3Var.c;
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
            str = "TRACK";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "AUDIOBOOK";
        }
        parcel.writeString(str);
    }
}
