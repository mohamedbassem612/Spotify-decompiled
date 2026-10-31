package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o5c1 implements p5c1 {
    public static final Parcelable.Creator<o5c1> CREATOR = new yub1((byte) 24);
    public final jxc1 a;
    public final int b;

    public o5c1(jxc1 jxc1Var, int i) {
        this.a = jxc1Var;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5c1)) {
            return false;
        }
        o5c1 o5c1Var = (o5c1) obj;
        return u890.j(this.a, o5c1Var.a) && this.b == o5c1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
    }
}
