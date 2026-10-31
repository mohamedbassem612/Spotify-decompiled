package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gxz0 implements Parcelable {
    public static final Parcelable.Creator<gxz0> CREATOR = new erz0((byte) 10);
    public final String a;
    public final String b;
    public final w4i1 c;
    public final long d;
    public final boolean e;

    public /* synthetic */ gxz0(String str, String str2, w4i1 w4i1Var, long j, int i) {
        this(str, str2, w4i1Var, (i & 8) != 0 ? 0L : j, false);
    }

    public static gxz0 a(gxz0 gxz0Var, w4i1 w4i1Var, int i) {
        String str = gxz0Var.a;
        String str2 = gxz0Var.b;
        if ((i & 4) != 0) {
            w4i1Var = gxz0Var.c;
        }
        w4i1 w4i1Var2 = w4i1Var;
        long j = gxz0Var.d;
        boolean z = (i & 16) != 0 ? gxz0Var.e : true;
        gxz0Var.getClass();
        return new gxz0(str, str2, w4i1Var2, j, z);
    }

    public final String b() {
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
        if (!(obj instanceof gxz0)) {
            return false;
        }
        gxz0 gxz0Var = (gxz0) obj;
        return u890.j(this.a, gxz0Var.a) && u890.j(this.b, gxz0Var.b) && u890.j(this.c, gxz0Var.c) && this.d == gxz0Var.d && this.e == gxz0Var.e;
    }

    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.f(ydh.d(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), this.d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public gxz0(String str, String str2, w4i1 w4i1Var, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = w4i1Var;
        this.d = j;
        this.e = z;
    }
}
