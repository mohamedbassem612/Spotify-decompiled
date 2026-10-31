package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oq30 implements Parcelable {
    public static final Parcelable.Creator<oq30> CREATOR = new ix20((byte) 26);
    public final wkt X;
    public final wa71 a;
    public final jlw0 b;
    public final jlw0 c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final s171 h;
    public final z771 i;
    public final ez61 t;

    public oq30(wa71 wa71Var, jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str, String str2, s171 s171Var, z771 z771Var, ez61 ez61Var, wkt wktVar) {
        this.a = wa71Var;
        this.b = jlw0Var;
        this.c = jlw0Var2;
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = s171Var;
        this.i = z771Var;
        this.t = ez61Var;
        this.X = wktVar;
    }

    public static oq30 a(oq30 oq30Var, wkt wktVar) {
        return new oq30(oq30Var.a, oq30Var.b, oq30Var.c, oq30Var.d, oq30Var.e, oq30Var.f, oq30Var.g, oq30Var.h, oq30Var.i, oq30Var.t, wktVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq30)) {
            return false;
        }
        oq30 oq30Var = (oq30) obj;
        return u890.j(this.a, oq30Var.a) && u890.j(this.b, oq30Var.b) && u890.j(this.c, oq30Var.c) && this.d == oq30Var.d && this.e == oq30Var.e && u890.j(this.f, oq30Var.f) && u890.j(this.g, oq30Var.g) && u890.j(this.h, oq30Var.h) && u890.j(this.i, oq30Var.i) && u890.j(this.t, oq30Var.t) && u890.j(this.X, oq30Var.X);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jlw0 jlw0Var = this.b;
        int iF = pze0.f(this.t, xvj1.j(this.i.a, (this.h.hashCode() + cy30.d(cy30.d(kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + ((iHashCode + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31)) * 31, 31), 31), 31, this.f), 31, this.g)) * 31, 31), 31);
        wkt wktVar = this.X;
        return iF + (wktVar != null ? wktVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.t, i);
    }
}
