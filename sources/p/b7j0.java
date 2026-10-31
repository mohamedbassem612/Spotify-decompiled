package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b7j0 extends e7j0 {
    public static final Parcelable.Creator<b7j0> CREATOR;
    public final MessageResponseToken a;

    static {
        int i = MessageResponseToken.$stable;
        CREATOR = new rqi0((byte) 19);
    }

    public b7j0(MessageResponseToken messageResponseToken) {
        this.a = messageResponseToken;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7j0) && u890.j(this.a, ((b7j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
