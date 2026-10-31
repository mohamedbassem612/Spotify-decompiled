package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class woc1 implements Parcelable {
    public static final Parcelable.Creator<woc1> CREATOR = new y7c1(24);
    public final lik1 a;
    public final String b;
    public final n6r0 c;
    public final boolean d;
    public final Map e;

    public woc1(lik1 lik1Var, String str, n6r0 n6r0Var, boolean z, Map map) {
        this.a = lik1Var;
        this.b = str;
        this.c = n6r0Var;
        this.d = z;
        this.e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woc1)) {
            return false;
        }
        woc1 woc1Var = (woc1) obj;
        return u890.j(this.a, woc1Var.a) && u890.j(this.b, woc1Var.b) && u890.j(this.c, woc1Var.c) && this.d == woc1Var.d && u890.j(this.e, woc1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g((this.c.hashCode() + cy30.d(this.a.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator itJ = xcg1.j(parcel, this.e);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
