package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.v1.proto.CheckoutStatus;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zfm0 implements nhm0 {
    public static final Parcelable.Creator<zfm0> CREATOR = new w9k0((byte) 21);
    public final CheckoutStatus a;

    public zfm0(CheckoutStatus checkoutStatus) {
        this.a = checkoutStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfm0) && u890.j(this.a, ((zfm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
    }
}
