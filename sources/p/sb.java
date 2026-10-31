package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sb extends ub {
    public static final Parcelable.Creator<sb> CREATOR = new scc((byte) 11);
    public final qc a;
    public final nc b;
    public final hc c;
    public final zc d;
    public final boolean e;

    public sb(qc qcVar, nc ncVar, hc hcVar, zc zcVar, boolean z) {
        this.a = qcVar;
        this.b = ncVar;
        this.c = hcVar;
        this.d = zcVar;
        this.e = z;
    }

    public static sb k(sb sbVar, oc ocVar, nc ncVar, hc hcVar, yc ycVar, int i) {
        if ((i & 1) != 0) {
            ocVar = sbVar.a;
        }
        oc ocVar2 = ocVar;
        if ((i & 2) != 0) {
            ncVar = sbVar.b;
        }
        nc ncVar2 = ncVar;
        if ((i & 4) != 0) {
            hcVar = sbVar.c;
        }
        hc hcVar2 = hcVar;
        if ((i & 8) != 0) {
            ycVar = sbVar.d;
        }
        boolean z = sbVar.e;
        sbVar.getClass();
        return new sb(ocVar2, ncVar2, hcVar2, ycVar, z);
    }

    public final boolean a() {
        return this.a.a() && this.c.a();
    }

    public final hc b() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb)) {
            return false;
        }
        sb sbVar = (sb) obj;
        return u890.j(this.a, sbVar.a) && u890.j(this.b, sbVar.b) && u890.j(this.c, sbVar.c) && u890.j(this.d, sbVar.d) && this.e == sbVar.e;
    }

    public final nc g() {
        return this.b;
    }

    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final zc j() {
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
        parcel.writeValue(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
