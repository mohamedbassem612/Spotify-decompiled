package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o750 implements Parcelable {
    public static final Parcelable.Creator<o750> CREATOR = new n750((byte) 0);
    public final p6r0 a;
    public final lik1 b;
    public final v850 c;
    public final lik1 d;

    public o750(p6r0 p6r0Var, lik1 lik1Var, v850 v850Var, lik1 lik1Var2) {
        this.a = p6r0Var;
        this.b = lik1Var;
        this.c = v850Var;
        this.d = lik1Var2;
    }

    public final lik1 a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p6r0 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o750)) {
            return false;
        }
        o750 o750Var = (o750) obj;
        return u890.j(this.a, o750Var.a) && u890.j(this.b, o750Var.b) && this.c == o750Var.c && u890.j(this.d, o750Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b.a)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeParcelable(this.d, i);
    }
}
