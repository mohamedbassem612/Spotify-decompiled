package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e3b1 implements f3b1 {
    public static final Parcelable.Creator<e3b1> CREATOR = new nja1((byte) 14);
    public final zxf a;
    public final String b;
    public final SpotifyCheckoutNative c;

    public e3b1(zxf zxfVar, String str, SpotifyCheckoutNative spotifyCheckoutNative) {
        this.a = zxfVar;
        this.b = str;
        this.c = spotifyCheckoutNative;
    }

    public final String Z() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3b1)) {
            return false;
        }
        e3b1 e3b1Var = (e3b1) obj;
        return u890.j(this.a, e3b1Var.a) && u890.j(this.b, e3b1Var.b) && u890.j(this.c, e3b1Var.c);
    }

    public final zxf getSource() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c.toByteArray());
    }
}
