package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t480 implements Parcelable {
    public static final Parcelable.Creator<t480> CREATOR = new hbn1((byte) 24);
    public final UUID a;

    public t480(UUID uuid) {
        this.a = uuid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t480) && u890.j(this.a, ((t480) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }
}
