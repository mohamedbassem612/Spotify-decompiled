package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class giv0 implements nb10 {
    public static final Parcelable.Creator<giv0> CREATOR = new g0v0((byte) 8);
    public final String a;
    public final int b;

    public giv0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giv0)) {
            return false;
        }
        giv0 giv0Var = (giv0) obj;
        return u890.j(this.a, giv0Var.a) && this.b == giv0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "ALBUM";
        } else if (i2 == 2) {
            str = "BOOK";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "UNRECOGNIZED";
        }
        parcel.writeString(str);
    }
}
