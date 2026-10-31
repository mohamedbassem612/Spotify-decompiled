package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vau extends abu implements nj90 {
    public static final Parcelable.Creator<vau> CREATOR = new zrt((byte) 13);
    public final String a;
    public final Map b;
    public final String c;
    public final String d;
    public boolean e;
    public final String f;

    public vau(String str, Map map, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
    }

    @Override // p.abu
    public final String a() {
        return this.f;
    }

    @Override // p.abu
    public final boolean b() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vau)) {
            return false;
        }
        vau vauVar = (vau) obj;
        return u890.j(this.a, vauVar.a) && this.b.equals(vauVar.b) && u890.j(this.c, vauVar.c) && u890.j(this.d, vauVar.d) && this.e == vauVar.e && u890.j(this.f, vauVar.f);
    }

    @Override // p.abu
    public final void g() {
        this.e = false;
    }

    @Override // p.abu
    public final String getContextUri() {
        return this.d;
    }

    public final String getItemId() {
        return this.c;
    }

    public final int hashCode() {
        int iE = cy30.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + xcg1.g(cy30.d((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itJ = xcg1.j(parcel, this.b);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
    }
}
