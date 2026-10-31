package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g000 extends g700 {
    public static final Parcelable.Creator<g000> CREATOR = new dez((byte) 24);
    public final nsn0 a;

    public g000(nsn0 nsn0Var) {
        this.a = nsn0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g000) && this.a.equals(((g000) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.g700
    public final String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qqn1.a0(this.a, parcel);
    }
}
