package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zx1 implements gy1 {
    public static final Parcelable.Creator<zx1> CREATOR = new ev1((byte) 1);
    public final String a;
    public final Set b;

    public zx1(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx1)) {
            return false;
        }
        zx1 zx1Var = (zx1) obj;
        return u890.j(this.a, zx1Var.a) && this.b.equals(zx1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itH = k4s0.h(this.b, parcel);
        while (itH.hasNext()) {
            ((hmg) itH.next()).writeToParcel(parcel, i);
        }
    }
}
