package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kkg0 implements Parcelable {
    public static final Parcelable.Creator<kkg0> CREATOR = new isf0((byte) 26);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final env0 e;
    public final boolean f;
    public final boolean g;

    public kkg0(boolean z, boolean z2, String str, boolean z3, env0 env0Var, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = env0Var;
        this.f = z4;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkg0)) {
            return false;
        }
        kkg0 kkg0Var = (kkg0) obj;
        return this.a == kkg0Var.a && this.b == kkg0Var.b && u890.j(this.c, kkg0Var.c) && this.d == kkg0Var.d && u890.j(this.e, kkg0Var.e) && this.f == kkg0Var.f && this.g == kkg0Var.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iG2 = xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        env0 env0Var = this.e;
        return Boolean.hashCode(this.g) + xcg1.g((iG2 + (env0Var != null ? env0Var.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
