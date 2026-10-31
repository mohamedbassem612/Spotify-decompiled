package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ks90 implements Parcelable {
    public static final Parcelable.Creator<ks90> CREATOR = new qg90((byte) 24);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ ks90(int i, int i2, String str, String str2, boolean z, boolean z2, int i3) {
        this(i, (i3 & 2) != 0 ? 1 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks90)) {
            return false;
        }
        ks90 ks90Var = (ks90) obj;
        return this.a == ks90Var.a && this.b == ks90Var.b && u890.j(this.c, ks90Var.c) && u890.j(this.d, ks90Var.d) && this.e == ks90Var.e && this.f == ks90Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(cy30.d(cy30.d(ab80.k(this.b, l1d.C(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ab80.v(this.a));
        parcel.writeString(ab80.u(this.b));
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public ks90(int i, int i2, String str, String str2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }
}
