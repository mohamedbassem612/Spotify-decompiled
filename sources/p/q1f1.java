package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q1f1 extends s1f1 {
    public static final Parcelable.Creator<q1f1> CREATOR = new lse1((byte) 21);
    public final pn71 a;

    public q1f1(pn71 pn71Var) {
        this.a = pn71Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1f1) && u890.j(this.a, ((q1f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
