package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j39 implements Parcelable {
    public static final Parcelable.Creator<j39> CREATOR = new so8((byte) 4);
    public final List a;
    public final o5a b;

    public j39(List list, o5a o5aVar) {
        this.a = list;
        this.b = o5aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j39)) {
            return false;
        }
        j39 j39Var = (j39) obj;
        return this.a.equals(j39Var.a) && u890.j(this.b, j39Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        o5a o5aVar = this.b;
        return iHashCode + (o5aVar == null ? 0 : o5aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((ma51) itM.next()).writeToParcel(parcel, i);
        }
        o5a o5aVar = this.b;
        if (o5aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            o5aVar.writeToParcel(parcel, i);
        }
    }
}
