package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yb71 extends zb71 {
    public static final Parcelable.Creator<yb71> CREATOR = new v871((byte) 23);
    public final String a;
    public final String b;
    public final rb71 c;
    public final String d;
    public final int e;
    public final xb71 f;
    public final ib71 g;
    public final vb71 h;
    public final String i;

    public yb71(String str, String str2, rb71 rb71Var, String str3, int i, xb71 xb71Var, ib71 ib71Var, vb71 vb71Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = rb71Var;
        this.d = str3;
        this.e = i;
        this.f = xb71Var;
        this.g = ib71Var;
        this.h = vb71Var;
        this.i = str4;
    }

    public static yb71 j(yb71 yb71Var, rb71 rb71Var) {
        return new yb71(yb71Var.a, yb71Var.b, rb71Var, yb71Var.d, yb71Var.e, yb71Var.f, yb71Var.g, yb71Var.h, yb71Var.i);
    }

    @Override // p.zb71
    public final rb71 a() {
        return this.c;
    }

    @Override // p.zb71
    public final ib71 b() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb71)) {
            return false;
        }
        yb71 yb71Var = (yb71) obj;
        return u890.j(this.a, yb71Var.a) && u890.j(this.b, yb71Var.b) && u890.j(this.c, yb71Var.c) && u890.j(this.d, yb71Var.d) && this.e == yb71Var.e && u890.j(this.f, yb71Var.f) && this.g == yb71Var.g && u890.j(this.h, yb71Var.h) && u890.j(this.i, yb71Var.i);
    }

    @Override // p.zb71
    public final vb71 g() {
        return this.h;
    }

    @Override // p.zb71
    public final String h() {
        return this.i;
    }

    public final int hashCode() {
        int iK = ab80.k(this.e, cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31);
        xb71 xb71Var = this.f;
        int iHashCode = (iK + (xb71Var == null ? 0 : xb71Var.hashCode())) * 31;
        ib71 ib71Var = this.g;
        int iHashCode2 = (iHashCode + (ib71Var == null ? 0 : ib71Var.hashCode())) * 31;
        vb71 vb71Var = this.h;
        return this.i.hashCode() + ((iHashCode2 + (vb71Var != null ? vb71Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        int i2 = this.e;
        if (i2 == 1) {
            str = "Square";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Round";
        }
        parcel.writeString(str);
        xb71 xb71Var = this.f;
        if (xb71Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xb71Var.writeToParcel(parcel, i);
        }
        ib71 ib71Var = this.g;
        if (ib71Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ib71Var.name());
        }
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i);
    }
}
