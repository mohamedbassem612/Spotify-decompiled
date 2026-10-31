package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pkm0 implements dtb1 {
    public static final Parcelable.Creator<pkm0> CREATOR = new fgm0((byte) 18);
    public final String a;
    public final ArrayList b;
    public final int c;
    public final g6m0 d;

    public pkm0(String str, ArrayList arrayList, int i, g6m0 g6m0Var) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = g6m0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkm0)) {
            return false;
        }
        pkm0 pkm0Var = (pkm0) obj;
        return u890.j(this.a, pkm0Var.a) && this.b.equals(pkm0Var.b) && this.c == pkm0Var.c && this.d == pkm0Var.d;
    }

    public final String getId() {
        return "MoreLike";
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        int i2 = this.c;
        if (i2 == 1) {
            str = "Tracks";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Artists";
        }
        parcel.writeString(str);
        parcel.writeString(this.d.name());
    }
}
