package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ftv implements Parcelable {
    public static final Parcelable.Creator<ftv> CREATOR = new s5v((byte) 14);
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final List i;
    public final Map t;

    public ftv(String str, String str2, int i, String str3, String str4, boolean z, boolean z2, String str5, List list, Map map) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = str5;
        this.i = list;
        this.t = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftv)) {
            return false;
        }
        ftv ftvVar = (ftv) obj;
        return u890.j(this.a, ftvVar.a) && u890.j(this.b, ftvVar.b) && this.c == ftvVar.c && u890.j(this.d, ftvVar.d) && u890.j(this.e, ftvVar.e) && this.f == ftvVar.f && this.g == ftvVar.g && u890.j(this.h, ftvVar.h) && u890.j(this.i, ftvVar.i) && u890.j(this.t, ftvVar.t);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return this.t.hashCode() + f4i1.b((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeStringList(this.i);
        Iterator itJ = xcg1.j(parcel, this.t);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
