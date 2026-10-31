package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kpg implements oim {
    public static final Parcelable.Creator<kpg> CREATOR = new i8g((byte) 23);
    public final lik1 a;
    public final bjm b = new bjm(6, "spotify:playlist:37i9dQZF1CIl0ks0ynmzpD", (String) null);

    public kpg(lik1 lik1Var) {
        this.a = lik1Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpg) && u890.j(this.a, ((kpg) obj).a);
    }

    public final bjm getTarget() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
