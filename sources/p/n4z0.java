package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n4z0 implements mvb1 {
    public static final Parcelable.Creator<n4z0> CREATOR = new j1z0((byte) 9);
    public final String a;
    public final List b;
    public final ArrayList c;

    public n4z0(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4z0)) {
            return false;
        }
        n4z0 n4z0Var = (n4z0) obj;
        return u890.j(this.a, n4z0Var.a) && this.b.equals(n4z0Var.b) && this.c.equals(n4z0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((r6i1) itO.next()).writeToParcel(parcel, i);
        }
    }
}
