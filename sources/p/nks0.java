package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nks0 extends pks0 {
    public static final Parcelable.Creator<nks0> CREATOR = new bis0((byte) 3);
    public final int a;

    public nks0(int i) {
        this.a = i;
    }

    @Override // p.pks0
    public final int a() {
        return this.a;
    }

    @Override // p.pks0
    public final String b() {
        return String.valueOf(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nks0) && this.a == ((nks0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
