package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xau extends abu implements nj90 {
    public static final Parcelable.Creator<xau> CREATOR = new zrt((byte) 15);
    public boolean X;
    public final String Y;
    public final String a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final Boolean e;
    public final String f;
    public final String g;
    public final wjq0 h;
    public final String i;
    public final String t;

    public xau(String str, String str2, Map map, boolean z, Boolean bool, String str3, String str4, wjq0 wjq0Var, String str5, String str6, boolean z2, String str7) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = bool;
        this.f = str3;
        this.g = str4;
        this.h = wjq0Var;
        this.i = str5;
        this.t = str6;
        this.X = z2;
        this.Y = str7;
    }

    @Override // p.abu
    public final String a() {
        return this.Y;
    }

    @Override // p.abu
    public final boolean b() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xau)) {
            return false;
        }
        xau xauVar = (xau) obj;
        return u890.j(this.a, xauVar.a) && u890.j(this.b, xauVar.b) && this.c.equals(xauVar.c) && this.d == xauVar.d && u890.j(this.e, xauVar.e) && u890.j(this.f, xauVar.f) && u890.j(this.g, xauVar.g) && u890.j(this.h, xauVar.h) && u890.j(this.i, xauVar.i) && u890.j(this.t, xauVar.t) && this.X == xauVar.X && u890.j(this.Y, xauVar.Y);
    }

    @Override // p.abu
    public final void g() {
        this.X = false;
    }

    @Override // p.abu
    public final String getContextUri() {
        return this.t;
    }

    public final String getItemId() {
        return this.i;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(cy30.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        Boolean bool = this.e;
        int iHashCode2 = this.g.hashCode() + cy30.d((iG + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f);
        this.h.getClass();
        int i = iHashCode2 * 961;
        String str2 = this.i;
        return this.Y.hashCode() + xcg1.g(cy30.d((i + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.t), 31, this.X);
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
        parcel.writeInt(this.d ? 1 : 0);
        Boolean bool = this.e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeString(this.Y);
    }
}
