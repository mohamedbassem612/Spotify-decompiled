package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kbn1 extends u9 {
    public static final Parcelable.Creator<kbn1> CREATOR = new e9n1((byte) 16);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean t;

    public kbn1(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
        this.t = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kbn1)) {
            return false;
        }
        kbn1 kbn1Var = (kbn1) obj;
        return this.a == kbn1Var.a && this.b == kbn1Var.b && this.c == kbn1Var.c && TextUtils.equals(this.d, kbn1Var.d) && TextUtils.equals(this.e, kbn1Var.e) && TextUtils.equals(this.f, kbn1Var.f) && TextUtils.equals(this.g, kbn1Var.g) && TextUtils.equals(this.h, kbn1Var.h) && this.i == kbn1Var.i && this.t == kbn1Var.t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.t)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j541.F(parcel, 5, this.d);
        j541.F(parcel, 6, this.e);
        j541.F(parcel, 7, this.f);
        j541.F(parcel, 8, this.g);
        j541.F(parcel, 9, this.h);
        j541.K(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        j541.K(parcel, 11, 4);
        parcel.writeInt(this.t ? 1 : 0);
        j541.M(iL, parcel);
    }
}
