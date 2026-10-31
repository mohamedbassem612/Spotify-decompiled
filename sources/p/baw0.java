package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class baw0 implements kaw0 {
    public static final Parcelable.Creator<baw0> CREATOR = new w7w0((byte) 8);
    public final long a;
    public final w4i1 b;
    public final String c;

    public baw0(long j, w4i1 w4i1Var, String str) {
        this.a = j;
        this.b = w4i1Var;
        this.c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baw0)) {
            return false;
        }
        baw0 baw0Var = (baw0) obj;
        return this.a == baw0Var.a && u890.j(this.b, baw0Var.b) && u890.j(this.c, baw0Var.c);
    }

    public final w4i1 getUser() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ydh.d(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final long v0() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
