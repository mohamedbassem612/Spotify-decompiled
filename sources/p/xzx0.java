package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xzx0 extends c0y0 {
    public static final Parcelable.Creator<xzx0> CREATOR = new wvw0((byte) 28);
    public final String b;
    public final String c;
    public final String d;

    public xzx0(String str, String str2, String str3) {
        super(null);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // p.c0y0
    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzx0)) {
            return false;
        }
        xzx0 xzx0Var = (xzx0) obj;
        return u890.j(this.b, xzx0Var.b) && u890.j(this.c, xzx0Var.c) && u890.j(this.d, xzx0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
