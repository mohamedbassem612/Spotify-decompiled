package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class okn1 extends u9 implements bmd {
    public static final Parcelable.Creator<okn1> CREATOR = new e9n1((byte) 23);
    public final String b;
    public final List c;
    public final Object a = new Object();
    public HashSet d = null;

    public okn1(String str, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
        zod.s(str);
        zod.s(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || okn1.class != obj.getClass()) {
            return false;
        }
        okn1 okn1Var = (okn1) obj;
        String str = okn1Var.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list = okn1Var.c;
        List list2 = this.c;
        return list2 == null ? list == null : list2.equals(list);
    }

    @Override // p.bmd
    public final Set g() {
        HashSet hashSet;
        synchronized (this.a) {
            try {
                hashSet = this.d;
                if (hashSet == null) {
                    hashSet = new HashSet(this.c);
                    this.d = hashSet;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str != null ? str.hashCode() : 0;
        List list = this.c;
        return ((iHashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + strValueOf.length() + 1);
        bb00.j(sb, "CapabilityInfo{", str, ", ", strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.b);
        j541.J(parcel, 3, this.c);
        j541.M(iL, parcel);
    }
}
