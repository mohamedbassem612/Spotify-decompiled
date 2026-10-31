package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ni0 extends u9 {
    public static final Parcelable.Creator<ni0> CREATOR = new e9n1((byte) 24);
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean g;

    public ni0(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni0)) {
            return false;
        }
        ni0 ni0Var = (ni0) obj;
        return o4e.c(this.b, ni0Var.b) && this.a == ni0Var.a && this.c == ni0Var.c && this.d == ni0Var.d && Arrays.equals(this.e, ni0Var.e) && this.f == ni0Var.f && this.g == ni0Var.g;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 8);
        parcel.writeLong(this.a);
        j541.F(parcel, 3, this.b);
        j541.K(parcel, 4, 8);
        parcel.writeLong(this.c);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j541.G(parcel, 6, this.e);
        j541.K(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        j541.K(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        j541.M(iL, parcel);
    }
}
