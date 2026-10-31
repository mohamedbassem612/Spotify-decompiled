package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g830 implements oim {
    public static final Parcelable.Creator<g830> CREATOR = new ix20((byte) 10);
    public final String a;
    public final String b;
    public final String c;
    public final bjm d;

    public g830(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = new bjm(6, str, (String) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g830)) {
            return false;
        }
        g830 g830Var = (g830) obj;
        return u890.j(this.a, g830Var.a) && u890.j(this.b, g830Var.b) && u890.j(this.c, g830Var.c);
    }

    public final bjm getTarget() {
        return this.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
