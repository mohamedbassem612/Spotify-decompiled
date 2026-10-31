package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k2j1 implements m2j1 {
    public static final Parcelable.Creator<k2j1> CREATOR = new xbi1((byte) 20);
    public final sbs0 a;
    public final String b;

    public k2j1(sbs0 sbs0Var, String str) {
        this.a = sbs0Var;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2j1)) {
            return false;
        }
        k2j1 k2j1Var = (k2j1) obj;
        return u890.j(this.a, k2j1Var.a) && u890.j(this.b, k2j1Var.b);
    }

    public final int hashCode() {
        sbs0 sbs0Var = this.a;
        return this.b.hashCode() + ((sbs0Var == null ? 0 : sbs0Var.hashCode()) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        sbs0 sbs0Var = this.a;
        if (sbs0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sbs0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
    }
}
