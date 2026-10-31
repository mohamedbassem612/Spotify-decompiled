package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rib0 implements Parcelable {
    public static final Parcelable.Creator<rib0> CREATOR = new jca0((byte) 29);
    public final String a;
    public final String b;
    public final boolean c;
    public final Map d;
    public final boolean e;
    public final Integer f;
    public final lhg1 g;

    public rib0(String str, String str2, boolean z, Map map, boolean z2, Integer num, lhg1 lhg1Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = map;
        this.e = z2;
        this.f = num;
        this.g = lhg1Var;
    }

    public final String a() {
        String str = this.b;
        return str == null ? l1d.m("current-incoming:", this.a) : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rib0)) {
            return false;
        }
        rib0 rib0Var = (rib0) obj;
        return u890.j(this.a, rib0Var.a) && u890.j(this.b, rib0Var.b) && this.c == rib0Var.c && u890.j(this.d, rib0Var.d) && this.e == rib0Var.e && u890.j(this.f, rib0Var.f) && u890.j(this.g, rib0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(cy30.e(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        int iHashCode2 = (iG + (num == null ? 0 : num.hashCode())) * 31;
        lhg1 lhg1Var = this.g;
        return iHashCode2 + (lhg1Var != null ? lhg1Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        Iterator itJ = xcg1.j(parcel, this.d);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.e ? 1 : 0);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeParcelable(this.g, i);
    }
}
