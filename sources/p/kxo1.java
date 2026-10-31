package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kxo1 extends u9 {
    public static final Parcelable.Creator<kxo1> CREATOR = new hmo1((byte) 15);
    public final String a;
    public final String b;
    public final nro1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final n5p1 g;

    public kxo1(String str, String str2, nro1 nro1Var, String str3, String str4, Float f, n5p1 n5p1Var) {
        this.a = str;
        this.b = str2;
        this.c = nro1Var;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = n5p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kxo1.class == obj.getClass()) {
            kxo1 kxo1Var = (kxo1) obj;
            if (Objects.equals(this.a, kxo1Var.a) && Objects.equals(this.b, kxo1Var.b) && Objects.equals(this.c, kxo1Var.c) && Objects.equals(this.d, kxo1Var.d) && Objects.equals(this.e, kxo1Var.e) && Objects.equals(this.f, kxo1Var.f) && Objects.equals(this.g, kxo1Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.g);
        String strValueOf2 = String.valueOf(this.c);
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.e;
        int length3 = String.valueOf(str3).length();
        Float f = this.f;
        int length4 = String.valueOf(f).length();
        int length5 = strValueOf.length();
        String str4 = this.a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 19 + length3 + 14 + length4 + 14 + length5 + 15 + String.valueOf(str4).length() + 8 + strValueOf2.length() + 1);
        bb00.j(sb, "AppParcelable{title='", str, "', developerName='", str2);
        sb.append("', formattedPrice='");
        sb.append(str3);
        sb.append("', starRating=");
        sb.append(f);
        bb00.j(sb, ", wearDetails=", strValueOf, ", deepLinkUri='", str4);
        return l1d.q(sb, "', icon=", strValueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.F(parcel, 2, this.b);
        j541.E(parcel, 3, this.c, i);
        j541.F(parcel, 4, this.d);
        j541.F(parcel, 5, this.e);
        j541.x(parcel, 6, this.f);
        j541.E(parcel, 7, this.g, i);
        j541.M(iL, parcel);
    }
}
