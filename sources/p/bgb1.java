package p;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bgb1 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgb1(nwj nwjVar, bpb1 bpb1Var, lnm lnmVar) {
        super(5, lnmVar);
        this.a = (byte) 9;
        this.c = nwjVar;
        this.d = bpb1Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                bgb1 bgb1Var = new bgb1((avl1) obj6, (lnm) obj5, (byte) 0);
                bgb1Var.b = (eob1) obj2;
                bgb1Var.c = (s600) obj3;
                bgb1Var.invokeSuspend(rih1Var);
                break;
            case 1:
                bgb1 bgb1Var2 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 1);
                bgb1Var2.b = (pib1) obj3;
                bgb1Var2.c = (tqw) obj4;
                bgb1Var2.invokeSuspend(rih1Var);
                break;
            case 2:
                bgb1 bgb1Var3 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 2);
                bgb1Var3.b = (ycd1) obj2;
                bgb1Var3.c = (wcd1) obj3;
                bgb1Var3.invokeSuspend(rih1Var);
                break;
            case 3:
                bgb1 bgb1Var4 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 3);
                bgb1Var4.b = (wde1) obj;
                bgb1Var4.c = (vde1) obj3;
                bgb1Var4.invokeSuspend(rih1Var);
                break;
            case 4:
                bgb1 bgb1Var5 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 4);
                bgb1Var5.b = (l8f1) obj3;
                bgb1Var5.c = (tqw) obj4;
                bgb1Var5.invokeSuspend(rih1Var);
                break;
            case 5:
                bgb1 bgb1Var6 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 5);
                bgb1Var6.b = (x8f1) obj3;
                bgb1Var6.c = (tqw) obj4;
                bgb1Var6.invokeSuspend(rih1Var);
                break;
            case 6:
                bgb1 bgb1Var7 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 6);
                bgb1Var7.b = (ref1) obj3;
                bgb1Var7.c = (tqw) obj4;
                bgb1Var7.invokeSuspend(rih1Var);
                break;
            case 7:
                bgb1 bgb1Var8 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 7);
                bgb1Var8.b = (g3j1) obj3;
                bgb1Var8.c = (tqw) obj4;
                bgb1Var8.invokeSuspend(rih1Var);
                break;
            case 8:
                bgb1 bgb1Var9 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 8);
                bgb1Var9.b = (d4j1) obj2;
                bgb1Var9.c = (c4j1) obj3;
                bgb1Var9.invokeSuspend(rih1Var);
                break;
            case 9:
                bgb1 bgb1Var10 = new bgb1((nwj) this.c, (bpb1) obj6, (lnm) obj5);
                bgb1Var10.b = (iej1) obj3;
                bgb1Var10.invokeSuspend(rih1Var);
                break;
            case 10:
                bgb1 bgb1Var11 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 10);
                bgb1Var11.b = (hwj1) obj2;
                bgb1Var11.c = (tqw) obj4;
                bgb1Var11.invokeSuspend(rih1Var);
                break;
            case 11:
                bgb1 bgb1Var12 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 11);
                bgb1Var12.b = (q2k1) obj2;
                bgb1Var12.c = (m2k1) obj3;
                bgb1Var12.invokeSuspend(rih1Var);
                break;
            default:
                bgb1 bgb1Var13 = new bgb1((avl1) obj6, (lnm) obj5, (byte) 12);
                bgb1Var13.b = (c5m1) obj3;
                bgb1Var13.c = (tqw) obj4;
                bgb1Var13.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        ak90 xj90Var;
        bee1 bee1Var;
        l0l l0lVarC;
        ou80 ou80Var;
        ou80 ou80Var2;
        byte b = this.a;
        int i = 3;
        Object obj2 = this.d;
        rih1 rih1Var = rih1.a;
        Float f = null;
        str = null;
        String str = null;
        switch (b) {
            case 0:
                eob1 eob1Var = (eob1) this.b;
                s600 s600Var = (s600) this.c;
                hm5.M(obj);
                h7e0 h7e0Var = eob1Var.b;
                if (!(h7e0Var instanceof j8e0)) {
                    return rih1Var;
                }
                vr51 vr51Var = ((dgb1) obj2).h;
                wj90 wj90Var = eob1Var.g;
                j8e0 j8e0Var = (j8e0) h7e0Var;
                int i2 = j8e0Var.a;
                zuc0 zuc0Var = j8e0Var.e;
                bk90 bk90Var = ((wdb1) vr51Var.b).b;
                int iOrdinal = s600Var.ordinal();
                if (iOrdinal == 0) {
                    xj90Var = new xj90(i2, zuc0Var, wj90Var);
                } else if (iOrdinal == 1) {
                    xj90Var = new zj90(i2, zuc0Var);
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    xj90Var = new tj90(i2, zuc0Var);
                }
                bk90Var.a(xj90Var);
                return rih1Var;
            case 1:
                yxb0 yxb0Var = (yxb0) obj2;
                los losVar = (los) yxb0Var.c;
                pib1 pib1Var = (pib1) this.b;
                tqw tqwVar = (tqw) this.c;
                hm5.M(obj);
                if (uib1.a[pib1Var.ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                losVar.c(new ccb1(yxb0Var, tqwVar, (byte) 5));
                losVar.a(ixb.c);
                return rih1Var;
            case 2:
                ycd1 ycd1Var = (ycd1) this.b;
                wcd1 wcd1Var = (wcd1) this.c;
                hm5.M(obj);
                if (!u890.j(wcd1Var, wcd1.a)) {
                    eg.o();
                    return null;
                }
                Float f2 = ycd1Var.d;
                if (f2 != null) {
                    float fFloatValue = f2.floatValue();
                    Float f3 = ycd1Var.a.b;
                    f = new Float(fFloatValue * (f3 != null ? f3.floatValue() : 1.0f));
                }
                if (f == null) {
                    return rih1Var;
                }
                ((bdd1) obj2).b.invoke(new vsa1(f.floatValue()));
                return rih1Var;
            case 3:
                dfm dfmVar = (dfm) obj2;
                wde1 wde1Var = (wde1) this.b;
                vde1 vde1Var = (vde1) this.c;
                hm5.M(obj);
                if (!u890.j(vde1Var, vde1.a)) {
                    eg.o();
                    return null;
                }
                xab1 xab1Var = (xab1) dfmVar.i;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                boolean z = wde1Var.g;
                int i3 = wde1Var.h;
                if (z && i3 == 3 && (((l0lVarC = ((zuf) dfmVar.g).a.c()) != null && l0lVarC.l()) || l0lVarC == null)) {
                    bee1Var = new bee1(dfmVar, wde1Var, (lnm) null, (byte) 0);
                } else {
                    bee1Var = (!wde1Var.g || i3 == 3) ? null : new bee1(dfmVar, wde1Var, (lnm) null, (byte) 1);
                }
                if (bee1Var == null) {
                    return rih1Var;
                }
                dfmVar.i = fn31.T((llm) dfmVar.h, (o8n) null, 0, new i7u0(bee1Var, (lnm) null, (byte) 11), 3);
                return rih1Var;
            case 4:
                z72 z72Var = (z72) obj2;
                lzn0 lzn0Var = (lzn0) z72Var.f;
                l8f1 l8f1Var = (l8f1) this.b;
                tqw tqwVar2 = (tqw) this.c;
                hm5.M(obj);
                if (l8f1Var instanceof h8f1) {
                    Parcelable.Creator creator = lik1.CREATOR;
                    String str2 = ((h8f1) l8f1Var).b;
                    if (oap1.o(str2)) {
                        lzn0Var.a(str2, cvl1.d(tqwVar2), (Bundle) null);
                    } else {
                        n57.s("Invalid URI, won't navigate. Uri: ".concat(str2));
                    }
                } else if (l8f1Var instanceof i8f1) {
                    String str3 = ((i8f1) l8f1Var).b;
                    tv80 tv80VarD = cvl1.d(tqwVar2);
                    lik1 lik1Var = nik1.y4;
                    fm6 fm6Var = new fm6(str3, lik1Var, (String) null, new bm6(false, false, false, false, false, (ok51) null, false, (p860) null, 2043));
                    if (((em6) z72Var.t).a.a()) {
                        ((yhm) z72Var.i).a(fm6Var, tv80VarD);
                    } else {
                        mfm mfmVarA = ((i4q) z72Var.h).a(lik1Var);
                        Observable observableA = ((js6) z72Var.g).a(fm6Var);
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        mfm.b(mfmVarA, observableA, yon1.V0(), new bjm(6, str3, (String) null), tv80VarD, 16);
                    }
                } else if (l8f1Var instanceof k8f1) {
                    Parcelable.Creator creator2 = lik1.CREATOR;
                    String str4 = ((k8f1) l8f1Var).b;
                    if (oap1.o(str4)) {
                        lzn0Var.a(str4, cvl1.d(tqwVar2), (Bundle) null);
                    } else {
                        v8i0.j("Invalid URI, won't navigate. Uri: ", str4);
                    }
                }
                return rih1Var;
            case 5:
                x8f1 x8f1Var = (x8f1) this.b;
                tqw tqwVar3 = (tqw) this.c;
                hm5.M(obj);
                ((b9f1) obj2).c.a(x8f1Var.a, cvl1.d(tqwVar3), (Bundle) null);
                return rih1Var;
            case 6:
                ref1 ref1Var = (ref1) this.b;
                tqw tqwVar4 = (tqw) this.c;
                hm5.M(obj);
                if (ref1Var == null) {
                    eg.o();
                    return null;
                }
                String str5 = ref1Var.a;
                lo60 lo60Var = ((uef1) obj2).b;
                if (tqwVar4 != null) {
                    lo60Var.a(str5, n3o1.y(tqwVar4), (Bundle) null);
                    return rih1Var;
                }
                lo60Var.h(str5);
                return rih1Var;
            case 7:
                rwj rwjVar = (rwj) obj2;
                f3j1 f3j1Var = (g3j1) this.b;
                tqw tqwVar5 = (tqw) this.c;
                hm5.M(obj);
                if ((f3j1Var instanceof c3j1) || (f3j1Var instanceof d3j1)) {
                    return rih1Var;
                }
                if (f3j1Var instanceof f3j1) {
                    z710.d((z710) rwjVar.d, f3j1Var.a, false, 6);
                    return rih1Var;
                }
                if (f3j1Var instanceof e3j1) {
                    ((lzn0) rwjVar.e).a("spotify:genre:0JQ5DAqbMKFImHYGo3eTSg", cvl1.d(tqwVar5), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                d4j1 d4j1Var = (d4j1) this.b;
                c4j1 c4j1Var = (c4j1) this.c;
                hm5.M(obj);
                if (!u890.j(c4j1Var, c4j1.a)) {
                    eg.o();
                    return null;
                }
                String str6 = d4j1Var.b;
                Context context = ((e4j1) obj2).a;
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
                if (clipboardManager == null) {
                    return rih1Var;
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText(null, str6));
                if (Build.VERSION.SDK_INT > 32) {
                    return rih1Var;
                }
                Toast.makeText(context, 2131962053, 0).show();
                return rih1Var;
            case 9:
                iu30 iu30Var = ((nwj) this.c).b;
                iej1 iej1Var = (iej1) this.b;
                hm5.M(obj);
                if (iej1Var instanceof dej1) {
                    dej1 dej1Var = (dej1) iej1Var;
                    int i4 = dej1Var.a;
                    String str7 = dej1Var.b;
                    String str8 = dej1Var.c;
                    int iOrdinal2 = dej1Var.d.ordinal();
                    if (iOrdinal2 == 0) {
                        i = 1;
                    } else if (iOrdinal2 == 1) {
                        i = 2;
                    } else if (iOrdinal2 != 2) {
                        eg.o();
                    }
                    iu30Var.invoke(new etj1(i4, str7, str8, i));
                    return rih1Var;
                }
                if (iej1Var instanceof eej1) {
                    eej1 eej1Var = (eej1) iej1Var;
                    iu30Var.invoke(new jtj1(eej1Var.a, eej1Var.b));
                    return rih1Var;
                }
                if (iej1Var instanceof hej1) {
                    ((bpb1) obj2).m((Object) null, new Integer(((hej1) iej1Var).a));
                    return rih1Var;
                }
                if (iej1Var instanceof fej1) {
                    return rih1Var;
                }
                if (iej1Var instanceof gej1) {
                    gej1 gej1Var = (gej1) iej1Var;
                    iu30Var.invoke(new htj1(gej1Var.a, gej1Var.b, gej1Var.c));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 10:
                hwj1 hwj1Var = (hwj1) this.b;
                tqw tqwVar6 = (tqw) this.c;
                hm5.M(obj);
                if (hwj1Var.a) {
                    a1r0.i((a1r0) ((ynb0) ((qhm) obj2).d).get(), nik1.v1.a, (tqwVar6 == null || (ou80Var = n3o1.y(tqwVar6).a) == null) ? null : ou80Var.a, (Bundle) null, 4);
                }
                return rih1Var;
            case 11:
                q2k1 q2k1Var = (q2k1) this.b;
                m2k1 m2k1Var = (m2k1) this.c;
                hm5.M(obj);
                if ((q2k1Var instanceof o2k1) && ((o2k1) q2k1Var).b && m2k1Var != null) {
                    ((csc1) ((ynb0) ((cd6) obj2).i).get()).a((tv80) null);
                }
                return rih1Var;
            default:
                vbe1 vbe1Var = (vbe1) obj2;
                c5m1 c5m1Var = (c5m1) this.b;
                tqw tqwVar7 = (tqw) this.c;
                hm5.M(obj);
                if (c5m1Var == null) {
                    eg.o();
                    return null;
                }
                String strI = cgj1.I((String) vbe1Var.c);
                if (strI == null) {
                    return rih1Var;
                }
                a1r0 a1r0Var = (a1r0) vbe1Var.f;
                if (tqwVar7 != null && (ou80Var2 = n3o1.y(tqwVar7).a) != null) {
                    str = ou80Var2.a;
                }
                a1r0.j(a1r0Var, strI, str, (Bundle) null, false, 12);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgb1(avl1 avl1Var, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.d = avl1Var;
    }
}
