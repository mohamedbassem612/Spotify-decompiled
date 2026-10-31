package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class efs0 implements ffs0 {
    public static final Parcelable.Creator<efs0> CREATOR = new ybs0((byte) 17);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;

    public efs0(long j, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
    }

    public final long C0() {
        return this.e;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efs0)) {
            return false;
        }
        efs0 efs0Var = (efs0) obj;
        return u890.j(this.a, efs0Var.a) && u890.j(this.b, efs0Var.b) && u890.j(this.c, efs0Var.c) && this.d == efs0Var.d && this.e == efs0Var.e;
    }

    public final String getRequestId() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeLong(this.e);
    }
}
