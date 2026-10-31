package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pi0 extends u9 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final pue0 f = new pue0("AdBreakStatus", (String) null);
    public static final Parcelable.Creator<pi0> CREATOR = new agm0((byte) 20);

    public pi0(long j, long j2, long j3, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi0)) {
            return false;
        }
        pi0 pi0Var = (pi0) obj;
        return this.a == pi0Var.a && this.b == pi0Var.b && o4e.c(this.c, pi0Var.c) && o4e.c(this.d, pi0Var.d) && this.e == pi0Var.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 8);
        parcel.writeLong(this.a);
        j541.K(parcel, 3, 8);
        parcel.writeLong(this.b);
        j541.F(parcel, 4, this.c);
        j541.F(parcel, 5, this.d);
        j541.K(parcel, 6, 8);
        parcel.writeLong(this.e);
        j541.M(iL, parcel);
    }
}
