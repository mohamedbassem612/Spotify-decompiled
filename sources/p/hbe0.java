package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hbe0 extends dce0 {
    public static final Parcelable.Creator<hbe0> CREATOR = new qod0((byte) 23);
    public final FetchMode a;

    public hbe0(FetchMode fetchMode) {
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
        return (obj instanceof hbe0) && this.a == ((hbe0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
