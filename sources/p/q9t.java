package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q9t implements Parcelable {
    public static final Parcelable.Creator<q9t> CREATOR = new qms((byte) 7);
    public final kjo0 a;
    public final int b;
    public final int c;

    public q9t(kjo0 kjo0Var, int i, int i2) {
        this.a = kjo0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9t)) {
            return false;
        }
        q9t q9tVar = (q9t) obj;
        return u890.j(this.a, q9tVar.a) && this.b == q9tVar.b && this.c == q9tVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
