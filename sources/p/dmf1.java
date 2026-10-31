package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dmf1 implements oim {
    public static final Parcelable.Creator<dmf1> CREATOR = new r8f1((byte) 13);
    public final String a;
    public final lik1 b;
    public final String c;
    public final vsf1 d;
    public final Map e;
    public final bjm f;

    public dmf1(String str, lik1 lik1Var, String str2, vsf1 vsf1Var, Map map) {
        this.a = str;
        this.b = lik1Var;
        this.c = str2;
        this.d = vsf1Var;
        this.e = map;
        this.f = new bjm(str, str2, vsf1Var.b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmf1)) {
            return false;
        }
        dmf1 dmf1Var = (dmf1) obj;
        return u890.j(this.a, dmf1Var.a) && u890.j(this.b, dmf1Var.b) && u890.j(this.c, dmf1Var.c) && u890.j(this.d, dmf1Var.d) && u890.j(this.e, dmf1Var.e);
    }

    public final bjm getTarget() {
        return this.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b.a);
        String str = this.c;
        int iHashCode = (this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Map map = this.e;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        Map map = this.e;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ dmf1(String str, lik1 lik1Var, String str2, vsf1 vsf1Var) {
        this(str, lik1Var, str2, vsf1Var, null);
    }
}
