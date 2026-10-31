package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jby0 extends mby0 {
    public static final Parcelable.Creator<jby0> CREATOR = new zzx0((byte) 12);
    public final int a;
    public final z771 b;
    public final wa71 c;
    public final wkt d;

    public jby0(int i, z771 z771Var, wa71 wa71Var, wkt wktVar) {
        this.a = i;
        this.b = z771Var;
        this.c = wa71Var;
        this.d = wktVar;
    }

    public static jby0 h(jby0 jby0Var, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            i = jby0Var.a;
        }
        z771 z771Var = jby0Var.b;
        wa71 wa71Var = jby0Var.c;
        if ((i2 & 8) != 0) {
            wktVar = jby0Var.d;
        }
        return new jby0(i, z771Var, wa71Var, wktVar);
    }

    public final z771 a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jby0)) {
            return false;
        }
        jby0 jby0Var = (jby0) obj;
        return this.a == jby0Var.a && u890.j(this.b, jby0Var.b) && u890.j(this.c, jby0Var.c) && u890.j(this.d, jby0Var.d);
    }

    public final wa71 g() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xvj1.j(this.b.a, l1d.C(this.a) * 31, 31)) * 31;
        wkt wktVar = this.d;
        return iHashCode + (wktVar == null ? 0 : wktVar.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
