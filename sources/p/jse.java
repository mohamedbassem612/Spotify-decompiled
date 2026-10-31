package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jse implements Parcelable {
    public static final Parcelable.Creator<jse> CREATOR = new zge((byte) 10);
    public final String a;
    public final String b;
    public final List c;

    public jse(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jse)) {
            return false;
        }
        jse jseVar = (jse) obj;
        return u890.j(this.a, jseVar.a) && u890.j(this.b, jseVar.b) && u890.j(this.c, jseVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
    }
}
