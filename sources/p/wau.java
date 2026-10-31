package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wau extends abu implements nj90 {
    public static final Parcelable.Creator<wau> CREATOR = new zrt((byte) 14);
    public final Map a;
    public final String b;
    public final String c;
    public boolean d;
    public final String e;

    public wau(Map map, String str, String str2, boolean z, String str3) {
        this.a = map;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    @Override // p.abu
    public final String a() {
        return this.e;
    }

    @Override // p.abu
    public final boolean b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wau)) {
            return false;
        }
        wau wauVar = (wau) obj;
        return this.a.equals(wauVar.a) && u890.j(this.b, wauVar.b) && u890.j(this.c, wauVar.c) && this.d == wauVar.d && u890.j(this.e, wauVar.e);
    }

    @Override // p.abu
    public final void g() {
        this.d = false;
    }

    @Override // p.abu
    public final String getContextUri() {
        return this.c;
    }

    public final String getItemId() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itJ = xcg1.j(parcel, this.a);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
    }
}
