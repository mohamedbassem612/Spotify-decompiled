package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x120 implements b220 {
    public static final Parcelable.Creator<x120> CREATOR = new no10((byte) 19);
    public final ArrayList a;
    public final int b;
    public final Integer c;
    public final String d;

    public x120(int i, Integer num, String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = num;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x120)) {
            return false;
        }
        x120 x120Var = (x120) obj;
        return this.a.equals(x120Var.a) && this.b == x120Var.b && u890.j(this.c, x120Var.c) && u890.j(this.d, x120Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((ll51) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeString(this.d);
    }
}
