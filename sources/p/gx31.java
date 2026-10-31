package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gx31 implements jx31 {
    public static final Parcelable.Creator<gx31> CREATOR = new xw31((byte) 8);
    public final int a;
    public final int b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;

    public gx31(int i, int i2, String str, boolean z, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = z;
        this.e = i3;
        this.f = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx31)) {
            return false;
        }
        gx31 gx31Var = (gx31) obj;
        return this.a == gx31Var.a && this.b == gx31Var.b && u890.j(this.c, gx31Var.c) && this.d == gx31Var.d && this.e == gx31Var.e && this.f == gx31Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + kaa0.f(this.e, xcg1.g(cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
