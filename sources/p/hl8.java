package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hl8 implements jl8 {
    public static final Parcelable.Creator<hl8> CREATOR = new bu7((byte) 22);
    public final yg8 a;

    public hl8(yg8 yg8Var) {
        this.a = yg8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hl8) && this.a == ((hl8) obj).a;
    }

    public final int hashCode() {
        yg8 yg8Var = this.a;
        if (yg8Var == null) {
            return 0;
        }
        return yg8Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yg8 yg8Var = this.a;
        if (yg8Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(yg8Var.name());
        }
    }
}
