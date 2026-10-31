package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g9o0 implements oim {
    public static final Parcelable.Creator<g9o0> CREATOR = new b4o0((byte) 4);
    public final lik1 a;
    public final bjm b = new bjm(6, "spotify:collection:podcasts:episodes", (String) null);

    public g9o0(lik1 lik1Var) {
        this.a = lik1Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9o0) && u890.j(this.a, ((g9o0) obj).a);
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
