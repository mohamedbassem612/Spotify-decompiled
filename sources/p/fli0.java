package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fli0 implements Parcelable {
    public static final Parcelable.Creator<fli0> CREATOR = new cyh0((byte) 22);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final dx e;
    public final int f;
    public final int g;
    public final boolean h;

    public fli0(String str, String str2, String str3, String str4, dx dxVar, int i, int i2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dxVar;
        this.f = i;
        this.g = i2;
        this.h = z;
    }

    public static fli0 a(fli0 fli0Var, dx dxVar, int i, int i2) {
        String str = fli0Var.a;
        String str2 = fli0Var.b;
        String str3 = fli0Var.c;
        String str4 = fli0Var.d;
        if ((i2 & 16) != 0) {
            dxVar = fli0Var.e;
        }
        dx dxVar2 = dxVar;
        if ((i2 & 32) != 0) {
            i = fli0Var.f;
        }
        int i3 = fli0Var.g;
        boolean z = fli0Var.h;
        fli0Var.getClass();
        return new fli0(str, str2, str3, str4, dxVar2, i, i3, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fli0)) {
            return false;
        }
        fli0 fli0Var = (fli0) obj;
        return u890.j(this.a, fli0Var.a) && u890.j(this.b, fli0Var.b) && u890.j(this.c, fli0Var.c) && u890.j(this.d, fli0Var.d) && u890.j(this.e, fli0Var.e) && this.f == fli0Var.f && this.g == fli0Var.g && this.h == fli0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + kaa0.f(this.g, ab80.k(this.f, (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        int i2 = this.f;
        if (i2 == 1) {
            str = "LOADING";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "READY";
        }
        parcel.writeString(str);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
