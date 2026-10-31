package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mrf0 implements grf0 {
    public static final Parcelable.Creator<mrf0> CREATOR = new ipf0((byte) 14);
    public final vhc0 a;
    public final Map b;
    public final boolean c;

    public mrf0(vhc0 vhc0Var, Map map, boolean z) {
        this.a = vhc0Var;
        this.b = map;
        this.c = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrf0)) {
            return false;
        }
        mrf0 mrf0Var = (mrf0) obj;
        return u890.j(this.a, mrf0Var.a) && u890.j(this.b, mrf0Var.b) && this.c == mrf0Var.c;
    }

    public final Map f0() {
        return this.b;
    }

    public final int hashCode() {
        vhc0 vhc0Var = this.a;
        return Boolean.hashCode(this.c) + cy30.e((vhc0Var == null ? 0 : Integer.hashCode(vhc0Var.a)) * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        vhc0 vhc0Var = this.a;
        if (vhc0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(vhc0Var.a);
        }
        Iterator itJ = xcg1.j(parcel, this.b);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeInt(((vhc0) entry.getKey()).a);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeInt(this.c ? 1 : 0);
    }
}
