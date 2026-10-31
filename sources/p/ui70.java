package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ui70 extends hj70 {
    public static final Parcelable.Creator<ui70> CREATOR = new ai70((byte) 17);
    public final tv80 c;
    public final int d;
    public final String e;

    public ui70(int i, String str, tv80 tv80Var) {
        super(33, 1);
        this.c = tv80Var;
        this.d = i;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui70)) {
            return false;
        }
        ui70 ui70Var = (ui70) obj;
        return u890.j(this.c, ui70Var.c) && this.d == ui70Var.d && u890.j(this.e, ui70Var.e);
    }

    public final int hashCode() {
        tv80 tv80Var = this.c;
        return this.e.hashCode() + ab80.k(this.d, (tv80Var == null ? 0 : tv80Var.hashCode()) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeParcelable(this.c, i);
        int i2 = this.d;
        if (i2 == 1) {
            str = "HOST";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "PARTICIPANT";
        }
        parcel.writeString(str);
        parcel.writeString(this.e);
    }
}
