package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rdv0 implements vr41 {
    public static final Parcelable.Creator<rdv0> CREATOR = new g0v0((byte) 6);
    public final String a;
    public final String b;
    public final String c;

    public rdv0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdv0)) {
            return false;
        }
        rdv0 rdv0Var = (rdv0) obj;
        return u890.j(this.a, rdv0Var.a) && u890.j(this.b, rdv0Var.b) && u890.j(this.c, rdv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
