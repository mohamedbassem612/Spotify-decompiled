package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromCallable;
import j$.time.Clock;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sqm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqm(ujr ujrVar, akr akrVar, wjr wjrVar) {
        super(0);
        this.a = (byte) 24;
        this.b = akrVar;
        this.c = wjrVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        String str;
        YearMonth yearMonthNow;
        qtb0 qtb0Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 3;
        Object obj = null;
        Object[] objArr = 0;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((iu30) obj3).invoke(new snh0((vy30) obj2));
                return rih1Var;
            case 1:
                btm btmVar = (btm) obj3;
                i8h1 i8h1Var = (i8h1) btmVar.i.get();
                l3l0 l3l0Var = (l3l0) btmVar.j.getValue();
                l3l0Var.getClass();
                x6h1 x6h1VarC = l3l0Var.a.c();
                x6h1VarC.i.add(new a7h1("remove_note_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T((c9n) obj2, (o8n) null, 0, new awe(btmVar, objArr == true ? 1 : 0, (byte) 26), 3);
                return rih1Var;
            case 2:
                ftm ftmVar = (ftm) obj3;
                a1r0 a1r0Var = ftmVar.c;
                yho0 yho0Var = (yho0) obj2;
                boolean z2 = yho0Var.c;
                som somVar = yho0Var.a;
                if (z2) {
                    String str2 = somVar.a;
                    String strV0 = ihc1.V0(str2, ':', str2);
                    htm htmVar = ftmVar.b;
                    String str3 = htmVar.b;
                    String str4 = htmVar.c;
                    String str5 = htmVar.d;
                    Uri.Builder builderAppendQueryParameter = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-management:menu:".concat(strV0)).appendQueryParameter("context_uri", str3).appendQueryParameter("item_uri", str4);
                    if (str5 != null) {
                        builderAppendQueryParameter.appendQueryParameter("list_item_id", str5);
                    }
                    a1r0.j(a1r0Var, builderAppendQueryParameter.build().toString(), (String) null, (Bundle) null, false, 14);
                } else {
                    String str6 = somVar.a;
                    String strV1 = ihc1.V0(str6, ':', str6);
                    String str7 = yho0Var.b.a;
                    str = str7 != null ? str7 : "";
                    String str8 = somVar.d;
                    Uri.Builder builderAppendQueryParameter2 = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-report:action:".concat(strV1)).appendQueryParameter("author_name", str);
                    if (str8 != null) {
                        builderAppendQueryParameter2.appendQueryParameter("creator_uri", str8);
                    }
                    a1r0.j(a1r0Var, builderAppendQueryParameter2.build().toString(), (String) null, (Bundle) null, false, 14);
                }
                return rih1Var;
            case 3:
                mtm mtmVar = (mtm) obj3;
                jqd0 jqd0Var = mtmVar.m;
                String strD = mtmVar.c.d();
                jqd0Var.b = true;
                i8h1 i8h1Var2 = (i8h1) ((ynb0) jqd0Var.c).get();
                x6h1 x6h1VarC2 = ((txk0) jqd0Var.d).b.c();
                x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strD)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                hma1 hma1VarEdit = mtmVar.l.a.edit();
                hma1VarEdit.a(kio0.b, true);
                hma1VarEdit.g();
                ((ven0) obj2).setValue(Boolean.FALSE);
                return rih1Var;
            case 4:
                wtm wtmVar = (wtm) obj3;
                yho0 yho0Var2 = (yho0) obj2;
                som somVar2 = yho0Var2.a;
                String str9 = somVar2.a;
                String strV2 = ihc1.V0(str9, ':', str9);
                String str10 = yho0Var2.b.a;
                str = str10 != null ? str10 : "";
                String str11 = somVar2.d;
                Uri.Builder builderAppendQueryParameter3 = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-report:action:".concat(strV2)).appendQueryParameter("author_name", str);
                if (str11 != null) {
                    builderAppendQueryParameter3.appendQueryParameter("creator_uri", str11);
                }
                a1r0.j(wtmVar.c, builderAppendQueryParameter3.build().toString(), (String) null, (Bundle) null, false, 14);
                return rih1Var;
            case 5:
                String str12 = ((jxm) obj2).a;
                uwr uwrVar = cbx.a;
                ((iu30) obj3).invoke(new hxm(str12, ((yex) zex.a.d).e));
                return rih1Var;
            case 6:
                String str13 = ((gym) obj2).a;
                uwr uwrVar2 = cbx.a;
                ((iu30) obj3).invoke(new eym(str13, ((yex) zex.a.d).e));
                return rih1Var;
            case 7:
                h0o h0oVar = (h0o) obj2;
                iu30 iu30Var = (iu30) obj3;
                g0o g0oVar = h0oVar.d;
                String str14 = h0oVar.b;
                if (!(g0oVar instanceof f0o)) {
                    if ((g0oVar instanceof d0o) && str14 != null && str14.length() != 0) {
                        iu30Var.invoke(new zzn(str14));
                    } else if (h0oVar.e || h0oVar.f || g0oVar.a().size() > 1) {
                        iu30Var.invoke(yzn.a);
                    } else if (str14 != null && str14.length() != 0) {
                        iu30Var.invoke(new zzn(str14));
                    }
                }
                return rih1Var;
            case 8:
                ((iu30) obj3).invoke(((t0o) obj2).a);
                return rih1Var;
            case 9:
                ((iu30) obj3).invoke("spotify:user:" + ((m3o) obj2).d);
                return rih1Var;
            case 10:
                ((iu30) obj3).invoke((bxn) obj2);
                return rih1Var;
            case 11:
                ((iu30) obj3).invoke((c3o) obj2);
                return rih1Var;
            case 12:
                if (!((r4o) obj3).a) {
                    return new qbo0();
                }
                tl7 tl7VarU = h7p1.u((ViewGroup) obj2);
                return tl7VarU == null ? new qbo0() : tl7VarU;
            case 13:
                return new kpg0((xpw) ((fgo) obj3).a.invoke((oud) obj2), kfo.f);
            case 14:
                gmo gmoVar = (gmo) obj2;
                mmo mmoVar = gmoVar.a;
                View view = (View) obj3;
                return (view == null || !(mmoVar.k() instanceof b6w0)) ? gmoVar.b(mmoVar.k()) : view;
            case 15:
                wzn wznVar = (wzn) obj3;
                Function0 function0 = ((s0s) wznVar.b).e;
                if (function0 != null) {
                    function0.invoke();
                }
                wzn.b(wznVar, (cir0) obj2);
                return rih1Var;
            case 16:
                ((wen0) obj3).l((lvb1) obj2);
                return rih1Var;
            case 17:
                return jch0.w((Context) obj3, ((u4r) obj2).a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                LocalDate localDate = ((v720) obj3).c;
                if (localDate == null || (yearMonthNow = YearMonth.from(localDate)) == null) {
                    yearMonthNow = YearMonth.now((Clock) obj2);
                }
                return v8r.q(yearMonthNow);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((iu30) obj3).invoke(rih1Var);
                ((Function0) ((umf0) obj2).e).invoke();
                return rih1Var;
            case 20:
                gdr gdrVar = (gdr) obj2;
                fdr fdrVar = (fdr) obj3;
                int iOrdinal = fdrVar.ordinal();
                if (iOrdinal == 0) {
                    gdrVar.getClass();
                    String string = UUID.randomUUID().toString();
                    hma1 hma1VarEdit2 = gdrVar.a.edit();
                    hma1VarEdit2.d(gdr.c, string);
                    hma1VarEdit2.d(gdr.d, o6p1.m(fdrVar));
                    hma1VarEdit2.g();
                    return string;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return (String) gdrVar.b().a;
                    }
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    String str15 = (String) gdrVar.b().a;
                    hma1 hma1VarEdit3 = gdrVar.a.edit();
                    hma1VarEdit3.f(gdr.c);
                    hma1VarEdit3.f(gdr.d);
                    hma1VarEdit3.g();
                    return str15;
                }
                mmr0 mmr0VarB = gdrVar.b();
                dma1 dma1Var = gdrVar.a;
                String str16 = (String) mmr0VarB.a;
                fdr fdrVar2 = (fdr) mmr0VarB.b;
                fdr fdrVar3 = fdr.LOGGED_IN;
                if (str16 != null && fdrVar2 == fdr.LOGGED_OUT) {
                    hma1 hma1VarEdit4 = dma1Var.edit();
                    hma1VarEdit4.d(gdr.c, str16);
                    hma1VarEdit4.d(gdr.d, o6p1.m(fdrVar3));
                    hma1VarEdit4.g();
                    return str16;
                }
                String string2 = UUID.randomUUID().toString();
                hma1 hma1VarEdit5 = dma1Var.edit();
                hma1VarEdit5.d(gdr.c, string2);
                hma1VarEdit5.d(gdr.d, o6p1.m(fdrVar3));
                hma1VarEdit5.g();
                return string2;
            case 21:
                xtb0 xtb0Var = (xtb0) obj3;
                List list = xtb0Var.h().l;
                qtb0 qtb0Var2 = (qtb0) o7h.s0(list);
                if (!u890.j(qtb0Var2 != null ? qtb0Var2.l : null, obj2)) {
                    for (Object obj4 : list) {
                        if (((qtb0) obj4).l.equals(obj2)) {
                            obj = obj4;
                            qtb0Var = (qtb0) obj;
                            if (qtb0Var != null && qtb0Var.p <= 0) {
                                z = true;
                            }
                        }
                    }
                    qtb0Var = (qtb0) obj;
                    if (qtb0Var != null) {
                        z = true;
                    }
                } else if (((err0) xtb0Var.e.c).s() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                return ((Flowable) obj3).j((xh80) ((h72) ((a1q) obj2).b).i).J(b6j0.T0);
            case 23:
                mhr mhrVar = (mhr) obj3;
                mhrVar.l.a(Completable.u(300L, TimeUnit.MILLISECONDS, mhrVar.d).c(new CompletableFromCallable(new e71(mhrVar, (String) obj2, (byte) 4))).subscribe());
                return rih1Var;
            case 24:
                th30 th30Var = ((akr) obj3).g;
                zf30 zf30Var = ((wjr) obj2).a;
                if (!th30Var.L) {
                    nu9 nu9Var = new nu9(th30Var);
                    nu9Var.o(0, 2130772011, 0, 0);
                    nu9Var.m(zf30Var);
                    int i = ujr.y1;
                    if (th30Var.U()) {
                        nu9Var.g(true, true);
                    } else {
                        nu9Var.f();
                    }
                }
                return rih1Var;
            case 25:
                ((clr) obj3).b.e((w2z) obj2);
                return rih1Var;
            case 26:
                rl1 rl1Var = (rl1) obj3;
                return rl1Var.b ? ((Single) obj2).flatMapObservable(new wcr(rl1Var, b2)) : Observable.just(kkn.b);
            case 27:
                mqr mqrVar = ((nqr) obj3).e;
                if (mqrVar != null) {
                    mqrVar.a.invoke(new ban((String) obj2));
                }
                return rih1Var;
            case 28:
                ((Disposable) obj3).dispose();
                ((MobiusLoop) obj2).dispose();
                return rih1Var;
            default:
                kbp kbpVar = (kbp) ((iir) obj3).b;
                xd2 xd2Var = new xd2((ven0) obj2, (byte) 8);
                kbpVar.getClass();
                return new tvr(xd2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqm(n0o n0oVar, h0o h0oVar, iu30 iu30Var) {
        super(0);
        this.a = (byte) 7;
        this.c = h0oVar;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqm(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
