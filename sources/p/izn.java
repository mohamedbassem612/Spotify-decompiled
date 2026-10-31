package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class izn implements nzn {
    public static final Parcelable.Creator<izn> CREATOR = new upn((byte) 20);
    public final ArrayList a;
    public final int b;
    public final iu30 c;

    public izn(ArrayList arrayList, int i, iu30 iu30Var) {
        this.a = arrayList;
        this.b = i;
        this.c = iu30Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izn)) {
            return false;
        }
        izn iznVar = (izn) obj;
        return this.a.equals(iznVar.a) && this.b == iznVar.b && u890.j(this.c, iznVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((bzn) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b);
        parcel.writeSerializable((Serializable) this.c);
    }
}
