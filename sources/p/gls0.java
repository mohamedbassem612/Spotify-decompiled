package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gls0 implements Parcelable {
    public static final Parcelable.Creator<gls0> CREATOR = new bis0((byte) 7);
    public final boolean a;
    public final boolean b;
    public final fls0 c;

    public gls0(boolean z, boolean z2, fls0 fls0Var) {
        this.a = z;
        this.b = z2;
        this.c = fls0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gls0)) {
            return false;
        }
        gls0 gls0Var = (gls0) obj;
        return this.a == gls0Var.a && this.b == gls0Var.b && u890.j(this.c, gls0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
    }
}
