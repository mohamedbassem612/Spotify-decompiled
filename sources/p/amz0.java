package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class amz0 extends ouo1 implements Parcelable {
    public static final Parcelable.Creator<amz0> CREATOR = new j1z0((byte) 24);
    public final List b;
    public final Long c;

    public amz0(Long l, List list) {
        this.b = list;
        this.c = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amz0)) {
            return false;
        }
        amz0 amz0Var = (amz0) obj;
        return this.b.equals(amz0Var.b) && u890.j(this.c, amz0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Long l = this.c;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((khc0) itM.next()).writeToParcel(parcel, i);
        }
        Long l = this.c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }
}
