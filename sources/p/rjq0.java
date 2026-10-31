package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rjq0 implements qvy0 {
    public static final Parcelable.Creator<rjq0> CREATOR = new p7q0((byte) 11);
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public rjq0(String str, String str2, int i, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjq0)) {
            return false;
        }
        rjq0 rjq0Var = (rjq0) obj;
        return this.a == rjq0Var.a && u890.j(this.b, rjq0Var.b) && u890.j(this.c, rjq0Var.c) && u890.j(this.d, rjq0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // p.qvy0
    public final int t0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
