package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class hxe1 extends mxe1 {
    public final int b;
    public final String c;
    public static final gxe1 Companion = new gxe1();
    public static final Parcelable.Creator<hxe1> CREATOR = new lse1(12);

    public /* synthetic */ hxe1(int i, int i2, String str) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, fxe1.a.getDescriptor());
            throw null;
        }
        this.b = i2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxe1)) {
            return false;
        }
        hxe1 hxe1Var = (hxe1) obj;
        return this.b == hxe1Var.b && u890.j(this.c, hxe1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    public hxe1(int i, String str) {
        this.b = i;
        this.c = str;
    }
}
