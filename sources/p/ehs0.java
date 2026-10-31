package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ehs0 implements Parcelable {
    public static final Parcelable.Creator<ehs0> CREATOR = new ybs0((byte) 22);
    public final long a;
    public final String b;

    public ehs0(long j, String str) {
        this.a = j;
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
        if (!(obj instanceof ehs0)) {
            return false;
        }
        ehs0 ehs0Var = (ehs0) obj;
        return this.a == ehs0Var.a && u890.j(this.b, ehs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
    }
}
