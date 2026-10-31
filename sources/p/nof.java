package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nof implements pof {
    public static final Parcelable.Creator<nof> CREATOR;
    public final String a;
    public final t7q0 b;
    public final List c;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
        CREATOR = new zbf((byte) 22);
    }

    public nof(String str, t7q0 t7q0Var, List list) {
        this.a = str;
        this.b = t7q0Var;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nof)) {
            return false;
        }
        nof nofVar = (nof) obj;
        return u890.j(this.a, nofVar.a) && u890.j(this.b, nofVar.b) && u890.j(this.c, nofVar.c);
    }

    @Override // p.pof
    public final String getViewUri() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        List list = this.c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        List list = this.c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
