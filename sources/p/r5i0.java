package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r5i0 implements t5i0 {
    public static final Parcelable.Creator<r5i0> CREATOR = new cyh0((byte) 14);
    public final Map a;

    public r5i0(Map map) {
        this.a = map;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5i0) && u890.j(this.a, ((r5i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itJ = xcg1.j(parcel, this.a);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeInt(((Number) entry.getValue()).intValue());
        }
    }
}
