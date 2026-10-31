package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gfs0 implements ifs0 {
    public static final Parcelable.Creator<gfs0> CREATOR = new ybs0((byte) 18);
    public final ArrayList a;

    public gfs0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfs0) && this.a.equals(((gfs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.ifs0
    public final List l0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((dfs0) itO.next()).writeToParcel(parcel, i);
        }
    }
}
