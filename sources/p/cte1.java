package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserTimeline;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cte1 implements Parcelable {
    public static final Parcelable.Creator<cte1> CREATOR = new lse1((byte) 2);
    public final UserTimeline a;
    public final int b;

    public cte1(UserTimeline userTimeline, int i) {
        this.a = userTimeline;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cte1)) {
            return false;
        }
        cte1 cte1Var = (cte1) obj;
        return this.a.equals(cte1Var.a) && this.b == cte1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
        parcel.writeInt(this.b);
    }
}
