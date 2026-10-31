package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gvo0 extends hvo0 {
    public static final Parcelable.Creator<gvo0> CREATOR = new b4o0((byte) 25);
    public final boolean a;
    public final boolean b;
    public final String c;

    public gvo0(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
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
        if (!(obj instanceof gvo0)) {
            return false;
        }
        gvo0 gvo0Var = (gvo0) obj;
        return this.a == gvo0Var.a && this.b == gvo0Var.b && u890.j(this.c, gvo0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
    }
}
