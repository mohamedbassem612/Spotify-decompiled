package p;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n841 extends u9 {
    public static final Parcelable.Creator<n841> CREATOR = new e9n1((byte) 9);
    public final PendingIntent a;

    public n841(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n841) {
            return k8p1.h(this.a, ((n841) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 1, this.a, i);
        j541.M(iL, parcel);
    }
}
