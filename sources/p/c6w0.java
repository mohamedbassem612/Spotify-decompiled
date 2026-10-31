package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c6w0 extends d6w0 {
    public static final Parcelable.Creator<c6w0> CREATOR = new g0v0((byte) 26);
    public final int b;
    public final boolean c;
    public final hd5 d;
    public final boolean e;

    public /* synthetic */ c6w0(int i, boolean z, hd5 hd5Var, int i2) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? fd5.c : hd5Var, (i2 & 8) == 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6w0)) {
            return false;
        }
        c6w0 c6w0Var = (c6w0) obj;
        return this.b == c6w0Var.b && this.c == c6w0Var.c && u890.j(this.d, c6w0Var.d) && this.e == c6w0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + xcg1.g(l1d.C(this.b) * 31, 31, this.c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lzu0.j(this.b));
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public c6w0(int i, boolean z, hd5 hd5Var, boolean z2) {
        super(z || z2);
        this.b = i;
        this.c = z;
        this.d = hd5Var;
        this.e = z2;
    }
}
