package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oqr0 implements Parcelable {
    public static final Parcelable.Creator<oqr0> CREATOR = new elr0((byte) 13);
    public final h3f1 a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public oqr0(h3f1 h3f1Var, String str, String str2, ArrayList arrayList) {
        this.a = h3f1Var;
        this.b = str;
        this.c = str2;
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
        if (!(obj instanceof oqr0)) {
            return false;
        }
        oqr0 oqr0Var = (oqr0) obj;
        return u890.j(this.a, oqr0Var.a) && u890.j(this.b, oqr0Var.b) && u890.j(this.c, oqr0Var.c) && this.d.equals(oqr0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Iterator itO = xvj1.o(this.d, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
    }
}
