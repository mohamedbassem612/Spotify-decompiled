package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hni1 implements Parcelable {
    public static final Parcelable.Creator<hni1> CREATOR = new xbi1((byte) 11);
    public final int a;
    public final String b;

    public hni1(int i, String str) {
        this.a = i;
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
        if (!(obj instanceof hni1)) {
            return false;
        }
        hni1 hni1Var = (hni1) obj;
        return this.a == hni1Var.a && u890.j(this.b, hni1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a != 1) {
            throw null;
        }
        parcel.writeString("WrappedParty");
        parcel.writeString(this.b);
    }
}
