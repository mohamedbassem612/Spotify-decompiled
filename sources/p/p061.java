package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p061 implements Parcelable {
    public static final Parcelable.Creator<p061> CREATOR = new ge51((byte) 21);
    public final Set a;
    public final boolean b;

    public p061(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p061)) {
            return false;
        }
        p061 p061Var = (p061) obj;
        return u890.j(this.a, p061Var.a) && this.b == p061Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeParcelable((Parcelable) itH.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
    }
}
