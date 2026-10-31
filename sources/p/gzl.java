package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gzl extends kzl {
    public static final Parcelable.Creator<gzl> CREATOR = new ezl((byte) 1);
    public final String a;
    public final SearchConfiguration b;

    public gzl(String str, SearchConfiguration searchConfiguration) {
        this.a = str;
        this.b = searchConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzl)) {
            return false;
        }
        gzl gzlVar = (gzl) obj;
        return u890.j(this.a, gzlVar.a) && u890.j(this.b, gzlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
