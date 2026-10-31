package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eaa0 implements Parcelable {
    public static final Parcelable.Creator<eaa0> CREATOR = new qg90((byte) 27);
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ eaa0(List list, String str, int i) {
        this((i & 1) != 0 ? null : "AI Agent [Bond]", (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : "Talk to Spotify badge (Android)", (i & 8) != 0 ? null : "Report a Talk to Spotify issue", null, (i & 32) != 0 ? null : str, null);
    }

    public static eaa0 a(eaa0 eaa0Var, String str, List list, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = eaa0Var.a;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = eaa0Var.c;
        }
        String str5 = str2;
        String str6 = eaa0Var.d;
        String str7 = eaa0Var.e;
        String str8 = eaa0Var.f;
        if ((i & 64) != 0) {
            str3 = eaa0Var.g;
        }
        return new eaa0(str4, list, str5, str6, str7, str8, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaa0)) {
            return false;
        }
        eaa0 eaa0Var = (eaa0) obj;
        return u890.j(this.a, eaa0Var.a) && u890.j(this.b, eaa0Var.b) && u890.j(this.c, eaa0Var.c) && u890.j(this.d, eaa0Var.d) && u890.j(this.e, eaa0Var.e) && u890.j(this.f, eaa0Var.f) && u890.j(this.g, eaa0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public eaa0(String str, List list, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }
}
