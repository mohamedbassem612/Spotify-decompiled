package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ex31 implements jx31 {
    public static final Parcelable.Creator<ex31> CREATOR = new xw31((byte) 6);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public ex31(int i, int i2, String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex31)) {
            return false;
        }
        ex31 ex31Var = (ex31) obj;
        return u890.j(this.a, ex31Var.a) && this.b == ex31Var.b && this.c == ex31Var.c && u890.j(this.d, ex31Var.d) && this.e == ex31Var.e && this.f == ex31Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(cy30.d(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
