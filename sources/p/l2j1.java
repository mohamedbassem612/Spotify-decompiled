package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l2j1 implements m2j1 {
    public static final Parcelable.Creator<l2j1> CREATOR = new xbi1((byte) 21);
    public final int a;
    public final String b;

    public l2j1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2j1)) {
            return false;
        }
        l2j1 l2j1Var = (l2j1) obj;
        return this.a == l2j1Var.a && u890.j(this.b, l2j1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "ID_AND_SELFIE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "ID_ONLY";
        }
        parcel.writeString(str);
        parcel.writeString(this.b);
    }
}
