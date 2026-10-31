package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pqh0 extends u9 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public static final pue0 e = new pue0("MediaLiveSeekableRange", (String) null);
    public static final Parcelable.Creator<pqh0> CREATOR = new jrn1((byte) 3);

    public pqh0(long j, long j2, boolean z, boolean z2) {
        this.a = Math.max(j, 0L);
        this.b = Math.max(j2, 0L);
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqh0)) {
            return false;
        }
        pqh0 pqh0Var = (pqh0) obj;
        return this.a == pqh0Var.a && this.b == pqh0Var.b && this.c == pqh0Var.c && this.d == pqh0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 8);
        parcel.writeLong(this.a);
        j541.K(parcel, 3, 8);
        parcel.writeLong(this.b);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j541.M(iL, parcel);
    }
}
