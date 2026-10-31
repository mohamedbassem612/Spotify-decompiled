package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class tv80 implements a8h1, Serializable, Parcelable {
    public final String X;
    public final int Y;
    public final ou80 a;
    public final y6r0 b;
    public final boolean c;
    public final long d;
    public final long e;
    public final Integer f;
    public final g6h1 g;
    public final String h;
    public final String i;
    public final String t;
    public static final sv80 Companion = new sv80();
    public static final Parcelable.Creator<tv80> CREATOR = new xl80((byte) 4);

    public tv80(int i, ou80 ou80Var, y6r0 y6r0Var, boolean z, long j, long j2, Integer num, g6h1 g6h1Var, String str, String str2, String str3, String str4, int i2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, rv80.a.getDescriptor());
            throw null;
        }
        this.a = ou80Var;
        this.b = y6r0Var;
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            g6h1.Companion.getClass();
            this.g = g6h1.e;
        } else {
            this.g = g6h1Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.t = null;
        } else {
            this.t = str3;
        }
        this.X = (i & 1024) == 0 ? "" : str4;
        this.Y = (i & 2048) == 0 ? 0 : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv80)) {
            return false;
        }
        tv80 tv80Var = (tv80) obj;
        return u890.j(this.a, tv80Var.a) && u890.j(this.b, tv80Var.b) && this.c == tv80Var.c && this.d == tv80Var.d && this.e == tv80Var.e && u890.j(this.f, tv80Var.f) && u890.j(this.g, tv80Var.g) && u890.j(this.h, tv80Var.h) && u890.j(this.i, tv80Var.i) && u890.j(this.t, tv80Var.t) && u890.j(this.X, tv80Var.X) && this.Y == tv80Var.Y;
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        y6r0 y6r0Var = this.b;
        int iF = cy30.f(cy30.f(xcg1.g((iHashCode + (y6r0Var == null ? 0 : y6r0Var.a.hashCode())) * 31, 31, this.c), this.d, 31), this.e, 31);
        Integer num = this.f;
        int iHashCode2 = (this.g.hashCode() + ((iF + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str = this.h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.t;
        return Integer.hashCode(this.Y) + cy30.d((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.a);
        y6r0 y6r0Var = this.b;
        parcel.writeString(y6r0Var != null ? y6r0Var.a : null);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeValue(this.f);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeSerializable(this.g);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y);
    }

    public tv80(ou80 ou80Var, y6r0 y6r0Var, boolean z, long j, long j2, Integer num, g6h1 g6h1Var, String str, String str2, String str3, String str4, int i) {
        this.a = ou80Var;
        this.b = y6r0Var;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = num;
        this.g = g6h1Var;
        this.h = str;
        this.i = str2;
        this.t = str3;
        this.X = str4;
        this.Y = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tv80(ou80 ou80Var, y6r0 y6r0Var) {
        this(ou80Var, y6r0Var, true, 0L, 0L, null, g6h1.e, null, null, null, "", 0);
        g6h1.Companion.getClass();
    }
}
