package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j7a implements uy31 {
    public static final j7a a = new j7a();
    public static final Parcelable.Creator<j7a> CREATOR = new ux9((byte) 19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.uy31
    public final List getRules() {
        return p7h.M(Rule.DISALLOW_IF_AD_PLAYING, Rule.DISALLOW_IF_NOW_PLAYING_VIEW_DISPLAYING, Rule.DISALLOW_IF_CAR_CONNECTED, Rule.DISALLOW_IF_APPLICATION_BACKGROUNDED, Rule.DISALLOW_IF_CONTEXT_SWITCHED, Rule.DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING, Rule.DISALLOW_IF_CONNECTIVITY_OFFLINE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
