package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hzn implements nzn {
    public static final Parcelable.Creator<hzn> CREATOR = new upn((byte) 19);
    public final ArrayList a;
    public final int b;
    public final iu30 c;

    public hzn(ArrayList arrayList, int i, iu30 iu30Var) {
        this.a = arrayList;
        this.b = i;
        this.c = iu30Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzn)) {
            return false;
        }
        hzn hznVar = (hzn) obj;
        return u890.j(this.a, hznVar.a) && this.b == hznVar.b && u890.j(this.c, hznVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((bzn) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b);
        parcel.writeSerializable((Serializable) this.c);
    }

    public /* synthetic */ hzn(ArrayList arrayList) {
        this(arrayList, 2, rwn.g);
    }
}
