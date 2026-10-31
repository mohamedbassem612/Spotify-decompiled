package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lby0 extends mby0 {
    public static final Parcelable.Creator<lby0> CREATOR = new zzx0((byte) 14);
    public final int a;
    public final z771 b;
    public final wa71 c;
    public final wkt d;

    public lby0(int i, z771 z771Var, wa71 wa71Var, wkt wktVar) {
        this.a = i;
        this.b = z771Var;
        this.c = wa71Var;
        this.d = wktVar;
    }

    public static lby0 h(lby0 lby0Var, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            i = lby0Var.a;
        }
        z771 z771Var = lby0Var.b;
        wa71 wa71Var = lby0Var.c;
        if ((i2 & 8) != 0) {
            wktVar = lby0Var.d;
        }
        return new lby0(i, z771Var, wa71Var, wktVar);
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
        if (!(obj instanceof lby0)) {
            return false;
        }
        lby0 lby0Var = (lby0) obj;
        return this.a == lby0Var.a && u890.j(this.b, lby0Var.b) && u890.j(this.c, lby0Var.c) && u890.j(this.d, lby0Var.d);
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
