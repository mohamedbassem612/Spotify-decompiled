package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e7n0 extends h7n0 {
    public static final Parcelable.Creator<e7n0> CREATOR = new fgm0((byte) 26);
    public final ela1 a;
    public final u771 b;
    public final int c;
    public final wkt d;
    public final String e;
    public final Throwable f;

    public e7n0(ela1 ela1Var, u771 u771Var, int i, wkt wktVar, String str, Throwable th) {
        this.a = ela1Var;
        this.b = u771Var;
        this.c = i;
        this.d = wktVar;
        this.e = str;
        this.f = th;
    }

    public static e7n0 j(e7n0 e7n0Var, ela1 ela1Var, u771 u771Var, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            ela1Var = e7n0Var.a;
        }
        ela1 ela1Var2 = ela1Var;
        if ((i2 & 2) != 0) {
            u771Var = e7n0Var.b;
        }
        u771 u771Var2 = u771Var;
        if ((i2 & 4) != 0) {
            i = e7n0Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            wktVar = e7n0Var.d;
        }
        return new e7n0(ela1Var2, u771Var2, i3, wktVar, e7n0Var.e, e7n0Var.f);
    }

    public final int a() {
        return this.c;
    }

    public final u771 b() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7n0)) {
            return false;
        }
        e7n0 e7n0Var = (e7n0) obj;
        return u890.j(this.a, e7n0Var.a) && u890.j(this.b, e7n0Var.b) && this.c == e7n0Var.c && u890.j(this.d, e7n0Var.d) && u890.j(this.e, e7n0Var.e) && u890.j(this.f, e7n0Var.f);
    }

    public final wkt g() {
        return this.d;
    }

    public final ela1 h() {
        return this.a;
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cfm0.g(this.b, this.a.hashCode() * 31, 31), 31);
        wkt wktVar = this.d;
        int iD = cy30.d((iK + (wktVar == null ? 0 : wktVar.hashCode())) * 31, 31, this.e);
        Throwable th = this.f;
        return iD + (th != null ? th.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(lf51.q(this.c));
        parcel.writeString(this.e);
        parcel.writeSerializable(this.f);
    }
}
