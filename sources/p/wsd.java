package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wsd implements zsd {
    public static final Parcelable.Creator<wsd> CREATOR = new yyb((byte) 26);
    public final amz0 a;

    public wsd(amz0 amz0Var) {
        this.a = amz0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsd) && u890.j(this.a, ((wsd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
