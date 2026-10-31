package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ygb1 extends bhb1 {
    public static final Parcelable.Creator<ygb1> CREATOR = new nja1((byte) 23);
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final wkt e;
    public final boolean f;

    public ygb1(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, wkt wktVar, boolean z) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = wktVar;
        this.f = z;
    }

    public static ygb1 l(ygb1 ygb1Var, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            i = ygb1Var.a;
        }
        int i3 = i;
        z771 z771Var = ygb1Var.b;
        ez61 ez61Var = ygb1Var.c;
        wa71 wa71Var = ygb1Var.d;
        if ((i2 & 16) != 0) {
            wktVar = ygb1Var.e;
        }
        return new ygb1(i3, z771Var, ez61Var, wa71Var, wktVar, ygb1Var.f);
    }

    public final ez61 a() {
        return this.c;
    }

    public final boolean b() {
        return this.f;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygb1)) {
            return false;
        }
        ygb1 ygb1Var = (ygb1) obj;
        return this.a == ygb1Var.a && u890.j(this.b, ygb1Var.b) && u890.j(this.c, ygb1Var.c) && u890.j(this.d, ygb1Var.d) && u890.j(this.e, ygb1Var.e) && this.f == ygb1Var.f;
    }

    public final z771 g() {
        return this.b;
    }

    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31)) * 31;
        wkt wktVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31);
    }

    public final wa71 j() {
        return this.d;
    }

    public final wkt k() {
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
