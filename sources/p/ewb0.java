package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ewb0 implements dtb1 {
    public static final Parcelable.Creator<ewb0> CREATOR = new cwb0((byte) 1);
    public final ArrayList a;
    public final dwb0 b;
    public final String c;

    public ewb0(ArrayList arrayList, dwb0 dwb0Var, String str) {
        this.a = arrayList;
        this.b = dwb0Var;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewb0)) {
            return false;
        }
        ewb0 ewb0Var = (ewb0) obj;
        return this.a.equals(ewb0Var.a) && u890.j(this.b, ewb0Var.b) && u890.j(this.c, ewb0Var.c);
    }

    @Override // p.dtb1
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dwb0 dwb0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (dwb0Var == null ? 0 : dwb0Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((dwb0) itO.next()).writeToParcel(parcel, i);
        }
        dwb0 dwb0Var = this.b;
        if (dwb0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dwb0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
    }
}
