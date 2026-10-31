package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w31 implements c41 {
    public static final Parcelable.Creator<w31> CREATOR = new t21((byte) 25);
    public final hm a;
    public final epv0 b;
    public final n5o c;
    public final jj01 d;
    public final boolean e;

    public w31(hm hmVar, epv0 epv0Var, n5o n5oVar, jj01 jj01Var, boolean z) {
        this.a = hmVar;
        this.b = epv0Var;
        this.c = n5oVar;
        this.d = jj01Var;
        this.e = z;
    }

    public static w31 a(w31 w31Var, epv0 epv0Var, jj01 jj01Var, boolean z, int i) {
        hm hmVar = w31Var.a;
        if ((i & 2) != 0) {
            epv0Var = w31Var.b;
        }
        epv0 epv0Var2 = epv0Var;
        n5o n5oVar = w31Var.c;
        if ((i & 8) != 0) {
            jj01Var = w31Var.d;
        }
        jj01 jj01Var2 = jj01Var;
        if ((i & 16) != 0) {
            z = w31Var.e;
        }
        w31Var.getClass();
        return new w31(hmVar, epv0Var2, n5oVar, jj01Var2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w31)) {
            return false;
        }
        w31 w31Var = (w31) obj;
        return u890.j(this.a, w31Var.a) && u890.j(this.b, w31Var.b) && u890.j(this.c, w31Var.c) && u890.j(this.d, w31Var.d) && this.e == w31Var.e;
    }

    public final int hashCode() {
        hm hmVar = this.a;
        int iHashCode = (hmVar == null ? 0 : hmVar.hashCode()) * 31;
        epv0 epv0Var = this.b;
        int iHashCode2 = (iHashCode + (epv0Var == null ? 0 : epv0Var.hashCode())) * 31;
        n5o n5oVar = this.c;
        int iHashCode3 = (iHashCode2 + (n5oVar == null ? 0 : n5oVar.hashCode())) * 31;
        jj01 jj01Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (jj01Var != null ? jj01Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        jj01 jj01Var = this.d;
        if (jj01Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jj01Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
