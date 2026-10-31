package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m3 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        return new m8l0(((md1) this.b).c);
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        lf1 lf1Var = (lf1) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(lf1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.i(iu30Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            irn1.u((qim0) null, j4i.a, (vu30) null, (erl1) null, apo.r(1288269716, new n891(lf1Var, iu30Var, (nf1) this.b, (byte) 6), x340Var2), x340Var2, 24624, 13);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        yg1 yg1Var = (yg1) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(yg1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.i(iu30Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            yg1Var.getClass();
            bh1 bh1Var = (bh1) this.b;
            o6p1.a(yg1Var, bh1Var.f, (qim0) null, iu30Var, bh1Var.e, x340Var2, (i << 6) & 7168);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        tqw tqwVar = (tqw) obj4;
        return ((il3) ((k2q) ((rt01) this.b).c).c).a(new gl3(tqwVar != null ? n3o1.y(tqwVar) : null));
    }

    /* JADX WARN: Code duplicated, block: B:268:0x0c00  */
    /* JADX WARN: Code duplicated, block: B:270:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:272:0x0c09  */
    /* JADX WARN: Code duplicated, block: B:274:0x0c0c  */
    /* JADX WARN: Code duplicated, block: B:275:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:276:0x0c30  */
    /* JADX WARN: Code duplicated, block: B:277:0x0c4f  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        int iC;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        char c;
        d9u0 g9u0Var;
        char c2;
        d9u0 g9u0Var2;
        int i;
        int i2;
        int i3;
        byte b = this.a;
        bpt0 bpt0Var = bpt0.b;
        rih1 rih1Var = rih1.a;
        byte b2 = 4;
        boolean z = true;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                Context context = (Context) obj2;
                ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new l3(composeView, new kdn0(gy50.a), new p811(), context, (n3) obj6, new p811(), (iu30) obj4);
            case 1:
                Context context2 = (Context) obj2;
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new u3(frameLayout, new p811(), context2, (v3) obj6);
            case 2:
                ((Number) obj3).intValue();
                yvk0 yvk0Var = (yvk0) ((qj0) obj6).d;
                yvk0Var.getClass();
                return new trl0(yvk0Var);
            case 3:
                ((Number) obj3).intValue();
                uzl0 uzl0Var = ((lr) obj6).a;
                uzl0Var.getClass();
                return new ozl0(new pzl0(uzl0Var));
            case 4:
                ((Number) obj3).intValue();
                uzl0 uzl0Var2 = (uzl0) ((rwj) obj6).f;
                uzl0Var2.getClass();
                return new gzl0(new jzl0(uzl0Var2), Integer.valueOf(((gs) obj).a));
            case 5:
                ((Number) obj3).intValue();
                uzl0 uzl0Var3 = (uzl0) ((yxb0) obj6).f;
                uzl0Var3.getClass();
                return new fzl0(new jzl0(uzl0Var3));
            case 6:
                ((Number) obj3).intValue();
                uzl0 uzl0Var4 = (uzl0) ((ldo) obj6).d;
                uzl0Var4.getClass();
                return new hzl0(new jzl0(uzl0Var4));
            case 7:
                ((Number) obj3).intValue();
                uzl0 uzl0Var5 = (uzl0) ((res) obj6).h;
                uzl0Var5.getClass();
                return new izl0(new jzl0(uzl0Var5), Integer.valueOf(((iu) obj).b));
            case 8:
                o6u0 o6u0Var = (o6u0) obj;
                ((Number) obj3).intValue();
                return new tjl0(((d70) obj6).a, Integer.valueOf(o6u0Var.a), u2p1.w(o6u0Var.e));
            case 9:
                cm0 cm0Var = (cm0) obj6;
                return ((Observable) cm0Var.c).firstOrError().zipWith(((Flowable) cm0Var.d).z(), rbc.d).observeOn((Scheduler) cm0Var.e).flatMapCompletable(new t7o0(cm0Var, (byte) 5));
            case 10:
                return new zm0((an0) obj6, (iu30) obj4);
            case 11:
                vpk0 vpk0Var = (vpk0) obj;
                lo0 lo0Var = (lo0) obj2;
                zo0 zo0Var = (zo0) obj4;
                jp0 jp0Var = (jp0) obj6;
                r6h1 r6h1Var = vpk0Var.a;
                y6h1 y6h1Var = vpk0Var.b;
                zp0 zp0Var = lo0Var.a;
                String str = zp0Var.c;
                String str2 = zp0Var.f;
                hs10 hs10Var = zp0Var.a;
                boolean z2 = zo0Var instanceof to0;
                es10 es10Var = es10.a;
                b7x b7xVar = b7x.a;
                if (z2) {
                    String str3 = ((to0) zo0Var).a;
                    if (u890.j(hs10Var, gs10.a)) {
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("interested_feedback_option", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like_ad", 2, Collections.singletonMap("reason", str3)), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                    } else if (u890.j(hs10Var, fs10.a)) {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("not_interested_feedback_option", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        if (u890.j(hs10Var, es10Var)) {
                            return jp0.f(vpk0Var, lo0Var, str3);
                        }
                        obj5 = null;
                    }
                    return w7h1Var;
                }
                if (zo0Var instanceof po0) {
                    po0 po0Var = (po0) zo0Var;
                    xx10 xx10Var = po0Var.b;
                    String str4 = po0Var.a;
                    if (xx10Var instanceof tx10) {
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("interested_feedback_option", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like_ad", 2, Collections.singletonMap("reason", str4)), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        if (xx10Var instanceof vx10) {
                            return jp0.f(vpk0Var, lo0Var, str4);
                        }
                        if (xx10Var instanceof sx10) {
                            x6h1 x6h1VarC4 = y6h1Var.c();
                            x6h1VarC4.i.add(new a7h1("neutral_close_ad_option", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                        }
                        obj5 = null;
                    }
                    return w7h1Var;
                }
                if (zo0Var instanceof yo0) {
                    mmr0 mmr0Var = ((yo0) zo0Var).c;
                    int iIntValue = ((Number) mmr0Var.a).intValue();
                    upk0 upk0Var = (upk0) mmr0Var.b;
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("report_ad_option", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA = x6h1VarC5.a();
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    x6h1 x6h1VarC6 = y6h1VarA.c();
                    x6h1VarC6.i.add(new a7h1("report_category_option", upk0Var.a, numValueOf, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                    x6h1VarC7.i.add(new a7h1("submit_report_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC7.a(), r6h1Var, System.currentTimeMillis());
                } else if (zo0Var instanceof so0) {
                    if (hs10Var instanceof cs10) {
                        x6h1 x6h1VarC8 = y6h1Var.c();
                        x6h1VarC8.i.add(new a7h1("not_interested_feedback_option", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1Var, System.currentTimeMillis());
                    }
                    obj5 = null;
                } else {
                    if (zo0Var instanceof ro0) {
                        mo0 mo0Var = ((ro0) zo0Var).a;
                        r6h1 r6h1VarB = vpk0Var.b();
                        String strE = gq0.e(str2);
                        y6h1 y6h1Var2 = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-ads-feedback-not-interested-menu";
                        x6h1VarI.f = "1.1.0";
                        x6h1VarI.g = "22.0.0";
                        x6h1VarI.b = str;
                        x6h1VarI.d = strE;
                        y6h1 y6h1VarA2 = x6h1VarI.a();
                        int iOrdinal = mo0Var.ordinal();
                        if (iOrdinal == 0) {
                            x6h1 x6h1VarC9 = y6h1VarA2.c();
                            x6h1VarC9.i.add(new a7h1("menu_back_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC9.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC9.a(), r6h1VarB, System.currentTimeMillis());
                        } else {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            x6h1 x6h1VarC10 = y6h1VarA2.c();
                            x6h1VarC10.i.add(new a7h1("system_back_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC10.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC10.a(), r6h1VarB, System.currentTimeMillis());
                        }
                        return w7h1Var2;
                    }
                    if (zo0Var instanceof uo0) {
                        if ((hs10Var instanceof cs10) || (hs10Var instanceof ds10)) {
                            x6h1 x6h1VarC11 = y6h1Var.c();
                            x6h1VarC11.i.add(new a7h1("report_ad_option", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC11.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1Var, System.currentTimeMillis());
                        }
                        obj5 = null;
                    } else if (zo0Var instanceof wo0) {
                        wo0 wo0Var = (wo0) zo0Var;
                        x6h1 x6h1VarC12 = y6h1Var.c();
                        x6h1VarC12.i.add(new a7h1("report_ad_option", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC12.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC12.a();
                        upk0 upk0Var2 = wo0Var.b;
                        Integer numValueOf2 = Integer.valueOf(wo0Var.a);
                        x6h1 x6h1VarC13 = y6h1VarA3.c();
                        x6h1VarC13.i.add(new a7h1("report_category_option", upk0Var2.a, numValueOf2, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC13.a(), r6h1Var, System.currentTimeMillis());
                    } else if (zo0Var instanceof vo0) {
                        if ((hs10Var instanceof cs10) || (hs10Var instanceof ds10)) {
                            x6h1 x6h1VarC14 = y6h1Var.c();
                            x6h1VarC14.i.add(new a7h1("report_ad_option", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC14.j = false;
                            x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                            x6h1VarC15.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC15.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC15.a(), r6h1Var, System.currentTimeMillis());
                        }
                        obj5 = null;
                    } else if (zo0Var instanceof xo0) {
                        xo0 xo0Var = (xo0) zo0Var;
                        i8h1 i8h1Var = jp0Var.f;
                        x6h1 x6h1VarC16 = y6h1Var.c();
                        x6h1VarC16.i.add(new a7h1("report_ad_option", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC16.j = false;
                        y6h1 y6h1VarA4 = x6h1VarC16.a();
                        upk0 upk0Var3 = xo0Var.b;
                        Integer numValueOf3 = Integer.valueOf(xo0Var.a);
                        x6h1 x6h1VarC17 = y6h1VarA4.c();
                        x6h1VarC17.i.add(new a7h1("report_category_option", upk0Var3.a, numValueOf3, (String) null, (String) null));
                        x6h1VarC17.j = false;
                        x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                        x6h1VarC18.i.add(new a7h1("submit_report_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC18.j = false;
                        x6h1 x6h1VarC19 = x6h1VarC18.a().c();
                        x6h1VarC19.i.add(new a7h1("report_confirmation", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC19.j = true;
                        y6h1 y6h1VarA5 = x6h1VarC19.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA5;
                        ((xjn) k7h1Var).b = r6h1Var;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        obj5 = null;
                        i8h1Var.f(k7h1Var.a(), (Set) null);
                    } else {
                        obj5 = null;
                        if (zo0Var instanceof qo0) {
                            qo0 qo0Var = (qo0) zo0Var;
                            if ((hs10Var instanceof cs10) || (hs10Var instanceof ds10)) {
                                x6h1 x6h1VarC20 = y6h1Var.c();
                                x6h1VarC20.i.add(new a7h1("report_ad_option", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC20.j = false;
                                x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                                x6h1VarC21.i.add(new a7h1("advertising_policies_link", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC21.j = false;
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", qo0Var.a)), x6h1VarC21.a(), r6h1Var, System.currentTimeMillis());
                            }
                        } else if (zo0Var instanceof no0) {
                            mmr0 mmr0Var2 = ((no0) zo0Var).a;
                            int iIntValue2 = ((Number) mmr0Var2.a).intValue();
                            upk0 upk0Var4 = (upk0) mmr0Var2.b;
                            if ((hs10Var instanceof cs10) || (hs10Var instanceof ds10)) {
                                x6h1 x6h1VarC22 = y6h1Var.c();
                                x6h1VarC22.i.add(new a7h1("report_ad_option", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC22.j = false;
                                y6h1 y6h1VarA6 = x6h1VarC22.a();
                                Integer numValueOf4 = Integer.valueOf(iIntValue2);
                                x6h1 x6h1VarC23 = y6h1VarA6.c();
                                x6h1VarC23.i.add(new a7h1("report_category_option", upk0Var4.a, numValueOf4, (String) null, (String) null));
                                x6h1VarC23.j = false;
                                x6h1 x6h1VarC24 = x6h1VarC23.a().c();
                                x6h1VarC24.i.add(new a7h1("submit_report_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC24.j = false;
                                x6h1 x6h1VarC25 = x6h1VarC24.a().c();
                                x6h1VarC25.i.add(new a7h1("report_confirmation", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC25.j = true;
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC25.a(), r6h1Var, System.currentTimeMillis());
                            }
                        } else if (zo0Var instanceof oo0) {
                            oo0 oo0Var = (oo0) zo0Var;
                            int i4 = oo0Var.a;
                            String str5 = oo0Var.b;
                            r6h1 r6h1VarB2 = vpk0Var.b();
                            py9 py9Var = new py9(str, gq0.e(str2), r6h1VarB2, (byte) 7);
                            if (u890.j(hs10Var, es10Var)) {
                                int iC2 = l1d.C(i4);
                                if (iC2 == 0) {
                                    return py9Var.k();
                                }
                                if (iC2 == 1) {
                                    return py9Var.e();
                                }
                                if (iC2 == 2) {
                                    x6h1 x6h1VarC26 = py9Var.c.c();
                                    x6h1VarC26.i.add(new a7h1("system_back_button", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC26.j = false;
                                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC26.a(), r6h1VarB2, System.currentTimeMillis());
                                }
                                eg.o();
                            } else if (((hs10Var instanceof cs10) || (hs10Var instanceof ds10)) && str5 != null) {
                                int iHashCode = str5.hashCode();
                                if (iHashCode != -599114383) {
                                    if (iHashCode != 829006501) {
                                        if (iHashCode == 1397936271 && str5.equals("instream_overflow_entry")) {
                                            iC = l1d.C(i4);
                                            if (iC != 0) {
                                                w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                                            } else if (iC != 1) {
                                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                                            } else if (iC == 2) {
                                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                                            } else {
                                                eg.o();
                                            }
                                        }
                                    } else if (str5.equals("not_interested_reasons")) {
                                        int iC3 = l1d.C(i4);
                                        if (iC3 == 0) {
                                            return py9Var.k();
                                        }
                                        if (iC3 == 1) {
                                            return py9Var.e();
                                        }
                                        if (iC3 != 2) {
                                            eg.o();
                                        }
                                    }
                                } else if (str5.equals("infeed_overflow_entry")) {
                                    iC = l1d.C(i4);
                                    if (iC != 0) {
                                        w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                                    } else if (iC != 1) {
                                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                                    } else if (iC == 2) {
                                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                                    } else {
                                        eg.o();
                                    }
                                }
                            }
                        } else {
                            eg.o();
                        }
                    }
                }
                return w7h1Var;
                return obj5;
            case 12:
                Context context3 = (Context) obj2;
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context3).inflate(2131624017, (ViewGroup) obj3, false);
                yir yirVarA = ((hjc) ((bs0) obj6).d).a((l0i) null);
                int dimensionPixelSize = context3.getResources().getDimensionPixelSize(2131166836);
                yir yirVar = yirVarA;
                bjx bjxVar = (bjx) yirVar.c;
                ((FrameLayout) bjxVar.b).setLayoutParams(new FrameLayout.LayoutParams(-1, dimensionPixelSize));
                yirVar.n((iu30) obj4);
                viewGroup.addView((FrameLayout) bjxVar.b);
                return new as0(viewGroup, yirVarA, (byte) 0);
            case 13:
                bpt0 bpt0Var2 = (bpt0) obj3;
                tm tmVar = (tm) obj6;
                CompletableSource completableSourceFlatMapCompletable = new FlowableSingleSingle(new FlowableTake((FlowableMap) tmVar.c)).flatMapCompletable(new gid(tmVar, bpt0Var2, (byte) 11));
                w9u0 w9u0Var = (w9u0) tmVar.d;
                if (bpt0Var2 == bpt0Var) {
                    c = 0;
                    g9u0Var = new d9u0("nowplaying", false);
                } else {
                    c = 0;
                    g9u0Var = new g9u0("nowplaying", false);
                }
                CompletableSource completableSourceIgnoreElement = w9u0Var.a(g9u0Var).ignoreElement();
                CompletableSource[] completableSourceArr = new CompletableSource[2];
                completableSourceArr[c] = completableSourceFlatMapCompletable;
                completableSourceArr[1] = completableSourceIgnoreElement;
                return Completable.m(completableSourceArr);
            case 14:
                bpt0 bpt0Var3 = (bpt0) obj3;
                bs0 bs0Var = (bs0) obj6;
                CompletableSource completableSourceFlatMapCompletable2 = new FlowableSingleSingle(new FlowableTake((FlowableMap) bs0Var.b)).flatMapCompletable(new oj80(bs0Var, bpt0Var3, (byte) 11));
                w9u0 w9u0Var2 = (w9u0) bs0Var.d;
                if (bpt0Var3 == bpt0Var) {
                    c2 = 0;
                    g9u0Var2 = new d9u0("nowplaying", false);
                } else {
                    c2 = 0;
                    g9u0Var2 = new g9u0("nowplaying", false);
                }
                CompletableSource completableSourceIgnoreElement2 = w9u0Var2.a(g9u0Var2).ignoreElement();
                CompletableSource[] completableSourceArr2 = new CompletableSource[2];
                completableSourceArr2[c2] = completableSourceFlatMapCompletable2;
                completableSourceArr2[1] = completableSourceIgnoreElement2;
                return Completable.m(completableSourceArr2);
            case 15:
                jjm0 jjm0Var = (jjm0) obj;
                iw0 iw0Var = (iw0) obj2;
                int iIntValue3 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-439021127);
                qj0 qj0Var = (qj0) obj6;
                FlowableMap flowableMap = (FlowableMap) qj0Var.d;
                vbm[] vbmVarArr = q601.a;
                ven0 ven0VarG = rwq.g(new kge(flowableMap), 0L, (o8n) null, x340Var, 48, 2);
                boolean zF = x340Var.f(((Number) ven0VarG.getValue()).longValue());
                Object objT = x340Var.T();
                if (zF || objT == m4cVar) {
                    objT = yv91.a(new y4(iw0Var, ven0VarG, (byte) 12));
                    x340Var.s0(objT);
                }
                tob1 tob1Var = (tob1) objT;
                if ((((iIntValue3 & 112) ^ 48) <= 32 || !x340Var.g(iw0Var)) && (iIntValue3 & 48) != 32) {
                    z = false;
                }
                boolean zI = x340Var.i(qj0Var) | z;
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new kw0(iw0Var, qj0Var, (lnm) null, (byte) 0);
                    x340Var.s0(objT2);
                }
                jjm0Var.a((zu30) objT2, x340Var, (iIntValue3 << 3) & 112);
                jw0 jw0Var = new jw0(iw0Var, ((Boolean) tob1Var.getValue()).booleanValue());
                x340Var.r(false);
                return jw0Var;
            case 16:
                lw0 lw0Var = (lw0) obj6;
                return Completable.m(new CompletableSource[]{new CompletableFromAction(new bm0(lw0Var, (nw0) obj2, (byte) 2)), new FlowableSingleSingle(new FlowableTake(lw0Var.a)).map(new u9x0(lw0Var)).flatMapCompletable(new fl1(lw0Var, (byte) 4))});
            case 17:
                pw0 pw0Var = (pw0) obj6;
                return Completable.m(new CompletableSource[]{new CompletableFromAction(new bm0(pw0Var, (nw0) obj2, (byte) 3)), new FlowableSingleSingle(new FlowableTake(pw0Var.a)).map(new vbx0(pw0Var)).flatMapCompletable(new a42(pw0Var, (byte) 5))});
            case 18:
                qw0 qw0Var = (qw0) obj6;
                return Completable.m(new CompletableSource[]{new CompletableFromAction(new bm0(qw0Var, (sw0) obj2, (byte) 4)), new FlowableSingleSingle(new FlowableTake(qw0Var.a)).map(new wbx0(qw0Var, (byte) 27)).flatMapCompletable(new cp5(qw0Var, (byte) 5))});
            case 19:
                tw0 tw0Var = (tw0) obj6;
                return Completable.m(new CompletableSource[]{new CompletableFromAction(new bm0(tw0Var, (sw0) obj2, (byte) 5)), new FlowableSingleSingle(new FlowableTake(tw0Var.a)).map(new ybx0(tw0Var, (byte) 27)).flatMapCompletable(new bv40(tw0Var, (byte) 5))});
            case 20:
                ex0 ex0Var = (ex0) obj6;
                FlowableSingleSingle flowableSingleSingle = new FlowableSingleSingle(new FlowableTake(ex0Var.a));
                Flowable flowable = ex0Var.b;
                return Completable.m(new CompletableSource[]{Single.zip(flowableSingleSingle, new FlowableSingleSingle(ydh.f(flowable, flowable)), new x6o0(ex0Var.d, (byte) 5)).ignoreElement(), ex0Var.c.a(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).ignoreElement()});
            case 21:
                hx0 hx0Var = (hx0) obj6;
                FlowableSingleSingle flowableSingleSingle2 = new FlowableSingleSingle(new FlowableTake(hx0Var.a));
                Flowable flowable2 = hx0Var.b;
                return Completable.m(new CompletableSource[]{Single.zip(flowableSingleSingle2, new FlowableSingleSingle(ydh.f(flowable2, flowable2)), new t7o0(hx0Var.d, (byte) 6)).ignoreElement(), hx0Var.c.a(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).ignoreElement()});
            case 22:
                t71 t71Var = (t71) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var2 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i = (x340Var2.g(t71Var) ? 4 : 2) | iIntValue4;
                } else {
                    i = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i |= x340Var2.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(i & 1, (i & 147) != 146)) {
                    u71 u71Var = (u71) obj6;
                    Object objT3 = x340Var3.T();
                    if (objT3 == fkj0.X) {
                        objT3 = new spv(u71Var.c);
                        x340Var3.s0(objT3);
                    }
                    j2i j2iVar = t3i.a;
                    WeakHashMap weakHashMap = osl1.x;
                    irn1.u((qim0) null, j2iVar, (vu30) null, new bgc0(lhc.g(x340Var3).g, 16), apo.r(947583917, new n891((spv) objT3, t71Var, iu30Var, b2), x340Var3), x340Var3, 24624, 5);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                t71 t71Var2 = (t71) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var4 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                lzn0 lzn0Var = ((e81) obj6).a;
                if ((iIntValue5 & 6) == 0) {
                    i2 = iIntValue5 | (x340Var4.g(t71Var2) ? (byte) 4 : (byte) 2);
                } else {
                    i2 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i2 |= x340Var4.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(i2 & 1, (i2 & 147) != 146)) {
                    t71Var2.getClass();
                    Object objT4 = x340Var5.T();
                    Object obj7 = fkj0.X;
                    if (objT4 == obj7) {
                        objT4 = new uk81(lzn0Var);
                        x340Var5.s0(objT4);
                    }
                    uk81 uk81Var = (uk81) objT4;
                    Object objT5 = x340Var5.T();
                    if (objT5 == obj7) {
                        objT5 = new spv(lzn0Var);
                        x340Var5.s0(objT5);
                    }
                    r4p1.a(t71Var2, iu30Var2, uk81Var, (spv) objT5, (qim0) null, x340Var5, i2 & 112);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 24:
                bb1 bb1Var = (bb1) obj;
                iu30 iu30Var3 = (iu30) obj2;
                ((Number) obj4).intValue();
                eb1 eb1Var = (eb1) obj6;
                x340 x340Var6 = (b0k) obj3;
                Object objT6 = x340Var6.T();
                m4c m4cVar2 = fkj0.X;
                if (objT6 == m4cVar2) {
                    objT6 = eb1Var.e.b();
                    x340Var6.s0(objT6);
                }
                r6h1 r6h1Var2 = (r6h1) objT6;
                boolean zI2 = x340Var6.i(r6h1Var2);
                Object objT7 = x340Var6.T();
                if (zI2 || objT7 == m4cVar2) {
                    objT7 = new cb1(r6h1Var2, (byte) 1);
                    x340Var6.s0(objT7);
                }
                dgo1.c("addBlockedContentSearch", (iu30) objT7, apo.r(1455988999, new q1(eb1Var, bb1Var, iu30Var3, (byte) 14), x340Var6), x340Var6, 390);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return a(obj, obj2, obj3, obj4);
            case 26:
                return d(obj, obj2, obj3, obj4);
            case 27:
                return e(obj, obj2, obj3, obj4);
            case 28:
                return f(obj, obj2, obj3, obj4);
            default:
                tu1 tu1Var = (tu1) obj;
                vzq0 vzq0Var = (vzq0) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | ((iIntValue6 & 8) == 0 ? x340Var7.g(tu1Var) : x340Var7.i(tu1Var) ? (byte) 4 : (byte) 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var7.g(vzq0Var) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i3 & 1, (i3 & 147) != 146)) {
                    ((zu30) ((ven0) obj6).getValue()).J(tu1Var, vzq0Var, x340Var8, Integer.valueOf(i3 & 126));
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }
}
