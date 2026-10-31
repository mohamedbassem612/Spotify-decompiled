package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iqe1 implements mqe1 {
    public static final iqe1 a = new iqe1();
    public static final Parcelable.Creator<iqe1> CREATOR = new pwd1((byte) 22);

    @Override // p.mqe1
    public final List A0() {
        return z6x.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iqe1);
    }

    public final int hashCode() {
        return 212273770;
    }

    public final String toString() {
        return "Initial";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
