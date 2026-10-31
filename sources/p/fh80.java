package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fh80 implements uy31 {
    public static final fh80 a = new fh80();
    public static final Parcelable.Creator<fh80> CREATOR = new mj70((byte) 21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.uy31
    public final List getRules() {
        return p7h.M(Rule.DISALLOW_IF_CAR_CONNECTED, Rule.DISALLOW_IF_APPLICATION_BACKGROUNDED, Rule.DISALLOW_IF_CONTEXT_SWITCHED, Rule.DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING, Rule.DISALLOW_IF_CONNECTIVITY_OFFLINE, Rule.ALLOW_ONLY_CUSTOM_CLIENT_TRIGGERS);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
