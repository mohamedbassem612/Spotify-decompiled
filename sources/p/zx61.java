package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zx61 implements Parcelable {
    public static final Parcelable.Creator<zx61> CREATOR = new hs61(10);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final j9h f;
    public final boolean g;
    public final long h;

    public zx61(String str, String str2, String str3, String str4, Map map, j9h j9hVar, boolean z, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = j9hVar;
        this.g = z;
        this.h = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx61)) {
            return false;
        }
        zx61 zx61Var = (zx61) obj;
        return u890.j(this.a, zx61Var.a) && u890.j(this.b, zx61Var.b) && u890.j(this.c, zx61Var.c) && u890.j(this.d, zx61Var.d) && u890.j(this.e, zx61Var.e) && u890.j(this.f, zx61Var.f) && this.g == zx61Var.g && vve1.a(this.h, zx61Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + xcg1.g((this.f.hashCode() + cy30.e(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator itJ = xcg1.j(parcel, this.e);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        this.f.writeToParcel(parcel, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(new vve1(this.h), i);
    }
}
