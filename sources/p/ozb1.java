package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ozb1 implements td41 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f37p;
    public static final List q;
    public static final ArrayList r;
    public static final ArrayList s;
    public static final ArrayList t;
    public static final List u;
    public static final List v;
    public static final List w;
    public static final bma1 x;
    public final as3 a;
    public final bma1 b;
    public final idd1 c;
    public final idd1 d;
    public final yt91 e;
    public final yt91 f;
    public final yt91 g;
    public final yt91 h;
    public final yt91 i;
    public final yt91 j;
    public final yt91 k;
    public final yt91 l;
    public final yt91 m;
    public final yt91 n;
    public final yt91 o;

    static {
        dia1 dia1Var = dia1.AUTHOR;
        dia1 dia1Var2 = dia1.RECENTLY_PLAYED_OR_ADDED;
        dia1 dia1Var3 = dia1.RECENTLY_ADDED;
        dia1 dia1Var4 = dia1.ALPHABETICAL;
        f37p = p7h.M(new dia1[]{dia1Var2, dia1Var3, dia1Var4, dia1Var});
        List listM = p7h.M(new dia1[]{dia1Var2, dia1Var3, dia1Var4});
        q = listM;
        dia1 dia1Var5 = dia1.CREATOR;
        ArrayList arrayListO0 = o7h.O0(dia1Var5, listM);
        r = arrayListO0;
        s = o7h.O0(dia1.CUSTOM, arrayListO0);
        t = o7h.O0(dia1.RECENTLY_UPDATED, arrayListO0);
        u = p7h.M(new dia1[]{dia1.RELEVANCE, dia1Var2, dia1Var3, dia1Var4, dia1Var5});
        v = p7h.M(new dia1[]{dia1.DATE, dia1Var2, dia1Var3, dia1Var4, dia1Var5});
        w = p7h.M(new dia1[]{dia1Var2, dia1Var3, dia1Var4, dia1Var5, dia1.RELEASE_DATE});
        x = bma1.b.u("YourLibraryX.playlistCustomSortOption");
    }

    public ozb1(Context context, String str, s4b1 s4b1Var, as3 as3Var, ut71 ut71Var, evm1 evm1Var, bma1 bma1Var) {
        this.a = as3Var;
        this.b = bma1Var;
        this.c = new idd1(new gga1(s4b1Var, (byte) 27));
        this.d = new idd1(new m551(ut71Var, context, str, (byte) 27));
        dma1 dma1VarF = f();
        nda1 nda1Var = new nda1(0, this, ozb1.class, "commonDefaultSortOption", "commonDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 14);
        ArrayList arrayList = r;
        this.e = new yt91(dma1VarF, arrayList, nda1Var, (byte) 22);
        dma1 dma1VarF2 = f();
        boolean z = evm1Var.z();
        dia1 dia1Var = dia1.RECENTLY_UPDATED;
        Collection collection = q;
        this.f = new yt91(dma1VarF2, z ? o7h.O0(dia1Var, collection) : collection, new nda1(0, this, ozb1.class, "artistDefaultSortOption", "artistDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 6), (byte) 22);
        this.g = new yt91(f(), evm1Var.D() ? w : arrayList, new nda1(0, this, ozb1.class, "commonDefaultSortOption", "commonDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 5), (byte) 22);
        dma1 dma1VarF3 = f();
        boolean zA = evm1Var.A();
        ArrayList arrayList2 = s;
        this.h = new yt91(dma1VarF3, zA ? o7h.O0(dia1Var, arrayList2) : arrayList2, new nda1(0, this, ozb1.class, "playlistDefaultSortOption", "playlistDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 12), (byte) 22);
        this.i = new yt91(f(), t, new nda1(0, this, ozb1.class, "commonDefaultSortOption", "commonDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 13), (byte) 22);
        this.j = new yt91(f(), arrayList, new nda1(0, this, ozb1.class, "commonDefaultSortOption", "commonDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 9), (byte) 22);
        this.k = new yt91(f(), f37p, new nda1(0, this, ozb1.class, "commonDefaultSortOption", "commonDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 8), (byte) 22);
        this.l = new yt91(f(), arrayList, new nda1(0, this, ozb1.class, "commonDefaultSortOption", "commonDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 10), (byte) 22);
        this.m = new yt91(f(), u, l4b1.S0, (byte) 22);
        this.n = new yt91(f(), v, new nda1(0, this, ozb1.class, "eventDefaultSortOption", "eventDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 11), (byte) 22);
        this.o = new yt91(f(), arrayList, new nda1(0, this, ozb1.class, "commonDefaultSortOption", "commonDefaultSortOption()Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/SortOption;", 0, (byte) 7), (byte) 22);
    }

    @Override // p.td41
    public final List a(mml mmlVar, List list) {
        return (List) g(h(mmlVar, list)).c;
    }

    @Override // p.td41
    public final void b(as3 as3Var) {
        hma1 hma1VarEdit = f().edit();
        hma1VarEdit.d(this.b, as3Var.name());
        hma1VarEdit.h();
    }

    @Override // p.td41
    public final as3 c() {
        String strE = f().e(this.b, this.a.name());
        Enum enumValueOf = null;
        if (strE != null) {
            try {
                enumValueOf = Enum.valueOf(as3.class, strE.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
        }
        if (enumValueOf == null) {
            enumValueOf = as3.b;
        }
        return (as3) enumValueOf;
    }

    @Override // p.td41
    public final dia1 d(mml mmlVar, List list) {
        bma1 bma1Var;
        nzb1 nzb1VarH = h(mmlVar, list);
        yt91 yt91VarG = g(nzb1VarH);
        bma1 bma1Var2 = uo31.b;
        Enum enumValueOf = null;
        switch (nzb1VarH.ordinal()) {
            case 0:
                bma1Var = uo31.e;
                break;
            case 1:
                bma1Var = uo31.d;
                break;
            case 2:
                bma1Var = uo31.h;
                break;
            case 3:
                bma1Var = uo31.i;
                break;
            case 4:
                bma1Var = uo31.f;
                break;
            case 5:
                bma1Var = uo31.g;
                break;
            case 6:
                bma1Var = uo31.j;
                break;
            case 7:
                bma1Var = uo31.c;
                break;
            case 8:
                bma1Var = uo31.k;
                break;
            case 9:
                bma1Var = uo31.l;
                break;
            case 10:
                bma1Var = uo31.m;
                break;
            default:
                eg.o();
                return null;
        }
        Function0 function0 = (Function0) yt91VarG.d;
        List list2 = (List) yt91VarG.c;
        dia1 dia1Var = (dia1) function0.invoke();
        String strF = ((dma1) yt91VarG.b).f(bma1Var);
        if (strF != null) {
            try {
                enumValueOf = Enum.valueOf(dia1.class, strF.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
        }
        if (enumValueOf == null) {
            enumValueOf = dia1Var;
        }
        dia1 dia1Var2 = (dia1) enumValueOf;
        if (!list2.contains(dia1Var2)) {
            dia1Var2 = dia1Var;
        }
        if (list2.contains(dia1Var2)) {
            return dia1Var2;
        }
        return list2.contains(dia1Var) ? dia1Var : dia1.b;
    }

    @Override // p.td41
    public final void e(dia1 dia1Var, mml mmlVar, List list) {
        bma1 bma1Var;
        nzb1 nzb1VarH = h(mmlVar, list);
        yt91 yt91VarG = g(nzb1VarH);
        bma1 bma1Var2 = uo31.b;
        switch (nzb1VarH.ordinal()) {
            case 0:
                bma1Var = uo31.e;
                break;
            case 1:
                bma1Var = uo31.d;
                break;
            case 2:
                bma1Var = uo31.h;
                break;
            case 3:
                bma1Var = uo31.i;
                break;
            case 4:
                bma1Var = uo31.f;
                break;
            case 5:
                bma1Var = uo31.g;
                break;
            case 6:
                bma1Var = uo31.j;
                break;
            case 7:
                bma1Var = uo31.c;
                break;
            case 8:
                bma1Var = uo31.k;
                break;
            case 9:
                bma1Var = uo31.l;
                break;
            case 10:
                bma1Var = uo31.m;
                break;
            default:
                eg.o();
                return;
        }
        dia1 dia1Var2 = (dia1) ((Function0) yt91VarG.d).invoke();
        List list2 = (List) yt91VarG.c;
        if (!list2.contains(dia1Var)) {
            dia1Var = list2.contains(dia1Var2) ? dia1Var2 : dia1.b;
        }
        String strName = dia1Var.name();
        hma1 hma1VarEdit = ((dma1) yt91VarG.b).edit();
        hma1VarEdit.d(bma1Var, strName);
        hma1VarEdit.h();
    }

    public final dma1 f() {
        return (dma1) this.d.getValue();
    }

    public final yt91 g(nzb1 nzb1Var) {
        switch (nzb1Var.ordinal()) {
            case 0:
                return this.g;
            case 1:
                return this.f;
            case 2:
                return this.k;
            case 3:
                return this.l;
            case 4:
                return this.h;
            case 5:
                return this.i;
            case 6:
                return this.m;
            case 7:
                return this.e;
            case 8:
                return this.n;
            case 9:
                return this.o;
            case 10:
                return this.j;
            default:
                eg.o();
                return null;
        }
    }

    public final nzb1 h(mml mmlVar, List list) {
        boolean zBooleanValue = ((Boolean) this.c.getValue()).booleanValue();
        nzb1 nzb1Var = nzb1.e;
        if (zBooleanValue || (mmlVar instanceof iml)) {
            return nzb1Var;
        }
        if (mmlVar instanceof lml) {
            return nzb1.g;
        }
        jd11 jd11Var = rc11.a;
        if (h4p1.p(list, jd11Var.b(e5c0.class))) {
            return nzb1.b;
        }
        if (h4p1.p(list, jd11Var.b(y4c0.class))) {
            return nzb1.a;
        }
        if (!h4p1.p(list, jd11Var.b(y5c0.class))) {
            if (h4p1.p(list, jd11Var.b(z5c0.class))) {
                return nzb1.f;
            }
            if (h4p1.p(list, jd11Var.b(g5c0.class))) {
                return nzb1.c;
            }
            if (h4p1.p(list, jd11Var.b(b5c0.class))) {
                return nzb1.d;
            }
            if (h4p1.p(list, jd11Var.b(r5c0.class))) {
                return nzb1.i;
            }
            if (h4p1.p(list, jd11Var.b(f5c0.class))) {
                return nzb1.t;
            }
            return h4p1.p(list, jd11Var.b(j5c0.class)) ? nzb1.X : nzb1.h;
        }
        return nzb1Var;
    }
}
