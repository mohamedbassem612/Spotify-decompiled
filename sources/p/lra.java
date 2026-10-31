package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lra implements Parcelable {
    public static final Parcelable.Creator<lra> CREATOR = new ux9((byte) 29);
    public final nra a;
    public final String b;
    public final List c;
    public final List d;
    public final ora e;
    public final boolean f;
    public final String g;
    public final tly0 h;
    public final List i;

    public lra(nra nraVar, String str, List list, List list2, ora oraVar, boolean z, String str2, tly0 tly0Var, List list3) {
        this.a = nraVar;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = oraVar;
        this.f = z;
        this.g = str2;
        this.h = tly0Var;
        this.i = list3;
    }

    public static lra a(lra lraVar, ora oraVar, boolean z, int i) {
        nra nraVar = lraVar.a;
        String str = lraVar.b;
        List list = lraVar.c;
        List list2 = lraVar.d;
        if ((i & 16) != 0) {
            oraVar = lraVar.e;
        }
        ora oraVar2 = oraVar;
        if ((i & 32) != 0) {
            z = lraVar.f;
        }
        String str2 = lraVar.g;
        tly0 tly0Var = lraVar.h;
        List list3 = lraVar.i;
        lraVar.getClass();
        return new lra(nraVar, str, list, list2, oraVar2, z, str2, tly0Var, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lra)) {
            return false;
        }
        lra lraVar = (lra) obj;
        return u890.j(this.a, lraVar.a) && u890.j(this.b, lraVar.b) && u890.j(this.c, lraVar.c) && u890.j(this.d, lraVar.d) && u890.j(this.e, lraVar.e) && this.f == lraVar.f && u890.j(this.g, lraVar.g) && u890.j(this.h, lraVar.h) && u890.j(this.i, lraVar.i);
    }

    public final int hashCode() {
        nra nraVar = this.a;
        int iB = f4i1.b(f4i1.b(cy30.d((nraVar == null ? 0 : nraVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        ora oraVar = this.e;
        return this.i.hashCode() + ((this.h.hashCode() + cy30.d(xcg1.g((iB + (oraVar != null ? oraVar.hashCode() : 0)) * 31, 31, this.f), 31, this.g)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nra nraVar = this.a;
        if (nraVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nraVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        Iterator itM2 = kk0.m(parcel, this.d);
        while (itM2.hasNext()) {
            ((rta) itM2.next()).writeToParcel(parcel, i);
        }
        ora oraVar = this.e;
        if (oraVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oraVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeStringList(this.i);
    }
}
