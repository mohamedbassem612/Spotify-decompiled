package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d5g implements Parcelable {
    public static final Parcelable.Creator<d5g> CREATOR = new wxf(14);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final i5l1 e;
    public final xhc0 f;
    public final lra g;

    public d5g(boolean z, boolean z2, String str, String str2, i5l1 i5l1Var, xhc0 xhc0Var, lra lraVar) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = i5l1Var;
        this.f = xhc0Var;
        this.g = lraVar;
    }

    public static d5g a(d5g d5gVar, boolean z, lra lraVar, int i) {
        if ((i & 1) != 0) {
            z = d5gVar.a;
        }
        boolean z2 = d5gVar.b;
        String str = d5gVar.c;
        String str2 = d5gVar.d;
        i5l1 i5l1Var = d5gVar.e;
        xhc0 xhc0Var = d5gVar.f;
        d5gVar.getClass();
        return new d5g(z, z2, str, str2, i5l1Var, xhc0Var, lraVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5g)) {
            return false;
        }
        d5g d5gVar = (d5g) obj;
        return this.a == d5gVar.a && this.b == d5gVar.b && u890.j(this.c, d5gVar.c) && u890.j(this.d, d5gVar.d) && u890.j(this.e, d5gVar.e) && u890.j(this.f, d5gVar.f) && u890.j(this.g, d5gVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        i5l1 i5l1Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iD + (i5l1Var == null ? 0 : i5l1Var.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        i5l1 i5l1Var = this.e;
        if (i5l1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            i5l1Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f, i);
        this.g.writeToParcel(parcel, i);
    }
}
