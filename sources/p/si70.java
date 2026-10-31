package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class si70 extends hj70 {
    public static final Parcelable.Creator<si70> CREATOR = new ai70((byte) 15);
    public final boolean c;
    public final String d;

    public si70(boolean z, String str) {
        super(10, 1);
        this.c = z;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si70)) {
            return false;
        }
        si70 si70Var = (si70) obj;
        return this.c == si70Var.c && u890.j(this.d, si70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Boolean.hashCode(this.c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }
}
