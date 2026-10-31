package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j5c0 extends d6c0 {
    public static final Parcelable.Creator<j5c0> CREATOR = new cwb0((byte) 18);
    public final List b;

    public j5c0(List list) {
        super(true);
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5c0) && u890.j(this.b, ((j5c0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
