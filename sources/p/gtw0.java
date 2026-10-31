package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gtw0 implements Parcelable {
    public static final Parcelable.Creator<gtw0> CREATOR = new w7w0((byte) 29);
    public final String a;
    public final ioc1 b;

    public gtw0(String str, ioc1 ioc1Var) {
        this.a = str;
        this.b = ioc1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtw0)) {
            return false;
        }
        gtw0 gtw0Var = (gtw0) obj;
        return u890.j(this.a, gtw0Var.a) && this.b == gtw0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
