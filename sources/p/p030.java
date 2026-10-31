package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p030 implements lio {
    public static final Parcelable.Creator<p030> CREATOR = new ix20((byte) 4);
    public final yv51 a;
    public final String b;

    public p030(yv51 yv51Var, String str) {
        this.a = yv51Var;
        this.b = str;
    }

    @Override // p.vo1
    public final tu1 N(tu1 tu1Var) {
        ru1 ru1VarT = rwo1.t(tu1Var.a().b);
        return !u890.j(ru1VarT != null ? ru1VarT.a : null, this.b) ? tu1Var : super.N(tu1Var);
    }

    @Override // p.lio
    public final ru1 S0() {
        return new ru1(this.b, this.a.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p030)) {
            return false;
        }
        p030 p030Var = (p030) obj;
        return u890.j(this.a, p030Var.a) && u890.j(this.b, p030Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
    }

    public /* synthetic */ p030(yv51 yv51Var) {
        this(yv51Var, "atp");
    }
}
