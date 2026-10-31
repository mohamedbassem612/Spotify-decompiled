package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g7n0 extends h7n0 {
    public static final Parcelable.Creator<g7n0> CREATOR = new fgm0((byte) 28);
    public final ela1 a;
    public final u771 b;
    public final int c;
    public final wkt d;

    public g7n0(ela1 ela1Var, u771 u771Var, int i, wkt wktVar) {
        this.a = ela1Var;
        this.b = u771Var;
        this.c = i;
        this.d = wktVar;
    }

    public static g7n0 j(g7n0 g7n0Var, ela1 ela1Var, u771 u771Var, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            ela1Var = g7n0Var.a;
        }
        if ((i2 & 2) != 0) {
            u771Var = g7n0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = g7n0Var.c;
        }
        if ((i2 & 8) != 0) {
            wktVar = g7n0Var.d;
        }
        return new g7n0(ela1Var, u771Var, i, wktVar);
    }

    @Override // p.h7n0
    public final int a() {
        return this.c;
    }

    @Override // p.h7n0
    public final u771 b() {
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
        if (!(obj instanceof g7n0)) {
            return false;
        }
        g7n0 g7n0Var = (g7n0) obj;
        return u890.j(this.a, g7n0Var.a) && u890.j(this.b, g7n0Var.b) && this.c == g7n0Var.c && u890.j(this.d, g7n0Var.d);
    }

    @Override // p.h7n0
    public final wkt g() {
        return this.d;
    }

    @Override // p.h7n0
    public final ela1 h() {
        return this.a;
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cfm0.g(this.b, this.a.hashCode() * 31, 31), 31);
        wkt wktVar = this.d;
        return iK + (wktVar == null ? 0 : wktVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(lf51.q(this.c));
    }
}
