package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j0c implements Parcelable {
    public static final Parcelable.Creator<j0c> CREATOR;
    public final MessageResponseToken a;

    static {
        int i = MessageResponseToken.$stable;
        CREATOR = new yyb((byte) 1);
    }

    public j0c(MessageResponseToken messageResponseToken) {
        this.a = messageResponseToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0c) && u890.j(this.a, ((j0c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
