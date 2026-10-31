package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class wv0 {
    public static final mv0 Companion = new mv0();
    public static final znb0[] q = {null, null, dm5.S(2, p4.R0), dm5.S(2, p4.S0), dm5.S(2, p4.T0), dm5.S(2, p4.U0), dm5.S(2, p4.V0), dm5.S(2, p4.W0), null, null, null, null, null, null, null};
    public final String a;
    public final String b;
    public final Map c;
    public final Map d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f138p;

    public /* synthetic */ wv0(int i, String str, String str2, Map map, Map map2, List list, List list2, List list3, List list4, boolean z, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9;
        String str10;
        if (3 != (i & 3)) {
            o6p1.t(i, 3, iv0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        int i2 = i & 4;
        Map map3 = b7x.a;
        if (i2 == 0) {
            this.c = map3;
        } else {
            this.c = map;
        }
        if ((i & 8) == 0) {
            this.d = map3;
            map2 = map3;
        } else {
            this.d = map2;
        }
        int i3 = i & 16;
        z6x z6xVar = z6x.a;
        if (i3 == 0) {
            this.e = z6xVar;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = z6xVar;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = z6xVar;
        } else {
            this.g = list3;
        }
        if ((i & 128) == 0) {
            this.h = z6xVar;
        } else {
            this.h = list4;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
        this.j = "";
        if ((i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0) {
            String str11 = (String) map2.get("advertiser");
            this.k = str11 == null ? "" : str11;
        } else {
            this.k = str3;
        }
        if ((i & 1024) == 0) {
            String str12 = (String) map2.get("creative_id");
            this.l = str12 == null ? "" : str12;
        } else {
            this.l = str4;
        }
        if ((i & 2048) == 0) {
            String str13 = (String) map2.get("manifestId");
            this.m = str13 == null ? "" : str13;
        } else {
            this.m = str5;
        }
        if ((i & 4096) == 0) {
            str9 = (String) map2.get("product_name");
            if (str9 == null) {
                str9 = "";
            }
        } else {
            str9 = str6;
        }
        this.n = str9;
        if ((i & 8192) == 0) {
            str10 = (String) map2.get("lineitem_id");
            if (str10 == null) {
                str10 = "";
            }
        } else {
            str10 = str7;
        }
        this.o = str10;
        if ((i & 16384) != 0) {
            this.f138p = str8;
        } else {
            String str14 = (String) map2.get("buttonMessage");
            this.f138p = str14 != null ? str14 : "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv0)) {
            return false;
        }
        wv0 wv0Var = (wv0) obj;
        return u890.j(this.a, wv0Var.a) && u890.j(this.b, wv0Var.b) && u890.j(this.c, wv0Var.c) && u890.j(this.d, wv0Var.d) && u890.j(this.e, wv0Var.e) && u890.j(this.f, wv0Var.f) && u890.j(this.g, wv0Var.g) && u890.j(this.h, wv0Var.h) && this.i == wv0Var.i && this.j.equals(wv0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + xcg1.g(f4i1.b(f4i1.b(f4i1.b(f4i1.b(cy30.e(cy30.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public wv0(String str, String str2, Map map, Map map2, List list, List list2, List list3, List list4, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = map2;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = list4;
        this.i = z;
        this.j = str3;
        String str4 = (String) map2.get("advertiser");
        this.k = str4 == null ? "" : str4;
        String str5 = (String) map2.get("creative_id");
        this.l = str5 == null ? "" : str5;
        String str6 = (String) map2.get("manifestId");
        this.m = str6 == null ? "" : str6;
        String str7 = (String) map2.get("product_name");
        this.n = str7 == null ? "" : str7;
        String str8 = (String) map2.get("lineitem_id");
        this.o = str8 == null ? "" : str8;
        String str9 = (String) map2.get("buttonMessage");
        this.f138p = str9 != null ? str9 : "";
    }
}
