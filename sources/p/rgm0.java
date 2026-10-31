package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rgm0 implements nhm0 {
    public static final Parcelable.Creator<rgm0> CREATOR = new fgm0((byte) 2);
    public final SpotifyCheckoutNative a;
    public final qgm0 b;
    public final igm0 c;

    public /* synthetic */ rgm0(SpotifyCheckoutNative spotifyCheckoutNative, qgm0 qgm0Var, int i) {
        this(spotifyCheckoutNative, (i & 2) != 0 ? qgm0.a : qgm0Var, new igm0());
    }

    public static rgm0 a(rgm0 rgm0Var, SpotifyCheckoutNative spotifyCheckoutNative, qgm0 qgm0Var, igm0 igm0Var, int i) {
        if ((i & 1) != 0) {
            spotifyCheckoutNative = rgm0Var.a;
        }
        if ((i & 2) != 0) {
            qgm0Var = rgm0Var.b;
        }
        if ((i & 4) != 0) {
            igm0Var = rgm0Var.c;
        }
        rgm0Var.getClass();
        return new rgm0(spotifyCheckoutNative, qgm0Var, igm0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgm0)) {
            return false;
        }
        rgm0 rgm0Var = (rgm0) obj;
        return u890.j(this.a, rgm0Var.a) && this.b == rgm0Var.b && u890.j(this.c, rgm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
        parcel.writeString(this.b.name());
        this.c.writeToParcel(parcel, i);
    }

    public rgm0(SpotifyCheckoutNative spotifyCheckoutNative, qgm0 qgm0Var, igm0 igm0Var) {
        this.a = spotifyCheckoutNative;
        this.b = qgm0Var;
        this.c = igm0Var;
    }
}
