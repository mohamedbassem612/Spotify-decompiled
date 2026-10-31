package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class lxe1 extends mxe1 {
    public final int b;
    public final String c;
    public final String d;
    public static final kxe1 Companion = new kxe1();
    public static final Parcelable.Creator<lxe1> CREATOR = new lse1(14);

    public /* synthetic */ lxe1(int i, String str, int i2, String str2) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, jxe1.a.getDescriptor());
            throw null;
        }
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxe1)) {
            return false;
        }
        lxe1 lxe1Var = (lxe1) obj;
        return this.b == lxe1Var.b && u890.j(this.c, lxe1Var.c) && u890.j(this.d, lxe1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public lxe1(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }
}
