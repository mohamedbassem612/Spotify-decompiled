package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mse1 implements ose1 {
    public static final Parcelable.Creator<mse1> CREATOR = new lse1((byte) 0);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;

    public mse1(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
    }

    @Override // p.ose1
    public final boolean I() {
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
        if (!(obj instanceof mse1)) {
            return false;
        }
        mse1 mse1Var = (mse1) obj;
        return this.a == mse1Var.a && this.b == mse1Var.b && this.c == mse1Var.c && u890.j(this.d, mse1Var.d) && u890.j(this.e, mse1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // p.ose1
    public final boolean q0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
