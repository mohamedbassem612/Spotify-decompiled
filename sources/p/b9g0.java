package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b9g0 implements Parcelable {
    public static final Parcelable.Creator<b9g0> CREATOR = new isf0((byte) 19);
    public final String a;
    public final String b;
    public final List c;
    public final Map d;
    public final Set e;
    public final boolean f;

    public b9g0(String str, String str2, List list, Map map, Set set, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = map;
        this.e = set;
        this.f = z;
    }

    public static b9g0 a(b9g0 b9g0Var, Map map, LinkedHashSet linkedHashSet, boolean z, int i) {
        String str = b9g0Var.a;
        String str2 = b9g0Var.b;
        List list = b9g0Var.c;
        if ((i & 8) != 0) {
            map = b9g0Var.d;
        }
        Map map2 = map;
        Set set = linkedHashSet;
        if ((i & 16) != 0) {
            set = b9g0Var.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            z = b9g0Var.f;
        }
        b9g0Var.getClass();
        return new b9g0(str, str2, list, map2, set2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9g0)) {
            return false;
        }
        b9g0 b9g0Var = (b9g0) obj;
        return u890.j(this.a, b9g0Var.a) && u890.j(this.b, b9g0Var.b) && this.c.equals(b9g0Var.c) && this.d.equals(b9g0Var.d) && this.e.equals(b9g0Var.e) && this.f == b9g0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + gvg.c(cy30.e(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        Iterator itJ = xcg1.j(parcel, this.d);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            ((a9g0) entry.getValue()).writeToParcel(parcel, i);
        }
        Iterator itH = k4s0.h(this.e, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        parcel.writeInt(this.f ? 1 : 0);
    }
}
