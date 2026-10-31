package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lik1 implements Parcelable {
    public static final Parcelable.Creator<lik1> CREATOR = new agm0(17);
    public static final idd1 b = new idd1(w0n0.b1);
    public final String a;

    public lik1(String str) {
        this.a = str;
    }

    public final qir0 a() {
        return new qir0(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lik1) && u890.j(this.a, ((lik1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
