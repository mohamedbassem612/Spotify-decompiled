package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sj50 implements oim {
    public static final Parcelable.Creator<sj50> CREATOR = new n750((byte) 25);
    public final String a;
    public final String b;
    public final zks0 c;
    public final String d;

    public sj50(String str, String str2, zks0 zks0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = zks0Var;
        this.d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj50)) {
            return false;
        }
        sj50 sj50Var = (sj50) obj;
        return u890.j(this.a, sj50Var.a) && u890.j(this.b, sj50Var.b) && u890.j(this.c, sj50Var.c) && u890.j(this.d, sj50Var.d);
    }

    public final bjm getTarget() {
        return null;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
