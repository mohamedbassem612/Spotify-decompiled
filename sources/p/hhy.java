package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hhy extends mhy {
    public static final Parcelable.Creator<hhy> CREATOR = new utx((byte) 28);
    public final List a;
    public final a3t0 b;
    public final Set c;
    public final boolean d;

    public hhy(List list, a3t0 a3t0Var, Set set, boolean z) {
        this.a = list;
        this.b = a3t0Var;
        this.c = set;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhy)) {
            return false;
        }
        hhy hhyVar = (hhy) obj;
        return u890.j(this.a, hhyVar.a) && this.b == hhyVar.b && this.c.equals(hhyVar.c) && this.d == hhyVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gvg.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((ttm1) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b.name());
        Iterator itH = k4s0.h(this.c, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        parcel.writeInt(this.d ? 1 : 0);
    }
}
