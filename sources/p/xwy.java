package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xwy extends ywy {
    public static final Parcelable.Creator<xwy> CREATOR = new jhy((byte) 15);
    public final ela1 a;
    public final u771 b;
    public final int c;
    public final wkt d;

    public xwy(ela1 ela1Var, u771 u771Var, int i, wkt wktVar) {
        this.a = ela1Var;
        this.b = u771Var;
        this.c = i;
        this.d = wktVar;
    }

    public static xwy g(xwy xwyVar, ela1 ela1Var, u771 u771Var, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            ela1Var = xwyVar.a;
        }
        if ((i2 & 2) != 0) {
            u771Var = xwyVar.b;
        }
        if ((i2 & 4) != 0) {
            i = xwyVar.c;
        }
        if ((i2 & 8) != 0) {
            wktVar = xwyVar.d;
        }
        return new xwy(ela1Var, u771Var, i, wktVar);
    }

    public final u771 a() {
        return this.b;
    }

    public final wkt b() {
        return this.d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwy)) {
            return false;
        }
        xwy xwyVar = (xwy) obj;
        return u890.j(this.a, xwyVar.a) && u890.j(this.b, xwyVar.b) && this.c == xwyVar.c && u890.j(this.d, xwyVar.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cfm0.g(this.b, this.a.hashCode() * 31, 31), 31);
        wkt wktVar = this.d;
        return iK + (wktVar == null ? 0 : wktVar.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(lf51.q(this.c));
    }
}
