package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserListeningStatus;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lqe1 implements mqe1 {
    public static final Parcelable.Creator<lqe1> CREATOR = new pwd1((byte) 25);
    public final UserListeningStatus a;

    public lqe1(UserListeningStatus userListeningStatus) {
        this.a = userListeningStatus;
    }

    @Override // p.mqe1
    public final List A0() {
        return z6x.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqe1) && this.a.equals(((lqe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
    }
}
