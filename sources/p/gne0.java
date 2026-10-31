package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gne0 implements Parcelable {
    public static final Parcelable.Creator<gne0> CREATOR = new lbe0((byte) 16);
    public final jj40 a;

    public gne0(jj40 jj40Var) {
        this.a = jj40Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gne0) && u890.j(this.a, ((gne0) obj).a);
    }

    public final int hashCode() {
        jj40 jj40Var = this.a;
        if (jj40Var == null) {
            return 0;
        }
        return jj40Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
