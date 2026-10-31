package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y69 implements h79 {
    public static final Parcelable.Creator<y69> CREATOR = new so8((byte) 17);
    public final ArrayList a;

    public y69(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y69) && this.a.equals(((y69) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((x69) itO.next()).writeToParcel(parcel, i);
        }
    }
}
