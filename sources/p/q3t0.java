package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q3t0 implements Parcelable {
    public static final Parcelable.Creator<q3t0> CREATOR = new bis0((byte) 26);
    public final String a;
    public final String b;
    public final long c;

    public q3t0(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3t0)) {
            return false;
        }
        q3t0 q3t0Var = (q3t0) obj;
        return u890.j(this.a, q3t0Var.a) && u890.j(this.b, q3t0Var.b) && this.c == q3t0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }
}
