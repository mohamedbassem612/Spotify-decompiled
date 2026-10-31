package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w6h extends c871 {
    public static final Parcelable.Creator<w6h> CREATOR = new v6h((byte) 0);
    public final Set a;

    public w6h(Set set) {
        this.a = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6h) && this.a.equals(((w6h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeString(((a7h) itH.next()).name());
        }
    }
}
