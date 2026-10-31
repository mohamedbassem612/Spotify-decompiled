package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hby implements Parcelable {
    public static final Parcelable.Creator<hby> CREATOR = new utx((byte) 18);
    public final String a;
    public final EntityType b;

    public hby(String str, EntityType entityType) {
        this.a = str;
        this.b = entityType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hby)) {
            return false;
        }
        hby hbyVar = (hby) obj;
        return u890.j(this.a, hbyVar.a) && this.b == hbyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
