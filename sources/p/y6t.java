package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y6t implements oim {
    public static final Parcelable.Creator<y6t> CREATOR = new qms((byte) 3);
    public final tom a;

    public y6t(tom tomVar) {
        this.a = tomVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6t) && u890.j(this.a, ((y6t) obj).a);
    }

    public final bjm getTarget() {
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
