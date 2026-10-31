package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class klw0 extends llw0 {
    public static final Parcelable.Creator<klw0> CREATOR = new w7w0((byte) 18);
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final String g;

    public klw0(String str, long j, long j2, boolean z, boolean z2, int i, String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klw0)) {
            return false;
        }
        klw0 klw0Var = (klw0) obj;
        return u890.j(this.a, klw0Var.a) && this.b == klw0Var.b && this.c == klw0Var.c && this.d == klw0Var.d && this.e == klw0Var.e && this.f == klw0Var.f && u890.j(this.g, klw0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ab80.k(this.f, xcg1.g(xcg1.g(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        int i2 = this.f;
        if (i2 == 1) {
            str = "LANDSCAPE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "PORTRAIT";
        }
        parcel.writeString(str);
        parcel.writeString(this.g);
    }

    public klw0(Uri uri, String str) {
        this(uri.toString(), 0L, 0L, true, true, 2, str);
    }
}
