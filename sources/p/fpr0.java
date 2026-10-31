package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fpr0 implements Parcelable {
    public static final Parcelable.Creator<fpr0> CREATOR = new elr0((byte) 8);
    public final float a;
    public final int b;

    public fpr0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpr0)) {
            return false;
        }
        fpr0 fpr0Var = (fpr0) obj;
        return Float.compare(this.a, fpr0Var.a) == 0 && this.b == fpr0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeFloat(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "PX";
        } else if (i2 == 2) {
            str = "DP";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "SP";
        }
        parcel.writeString(str);
    }
}
