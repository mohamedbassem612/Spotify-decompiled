package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.adsinternal.adscore.model.Format;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ji0 implements Parcelable, ki0 {
    public static final Parcelable.Creator<ji0> CREATOR;
    public static final Set d1;
    public final boolean N0;
    public final List O0;
    public final String P0;
    public final Map Q0;
    public final String R0;
    public final String S0;
    public final String T0;
    public final String U0;
    public final String V0;
    public final String W0;
    public final boolean X;
    public final Long X0;
    public final boolean Y;
    public final jx0 Y0;
    public final Format Z;
    public final boolean Z0;
    public final String a;
    public final Set a1;
    public final String b;
    public final int b1;
    public final String c;
    public final int c1;
    public final String d;
    public final String e;
    public final Map f;
    public final fgh0 g;
    public final String h;
    public final String i;
    public final String t;

    static {
        m9x0 m9x0Var = new m9x0((byte) 27);
        CREATOR = new gp((byte) 22);
        d1 = dm61.z0(new co0[]{co0.Z0, co0.X, co0.P0, co0.c1, co0.h, co0.f1, co0.S0, co0.f, co0.Z});
        m9x0.a(m9x0Var, (String) null, (String) null, (Map) null, (fgh0) null, (String) null, (String) null, (String) null, (Format) null, (String) null, (Map) null, 524287);
    }

    public ji0(String str, String str2, String str3, String str4, String str5, int i, Map map, fgh0 fgh0Var, String str6, String str7, String str8, boolean z, boolean z2, Format format, boolean z3, List list, String str9, Map map2, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.b1 = i;
        this.f = map;
        this.g = fgh0Var;
        this.h = str6;
        this.i = str7;
        this.t = str8;
        this.X = z;
        this.Y = z2;
        this.Z = format;
        this.N0 = z3;
        this.O0 = list;
        this.P0 = str9;
        this.Q0 = map2;
        this.c1 = i2;
        this.R0 = (String) map.get("buttonMessage");
        l6p1.o((String) map.get("video_orientation"));
        this.S0 = (String) map.get("tagline");
        this.T0 = (String) map.get("secondaryTag");
        this.U0 = (String) map.get("logoImage");
        this.V0 = (String) map.get("displayImage");
        String str10 = (String) map.get("product_name");
        this.W0 = str10 == null ? "" : str10;
        String str11 = (String) map.get("viewable_threshold_ms");
        this.X0 = str11 != null ? nhc1.d0(10, str11) : null;
        jx0 jx0Var = jx0.b;
        this.Y0 = d3p1.x(str9);
        String str12 = (String) map.get("minimizable");
        this.Z0 = str12 != null ? Boolean.parseBoolean(str12) : true;
        this.a1 = Collections.synchronizedSet(o7h.o1(d1));
    }

    public static ji0 l(int i, int i2, String str, ji0 ji0Var) {
        String str2 = ji0Var.a;
        String str3 = ji0Var.b;
        String str4 = ji0Var.c;
        String str5 = ji0Var.d;
        String str6 = (i2 & 16) != 0 ? ji0Var.e : str;
        int i3 = ji0Var.b1;
        Map map = ji0Var.f;
        fgh0 fgh0Var = ji0Var.g;
        String str7 = ji0Var.h;
        String str8 = ji0Var.i;
        String str9 = ji0Var.t;
        boolean z = ji0Var.X;
        boolean z2 = ji0Var.Y;
        Format format = ji0Var.Z;
        boolean z3 = ji0Var.N0;
        List list = ji0Var.O0;
        String str10 = ji0Var.P0;
        Map map2 = ji0Var.Q0;
        int i4 = (i2 & 262144) != 0 ? ji0Var.c1 : i;
        ji0Var.getClass();
        return new ji0(str2, str3, str4, str5, str6, i3, map, fgh0Var, str7, str8, str9, z, z2, format, z3, list, str10, map2, i4);
    }

    @Override // p.fq0
    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji0)) {
            return false;
        }
        ji0 ji0Var = (ji0) obj;
        return gq0.b(this.a, ji0Var.a) && u890.j(this.b, ji0Var.b) && u890.j(this.c, ji0Var.c) && u890.j(this.d, ji0Var.d) && u890.j(this.e, ji0Var.e) && this.b1 == ji0Var.b1 && u890.j(this.f, ji0Var.f) && u890.j(this.g, ji0Var.g) && ouo1.Q(this.h, ji0Var.h) && u890.j(this.i, ji0Var.i) && pap1.v(this.t, ji0Var.t) && this.X == ji0Var.X && this.Y == ji0Var.Y && this.Z == ji0Var.Z && this.N0 == ji0Var.N0 && u890.j(this.O0, ji0Var.O0) && u890.j(this.P0, ji0Var.P0) && u890.j(this.Q0, ji0Var.Q0) && this.c1 == ji0Var.c1;
    }

    @Override // p.ki0
    public final String g() {
        return this.e;
    }

    @Override // p.fq0
    public final String h() {
        return this.t;
    }

    public final int hashCode() {
        return l1d.C(this.c1) + cy30.e(cy30.d(f4i1.b(xcg1.g((this.Z.hashCode() + xcg1.g(xcg1.g((pap1.x(this.t) + cy30.d((ouo1.a0(this.h) + ((this.g.hashCode() + cy30.e(ab80.k(this.b1, cy30.d(cy30.d(cy30.d(cy30.d(gq0.c(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.f)) * 31)) * 31, 31, this.i)) * 31, 31, this.X), 31, this.Y)) * 31, 31, this.N0), 31, this.O0), 31, this.P0), 31, this.Q0);
    }

    @Override // p.ki0
    public final String j() {
        return this.c;
    }

    @Override // p.fq0
    public final String k() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b2p1.E(this.a, parcel);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(x0d.x(this.b1));
        Iterator itJ = xcg1.j(parcel, this.f);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        this.g.writeToParcel(parcel, i);
        puo1.y(this.h, parcel);
        parcel.writeString(this.i);
        sap1.t(this.t, parcel);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeString(this.Z.name());
        parcel.writeInt(this.N0 ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.O0);
        while (itM.hasNext()) {
            parcel.writeValue(itM.next());
        }
        parcel.writeString(this.P0);
        Iterator itJ2 = xcg1.j(parcel, this.Q0);
        while (itJ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itJ2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeStringList((List) entry2.getValue());
        }
        parcel.writeString(x0d.w(this.c1));
    }

    public /* synthetic */ ji0(String str, String str2, String str3, String str4, String str5, int i, Map map, fgh0 fgh0Var, String str6, String str7, String str8, boolean z, boolean z2, Format format, boolean z3, List list, String str9, LinkedHashMap linkedHashMap, int i2) {
        this(str, str2, str3, str4, str5, i, map, fgh0Var, str6, str7, str8, z, z2, format, z3, list, str9, (Map) ((i2 & 131072) != 0 ? b7x.a : linkedHashMap), (i2 & 262144) != 0 ? 2 : 1);
    }
}
