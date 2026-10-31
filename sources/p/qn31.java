package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qn31 implements lio {
    public static final qn31 a = new qn31();
    public static final Parcelable.Creator<qn31> CREATOR = new s231((byte) 22);

    @Override // p.vo1
    public final tu1 N(tu1 tu1Var) {
        return tu1Var;
    }

    @Override // p.lio
    public final ru1 S0() {
        return new ru1("atp", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.vo1
    public final tu1 e0(tu1 tu1Var) {
        return tu1Var;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qn31);
    }

    public final int hashCode() {
        return 1302638661;
    }

    public final String toString() {
        return "RootDestination";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
