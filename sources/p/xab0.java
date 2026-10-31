package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xab0 implements Parcelable {
    public static final Parcelable.Creator<xab0> CREATOR = new jca0((byte) 18);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public xab0(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
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
        if (!(obj instanceof xab0)) {
            return false;
        }
        xab0 xab0Var = (xab0) obj;
        return u890.j(this.a, xab0Var.a) && this.b == xab0Var.b && this.c == xab0Var.c && u890.j(this.d, xab0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }
}
