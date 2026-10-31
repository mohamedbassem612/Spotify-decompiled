package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wde0 implements oim {
    public static final Parcelable.Creator<wde0> CREATOR = new lbe0((byte) 3);
    public final lik1 a;
    public final String b;
    public final bjm c;

    public wde0(String str, lik1 lik1Var) {
        this.a = lik1Var;
        this.b = str;
        this.c = new bjm(6, str, (String) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wde0)) {
            return false;
        }
        wde0 wde0Var = (wde0) obj;
        return u890.j(this.a, wde0Var.a) && u890.j(this.b, wde0Var.b);
    }

    public final bjm getTarget() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
