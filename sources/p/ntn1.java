package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ntn1 extends u9 {
    public static final Parcelable.Creator<ntn1> CREATOR = new jrn1(13);
    public final String a;
    public final String b;
    public final String c;

    public ntn1(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
        str3.getClass();
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ntn1)) {
            return false;
        }
        ntn1 ntn1Var = (ntn1) obj;
        return this.a.equals(ntn1Var.a) && k8p1.h(ntn1Var.b, this.b) && k8p1.h(ntn1Var.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String strTrim = str.trim();
        int length = strTrim.length();
        if (length > 25) {
            String strSubstring = strTrim.substring(0, 10);
            String strSubstring2 = strTrim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(strSubstring.length() + 3 + strSubstring2.length() + 2 + String.valueOf(i).length());
            bb00.j(sb, strSubstring, "...", strSubstring2, "::");
            sb.append(i);
            strTrim = sb.toString();
        }
        int length2 = strTrim.length();
        String str2 = this.b;
        int length3 = String.valueOf(str2).length() + length2 + 23;
        String str3 = this.c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + length3 + 7 + 1);
        sb2.append("Channel{token=");
        sb2.append(strTrim);
        sb2.append(", nodeId=");
        sb2.append(str2);
        return l1d.q(sb2, ", path=", str3, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.F(parcel, 4, this.c);
        j541.M(iL, parcel);
    }
}
