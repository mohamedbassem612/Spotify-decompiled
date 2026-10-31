package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lj01 implements mj01 {
    public static final Parcelable.Creator<lj01> CREATOR = new erz0((byte) 26);
    public final long a;
    public final boolean b;
    public final Map c;
    public final Set d;
    public final boolean e;

    public lj01(long j, boolean z, Map map, Set set, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = map;
        this.d = set;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj01)) {
            return false;
        }
        lj01 lj01Var = (lj01) obj;
        return this.a == lj01Var.a && this.b == lj01Var.b && this.c.equals(lj01Var.c) && this.d.equals(lj01Var.d) && this.e == lj01Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gvg.c(cy30.e(xcg1.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        Iterator itJ = xcg1.j(parcel, this.c);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeLong(((Number) entry.getValue()).longValue());
        }
        Iterator itH = k4s0.h(this.d, parcel);
        while (itH.hasNext()) {
            parcel.writeParcelable((Parcelable) itH.next(), i);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
