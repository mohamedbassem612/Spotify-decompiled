package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.v1.proto.CheckoutItemUnavailable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class egm0 implements nhm0 {
    public static final Parcelable.Creator<egm0> CREATOR = new w9k0((byte) 29);
    public final CheckoutItemUnavailable a;

    public egm0(CheckoutItemUnavailable checkoutItemUnavailable) {
        this.a = checkoutItemUnavailable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egm0) && u890.j(this.a, ((egm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
    }
}
