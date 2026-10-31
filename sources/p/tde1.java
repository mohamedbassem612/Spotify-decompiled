package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tde1 implements Parcelable {
    public static final Parcelable.Creator<tde1> CREATOR = new pwd1((byte) 10);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final int i;

    public tde1(String str, String str2, int i, boolean z, int i2, int i3, int i4, boolean z2, int i5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = z2;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tde1)) {
            return false;
        }
        tde1 tde1Var = (tde1) obj;
        return u890.j(this.a, tde1Var.a) && u890.j(this.b, tde1Var.b) && this.c == tde1Var.c && this.d == tde1Var.d && this.e == tde1Var.e && this.f == tde1Var.f && this.g == tde1Var.g && this.h == tde1Var.h && this.i == tde1Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + xcg1.g(kaa0.f(this.g, kaa0.f(this.f, ab80.k(this.e, xcg1.g(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31), 31), 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        int i2 = this.e;
        if (i2 == 1) {
            str = "Word";
        } else if (i2 == 2) {
            str = "Sentenced";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "Static";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
    }
}
