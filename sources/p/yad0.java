package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yad0 implements Parcelable {
    public static final Parcelable.Creator<yad0> CREATOR = new lad0(4);
    public final Map a;
    public final Map b;
    public final rad0 c;

    public yad0(Map map, Map map2, rad0 rad0Var) {
        this.a = map;
        this.b = map2;
        this.c = rad0Var;
    }

    public static yad0 a(yad0 yad0Var, LinkedHashMap linkedHashMap, Map map, rad0 rad0Var, int i) {
        Map map2 = linkedHashMap;
        if ((i & 1) != 0) {
            map2 = yad0Var.a;
        }
        if ((i & 2) != 0) {
            map = yad0Var.b;
        }
        if ((i & 4) != 0) {
            rad0Var = yad0Var.c;
        }
        return new yad0(map2, map, rad0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yad0)) {
            return false;
        }
        yad0 yad0Var = (yad0) obj;
        return u890.j(this.a, yad0Var.a) && u890.j(this.b, yad0Var.b) && u890.j(this.c, yad0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.e(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itJ = xcg1.j(parcel, this.a);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Iterator itJ2 = xcg1.j(parcel, this.b);
        while (itJ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itJ2.next();
            parcel.writeString((String) entry2.getKey());
            ((zad0) entry2.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.c, i);
    }
}
