package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tb extends ub {
    public static final Parcelable.Creator<tb> CREATOR = new scc((byte) 12);
    public final ed a;
    public final wc b;
    public final zc c;
    public final nc d;
    public final hc e;
    public final boolean f;

    public tb(ed edVar, wc wcVar, zc zcVar, nc ncVar, hc hcVar, boolean z) {
        this.a = edVar;
        this.b = wcVar;
        this.c = zcVar;
        this.d = ncVar;
        this.e = hcVar;
        this.f = z;
    }

    public static tb k(tb tbVar, ed edVar, rc rcVar, yc ycVar, nc ncVar, hc hcVar, int i) {
        if ((i & 1) != 0) {
            edVar = tbVar.a;
        }
        ed edVar2 = edVar;
        if ((i & 2) != 0) {
            rcVar = tbVar.b;
        }
        rc rcVar2 = rcVar;
        if ((i & 4) != 0) {
            ycVar = tbVar.c;
        }
        yc ycVar2 = ycVar;
        if ((i & 8) != 0) {
            ncVar = tbVar.d;
        }
        nc ncVar2 = ncVar;
        if ((i & 16) != 0) {
            hcVar = tbVar.e;
        }
        boolean z = tbVar.f;
        tbVar.getClass();
        return new tb(edVar2, rcVar2, ycVar2, ncVar2, hcVar, z);
    }

    public final boolean a() {
        return this.a.a() && this.b.a() && this.e.a();
    }

    public final hc b() {
        return this.e;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb)) {
            return false;
        }
        tb tbVar = (tb) obj;
        return u890.j(this.a, tbVar.a) && u890.j(this.b, tbVar.b) && u890.j(this.c, tbVar.c) && u890.j(this.d, tbVar.d) && u890.j(this.e, tbVar.e) && this.f == tbVar.f;
    }

    public final nc g() {
        return this.d;
    }

    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final zc j() {
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
        parcel.writeValue(this.d);
        parcel.writeValue(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
