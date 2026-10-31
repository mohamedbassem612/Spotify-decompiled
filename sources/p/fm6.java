package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fm6 implements oim {
    public static final Parcelable.Creator<fm6> CREATOR = new fp5((byte) 10);
    public final String a;
    public final lik1 b;
    public final String c;
    public final bm6 d;
    public final bjm e;

    public fm6(String str, lik1 lik1Var, String str2, bm6 bm6Var) {
        this.a = str;
        this.b = lik1Var;
        this.c = str2;
        this.d = bm6Var;
        this.e = new bjm(4, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm6)) {
            return false;
        }
        fm6 fm6Var = (fm6) obj;
        return u890.j(this.a, fm6Var.a) && u890.j(this.b, fm6Var.b) && u890.j(this.c, fm6Var.c) && u890.j(this.d, fm6Var.d);
    }

    @Override // p.oim
    public final bjm getTarget() {
        return this.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b.a);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
    }

    public /* synthetic */ fm6(String str, lik1 lik1Var, bm6 bm6Var) {
        this(str, lik1Var, null, bm6Var);
    }
}
