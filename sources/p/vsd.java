package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vsd implements zsd {
    public static final Parcelable.Creator<vsd> CREATOR = new yyb((byte) 25);
    public final mz9 a;

    public vsd(mz9 mz9Var) {
        this.a = mz9Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsd) && u890.j(this.a, ((vsd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
