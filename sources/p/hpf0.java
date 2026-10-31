package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hpf0 implements lpf0 {
    public static final Parcelable.Creator<hpf0> CREATOR = new j7f0((byte) 29);
    public final bff0 a;

    public hpf0(bff0 bff0Var) {
        this.a = bff0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpf0) && u890.j(this.a, ((hpf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
