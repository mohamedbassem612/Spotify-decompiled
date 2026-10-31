package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wt30 extends au30 {
    public static final Parcelable.Creator<wt30> CREATOR = new ix20((byte) 29);
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final wkt e;
    public final String f;
    public final String g;

    public wt30(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, wkt wktVar, String str, String str2) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = wktVar;
        this.f = str;
        this.g = str2;
    }

    public static wt30 n(wt30 wt30Var, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            i = wt30Var.a;
        }
        int i3 = i;
        z771 z771Var = wt30Var.b;
        ez61 ez61Var = wt30Var.c;
        wa71 wa71Var = wt30Var.d;
        if ((i2 & 16) != 0) {
            wktVar = wt30Var.e;
        }
        return new wt30(i3, z771Var, ez61Var, wa71Var, wktVar, wt30Var.f, wt30Var.g);
    }

    public final ez61 a() {
        return this.c;
    }

    public final String b() {
        return this.g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt30)) {
            return false;
        }
        wt30 wt30Var = (wt30) obj;
        return this.a == wt30Var.a && u890.j(this.b, wt30Var.b) && u890.j(this.c, wt30Var.c) && u890.j(this.d, wt30Var.d) && u890.j(this.e, wt30Var.e) && u890.j(this.f, wt30Var.f) && u890.j(this.g, wt30Var.g);
    }

    public final String g() {
        return this.f;
    }

    public final z771 h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31)) * 31;
        wkt wktVar = this.e;
        int iD = cy30.d((iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31, 31, this.f);
        String str = this.g;
        return iD + (str != null ? str.hashCode() : 0);
    }

    public final int j() {
        return this.a;
    }

    public final wa71 k() {
        return this.d;
    }

    public final wkt l() {
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
