package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gm3 extends jm3 {
    public static final Parcelable.Creator<gm3> CREATOR = new i93((byte) 5);
    public final EntryPoint a;

    public gm3(EntryPoint entryPoint) {
        this.a = entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm3) && this.a == ((gm3) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
