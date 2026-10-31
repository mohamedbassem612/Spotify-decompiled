package p;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bjm0 extends u9 {
    public static final Parcelable.Creator<bjm0> CREATOR = new ynm1((byte) 22);
    public final PendingIntent a;

    public bjm0(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 1, this.a, i);
        j541.M(iL, parcel);
    }
}
