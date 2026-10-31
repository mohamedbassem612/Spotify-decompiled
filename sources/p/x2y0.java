package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x2y0 implements Parcelable {
    public static final Parcelable.Creator<x2y0> CREATOR = new zzx0((byte) 3);
    public final ArrayList a;
    public final String b;

    public x2y0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2y0)) {
            return false;
        }
        x2y0 x2y0Var = (x2y0) obj;
        return this.a.equals(x2y0Var.a) && u890.j(this.b, x2y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((y2y0) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
    }
}
