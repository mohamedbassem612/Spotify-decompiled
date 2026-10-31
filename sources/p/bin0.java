package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bin0 implements Parcelable {
    public static final Parcelable.Creator<bin0> CREATOR = new dan0((byte) 5);
    public final List a;
    public final List b;
    public final Set c;
    public final shn0 d;

    public bin0(List list, List list2, Set set, shn0 shn0Var) {
        this.a = list;
        this.b = list2;
        this.c = set;
        this.d = shn0Var;
    }

    public static bin0 a(bin0 bin0Var, ArrayList arrayList, Set set, shn0 shn0Var, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = bin0Var.a;
        }
        List list2 = bin0Var.b;
        if ((i & 4) != 0) {
            set = bin0Var.c;
        }
        if ((i & 8) != 0) {
            shn0Var = bin0Var.d;
        }
        return new bin0(list, list2, set, shn0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bin0)) {
            return false;
        }
        bin0 bin0Var = (bin0) obj;
        return this.a.equals(bin0Var.a) && this.b.equals(bin0Var.b) && u890.j(this.c, bin0Var.c) && this.d == bin0Var.d;
    }

    public final int hashCode() {
        int iC = gvg.c(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        shn0 shn0Var = this.d;
        return iC + (shn0Var == null ? 0 : shn0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        Iterator itM2 = kk0.m(parcel, this.b);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
        Iterator itH = k4s0.h(this.c, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        shn0 shn0Var = this.d;
        if (shn0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(shn0Var.name());
        }
    }
}
