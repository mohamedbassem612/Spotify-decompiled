package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d4n implements Parcelable {
    public static final Parcelable.Creator<d4n> CREATOR = new rtm((byte) 11);
    public final yxa0 a;
    public final boolean b;
    public final lik1 c;
    public final i4n d;

    public d4n(yxa0 yxa0Var, boolean z, lik1 lik1Var, i4n i4nVar) {
        this.a = yxa0Var;
        this.b = z;
        this.c = lik1Var;
        this.d = i4nVar;
    }

    public static d4n a(d4n d4nVar, i4n i4nVar, int i) {
        yxa0 yxa0Var = d4nVar.a;
        boolean z = (i & 2) != 0 ? d4nVar.b : true;
        lik1 lik1Var = d4nVar.c;
        if ((i & 8) != 0) {
            i4nVar = d4nVar.d;
        }
        return new d4n(yxa0Var, z, lik1Var, i4nVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4n)) {
            return false;
        }
        d4n d4nVar = (d4n) obj;
        return u890.j(this.a, d4nVar.a) && this.b == d4nVar.b && u890.j(this.c, d4nVar.c) && u890.j(this.d, d4nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
