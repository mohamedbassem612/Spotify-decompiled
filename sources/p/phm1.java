package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class phm1 implements Parcelable {
    public static final Parcelable.Creator<phm1> CREATOR = new lfm1((byte) 22);
    public final String a;
    public final ArrayList b;
    public final int c;

    public phm1(int i, String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phm1)) {
            return false;
        }
        phm1 phm1Var = (phm1) obj;
        return u890.j(this.a, phm1Var.a) && this.b.equals(phm1Var.b) && this.c == phm1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            ((qhm1) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c);
    }
}
