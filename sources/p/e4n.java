package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e4n implements Parcelable {
    public static final Parcelable.Creator<e4n> CREATOR = new rtm(12);
    public final yxa0 a;
    public final lik1 b;

    public e4n(yxa0 yxa0Var, lik1 lik1Var) {
        this.a = yxa0Var;
        this.b = lik1Var;
    }

    public final yxa0 a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4n)) {
            return false;
        }
        e4n e4nVar = (e4n) obj;
        return u890.j(this.a, e4nVar.a) && u890.j(this.b, e4nVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
