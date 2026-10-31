package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.v1.proto.Error;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xfm0 implements nhm0 {
    public static final Parcelable.Creator<xfm0> CREATOR = new w9k0((byte) 20);
    public final Error a;

    public xfm0(Error error) {
        this.a = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfm0) && u890.j(this.a, ((xfm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
    }
}
