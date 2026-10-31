package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jwn1 extends u9 {
    public static final Parcelable.Creator<jwn1> CREATOR = new jrn1((byte) 18);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;
    public final Long h;

    public jwn1(int i, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, String str, Long l) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = arrayList;
        this.g = str;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwn1)) {
            return false;
        }
        jwn1 jwn1Var = (jwn1) obj;
        if (this.a == jwn1Var.a && this.b == jwn1Var.b && this.c == jwn1Var.c && this.d == jwn1Var.d && this.e == jwn1Var.e) {
            List list = jwn1Var.f;
            List list2 = this.f;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || list2.size() != list.size())) {
                if (k8p1.h(this.g, jwn1Var.g) && k8p1.h(this.h, jwn1Var.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f);
        int i = this.a;
        int length = String.valueOf(i).length();
        boolean z = this.b;
        int length2 = String.valueOf(z).length();
        boolean z2 = this.c;
        int length3 = String.valueOf(z2).length();
        boolean z3 = this.d;
        int length4 = String.valueOf(z3).length();
        boolean z4 = this.e;
        int length5 = String.valueOf(z4).length();
        int length6 = strValueOf.length();
        String str = this.g;
        int length7 = String.valueOf(str).length();
        Long l = this.h;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 21 + length3 + 23 + length4 + 22 + length5 + 25 + length6 + 10 + length7 + 27 + String.valueOf(l).length() + 1);
        sb.append("ConsentResponse {statusCode =");
        sb.append(i);
        sb.append(", hasTosConsent =");
        sb.append(z);
        sb.append(", hasLoggingConsent =");
        sb.append(z2);
        sb.append(", hasCloudSyncConsent =");
        sb.append(z3);
        sb.append(", hasLocationConsent =");
        sb.append(z4);
        sb.append(", accountConsentRecords =");
        sb.append(strValueOf);
        sb.append(", nodeId =");
        sb.append(str);
        sb.append(", lastUpdateRequestedTime =");
        sb.append(l);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j541.J(parcel, 6, this.f);
        j541.F(parcel, 7, this.g);
        Long l = this.h;
        if (l != null) {
            j541.K(parcel, 8, 8);
            parcel.writeLong(l.longValue());
        }
        j541.M(iL, parcel);
    }
}
