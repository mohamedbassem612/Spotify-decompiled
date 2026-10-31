package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zt30 extends au30 {
    public static final Parcelable.Creator<zt30> CREATOR = new xt30((byte) 1);
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final wkt e;
    public final String f;
    public final String g;

    public zt30(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, wkt wktVar, String str, String str2) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = wktVar;
        this.f = str;
        this.g = str2;
    }

    public static zt30 n(zt30 zt30Var, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            i = zt30Var.a;
        }
        int i3 = i;
        z771 z771Var = zt30Var.b;
        ez61 ez61Var = zt30Var.c;
        wa71 wa71Var = zt30Var.d;
        if ((i2 & 16) != 0) {
            wktVar = zt30Var.e;
        }
        return new zt30(i3, z771Var, ez61Var, wa71Var, wktVar, zt30Var.f, zt30Var.g);
    }

    @Override // p.au30
    public final ez61 a() {
        return this.c;
    }

    @Override // p.au30
    public final String b() {
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
        if (!(obj instanceof zt30)) {
            return false;
        }
        zt30 zt30Var = (zt30) obj;
        return this.a == zt30Var.a && u890.j(this.b, zt30Var.b) && u890.j(this.c, zt30Var.c) && u890.j(this.d, zt30Var.d) && u890.j(this.e, zt30Var.e) && u890.j(this.f, zt30Var.f) && u890.j(this.g, zt30Var.g);
    }

    @Override // p.au30
    public final String g() {
        return this.f;
    }

    @Override // p.au30
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

    @Override // p.au30
    public final int j() {
        return this.a;
    }

    @Override // p.au30
    public final wa71 k() {
        return this.d;
    }

    @Override // p.au30
    public final wkt l() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
