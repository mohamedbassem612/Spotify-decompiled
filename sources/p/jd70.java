package p;

import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jd70 extends vxo1 {
    public String c;
    public String d;
    public yxo1 e;

    public final vxo1 i(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.e = this.e.l(hubsImmutableComponentBundle);
        return this;
    }

    public final ld70 j() {
        Parcelable.Creator<ld70> creator = ld70.CREATOR;
        return eyo1.i(this.c, this.d, this.e.o());
    }
}
