package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w160 implements Parcelable {
    public static final Parcelable.Creator<w160> CREATOR = new xk50((byte) 10);
    public final f470 a;

    public w160(f470 f470Var) {
        this.a = f470Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w160) && u890.j(this.a, ((w160) obj).a);
    }

    public final int hashCode() {
        f470 f470Var = this.a;
        if (f470Var == null) {
            return 0;
        }
        return l1d.C(f470Var.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        f470 f470Var = this.a;
        if (f470Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            f470Var.writeToParcel(parcel, i);
        }
    }
}
