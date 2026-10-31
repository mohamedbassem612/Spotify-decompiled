package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s220 implements w220 {
    public static final Parcelable.Creator<s220> CREATOR = new no10((byte) 28);
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final c380 f;
    public final String g;
    public final String h;
    public final String i;

    public s220(String str, String str2, int i, String str3, String str4, c380 c380Var, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = c380Var;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public static s220 a(s220 s220Var, String str, String str2, int i) {
        String str3 = s220Var.a;
        String str4 = s220Var.b;
        int i2 = s220Var.c;
        String str5 = s220Var.d;
        String str6 = s220Var.e;
        c380 c380Var = s220Var.f;
        String str7 = s220Var.g;
        if ((i & 256) != 0) {
            str2 = s220Var.i;
        }
        return new s220(str3, str4, i2, str5, str6, c380Var, str7, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s220)) {
            return false;
        }
        s220 s220Var = (s220) obj;
        return u890.j(this.a, s220Var.a) && u890.j(this.b, s220Var.b) && this.c == s220Var.c && u890.j(this.d, s220Var.d) && u890.j(this.e, s220Var.e) && u890.j(this.f, s220Var.f) && u890.j(this.g, s220Var.g) && u890.j(this.h, s220Var.h) && u890.j(this.i, s220Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        int iF = kk0.f(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.g;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return this.i.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        int i2 = this.c;
        if (i2 == 1) {
            str = "TEXT";
        } else if (i2 == 2) {
            str = "NUMBER";
        } else if (i2 == 3) {
            str = "PHONE";
        } else if (i2 == 4) {
            str = "EMAIL";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "HIDDEN";
        }
        parcel.writeString(str);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Iterator itL = x0d.l(this.f, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
