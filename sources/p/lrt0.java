package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lrt0 extends xrt0 {
    public static final Parcelable.Creator<lrt0> CREATOR = new brt0((byte) 5);
    public final String a;
    public final String b;
    public final int c;

    public lrt0(int i, String str, String str2) {
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
        if (!(obj instanceof lrt0)) {
            return false;
        }
        lrt0 lrt0Var = (lrt0) obj;
        return u890.j(this.a, lrt0Var.a) && u890.j(this.b, lrt0Var.b) && this.c == lrt0Var.c;
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
            str = "NONE";
        } else if (i2 == 2) {
            str = "PLAYING";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "PAUSED";
        }
        parcel.writeString(str);
    }
}
