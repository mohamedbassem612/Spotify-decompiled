package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nam1 implements pam1 {
    public static final Parcelable.Creator<nam1> CREATOR = new w8m1((byte) 23);
    public final StoryCard a;
    public final boolean b;

    public nam1(StoryCard storyCard, boolean z) {
        this.a = storyCard;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nam1)) {
            return false;
        }
        nam1 nam1Var = (nam1) obj;
        return u890.j(this.a, nam1Var.a) && this.b == nam1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q6c1.c.u(this.a, parcel);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
