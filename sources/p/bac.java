package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bac implements dtb1 {
    public static final Parcelable.Creator<bac> CREATOR = new yyb((byte) 6);
    public final d761 a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public bac(d761 d761Var, ArrayList arrayList, String str, String str2) {
        this.a = d761Var;
        this.b = arrayList;
        this.c = str;
        this.d = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bac)) {
            return false;
        }
        bac bacVar = (bac) obj;
        return u890.j(this.a, bacVar.a) && this.b.equals(bacVar.b) && u890.j(this.c, bacVar.c) && u890.j(this.d, bacVar.d);
    }

    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(p3d1.f(this.b, Arrays.hashCode(this.a.a) * 31, 31), 31, this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            ((eac) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
