package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ew11 implements gw11 {
    public static final Parcelable.Creator<ew11> CREATOR = new e211((byte) 14);
    public final m620 a;
    public final String b;

    public ew11(m620 m620Var, String str) {
        this.a = m620Var;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew11)) {
            return false;
        }
        ew11 ew11Var = (ew11) obj;
        return u890.j(this.a, ew11Var.a) && u890.j(this.b, ew11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
    }
}
