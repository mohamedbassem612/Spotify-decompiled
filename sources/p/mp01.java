package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@lkn0
public final class mp01 implements Parcelable.Creator<RecentlyPlayedResponse> {
    @Override // android.os.Parcelable.Creator
    public final RecentlyPlayedResponse createFromParcel(Parcel parcel) {
        int i = parcel.readInt();
        boolean z = parcel.readInt() != 0;
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, RecentlyPlayedEntity.CREATOR);
        return new RecentlyPlayedResponse(i, z, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final RecentlyPlayedResponse[] newArray(int i) {
        return new RecentlyPlayedResponse[i];
    }

    public final nma0 serializer() {
        return lp01.a;
    }
}
