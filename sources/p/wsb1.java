package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wsb1 implements dhz, Parcelable {
    public static final Parcelable.Creator<wsb1> CREATOR = new olb1((byte) 16);
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final ygz e;

    public wsb1(int i, int i2, boolean z, int i3, ygz ygzVar) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = ygzVar;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
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
        if (!(obj instanceof wsb1)) {
            return false;
        }
        wsb1 wsb1Var = (wsb1) obj;
        return this.a == wsb1Var.a && this.b == wsb1Var.b && this.c == wsb1Var.c && this.d == wsb1Var.d && u890.j(this.e, wsb1Var.e);
    }

    public final int g() {
        return this.d;
    }

    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, xcg1.g(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31);
    }

    public final ygz j() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        int i2 = this.d;
        if (i2 == 1) {
            str = "Http";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Offline";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.e, i);
    }
}
