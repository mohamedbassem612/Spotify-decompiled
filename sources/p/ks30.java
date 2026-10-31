package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ks30 implements Parcelable {
    public static final Parcelable.Creator<ks30> CREATOR;
    public final MessageResponseToken a;

    static {
        int i = MessageResponseToken.$stable;
        CREATOR = new ix20((byte) 28);
    }

    public ks30(MessageResponseToken messageResponseToken) {
        this.a = messageResponseToken;
    }

    public final MessageResponseToken a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks30) && u890.j(this.a, ((ks30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
