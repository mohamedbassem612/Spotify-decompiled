package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f7n0 extends h7n0 {
    public static final Parcelable.Creator<f7n0> CREATOR = new fgm0((byte) 27);
    public final u771 a;
    public final int b;
    public final ela1 c;
    public final wkt d;
    public final llw0 e;
    public final jlw0 f;

    public f7n0(u771 u771Var, int i, ela1 ela1Var, wkt wktVar, llw0 llw0Var, jlw0 jlw0Var) {
        this.a = u771Var;
        this.b = i;
        this.c = ela1Var;
        this.d = wktVar;
        this.e = llw0Var;
        this.f = jlw0Var;
    }

    public static f7n0 j(f7n0 f7n0Var, int i, wkt wktVar, int i2) {
        u771 u771Var = f7n0Var.a;
        if ((i2 & 2) != 0) {
            i = f7n0Var.b;
        }
        int i3 = i;
        ela1 ela1Var = f7n0Var.c;
        if ((i2 & 8) != 0) {
            wktVar = f7n0Var.d;
        }
        return new f7n0(u771Var, i3, ela1Var, wktVar, f7n0Var.e, f7n0Var.f);
    }

    public final int a() {
        return this.b;
    }

    public final u771 b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7n0)) {
            return false;
        }
        f7n0 f7n0Var = (f7n0) obj;
        return u890.j(this.a, f7n0Var.a) && this.b == f7n0Var.b && u890.j(this.c, f7n0Var.c) && u890.j(this.d, f7n0Var.d) && u890.j(this.e, f7n0Var.e) && u890.j(this.f, f7n0Var.f);
    }

    public final wkt g() {
        return this.d;
    }

    public final ela1 h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31;
        wkt wktVar = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31)) * 31;
        jlw0 jlw0Var = this.f;
        return iHashCode2 + (jlw0Var != null ? jlw0Var.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(lf51.q(this.b));
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }
}
