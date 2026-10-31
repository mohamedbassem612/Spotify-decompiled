package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f7q0 extends t7q0 {
    public static final Parcelable.Creator<f7q0> CREATOR = new qxp0((byte) 21);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final s7q0 e;
    public final sge0 f;
    public final qz61 g;

    public /* synthetic */ f7q0(String str, String str2, String str3, String str4, s7q0 s7q0Var, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : s7q0Var, null, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7q0)) {
            return false;
        }
        f7q0 f7q0Var = (f7q0) obj;
        return u890.j(this.a, f7q0Var.a) && u890.j(this.b, f7q0Var.b) && u890.j(this.c, f7q0Var.c) && u890.j(this.d, f7q0Var.d) && u890.j(this.e, f7q0Var.e) && u890.j(this.f, f7q0Var.f) && u890.j(this.g, f7q0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        s7q0 s7q0Var = this.e;
        int iHashCode5 = (iHashCode4 + (s7q0Var == null ? 0 : s7q0Var.hashCode())) * 31;
        sge0 sge0Var = this.f;
        int iHashCode6 = (iHashCode5 + (sge0Var == null ? 0 : sge0Var.hashCode())) * 31;
        qz61 qz61Var = this.g;
        return iHashCode6 + (qz61Var != null ? qz61Var.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        sge0 sge0Var = this.f;
        if (sge0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sge0Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.g, i);
    }

    public f7q0(String str, String str2, String str3, String str4, s7q0 s7q0Var, sge0 sge0Var, qz61 qz61Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = s7q0Var;
        this.f = sge0Var;
        this.g = qz61Var;
    }
}
