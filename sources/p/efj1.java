package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class efj1 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ maa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ efj1(maa maaVar, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = maaVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lfo lfoVar = this.e;
        switch (b) {
            case 0:
                efj1 efj1Var = new efj1((hw2) lfoVar, (lnm) obj5, (byte) 0);
                efj1Var.b = (afj1) obj2;
                efj1Var.c = (rej1) obj3;
                efj1Var.d = (tqw) obj4;
                efj1Var.invokeSuspend(rih1Var);
                break;
            case 1:
                efj1 efj1Var2 = new efj1((yup0) lfoVar, (lnm) obj5, (byte) 1);
                efj1Var2.b = (ewj1) obj;
                efj1Var2.c = (cwj1) obj2;
                efj1Var2.d = (dwj1) obj3;
                efj1Var2.invokeSuspend(rih1Var);
                break;
            case 2:
                efj1 efj1Var3 = new efj1((o6k1) lfoVar, (lnm) obj5, (byte) 2);
                efj1Var3.b = (n6k1) obj2;
                efj1Var3.c = (k6k1) obj3;
                efj1Var3.d = (tqw) obj4;
                efj1Var3.invokeSuspend(rih1Var);
                break;
            case 3:
                efj1 efj1Var4 = new efj1((pt) lfoVar, (lnm) obj5, (byte) 3);
                efj1Var4.b = (gek1) obj;
                efj1Var4.c = (hek1) obj2;
                efj1Var4.d = (fek1) obj3;
                efj1Var4.invokeSuspend(rih1Var);
                break;
            case 4:
                efj1 efj1Var5 = new efj1(lfoVar, (lnm) obj5, (byte) 4);
                efj1Var5.b = (r5l1) obj2;
                efj1Var5.c = (n5l1) obj3;
                efj1Var5.d = (tqw) obj4;
                efj1Var5.invokeSuspend(rih1Var);
                break;
            case 5:
                efj1 efj1Var6 = new efj1((n0o) lfoVar, (lnm) obj5, (byte) 5);
                efj1Var6.b = (k7l1) obj2;
                efj1Var6.c = (i7l1) obj3;
                efj1Var6.d = (tqw) obj4;
                efj1Var6.invokeSuspend(rih1Var);
                break;
            case 6:
                efj1 efj1Var7 = new efj1((suh1) lfoVar, (lnm) obj5, (byte) 6);
                efj1Var7.b = (wxl1) obj2;
                efj1Var7.c = (uxl1) obj3;
                efj1Var7.d = (tqw) obj4;
                efj1Var7.invokeSuspend(rih1Var);
                break;
            default:
                efj1 efj1Var8 = new efj1((rwj) lfoVar, (lnm) obj5, (byte) 7);
                efj1Var8.b = (abm1) obj;
                efj1Var8.c = (yam1) obj3;
                efj1Var8.d = (tqw) obj4;
                efj1Var8.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        uwj1 uwj1Var;
        y1k1 y1k1Var;
        y1k1 y1k1Var2;
        a7e a7eVar;
        switch (this.a) {
            case 0:
                afj1 afj1Var = (afj1) this.b;
                rej1 rej1Var = (rej1) this.c;
                tqw tqwVar = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(rej1Var, rej1.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar != null) {
                    ((lzn0) this.e.f).a(afj1Var.a.e, n3o1.y(tqwVar), (Bundle) null);
                }
                return rih1.a;
            case 1:
                ewj1 ewj1Var = (ewj1) this.b;
                cwj1 cwj1Var = (cwj1) this.c;
                dwj1 dwj1Var = (dwj1) this.d;
                hm5.M(obj);
                owf1 owf1Var = (owf1) this.e.c;
                yvj1 yvj1Var = dwj1Var.a;
                int iOrdinal = cwj1Var.a.ordinal();
                if (iOrdinal == 0) {
                    uwj1Var = uwj1.a;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    uwj1Var = uwj1.b;
                }
                if (yvj1Var instanceof wvj1) {
                    y1k1Var = null;
                } else {
                    if (!(yvj1Var instanceof yvj1)) {
                        eg.o();
                        return null;
                    }
                    y1k1Var = yvj1Var.b;
                }
                vwj1 vwj1Var = (vwj1) owf1Var.b;
                synchronized (vwj1Var) {
                    try {
                        int iOrdinal2 = uwj1Var.ordinal();
                        if (iOrdinal2 == 0) {
                            y1k1Var2 = null;
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            y1k1Var2 = y1k1Var;
                        }
                        vwj1Var.d = y1k1Var2;
                        vwj1Var.b.m((Object) null, Optional.ofNullable(y1k1Var));
                        a7eVar = vwj1Var.g;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (a7eVar != null) {
                    a7eVar.invoke(y1k1Var, uwj1Var);
                }
                ewj1Var.a.invoke(dwj1Var.a, cwj1Var.a);
                return rih1.a;
            case 2:
                n6k1 n6k1Var = (n6k1) this.b;
                k6k1 k6k1Var = (k6k1) this.c;
                tqw tqwVar2 = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(k6k1Var, k6k1.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar2 != null) {
                    tv80 tv80VarY = n3o1.y(tqwVar2);
                    o6k1 o6k1Var = this.e;
                    Bundle bundle = new Bundle();
                    bundle.putString("origin", n6k1Var.a.h);
                    m6k1 m6k1Var = n6k1Var.a;
                    String str = m6k1Var.b;
                    String str2 = m6k1Var.i;
                    if (str2.length() != 0) {
                        char c = ihc1.i0(str, '?') ? '&' : '?';
                        str = str + c + Uri.encode("entrypointIdentifier") + "=" + Uri.encode(str2);
                    }
                    o6k1Var.d.a(str, tv80VarY, bundle);
                }
                return rih1.a;
            case 3:
                pt ptVar = this.e;
                gek1 gek1Var = (gek1) this.b;
                hek1 hek1Var = (hek1) this.c;
                fek1 fek1Var = (fek1) this.d;
                hm5.M(obj);
                if (fek1Var instanceof cek1) {
                    if (!pt.G(hek1Var)) {
                        ptVar.E(gek1Var, hek1Var);
                    }
                } else if (fek1Var instanceof dek1) {
                    ptVar.E(gek1Var, hek1Var);
                } else {
                    if (!(fek1Var instanceof eek1)) {
                        eg.o();
                        return null;
                    }
                    ptVar.E(gek1Var, hek1Var);
                    x1i1.a((x1i1) ptVar.i, new z740(1, ((lm10) ((i5y0) ptVar.e).d).a, "generate"), 6);
                }
                return rih1.a;
            case 4:
                r5l1 r5l1Var = (r5l1) this.b;
                n5l1 n5l1Var = (n5l1) this.c;
                tqw tqwVar3 = (tqw) this.d;
                hm5.M(obj);
                if ((n5l1Var instanceof n5l1) && (r5l1Var instanceof q5l1) && tqwVar3 != null) {
                    this.e.b.a(((q5l1) r5l1Var).a, n3o1.y(tqwVar3), (Bundle) null);
                }
                return rih1.a;
            case 5:
                k7l1 k7l1Var = (k7l1) this.b;
                i7l1 i7l1Var = (i7l1) this.c;
                tqw tqwVar4 = (tqw) this.d;
                hm5.M(obj);
                if (i7l1Var != null) {
                    ((lzn0) this.e.e).a(k7l1Var.d, cvl1.d(tqwVar4), (Bundle) null);
                    return rih1.a;
                }
                eg.o();
                return null;
            case 6:
                rih1 rih1Var = rih1.a;
                suh1 suh1Var = this.e;
                wxl1 wxl1Var = (wxl1) this.b;
                uxl1 uxl1Var = (uxl1) this.c;
                tqw tqwVar5 = (tqw) this.d;
                hm5.M(obj);
                if (uxl1Var == null) {
                    eg.o();
                    return null;
                }
                z740 z740VarA = ((iz31) suh1Var.f).a();
                if (!wxl1Var.b || z740VarA == null) {
                    String strI = cgj1.I(wxl1Var.a);
                    if (strI != null) {
                        a1r0.m((a1r0) suh1Var.d, strI, tqwVar5 != null ? n3o1.y(tqwVar5) : null, (Bundle) null, 12);
                    }
                } else {
                    x1i1.a((x1i1) suh1Var.e, z740VarA, 6);
                }
                return rih1Var;
            default:
                abm1 abm1Var = (abm1) this.b;
                yam1 yam1Var = (yam1) this.c;
                tqw tqwVar6 = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(yam1Var, yam1.a)) {
                    eg.o();
                    return null;
                }
                rwj rwjVar = this.e;
                String str3 = (String) abm1Var.a.q.get("wrapped.globalUri");
                if (str3 != null) {
                    lzn0 lzn0Var = (lzn0) rwjVar.d;
                    tv80 tv80VarY2 = tqwVar6 != null ? n3o1.y(tqwVar6) : null;
                    lzn0Var.f(new dwn0(str3, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY2 != null ? new bwn0(tv80VarY2) : null));
                }
                return rih1.a;
        }
    }
}
