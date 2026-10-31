package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m4 implements Parcelable {
    public static final Parcelable.Creator<m4> CREATOR = new scc((byte) 8);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final wkt i;

    public m4(String str, String str2, List list, String str3, String str4, String str5, int i, int i2, wkt wktVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = i2;
        this.i = wktVar;
    }

    public static m4 a(m4 m4Var, String str, String str2, List list, String str3, String str4, String str5, int i, int i2, wkt wktVar, int i3) {
        if ((i3 & 1) != 0) {
            str = m4Var.a;
        }
        String str6 = str;
        if ((i3 & 2) != 0) {
            str2 = m4Var.b;
        }
        String str7 = str2;
        if ((i3 & 4) != 0) {
            list = m4Var.c;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            str3 = m4Var.d;
        }
        String str8 = str3;
        if ((i3 & 16) != 0) {
            str4 = m4Var.e;
        }
        return new m4(str6, str7, list2, str8, str4, (i3 & 32) != 0 ? m4Var.f : str5, (i3 & 64) != 0 ? m4Var.g : i, (i3 & 128) != 0 ? m4Var.h : i2, (i3 & 256) != 0 ? m4Var.i : wktVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return u890.j(this.a, m4Var.a) && u890.j(this.b, m4Var.b) && u890.j(this.c, m4Var.c) && u890.j(this.d, m4Var.d) && u890.j(this.e, m4Var.e) && u890.j(this.f, m4Var.f) && this.g == m4Var.g && this.h == m4Var.h && u890.j(this.i, m4Var.i);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.h, kaa0.f(this.g, cy30.d(cy30.d(cy30.d(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
        wkt wktVar = this.i;
        return iF + (wktVar == null ? 0 : wktVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeParcelable(this.i, i);
    }
}
