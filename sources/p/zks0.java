package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zks0 implements Parcelable {
    public static final Parcelable.Creator<zks0> CREATOR = new bis0((byte) 5);
    public final int a;
    public final xks0 b;
    public final String c;
    public final yks0 d;

    public zks0(int i, xks0 xks0Var, String str, yks0 yks0Var) {
        this.a = i;
        this.b = xks0Var;
        this.c = str;
        this.d = yks0Var;
    }

    public final boolean a() {
        if (this.b != xks0.c) {
            return false;
        }
        yks0 yks0Var = yks0.c;
        yks0 yks0Var2 = this.d;
        return yks0Var2 == yks0Var || yks0Var2 == yks0.b;
    }

    public final boolean b() {
        return this.b == xks0.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zks0)) {
            return false;
        }
        zks0 zks0Var = (zks0) obj;
        return this.a == zks0Var.a && this.b == zks0Var.b && u890.j(this.c, zks0Var.c) && this.d == zks0Var.d;
    }

    public final boolean g() {
        return this.b == xks0.b && this.d == yks0.d;
    }

    public final boolean h() {
        return this.b == xks0.b && this.d == yks0.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "Unspecified";
        } else if (i2 == 2) {
            str = "OnPlatform";
        } else if (i2 == 3) {
            str = "OffPlatform";
        } else if (i2 == 4) {
            str = "InviteLink";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "FriendRequest";
        }
        parcel.writeString(str);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
    }
}
