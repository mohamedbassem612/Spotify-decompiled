package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wfo implements Parcelable {
    public static final Parcelable.Creator<wfo> CREATOR = new rco((byte) 2);
    public final String a;
    public final String b;
    public final Map c;

    public wfo(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfo)) {
            return false;
        }
        wfo wfoVar = (wfo) obj;
        return u890.j(this.a, wfoVar.a) && u890.j(this.b, wfoVar.b) && this.c.equals(wfoVar.c);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itJ = xcg1.j(parcel, this.c);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
