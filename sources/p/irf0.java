package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class irf0 implements grf0 {
    public static final Parcelable.Creator<irf0> CREATOR = new ipf0((byte) 13);
    public final Map a;

    public irf0(Map map) {
        this.a = map;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irf0) && this.a.equals(((irf0) obj).a);
    }

    public final Map f0() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itJ = xcg1.j(parcel, this.a);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeInt(((vhc0) entry.getKey()).a);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
