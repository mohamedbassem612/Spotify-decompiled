package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uvg1 implements Parcelable {
    public static final Parcelable.Creator<uvg1> CREATOR = new h3g1((byte) 29);
    public final long a;
    public final long b;
    public final long c;

    public uvg1(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j2 - j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvg1)) {
            return false;
        }
        uvg1 uvg1Var = (uvg1) obj;
        return this.a == uvg1Var.a && this.b == uvg1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
