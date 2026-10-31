package p;

import android.content.res.Resources;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h93 extends bey {
    public final /* synthetic */ byte b;
    public final zwm1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h93(zwm1 zwm1Var, byte b) {
        super(aey.c);
        this.b = b;
        switch (b) {
            case 1:
                super(aey.a);
                this.c = zwm1Var;
                break;
            case 2:
                super(aey.g);
                this.c = zwm1Var;
                break;
            case 3:
                super(aey.i);
                this.c = zwm1Var;
                break;
            case 4:
                super(aey.d);
                this.c = zwm1Var;
                break;
            case 5:
                super(aey.h);
                this.c = zwm1Var;
                break;
            case 6:
                super(aey.Y);
                this.c = zwm1Var;
                break;
            case 7:
                super(aey.X);
                this.c = zwm1Var;
                break;
            case 8:
                super(aey.b);
                this.c = zwm1Var;
                break;
            case 9:
                super(aey.e);
                this.c = zwm1Var;
                break;
            default:
                this.c = zwm1Var;
                break;
        }
    }

    @Override // p.bey
    public final String b(ttm1 ttm1Var, pey peyVar) {
        j93 j93Var;
        String str;
        String str2;
        obn obnVar;
        ha00 ha00Var;
        y030 y030Var;
        h9o0 h9o0Var;
        y481 y481Var;
        int i;
        Long l;
        lxi1 lxi1Var;
        byte b = this.b;
        int i2 = 2;
        String string = "";
        boolean z = false;
        zwm1 zwm1Var = this.c;
        j93 j93Var2 = null;
        String string2 = null;
        giv0 giv0Var = null;
        String string3 = null;
        tlb tlbVar = null;
        switch (b) {
            case 0:
                Resources resources = zwm1Var.b;
                nb10 nb10Var = ttm1Var.g;
                Set set = peyVar.e;
                Map map = ttm1.i;
                aey aeyVar = ttm1Var.e;
                if (!u890.j(map.get(aeyVar), j93.class)) {
                    j93Var = null;
                } else {
                    if (nb10Var == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.AlbumExtraInfo");
                        return null;
                    }
                    j93Var = (j93) nb10Var;
                }
                if (j93Var == null || (str = j93Var.b) == null) {
                    return null;
                }
                if (u890.j(map.get(aeyVar), j93.class)) {
                    if (nb10Var == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.AlbumExtraInfo");
                        return null;
                    }
                    j93Var2 = (j93) nb10Var;
                }
                int i3 = j93Var2 != null ? j93Var2.a : 0;
                int i4 = i3 == 0 ? -1 : g93.a[l1d.C(i3)];
                if (i4 == 1) {
                    String string4 = resources.getString(2131956833, str);
                    string4.getClass();
                    return string4;
                }
                if (i4 == 2) {
                    String string5 = resources.getString(2131956826, str);
                    string5.getClass();
                    return string5;
                }
                if (i4 == 3) {
                    String string6 = resources.getString(2131956829, str);
                    string6.getClass();
                    return string6;
                }
                if (!set.contains("albums") && !set.contains("downloaded_albums")) {
                    z = true;
                }
                return zwm1Var.a(str, z);
            case 1:
                Set set2 = peyVar.e;
                if (u890.j(ttm1.i.get(ttm1Var.e), tlb.class)) {
                    nb10 nb10Var2 = ttm1Var.g;
                    if (nb10Var2 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.BookExtraInfo");
                        return null;
                    }
                    tlbVar = (tlb) nb10Var2;
                }
                if (tlbVar != null && (str2 = tlbVar.a) != null) {
                    string = str2;
                }
                if (!set2.contains("books") && !set2.contains("downloaded_books")) {
                    z = true;
                }
                Resources resources2 = zwm1Var.b;
                if (z) {
                    return string.length() == 0 ? resources2.getString(2131956840) : resources2.getString(2131956839, string);
                }
                return string;
            case 2:
                if (peyVar.e.contains("authors")) {
                    return null;
                }
                return zwm1Var.b.getString(2131956838);
            case 3:
                Set set3 = peyVar.e;
                if (u890.j(ttm1.i.get(ttm1Var.e), obn.class)) {
                    nb10 nb10Var3 = ttm1Var.g;
                    if (nb10Var3 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.CourseExtraInfo");
                        return null;
                    }
                    obnVar = (obn) nb10Var3;
                } else {
                    obnVar = null;
                }
                String str3 = obnVar != null ? obnVar.a : null;
                if (!set3.contains("courses") && !set3.contains("downloaded_courses")) {
                    z = true;
                }
                Resources resources3 = zwm1Var.b;
                if (z && str3 != null && str3.length() != 0) {
                    string = resources3.getString(2131964050, str3);
                } else if (z) {
                    string = resources3.getString(2131964051);
                } else if (str3 != null) {
                    string = str3;
                }
                string.getClass();
                return string;
            case 4:
                if (u890.j(ttm1.i.get(ttm1Var.e), ha00.class)) {
                    nb10 nb10Var4 = ttm1Var.g;
                    if (nb10Var4 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.EventExtraInfo");
                        return null;
                    }
                    ha00Var = (ha00) nb10Var4;
                } else {
                    ha00Var = null;
                }
                if (ha00Var == null) {
                    return null;
                }
                String str4 = ha00Var.c;
                if (ihc1.y0(str4)) {
                    str4 = null;
                }
                String str5 = ha00Var.b;
                if (ihc1.y0(str5)) {
                    str5 = null;
                }
                boolean zContains = peyVar.e.contains("events");
                Resources resources4 = zwm1Var.b;
                if (str4 != null && str5 != null) {
                    string3 = resources4.getString(2131956854, str4, str5);
                } else if (str4 != null) {
                    string3 = str4;
                } else if (str5 != null) {
                    string3 = str5;
                }
                if (zContains || string3 == null) {
                    return !zContains ? resources4.getString(2131956853) : string3;
                }
                return resources4.getString(2131956852, string3);
            case 5:
                if (u890.j(ttm1.i.get(ttm1Var.e), y030.class)) {
                    nb10 nb10Var5 = ttm1Var.g;
                    if (nb10Var5 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.FolderExtraInfo");
                        return null;
                    }
                    y030Var = (y030) nb10Var5;
                } else {
                    y030Var = null;
                }
                if (y030Var != null) {
                    return zwm1Var.b(y030Var.b, y030Var.a);
                }
                return null;
            case 6:
                if (u890.j(ttm1.i.get(ttm1Var.e), h9o0.class)) {
                    nb10 nb10Var6 = ttm1Var.g;
                    if (nb10Var6 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.NewEpisodesExtraInfo");
                        return null;
                    }
                    h9o0Var = (h9o0) nb10Var6;
                } else {
                    h9o0Var = null;
                }
                long j = h9o0Var != null ? h9o0Var.a : 0L;
                Long lValueOf = j == 0 ? null : Long.valueOf(j);
                if (lValueOf != null) {
                    return zwm1Var.a.j(lValueOf.longValue());
                }
                return null;
            case 7:
                if (u890.j(ttm1.i.get(ttm1Var.e), giv0.class)) {
                    nb10 nb10Var7 = ttm1Var.g;
                    if (nb10Var7 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.PreReleaseExtraInfo");
                        return null;
                    }
                    giv0Var = (giv0) nb10Var7;
                }
                if (giv0Var == null) {
                    return "";
                }
                String str6 = giv0Var.a;
                int iC = l1d.C(giv0Var.b);
                if (iC == 0) {
                    i2 = 1;
                } else if (iC != 1) {
                    i2 = 3;
                }
                return zwm1Var.f(i2, str6);
            case 8:
                Resources resources5 = zwm1Var.b;
                Set set4 = peyVar.e;
                if (u890.j(ttm1.i.get(ttm1Var.e), y481.class)) {
                    nb10 nb10Var8 = ttm1Var.g;
                    if (nb10Var8 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.ShowExtraInfo");
                        return null;
                    }
                    y481Var = (y481) nb10Var8;
                } else {
                    y481Var = null;
                }
                if (peyVar.d) {
                    return resources5.getString(2131964084);
                }
                if (set4.contains("downloaded_podcasts") || (set4.contains("podcasts") && set4.contains("downloaded"))) {
                    if ((y481Var != null ? Integer.valueOf(y481Var.c) : null) != null && (i = y481Var.c) > 0) {
                        String str7 = y481Var.a;
                        if (str7 == null || str7.length() == 0) {
                            String quantityString = resources5.getQuantityString(2131820713, i, Integer.valueOf(i));
                            quantityString.getClass();
                            return quantityString;
                        }
                        String quantityString2 = resources5.getQuantityString(2131820712, i, Integer.valueOf(i), str7);
                        quantityString2.getClass();
                        return quantityString2;
                    }
                }
                String str8 = y481Var != null ? y481Var.a : null;
                long jLongValue = (y481Var == null || (l = y481Var.b) == null) ? 0L : l.longValue();
                Long lValueOf2 = jLongValue != 0 ? Long.valueOf(jLongValue) : null;
                if (!set4.contains("podcasts") && !set4.contains("downloaded_podcasts")) {
                    z = true;
                }
                return zwm1Var.g(str8, lValueOf2, z);
            default:
                if (u890.j(ttm1.i.get(ttm1Var.e), lxi1.class)) {
                    nb10 nb10Var9 = ttm1Var.g;
                    if (nb10Var9 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.VenueExtraInfo");
                        return null;
                    }
                    lxi1Var = (lxi1) nb10Var9;
                } else {
                    lxi1Var = null;
                }
                if (lxi1Var == null) {
                    return null;
                }
                boolean zContains2 = peyVar.e.contains("venue");
                String str9 = lxi1Var.a;
                if (ihc1.y0(str9)) {
                    str9 = null;
                }
                String str10 = lxi1Var.b;
                if (ihc1.y0(str10)) {
                    str10 = null;
                }
                Resources resources6 = zwm1Var.b;
                if (str10 != null && str9 != null) {
                    string2 = resources6.getString(2131956854, str10, str9);
                } else if (str10 != null) {
                    string2 = str10;
                } else if (str9 != null) {
                    string2 = str9;
                }
                if (zContains2 || string2 == null) {
                    return !zContains2 ? resources6.getString(2131956873) : string2;
                }
                return resources6.getString(2131956872, string2);
        }
    }
}
