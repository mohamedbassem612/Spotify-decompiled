package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g3f0 extends l3f0 {
    public static final Parcelable.Creator<g3f0> CREATOR = new rwe0((byte) 25);
    public final String a;
    public final of8 b;

    public g3f0(String str, of8 of8Var) {
        this.a = str;
        this.b = of8Var;
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
        if (!(obj instanceof g3f0)) {
            return false;
        }
        g3f0 g3f0Var = (g3f0) obj;
        return u890.j(this.a, g3f0Var.a) && u890.j(this.b, g3f0Var.b);
    }

    public final of8 g() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
