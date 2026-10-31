package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class caw0 implements kaw0 {
    public static final Parcelable.Creator<caw0> CREATOR = new w7w0((byte) 9);
    public final long a;
    public final w4i1 b;
    public final int c;

    public caw0(long j, w4i1 w4i1Var, int i) {
        this.a = j;
        this.b = w4i1Var;
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof caw0)) {
            return false;
        }
        caw0 caw0Var = (caw0) obj;
        return this.a == caw0Var.a && u890.j(this.b, caw0Var.b) && this.c == caw0Var.c;
    }

    public final w4i1 getUser() {
        return this.b;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ydh.d(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final long v0() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "Reported";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Removed";
        }
        parcel.writeString(str);
    }
}
