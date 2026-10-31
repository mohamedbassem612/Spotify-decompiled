package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zzz extends g700 {
    public static final Parcelable.Creator<zzz> CREATOR = new dez((byte) 22);
    public final nsn0 a;

    public zzz(nsn0 nsn0Var) {
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
        return (obj instanceof zzz) && this.a.equals(((zzz) obj).a);
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
