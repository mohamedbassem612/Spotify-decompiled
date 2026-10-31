package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j2n0 implements of51 {
    public static final Parcelable.Creator<j2n0> CREATOR = new fgm0((byte) 24);
    public final int a;
    public final int b;
    public final String c;
    public final boolean d;

    public j2n0(String str, int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2n0)) {
            return false;
        }
        j2n0 j2n0Var = (j2n0) obj;
        return this.a == j2n0Var.a && this.b == j2n0Var.b && u890.j(this.c, j2n0Var.c) && this.d == j2n0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    @Override // p.of51
    public final int p() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
