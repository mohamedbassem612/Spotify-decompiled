package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class irc0 implements orc0 {
    public static final Parcelable.Creator<irc0> CREATOR = new rqc0((byte) 16);
    public final Set a;

    public irc0(Set set) {
        this.a = set;
    }

    public final Set a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irc0) && this.a.equals(((irc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeInt(((Number) itH.next()).intValue());
        }
    }
}
