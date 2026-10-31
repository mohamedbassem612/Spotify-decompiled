package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class buu0 extends cuu0 {
    public static final Parcelable.Creator<buu0> CREATOR = new brt0((byte) 28);
    public final String a;
    public final wls0 b;
    public final String c;

    public buu0(String str, wls0 wls0Var, String str2) {
        this.a = str;
        this.b = wls0Var;
        this.c = str2;
    }

    public final wls0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buu0)) {
            return false;
        }
        buu0 buu0Var = (buu0) obj;
        return u890.j(this.a, buu0Var.a) && this.b == buu0Var.b && u890.j(this.c, buu0Var.c);
    }

    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
    }
}
