package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class faw0 implements kaw0 {
    public static final Parcelable.Creator<faw0> CREATOR = new w7w0((byte) 12);
    public final long a;
    public final w4i1 b;
    public final apl c;

    public faw0(long j, w4i1 w4i1Var, apl aplVar) {
        this.a = j;
        this.b = w4i1Var;
        this.c = aplVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof faw0)) {
            return false;
        }
        faw0 faw0Var = (faw0) obj;
        return this.a == faw0Var.a && u890.j(this.b, faw0Var.b) && u890.j(this.c, faw0Var.c);
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
        parcel.writeParcelable(this.c, i);
    }
}
