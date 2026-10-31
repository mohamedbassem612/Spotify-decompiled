package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rly0 extends tly0 {
    public static final Parcelable.Creator<rly0> CREATOR = new zzx0((byte) 23);
    public final SpotifyCheckoutNative a;

    public rly0(SpotifyCheckoutNative spotifyCheckoutNative) {
        this.a = spotifyCheckoutNative;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rly0) && u890.j(this.a, ((rly0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
    }
}
