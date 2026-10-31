package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class awp0 implements Parcelable {
    public static final Parcelable.Creator<awp0> CREATOR = new ump0((byte) 18);
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final k4m f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public awp0(String str, String str2, String str3, int i, int i2, k4m k4mVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = k4mVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awp0)) {
            return false;
        }
        awp0 awp0Var = (awp0) obj;
        return u890.j(this.a, awp0Var.a) && u890.j(this.b, awp0Var.b) && u890.j(this.c, awp0Var.c) && this.d == awp0Var.d && this.e == awp0Var.e && this.f == awp0Var.f && this.g == awp0Var.g && this.h == awp0Var.h && this.i == awp0Var.i;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g(p3d1.g(this.f, ab80.k(this.e, ab80.k(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.g), 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        int i2 = this.d;
        if (i2 == 1) {
            str = "TRACK";
        } else if (i2 == 2) {
            str = "ALBUM";
        } else if (i2 == 3) {
            str = "EPISODE";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "PLAYLIST";
        }
        parcel.writeString(str);
        parcel.writeString(fd21.o(this.e));
        parcel.writeString(this.f.name());
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
