package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dg implements Parcelable {
    public static final Parcelable.Creator<dg> CREATOR = new ad((byte) 6);
    public final String a;
    public final String b;
    public final Map c;

    public dg(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg)) {
            return false;
        }
        dg dgVar = (dg) obj;
        return u890.j(this.a, dgVar.a) && u890.j(this.b, dgVar.b) && u890.j(this.c, dgVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
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

    public /* synthetic */ dg(String str) {
        this(str, null, b7x.a);
    }
}
