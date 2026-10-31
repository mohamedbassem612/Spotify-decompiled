package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ie7 implements Parcelable {
    public static final Parcelable.Creator<ie7> CREATOR = new f67((byte) 14);
    public final String a;
    public final r620 b;
    public final yd7 c;
    public final List d;
    public final List e;

    public ie7(String str, r620 r620Var, yd7 yd7Var, List list, List list2) {
        this.a = str;
        this.b = r620Var;
        this.c = yd7Var;
        this.d = list;
        this.e = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie7)) {
            return false;
        }
        ie7 ie7Var = (ie7) obj;
        return u890.j(this.a, ie7Var.a) && this.b == ie7Var.b && u890.j(this.c, ie7Var.c) && u890.j(this.d, ie7Var.d) && u890.j(this.e, ie7Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        yd7 yd7Var = this.c;
        return this.e.hashCode() + f4i1.b((iHashCode + (yd7Var == null ? 0 : yd7Var.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        Iterator itM2 = kk0.m(parcel, this.e);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
    }
}
