package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class te2 extends we2 {
    public static final Parcelable.Creator<te2> CREATOR = new ev1((byte) 29);
    public final eb2 b;

    public te2(eb2 eb2Var) {
        super("https://age-assurance.spotify.com/check/start");
        this.b = eb2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te2) && u890.j(this.b, ((te2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
