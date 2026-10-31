package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ot1 implements pt1, Parcelable {
    public static final Parcelable.Creator<ot1> CREATOR = new d41(20);
    public final int N0;
    public final boolean O0;
    public final boolean X;
    public final int Y;
    public final Map Z;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final boolean t;

    public /* synthetic */ ot1(String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3, String str5, boolean z4, boolean z5, int i, Map map, int i2, boolean z6, int i3) {
        this(str, str2, str3, z, z, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? true : z2, (i3 & 128) != 0 ? false : z3, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? false : z4, (i3 & 1024) != 0 ? false : z5, (i3 & 2048) != 0 ? 1 : i, (i3 & 4096) != 0 ? b7x.a : map, (i3 & 8192) != 0 ? 4 : i2, (i3 & 16384) != 0 ? false : z6);
    }

    public static ot1 g(ot1 ot1Var, boolean z, int i) {
        return new ot1(ot1Var.a, ot1Var.b, ot1Var.c, (i & 8) != 0 ? ot1Var.d : true, z, ot1Var.f, ot1Var.g, ot1Var.h, ot1Var.i, ot1Var.t, ot1Var.X, ot1Var.Y, ot1Var.Z, ot1Var.N0, ot1Var.O0);
    }

    @Override // p.pt1
    public final String a() {
        return this.c;
    }

    @Override // p.pt1
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
        if (!(obj instanceof ot1)) {
            return false;
        }
        ot1 ot1Var = (ot1) obj;
        return u890.j(this.a, ot1Var.a) && u890.j(this.b, ot1Var.b) && u890.j(this.c, ot1Var.c) && this.d == ot1Var.d && this.e == ot1Var.e && u890.j(this.f, ot1Var.f) && this.g == ot1Var.g && this.h == ot1Var.h && u890.j(this.i, ot1Var.i) && this.t == ot1Var.t && this.X == ot1Var.X && this.Y == ot1Var.Y && u890.j(this.Z, ot1Var.Z) && this.N0 == ot1Var.N0 && this.O0 == ot1Var.O0;
    }

    @Override // p.pt1
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return Boolean.hashCode(this.O0) + ab80.k(this.N0, cy30.e(ab80.k(this.Y, xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.t), 31, this.X), 31), 31, this.Z), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        int i2 = this.Y;
        if (i2 == 1) {
            str = "NO";
        } else if (i2 == 2) {
            str = "YES";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "PENDING";
        }
        parcel.writeString(str);
        Iterator itJ = xcg1.j(parcel, this.Z);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString(((zhu0) entry.getKey()).name());
            parcel.writeInt(((Number) entry.getValue()).intValue());
        }
        int i3 = this.N0;
        if (i3 == 1) {
            str2 = "YOUR_EPISODES";
        } else if (i3 == 2) {
            str2 = "LIKED_SONGS";
        } else if (i3 == 3) {
            str2 = "YOUR_LIBRARY";
        } else {
            if (i3 != 4) {
                throw null;
            }
            str2 = "OTHER";
        }
        parcel.writeString(str2);
        parcel.writeInt(this.O0 ? 1 : 0);
    }

    public ot1(String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, boolean z4, String str5, boolean z5, boolean z6, int i, Map map, int i2, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = z3;
        this.h = z4;
        this.i = str5;
        this.t = z5;
        this.X = z6;
        this.Y = i;
        this.Z = map;
        this.N0 = i2;
        this.O0 = z7;
    }
}
