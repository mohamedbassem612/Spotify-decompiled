package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lgm0 implements pgm0 {
    public static final Parcelable.Creator<lgm0> CREATOR = new fgm0((byte) 6);
    public final Map a;
    public final String b;

    public /* synthetic */ lgm0(Map map, int i) {
        this((String) null, (i & 1) != 0 ? b7x.a : map);
    }

    public static lgm0 a(lgm0 lgm0Var, Map map) {
        String str = lgm0Var.b;
        lgm0Var.getClass();
        return new lgm0(str, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgm0)) {
            return false;
        }
        lgm0 lgm0Var = (lgm0) obj;
        return u890.j(this.a, lgm0Var.a) && u890.j(this.b, lgm0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itJ = xcg1.j(parcel, this.a);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            ((kgm0) entry.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
    }

    public lgm0(String str, Map map) {
        this.a = map;
        this.b = str;
    }
}
