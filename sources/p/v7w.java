package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v7w implements Parcelable {
    public static final Parcelable.Creator<v7w> CREATOR = new s5v((byte) 29);
    public final String a;
    public final List b;

    public v7w(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final String d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7w)) {
            return false;
        }
        v7w v7wVar = (v7w) obj;
        return u890.j(this.a, v7wVar.a) && u890.j(this.b, v7wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
    }
}
