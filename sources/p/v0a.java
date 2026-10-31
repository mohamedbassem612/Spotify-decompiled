package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v0a implements Parcelable {
    public static final Parcelable.Creator<v0a> CREATOR = new ux9(14);
    public final List a;
    public final String b;

    public v0a(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0a)) {
            return false;
        }
        v0a v0aVar = (v0a) obj;
        return u890.j(this.a, v0aVar.a) && u890.j(this.b, v0aVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeString(this.b);
    }
}
