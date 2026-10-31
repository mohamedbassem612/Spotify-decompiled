package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vqr0 implements Parcelable {
    public static final Parcelable.Creator<vqr0> CREATOR = new elr0((byte) 17);
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public vqr0(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqr0)) {
            return false;
        }
        vqr0 vqr0Var = (vqr0) obj;
        return u890.j(this.a, vqr0Var.a) && u890.j(this.b, vqr0Var.b) && u890.j(this.c, vqr0Var.c) && this.d == vqr0Var.d && u890.j(this.e, vqr0Var.e) && u890.j(this.f, vqr0Var.f) && u890.j(this.g, vqr0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
        String str = this.g;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(cfm0.r(this.d));
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
