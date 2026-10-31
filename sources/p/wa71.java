package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wa71 implements Parcelable {
    public static final Parcelable.Creator<wa71> CREATOR = new v871((byte) 9);
    public final String a;
    public final String b;
    public final cqs0 c;
    public final dqi1 d;
    public final String e;
    public final String f;
    public final Bundle g;

    public wa71(String str, String str2, cqs0 cqs0Var, dqi1 dqi1Var, String str3, String str4, Bundle bundle, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? dqs0.e : cqs0Var, (i & 8) != 0 ? null : dqi1Var, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? Bundle.EMPTY : bundle);
    }

    public static wa71 a(wa71 wa71Var, String str, cqs0 cqs0Var, String str2, int i) {
        if ((i & 1) != 0) {
            str = wa71Var.a;
        }
        String str3 = str;
        String str4 = wa71Var.b;
        if ((i & 4) != 0) {
            cqs0Var = wa71Var.c;
        }
        cqs0 cqs0Var2 = cqs0Var;
        dqi1 dqi1Var = wa71Var.d;
        if ((i & 16) != 0) {
            str2 = wa71Var.e;
        }
        String str5 = wa71Var.f;
        Bundle bundle = wa71Var.g;
        wa71Var.getClass();
        return new wa71(str3, str4, cqs0Var2, dqi1Var, str2, str5, bundle);
    }

    public static vkc0 b(wa71 wa71Var) {
        return new vkc0(wa71Var.a, wa71Var.b, wa71Var.c, wa71Var.d, null, 16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa71)) {
            return false;
        }
        wa71 wa71Var = (wa71) obj;
        return u890.j(this.a, wa71Var.a) && u890.j(this.b, wa71Var.b) && u890.j(this.c, wa71Var.c) && u890.j(this.d, wa71Var.d) && u890.j(this.e, wa71Var.e) && u890.j(this.f, wa71Var.f) && u890.j(this.g, wa71Var.g);
    }

    public final a6j0 g() {
        return new a6j0(this.a, this.e, this.f, this.b, this.d, this.c, null, 64);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        dqi1 dqi1Var = this.d;
        int iHashCode3 = (iHashCode2 + (dqi1Var == null ? 0 : dqi1Var.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return this.g.hashCode() + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        m7 m7Var = this.c;
        parcel.writeInt(m7Var.c());
        for (Map.Entry entry : m7Var.a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeBundle(this.g);
    }

    public wa71(String str, String str2, cqs0 cqs0Var, dqi1 dqi1Var, String str3, String str4, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = cqs0Var;
        this.d = dqi1Var;
        this.e = str3;
        this.f = str4;
        this.g = bundle;
    }
}
