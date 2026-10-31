package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rso1 extends u9 {
    public static final Parcelable.Creator<rso1> CREATOR = new hmo1(8);
    public final byte X;
    public final String Y;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final byte h;
    public final byte i;
    public final byte t;

    public rso1(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = b;
        this.i = b2;
        this.t = b3;
        this.X = b4;
        this.Y = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rso1.class != obj.getClass()) {
            return false;
        }
        rso1 rso1Var = (rso1) obj;
        if (this.a != rso1Var.a || this.h != rso1Var.h || this.i != rso1Var.i || this.t != rso1Var.t || this.X != rso1Var.X || !this.b.equals(rso1Var.b)) {
            return false;
        }
        String str = rso1Var.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (!this.d.equals(rso1Var.d) || !this.e.equals(rso1Var.e) || !this.f.equals(rso1Var.f)) {
            return false;
        }
        String str3 = rso1Var.g;
        String str4 = this.g;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = rso1Var.Y;
        String str6 = this.Y;
        if (str6 != null) {
            return str6.equals(str5);
        }
        return str5 == null;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() + ((this.a + 31) * 31);
        String str = this.c;
        int iD = cy30.d(cy30.d(cy30.d(((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode2 = (((((((((iD + (str2 != null ? str2.hashCode() : 0)) * 31) + this.h) * 31) + this.i) * 31) + this.t) * 31) + this.X) * 31;
        String str3 = this.Y;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        String str2 = this.c;
        int length3 = String.valueOf(str2).length();
        byte b = this.h;
        int length4 = String.valueOf((int) b).length();
        byte b2 = this.i;
        int length5 = String.valueOf((int) b2).length();
        byte b3 = this.t;
        int length6 = String.valueOf((int) b3).length();
        byte b4 = this.X;
        int length7 = String.valueOf((int) b4).length();
        String str3 = this.Y;
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 13 + length3 + 11 + length4 + 13 + length5 + 13 + length6 + 16 + length7 + 15 + String.valueOf(str3).length() + 2);
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(i);
        sb.append(", appId='");
        sb.append(str);
        sb.append("', dateTime='");
        sb.append(str2);
        sb.append("', eventId=");
        sb.append((int) b);
        c13.n(b2, b3, ", eventFlags=", ", categoryId=", sb);
        sb.append(", categoryCount=");
        sb.append((int) b4);
        sb.append(", packageName='");
        sb.append(str3);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        String str = this.b;
        j541.F(parcel, 3, str);
        j541.F(parcel, 4, this.c);
        j541.F(parcel, 5, this.d);
        j541.F(parcel, 6, this.e);
        j541.F(parcel, 7, this.f);
        String str2 = this.g;
        if (str2 != null) {
            str = str2;
        }
        j541.F(parcel, 8, str);
        j541.K(parcel, 9, 4);
        parcel.writeInt(this.h);
        j541.K(parcel, 10, 4);
        parcel.writeInt(this.i);
        j541.K(parcel, 11, 4);
        parcel.writeInt(this.t);
        j541.K(parcel, 12, 4);
        parcel.writeInt(this.X);
        j541.F(parcel, 13, this.Y);
        j541.M(iL, parcel);
    }
}
