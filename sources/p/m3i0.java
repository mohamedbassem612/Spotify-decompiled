package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m3i0 implements pn71 {
    public static final Parcelable.Creator<m3i0> CREATOR = new cyh0((byte) 3);
    public final u3i0 a;
    public final int b;

    public m3i0(u3i0 u3i0Var, int i) {
        this.a = u3i0Var;
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
        if (!(obj instanceof m3i0)) {
            return false;
        }
        m3i0 m3i0Var = (m3i0) obj;
        return u890.j(this.a, m3i0Var.a) && this.b == m3i0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
    }
}
