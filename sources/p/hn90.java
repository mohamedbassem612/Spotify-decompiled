package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hn90 implements Parcelable {
    public static final Parcelable.Creator<hn90> CREATOR = new qg90((byte) 13);
    public final xhc0 a;
    public final String b;

    public hn90(xhc0 xhc0Var, String str) {
        this.a = xhc0Var;
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
        if (!(obj instanceof hn90)) {
            return false;
        }
        hn90 hn90Var = (hn90) obj;
        return u890.j(this.a, hn90Var.a) && u890.j(this.b, hn90Var.b);
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
