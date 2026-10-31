package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.RiveAnimation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n5c1 implements p5c1 {
    public static final Parcelable.Creator<n5c1> CREATOR = new yub1((byte) 23);
    public final RiveAnimation a;

    public n5c1(RiveAnimation riveAnimation) {
        this.a = riveAnimation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5c1) && u890.j(this.a, ((n5c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        li31.c.u(this.a, parcel);
    }
}
