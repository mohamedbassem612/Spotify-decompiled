package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i79 implements Parcelable {
    public static final Parcelable.Creator<i79> CREATOR = new so8((byte) 23);
    public final g79 a;
    public final int b;
    public final h79 c;
    public final ArrayList d;

    public i79(g79 g79Var, int i, h79 h79Var, ArrayList arrayList) {
        this.a = g79Var;
        this.b = i;
        this.c = h79Var;
        this.d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i79)) {
            return false;
        }
        i79 i79Var = (i79) obj;
        return this.a == i79Var.a && this.b == i79Var.b && u890.j(this.c, i79Var.c) && this.d.equals(i79Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a.name());
        int i2 = this.b;
        if (i2 == 1) {
            str = "Decibels";
        } else if (i2 == 2) {
            str = "Hertz";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "Percent";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.c, i);
        Iterator itO = xvj1.o(this.d, parcel);
        while (itO.hasNext()) {
            ((z69) itO.next()).writeToParcel(parcel, i);
        }
    }
}
