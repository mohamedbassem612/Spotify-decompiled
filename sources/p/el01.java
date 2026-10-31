package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class el01 implements hl01 {
    public static final Parcelable.Creator<el01> CREATOR = new sj01((byte) 12);
    public final String a;
    public final int b;
    public final int c;

    public el01(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el01)) {
            return false;
        }
        el01 el01Var = (el01) obj;
        return u890.j(this.a, el01Var.a) && this.b == el01Var.b && this.c == el01Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(ywx0.r(this.c));
    }
}
