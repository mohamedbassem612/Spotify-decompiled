package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ry41 extends sy41 {
    public static final Parcelable.Creator<ry41> CREATOR = new uo41((byte) 9);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final String h;
    public final boolean i;
    public final boolean t;

    public ry41(String str, String str2, String str3, String str4, boolean z, boolean z2, List list, String str5, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = list;
        this.h = str5;
        this.i = z3;
        this.t = z4;
    }

    public static ry41 a(ry41 ry41Var, boolean z, boolean z2, int i) {
        String str = ry41Var.a;
        String str2 = ry41Var.b;
        String str3 = ry41Var.c;
        String str4 = ry41Var.d;
        if ((i & 16) != 0) {
            z = ry41Var.e;
        }
        boolean z3 = z;
        boolean z4 = ry41Var.f;
        List list = ry41Var.g;
        String str5 = ry41Var.h;
        if ((i & 256) != 0) {
            z2 = ry41Var.i;
        }
        return new ry41(str, str2, str3, str4, z3, z4, list, str5, z2, ry41Var.t);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry41)) {
            return false;
        }
        ry41 ry41Var = (ry41) obj;
        return u890.j(this.a, ry41Var.a) && u890.j(this.b, ry41Var.b) && u890.j(this.c, ry41Var.c) && u890.j(this.d, ry41Var.d) && this.e == ry41Var.e && this.f == ry41Var.f && this.g.equals(ry41Var.g) && u890.j(this.h, ry41Var.h) && this.i == ry41Var.i && this.t == ry41Var.t;
    }

    public final String getUri() {
        return this.b;
    }

    public final String getUuid() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iB = f4i1.b(xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str2 = this.h;
        return Boolean.hashCode(this.t) + xcg1.g((iB + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.g);
        while (itM.hasNext()) {
            ((jq6) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
    }
}
