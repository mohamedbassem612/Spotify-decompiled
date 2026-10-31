package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xsd implements zsd {
    public static final Parcelable.Creator<xsd> CREATOR = new yyb((byte) 27);
    public final zve1 a;

    public xsd(zve1 zve1Var) {
        this.a = zve1Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsd) && u890.j(this.a, ((xsd) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
