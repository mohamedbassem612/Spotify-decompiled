package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zg2 implements Parcelable {
    public static final Parcelable.Creator<zg2> CREATOR = new ue2((byte) 8);
    public final String a;
    public final tg2 b;
    public final String c;
    public final yg2 d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public /* synthetic */ zg2() {
        this("", new tg2("", -1), "", vg2.a, false, false, -1);
    }

    public static zg2 a(zg2 zg2Var, String str, tg2 tg2Var, String str2, yg2 yg2Var, boolean z, boolean z2, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = zg2Var.a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            tg2Var = zg2Var.b;
        }
        tg2 tg2Var2 = tg2Var;
        if ((i2 & 4) != 0) {
            str2 = zg2Var.c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            yg2Var = zg2Var.d;
        }
        yg2 yg2Var2 = yg2Var;
        if ((i2 & 16) != 0) {
            z = zg2Var.e;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            z2 = zg2Var.f;
        }
        boolean z4 = z2;
        if ((i2 & 64) != 0) {
            i = zg2Var.g;
        }
        zg2Var.getClass();
        return new zg2(str3, tg2Var2, str4, yg2Var2, z3, z4, i);
    }

    public final boolean b() {
        yg2 yg2Var = this.d;
        if (yg2Var instanceof ug2) {
            return true;
        }
        return (yg2Var instanceof wg2) && !(((wg2) yg2Var).a instanceof xb90);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg2)) {
            return false;
        }
        zg2 zg2Var = (zg2) obj;
        return u890.j(this.a, zg2Var.a) && u890.j(this.b, zg2Var.b) && u890.j(this.c, zg2Var.c) && u890.j(this.d, zg2Var.d) && this.e == zg2Var.e && this.f == zg2Var.f && this.g == zg2Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + xcg1.g(xcg1.g((this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g);
    }

    public zg2(String str, tg2 tg2Var, String str2, yg2 yg2Var, boolean z, boolean z2, int i) {
        this.a = str;
        this.b = tg2Var;
        this.c = str2;
        this.d = yg2Var;
        this.e = z;
        this.f = z2;
        this.g = i;
    }
}
