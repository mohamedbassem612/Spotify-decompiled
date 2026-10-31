package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class urf0 implements vrf0 {
    public static final Parcelable.Creator<urf0> CREATOR = new ipf0((byte) 21);
    public final Map a;

    public urf0(Map map) {
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof urf0) && this.a.equals(((urf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itJ = xcg1.j(parcel, this.a);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeInt(((jae) entry.getKey()).a);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
