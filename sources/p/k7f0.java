package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k7f0 implements Parcelable {
    public static final Parcelable.Creator<k7f0> CREATOR = new j7f0((byte) 0);
    public final m7f0 a;

    public k7f0(m7f0 m7f0Var) {
        this.a = m7f0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7f0) && this.a == ((k7f0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
