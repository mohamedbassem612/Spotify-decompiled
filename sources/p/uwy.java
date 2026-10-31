package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uwy extends ywy {
    public static final Parcelable.Creator<uwy> CREATOR = new jhy((byte) 13);
    public final ela1 a;
    public final u771 b;
    public final int c;
    public final wkt d;
    public final String e;
    public final Throwable f;

    public uwy(ela1 ela1Var, u771 u771Var, int i, wkt wktVar, String str, Throwable th) {
        this.a = ela1Var;
        this.b = u771Var;
        this.c = i;
        this.d = wktVar;
        this.e = str;
        this.f = th;
    }

    public static uwy g(uwy uwyVar, ela1 ela1Var, u771 u771Var, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            ela1Var = uwyVar.a;
        }
        ela1 ela1Var2 = ela1Var;
        if ((i2 & 2) != 0) {
            u771Var = uwyVar.b;
        }
        u771 u771Var2 = u771Var;
        if ((i2 & 4) != 0) {
            i = uwyVar.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            wktVar = uwyVar.d;
        }
        return new uwy(ela1Var2, u771Var2, i3, wktVar, uwyVar.e, uwyVar.f);
    }

    @Override // p.ywy
    public final u771 a() {
        return this.b;
    }

    @Override // p.ywy
    public final wkt b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwy)) {
            return false;
        }
        uwy uwyVar = (uwy) obj;
        return u890.j(this.a, uwyVar.a) && u890.j(this.b, uwyVar.b) && this.c == uwyVar.c && u890.j(this.d, uwyVar.d) && u890.j(this.e, uwyVar.e) && u890.j(this.f, uwyVar.f);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cfm0.g(this.b, this.a.hashCode() * 31, 31), 31);
        wkt wktVar = this.d;
        int iD = cy30.d((iK + (wktVar == null ? 0 : wktVar.hashCode())) * 31, 31, this.e);
        Throwable th = this.f;
        return iD + (th != null ? th.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(lf51.q(this.c));
        parcel.writeString(this.e);
        parcel.writeSerializable(this.f);
    }
}
