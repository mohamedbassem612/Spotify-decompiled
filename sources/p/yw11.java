package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yw11 implements Parcelable {
    public static final Parcelable.Creator<yw11> CREATOR = new e211((byte) 16);
    public final cxn a;
    public final Set b;
    public final List c;

    public yw11(cxn cxnVar, Set set, List list) {
        this.a = cxnVar;
        this.b = set;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw11)) {
            return false;
        }
        yw11 yw11Var = (yw11) obj;
        return u890.j(this.a, yw11Var.a) && this.b.equals(yw11Var.b) && this.c.equals(yw11Var.c);
    }

    public final List getItems() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itH = k4s0.h(this.b, parcel);
        while (itH.hasNext()) {
            ((m620) itH.next()).writeToParcel(parcel, i);
        }
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
