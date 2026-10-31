package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yz5 extends u9 {
    public static final Parcelable.Creator<yz5> CREATOR = new jrn1(22);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final int t;

    public yz5(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = str5;
        this.h = bool;
        this.i = bool2;
        this.t = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yz5)) {
            return false;
        }
        yz5 yz5Var = (yz5) obj;
        return o4e.c(this.a, yz5Var.a) && o4e.c(this.b, yz5Var.b) && o4e.c(this.c, yz5Var.c) && o4e.c(this.d, yz5Var.d) && o4e.c(this.e, yz5Var.e) && o4e.c(this.f, yz5Var.f) && o4e.c(this.g, yz5Var.g) && this.t == yz5Var.t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.t)});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String strValueOf = String.valueOf(this.e);
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = String.valueOf(str2).length() + length + 23;
        int length3 = String.valueOf(size).length();
        String str3 = this.d;
        int length4 = String.valueOf(str3).length() + length2 + 20 + length3 + 23 + 22;
        int length5 = strValueOf.length();
        String str4 = this.f;
        int i = length4 + length5 + 11;
        int length6 = String.valueOf(str4).length();
        String str5 = this.g;
        StringBuilder sb = new StringBuilder(i + length6 + 8 + String.valueOf(str5).length());
        bb00.j(sb, "applicationId: ", str, ", name: ", str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        bb00.j(sb, ", senderAppLaunchUrl: ", strValueOf, ", iconUrl: ", str4);
        return l1d.n(", type: ", str5, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.H(parcel, 5, Collections.unmodifiableList(this.c));
        j541.F(parcel, 6, this.d);
        j541.E(parcel, 7, this.e, i);
        j541.F(parcel, 8, this.f);
        j541.F(parcel, 9, this.g);
        j541.t(parcel, 10, this.h);
        j541.t(parcel, 11, this.i);
        j541.K(parcel, 12, 4);
        parcel.writeInt(this.t);
        j541.M(iL, parcel);
    }
}
