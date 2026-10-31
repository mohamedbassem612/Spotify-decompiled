package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kl50 implements nl50 {
    public static final Parcelable.Creator<kl50> CREATOR = new xk50((byte) 4);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    public kl50(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
    }

    public static kl50 a(kl50 kl50Var, String str, ArrayList arrayList, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = kl50Var.a;
        }
        String str4 = str;
        String str5 = kl50Var.b;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = kl50Var.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = kl50Var.d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = kl50Var.e;
        }
        return new kl50(str4, str5, str6, str3, list2);
    }

    @Override // p.nl50
    public final String U() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl50)) {
            return false;
        }
        kl50 kl50Var = (kl50) obj;
        return u890.j(this.a, kl50Var.a) && u890.j(this.b, kl50Var.b) && this.c.equals(kl50Var.c) && u890.j(this.d, kl50Var.d) && u890.j(this.e, kl50Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p.nl50
    public final String i1() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((jl50) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
