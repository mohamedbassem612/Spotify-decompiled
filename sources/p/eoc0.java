package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eoc0 implements oim {
    public static final Parcelable.Creator<eoc0> CREATOR = new v5c0((byte) 26);
    public final String a;
    public final lik1 b;
    public final gn10 c;
    public final dpu0 d;
    public final bjm e;

    public eoc0(String str, lik1 lik1Var, gn10 gn10Var, dpu0 dpu0Var) {
        this.a = str;
        this.b = lik1Var;
        this.c = gn10Var;
        this.d = dpu0Var;
        this.e = new bjm(6, str, (String) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoc0)) {
            return false;
        }
        eoc0 eoc0Var = (eoc0) obj;
        return u890.j(this.a, eoc0Var.a) && u890.j(this.b, eoc0Var.b) && u890.j(this.c, eoc0Var.c) && u890.j(this.d, eoc0Var.d);
    }

    public final bjm getTarget() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b.a)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        this.d.writeToParcel(parcel, i);
    }

    public /* synthetic */ eoc0(String str, lik1 lik1Var, gn10 gn10Var) {
        this(str, lik1Var, gn10Var, new dpu0(null, null, false, null));
    }
}
