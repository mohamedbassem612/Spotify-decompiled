package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mam1 implements pam1 {
    public static final Parcelable.Creator<mam1> CREATOR = new w8m1((byte) 22);
    public final StoryCard a;

    public mam1(StoryCard storyCard) {
        this.a = storyCard;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mam1) && u890.j(this.a, ((mam1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q6c1.c.u(this.a, parcel);
    }
}
