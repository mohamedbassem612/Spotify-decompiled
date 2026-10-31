package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jsf0 implements ksf0 {
    public static final Parcelable.Creator<jsf0> CREATOR = new isf0((byte) 0);
    public final Set a;
    public final boolean b;

    public jsf0(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsf0)) {
            return false;
        }
        jsf0 jsf0Var = (jsf0) obj;
        return u890.j(this.a, jsf0Var.a) && this.b == jsf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeInt(((vhc0) itH.next()).a);
        }
        parcel.writeInt(this.b ? 1 : 0);
    }
}
