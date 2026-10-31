package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n1f0 implements Parcelable {
    public static final Parcelable.Creator<n1f0> CREATOR = new rwe0((byte) 12);
    public final lb61 a;

    public n1f0(lb61 lb61Var) {
        this.a = lb61Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1f0) && u890.j(this.a, ((n1f0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
