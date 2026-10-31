package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xoh0 implements Parcelable {
    public static final Parcelable.Creator<xoh0> CREATOR = new hug0((byte) 24);
    public final long a;
    public final Uri b;
    public final long c;
    public final int d;
    public final int e;
    public final p8i0 f;
    public final long g;
    public final long h;

    public xoh0(long j, Uri uri, long j2, int i, int i2, p8i0 p8i0Var, long j3, long j4) {
        this.a = j;
        this.b = uri;
        this.c = j2;
        this.d = i;
        this.e = i2;
        this.f = p8i0Var;
        this.g = j3;
        this.h = j4;
    }

    public final Uri a() {
        return this.b;
    }

    public final long b() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoh0)) {
            return false;
        }
        xoh0 xoh0Var = (xoh0) obj;
        return this.a == xoh0Var.a && u890.j(this.b, xoh0Var.b) && this.c == xoh0Var.c && this.d == xoh0Var.d && this.e == xoh0Var.e && this.f == xoh0Var.f && this.g == xoh0Var.g && this.h == xoh0Var.h;
    }

    public final p8i0 g() {
        return this.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + cy30.f((this.f.hashCode() + kaa0.f(this.e, kaa0.f(this.d, cy30.f(hrt.h(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31), 31), 31)) * 31, this.g, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f.name());
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
    }
}
