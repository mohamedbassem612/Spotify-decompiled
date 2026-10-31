package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zau extends abu implements nj90 {
    public static final Parcelable.Creator<zau> CREATOR = new zrt((byte) 17);
    public final String a;
    public final LinkedHashMap b;
    public final String c;
    public final String d;
    public boolean e;
    public final String f;

    public zau(String str, LinkedHashMap linkedHashMap, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = linkedHashMap;
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
        if (!(obj instanceof zau)) {
            return false;
        }
        zau zauVar = (zau) obj;
        return u890.j(this.a, zauVar.a) && this.b.equals(zauVar.b) && u890.j(this.c, zauVar.c) && u890.j(this.d, zauVar.d) && this.e == zauVar.e && u890.j(this.f, zauVar.f);
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
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.f.hashCode() + xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        LinkedHashMap linkedHashMap = this.b;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
    }
}
