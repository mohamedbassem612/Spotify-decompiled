package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o0c1 implements Parcelable {
    public static final Parcelable.Creator<o0c1> CREATOR = new yub1((byte) 11);
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public o0c1(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0c1)) {
            return false;
        }
        o0c1 o0c1Var = (o0c1) obj;
        return this.a == o0c1Var.a && this.b == o0c1Var.b && this.c == o0c1Var.c && this.d == o0c1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }
}
