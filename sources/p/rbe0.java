package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rbe0 extends dce0 {
    public static final Parcelable.Creator<rbe0> CREATOR = new qod0((byte) 29);
    public final FetchMode a;

    public rbe0(FetchMode fetchMode) {
        this.a = fetchMode;
    }

    public final FetchMode a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbe0) && this.a == ((rbe0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
