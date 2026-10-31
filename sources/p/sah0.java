package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sah0 implements Parcelable {
    public static final Parcelable.Creator<sah0> CREATOR = new hug0((byte) 15);
    public final f8a a;

    public sah0(f8a f8aVar) {
        this.a = f8aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sah0) && this.a == ((sah0) obj).a;
    }

    public final int hashCode() {
        f8a f8aVar = this.a;
        if (f8aVar == null) {
            return 0;
        }
        return f8aVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        f8a f8aVar = this.a;
        if (f8aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(f8aVar.name());
        }
    }
}
