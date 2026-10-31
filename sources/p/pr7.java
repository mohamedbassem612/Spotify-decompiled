package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pr7 implements Parcelable {
    public static final Parcelable.Creator<pr7> CREATOR = new f67(26);
    public final String a;
    public final String b;
    public final jlw0 c;
    public final int d;
    public final int e;
    public final String f;
    public final u771 g;
    public final nr7 h;
    public final wkt i;

    public /* synthetic */ pr7(String str, String str2, jlw0 jlw0Var, int i, int i2, String str3, u771 u771Var, nr7 nr7Var, int i3) {
        this(str, str2, jlw0Var, i, i2, str3, u771Var, (i3 & 128) != 0 ? mr7.a : nr7Var, (wkt) null);
    }

    public static pr7 a(pr7 pr7Var, String str, u771 u771Var, nr7 nr7Var, wkt wktVar, int i) {
        String str2 = pr7Var.a;
        if ((i & 2) != 0) {
            str = pr7Var.b;
        }
        String str3 = str;
        jlw0 jlw0Var = pr7Var.c;
        int i2 = pr7Var.d;
        int i3 = pr7Var.e;
        String str4 = pr7Var.f;
        if ((i & 64) != 0) {
            u771Var = pr7Var.g;
        }
        u771 u771Var2 = u771Var;
        if ((i & 128) != 0) {
            nr7Var = pr7Var.h;
        }
        nr7 nr7Var2 = nr7Var;
        if ((i & 256) != 0) {
            wktVar = pr7Var.i;
        }
        return new pr7(str2, str3, jlw0Var, i2, i3, str4, u771Var2, nr7Var2, wktVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr7)) {
            return false;
        }
        pr7 pr7Var = (pr7) obj;
        return u890.j(this.a, pr7Var.a) && u890.j(this.b, pr7Var.b) && u890.j(this.c, pr7Var.c) && this.d == pr7Var.d && this.e == pr7Var.e && u890.j(this.f, pr7Var.f) && u890.j(this.g, pr7Var.g) && u890.j(this.h, pr7Var.h) && u890.j(this.i, pr7Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + cfm0.g(this.g, cy30.d(kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31), 31, this.f), 31)) * 31;
        wkt wktVar = this.i;
        return iHashCode + (wktVar == null ? 0 : wktVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }

    public pr7(String str, String str2, jlw0 jlw0Var, int i, int i2, String str3, u771 u771Var, nr7 nr7Var, wkt wktVar) {
        this.a = str;
        this.b = str2;
        this.c = jlw0Var;
        this.d = i;
        this.e = i2;
        this.f = str3;
        this.g = u771Var;
        this.h = nr7Var;
        this.i = wktVar;
    }
}
