package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oks0 extends pks0 {
    public static final Parcelable.Creator<oks0> CREATOR = new bis0((byte) 4);
    public final long a;

    public oks0(long j) {
        this.a = j;
    }

    @Override // p.pks0
    public final int a() {
        return (int) this.a;
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
        return (obj instanceof oks0) && this.a == ((oks0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
