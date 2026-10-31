package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vjq0 implements qvy0 {
    public static final Parcelable.Creator<vjq0> CREATOR = new p7q0((byte) 12);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;

    public vjq0(String str, int i, String str2, String str3, boolean z, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjq0)) {
            return false;
        }
        vjq0 vjq0Var = (vjq0) obj;
        return this.a == vjq0Var.a && u890.j(this.b, vjq0Var.b) && u890.j(this.c, vjq0Var.c) && u890.j(this.d, vjq0Var.d) && this.e == vjq0Var.e && u890.j(this.f, vjq0Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iG + (str == null ? 0 : str.hashCode());
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
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
    }
}
