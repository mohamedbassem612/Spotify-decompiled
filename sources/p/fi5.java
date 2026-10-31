package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fi5 extends u9 {
    public static final Parcelable.Creator<fi5> CREATOR = new ynm1((byte) 27);
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public fi5(String str, String str2, ArrayList arrayList, boolean z) {
        zod.s(arrayList);
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static fi5 j(List list, boolean z) {
        TreeSet treeSet = new TreeSet(epj1.c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((upq0) it.next()).a());
        }
        return new fi5(null, null, new ArrayList(treeSet), z);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fi5)) {
            return false;
        }
        fi5 fi5Var = (fi5) obj;
        return this.b == fi5Var.b && k8p1.h(this.a, fi5Var.a) && k8p1.h(this.c, fi5Var.c) && k8p1.h(this.d, fi5Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.J(parcel, 1, this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.F(parcel, 3, this.c);
        j541.F(parcel, 4, this.d);
        j541.M(iL, parcel);
    }
}
