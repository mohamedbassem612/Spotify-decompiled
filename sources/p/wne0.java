package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wne0 implements kvb1 {
    public static final Parcelable.Creator<wne0> CREATOR = new lbe0((byte) 18);
    public final String a;

    public wne0(String str) {
        this.a = str;
    }

    @Override // p.kvb1
    public final boolean K0(mvb1 mvb1Var) {
        return mvb1Var instanceof xne0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wne0) && u890.j(this.a, ((wne0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
