package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class auu0 extends cuu0 {
    public static final Parcelable.Creator<auu0> CREATOR = new brt0(27);
    public final String a;
    public final wls0 b;
    public final String c;
    public final boolean d;

    public auu0(String str, String str2, wls0 wls0Var, boolean z) {
        this.a = str;
        this.b = wls0Var;
        this.c = str2;
        this.d = z;
    }

    public static auu0 k(auu0 auu0Var, boolean z) {
        return new auu0(auu0Var.a, auu0Var.c, auu0Var.b, z);
    }

    @Override // p.cuu0
    public final wls0 a() {
        return this.b;
    }

    @Override // p.cuu0
    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auu0)) {
            return false;
        }
        auu0 auu0Var = (auu0) obj;
        return u890.j(this.a, auu0Var.a) && this.b == auu0Var.b && u890.j(this.c, auu0Var.c) && this.d == auu0Var.d;
    }

    @Override // p.cuu0
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.d) + cy30.d((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
