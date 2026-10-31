package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kbe0 extends dce0 {
    public static final Parcelable.Creator<kbe0> CREATOR = new qod0((byte) 26);
    public final FetchMode a;
    public final cae0 b;

    public kbe0(FetchMode fetchMode, cae0 cae0Var) {
        this.a = fetchMode;
        this.b = cae0Var;
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
        if (!(obj instanceof kbe0)) {
            return false;
        }
        kbe0 kbe0Var = (kbe0) obj;
        return this.a == kbe0Var.a && u890.j(this.b, kbe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeParcelable(this.b, i);
    }
}
