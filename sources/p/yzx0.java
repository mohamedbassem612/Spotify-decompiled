package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yzx0 extends c0y0 {
    public static final Parcelable.Creator<yzx0> CREATOR = new wvw0((byte) 29);
    public final String b;
    public final k0y0 c;
    public final boolean d;
    public final String e;
    public final String f;

    public yzx0(String str, k0y0 k0y0Var, boolean z, String str2, String str3) {
        super(null);
        this.b = str;
        this.c = k0y0Var;
        this.d = z;
        this.e = str2;
        this.f = str3;
    }

    public static yzx0 b(yzx0 yzx0Var, boolean z) {
        String str = yzx0Var.b;
        k0y0 k0y0Var = yzx0Var.c;
        String str2 = yzx0Var.e;
        String str3 = yzx0Var.f;
        yzx0Var.getClass();
        return new yzx0(str, k0y0Var, z, str2, str3);
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
        if (!(obj instanceof yzx0)) {
            return false;
        }
        yzx0 yzx0Var = (yzx0) obj;
        return u890.j(this.b, yzx0Var.b) && u890.j(this.c, yzx0Var.c) && this.d == yzx0Var.d && u890.j(this.e, yzx0Var.e) && u890.j(this.f, yzx0Var.f);
    }

    public final k0y0 g() {
        return this.c;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
