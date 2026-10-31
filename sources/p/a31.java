package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a31 extends r31 {
    public static final Parcelable.Creator<a31> CREATOR = new t21((byte) 6);
    public final bk8 a;

    public a31(bk8 bk8Var) {
        this.a = bk8Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a31) && this.a == ((a31) obj).a;
    }

    public final int hashCode() {
        bk8 bk8Var = this.a;
        if (bk8Var == null) {
            return 0;
        }
        return bk8Var.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bk8 bk8Var = this.a;
        if (bk8Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bk8Var.name());
        }
    }
}
