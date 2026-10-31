package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hia1 implements Parcelable {
    public static final Parcelable.Creator<hia1> CREATOR = new yx81((byte) 25);
    public final dia1 a;
    public final List b;
    public final List c;

    public hia1(dia1 dia1Var, List list, List list2) {
        this.a = dia1Var;
        this.b = list;
        this.c = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hia1)) {
            return false;
        }
        hia1 hia1Var = (hia1) obj;
        return this.a == hia1Var.a && this.b.equals(hia1Var.b) && this.c.equals(hia1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeString(((dia1) itM.next()).name());
        }
        Iterator itM2 = kk0.m(parcel, this.c);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
    }
}
