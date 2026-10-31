package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class evf1 implements Parcelable {
    public static final Parcelable.Creator<evf1> CREATOR = new r8f1((byte) 21);
    public final int a;
    public final int b;

    public evf1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evf1)) {
            return false;
        }
        evf1 evf1Var = (evf1) obj;
        return this.a == evf1Var.a && this.b == evf1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "Player";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Scrub";
        }
        parcel.writeString(str);
    }
}
