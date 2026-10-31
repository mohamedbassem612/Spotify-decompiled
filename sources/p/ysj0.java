package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ysj0 implements uy31 {
    public static final ysj0 a = new ysj0();
    public static final Parcelable.Creator<ysj0> CREATOR = new ohj0((byte) 9);

    public final int describeContents() {
        return 0;
    }

    public final List getRules() {
        return p7h.M(new Rule[]{Rule.DISALLOW_IF_CAR_CONNECTED, Rule.DISALLOW_IF_APPLICATION_BACKGROUNDED, Rule.DISALLOW_IF_CONTEXT_SWITCHED});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
