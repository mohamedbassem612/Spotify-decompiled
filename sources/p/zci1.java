package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zci1 implements Parcelable {
    public static final Parcelable.Creator<zci1> CREATOR = new xbi1((byte) 1);
    public final String a;
    public final m6r b;
    public final int c;
    public final int d;
    public final int e;
    public final yxa0 f;
    public final boolean g;
    public final String h;
    public final String i;
    public final boolean t;

    public zci1(String str, m6r m6rVar, int i, int i2, int i3, yxa0 yxa0Var, boolean z, String str2, String str3, boolean z2) {
        this.a = str;
        this.b = m6rVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = yxa0Var;
        this.g = z;
        this.h = str2;
        this.i = str3;
        this.t = z2;
    }

    public static zci1 a(zci1 zci1Var, String str, m6r m6rVar, int i, boolean z, String str2, String str3, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            str = zci1Var.a;
        }
        return new zci1(str, (i2 & 2) != 0 ? zci1Var.b : m6rVar, zci1Var.c, zci1Var.d, (i2 & 16) != 0 ? zci1Var.e : i, zci1Var.f, (i2 & 64) != 0 ? zci1Var.g : z, (i2 & 128) != 0 ? zci1Var.h : str2, (i2 & 256) != 0 ? zci1Var.i : str3, (i2 & 512) != 0 ? zci1Var.t : z2);
    }

    public final boolean b() {
        if (!this.g) {
            return false;
        }
        txa0 txa0Var = txa0.a;
        yxa0 yxa0Var = this.f;
        return u890.j(yxa0Var, txa0Var) || (yxa0Var instanceof vxa0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zci1)) {
            return false;
        }
        zci1 zci1Var = (zci1) obj;
        return u890.j(this.a, zci1Var.a) && u890.j(this.b, zci1Var.b) && this.c == zci1Var.c && this.d == zci1Var.d && this.e == zci1Var.e && u890.j(this.f, zci1Var.f) && this.g == zci1Var.g && u890.j(this.h, zci1Var.h) && u890.j(this.i, zci1Var.i) && this.t == zci1Var.t;
    }

    public final int g() {
        if (this.e == 3) {
            return 3;
        }
        if (ihc1.y0(this.a) || ihc1.y0(this.b.a)) {
            return 1;
        }
        if (b()) {
            if ((this.h.length() == 0) != (this.i.length() == 0)) {
                return 2;
            }
        }
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + cy30.d(cy30.d(xcg1.g((this.f.hashCode() + ab80.k(this.e, kaa0.f(this.d, kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        int i2 = this.e;
        if (i2 == 1) {
            str = "EMPTY";
        } else if (i2 == 2) {
            str = "READY";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "DATE_ERROR";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.t ? 1 : 0);
    }
}
