package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.icu.text.DateFormat;
import android.icu.text.NumberFormat;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import defpackage.d;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xt11 implements isw {
    public final boolean N0;
    public final boolean O0;
    public final ye P0 = new ye();
    public final uh Q0;
    public final uh R0;
    public final uh S0;
    public final uh T0;
    public final uh U0;
    public final uh V0;
    public final dtw W0;
    public final boolean X;
    public LinearLayout X0;
    public final ppc1 Y;
    public final lly Y0;
    public final boolean Z;
    public final t10 Z0;
    public final Context a;
    public final FrameLayout a1;
    public final iu30 b;
    public View b1;
    public final bu11 c;
    public final njy c1;
    public final yqg d;
    public final int d1;
    public final ggv e;
    public final int e1;
    public final mka f;
    public final boolean g;
    public final n5r h;
    public final yt11 i;
    public final boolean t;

    public xt11(Context context, ViewGroup viewGroup, iu30 iu30Var, gw70 gw70Var, bu11 bu11Var, yqg yqgVar, ggv ggvVar, mka mkaVar, int i, boolean z, boolean z2, int i2, int i3, n5r n5rVar, wpw wpwVar, vtw vtwVar, vtw vtwVar2, vtw vtwVar3, vtw vtwVar4, vtw vtwVar5, vtw vtwVar6, yt11 yt11Var, boolean z3, boolean z4, boolean z5, ppc1 ppc1Var, boolean z6, boolean z7, boolean z8, int i4) {
        uh uhVar;
        uh uhVar2;
        uh uhVar3;
        uh uhVar4;
        uh uhVar5;
        uh uhVar6;
        dtw dtwVarD;
        this.a = context;
        this.b = iu30Var;
        this.c = bu11Var;
        this.d = yqgVar;
        this.e = ggvVar;
        this.f = mkaVar;
        this.d1 = i;
        this.g = z2;
        this.e1 = i2;
        this.h = n5rVar;
        this.i = yt11Var;
        this.t = z4;
        this.X = z5;
        this.Y = ppc1Var;
        this.Z = z6;
        this.N0 = z7;
        this.O0 = z8;
        if (vtwVar != null) {
            uhVar = new uh(context, viewGroup, vtwVar);
            uhVar.a = new vt11(this, (byte) 4);
        } else {
            uhVar = null;
        }
        this.Q0 = uhVar;
        if (vtwVar2 != null) {
            uhVar2 = new uh(context, viewGroup, vtwVar2);
            uhVar2.a = new vt11(this, (byte) 5);
        } else {
            uhVar2 = null;
        }
        this.R0 = uhVar2;
        if (vtwVar3 != null) {
            uhVar3 = new uh(context, viewGroup, vtwVar3);
            uhVar3.a = new vt11(this, (byte) 0);
        } else {
            uhVar3 = null;
        }
        this.S0 = uhVar3;
        if (vtwVar4 != null) {
            uhVar4 = new uh(context, viewGroup, vtwVar4);
            uhVar4.a = new vt11(this, (byte) 1);
        } else {
            uhVar4 = null;
        }
        this.T0 = uhVar4;
        if (vtwVar5 != null) {
            uhVar5 = new uh(context, viewGroup, vtwVar5);
            uhVar5.a = new vt11(this, (byte) 2);
        } else {
            uhVar5 = null;
        }
        this.U0 = uhVar5;
        if (vtwVar6 != null) {
            uhVar6 = new uh(context, viewGroup, vtwVar6);
            uhVar6.a = new vt11(this, (byte) 3);
        } else {
            uhVar6 = null;
        }
        this.V0 = uhVar6;
        if (wpwVar != null) {
            tka0 tka0Var = dtw.C;
            dtwVarD = mhc.d(context, viewGroup, wpwVar, null, 24);
        } else {
            dtwVarD = null;
        }
        this.W0 = dtwVarD;
        lly llyVar = new lly(context, gw70Var, z ? 3 : 4, false, true, z3, 8);
        this.Y0 = llyVar;
        EncoreListRow encoreListRow = llyVar.c;
        this.Z0 = new t10(encoreListRow);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(i3, 0, i3, 0);
        frameLayout.addView(encoreListRow, 0, new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setTag("ReleaseRowElement");
        this.a1 = frameLayout;
        Integer numC = f4p1.c(i4);
        this.c1 = numC != null ? new njy(numC.intValue()) : null;
    }

    public static int d(long j, long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(Math.min(j, j2)).atZone(zoneIdSystemDefault).toLocalDate(), Instant.ofEpochMilli(Math.max(j, j2)).atZone(zoneIdSystemDefault).toLocalDate());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static int f(int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 1;
        }
        if (iC == 1) {
            return 2;
        }
        eg.o();
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:265:0x0530  */
    /* JADX WARN: Code duplicated, block: B:267:0x0533  */
    /* JADX WARN: Code duplicated, block: B:270:0x053f  */
    /* JADX WARN: Code duplicated, block: B:273:0x055c  */
    /* JADX WARN: Code duplicated, block: B:274:0x0561  */
    /* JADX WARN: Code duplicated, block: B:277:0x0583  */
    /* JADX WARN: Code duplicated, block: B:278:0x0589  */
    /* JADX WARN: Code duplicated, block: B:280:0x058c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0592  */
    /* JADX WARN: Code duplicated, block: B:284:0x0599  */
    /* JADX WARN: Code duplicated, block: B:286:0x059c  */
    /* JADX WARN: Code duplicated, block: B:288:0x059f  */
    /* JADX WARN: Code duplicated, block: B:289:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:291:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:292:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:295:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:299:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:301:0x0608  */
    /* JADX WARN: Code duplicated, block: B:307:0x061b  */
    /* JADX WARN: Code duplicated, block: B:314:0x063b  */
    /* JADX WARN: Code duplicated, block: B:317:0x064c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x064e  */
    /* JADX WARN: Code duplicated, block: B:320:0x0656  */
    /* JADX WARN: Code duplicated, block: B:321:0x065b  */
    /* JADX WARN: Code duplicated, block: B:325:0x0664  */
    /* JADX WARN: Code duplicated, block: B:327:0x066a  */
    /* JADX WARN: Code duplicated, block: B:329:0x067e  */
    /* JADX WARN: Code duplicated, block: B:330:0x0681  */
    /* JADX WARN: Code duplicated, block: B:332:0x0697  */
    /* JADX WARN: Code duplicated, block: B:335:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:337:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:339:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:340:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:342:0x06c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:343:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:344:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:347:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:349:0x06f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:350:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:352:0x0710  */
    /* JADX WARN: Code duplicated, block: B:354:0x0714  */
    /* JADX WARN: Code duplicated, block: B:356:0x0718  */
    /* JADX WARN: Code duplicated, block: B:357:0x071b  */
    /* JADX WARN: Code duplicated, block: B:360:0x0721  */
    /* JADX WARN: Code duplicated, block: B:362:0x0725 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:364:0x072a  */
    /* JADX WARN: Code duplicated, block: B:366:0x073f  */
    /* JADX WARN: Code duplicated, block: B:368:0x0743  */
    /* JADX WARN: Code duplicated, block: B:370:0x0747  */
    /* JADX WARN: Code duplicated, block: B:371:0x074a  */
    /* JADX WARN: Code duplicated, block: B:374:0x075a  */
    /* JADX WARN: Code duplicated, block: B:376:0x076e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:377:0x0770  */
    /* JADX WARN: Code duplicated, block: B:379:0x0788  */
    /* JADX WARN: Code duplicated, block: B:381:0x078c  */
    /* JADX WARN: Code duplicated, block: B:384:0x0796  */
    /* JADX WARN: Code duplicated, block: B:386:0x07a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:390:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:392:0x07b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:394:0x07c4 A[PHI: r6
      0x07c4: PHI (r6v12 android.view.View) = (r6v11 android.view.View), (r6v11 android.view.View), (r6v20 android.view.View), (r6v20 android.view.View) binds: [B:401:0x07f6, B:402:0x07f8, B:391:0x07b7, B:392:0x07b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:395:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:397:0x07d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:400:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:402:0x07f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:406:0x0812  */
    /* JADX WARN: Code duplicated, block: B:408:0x0815  */
    /* JADX WARN: Code duplicated, block: B:409:0x0820  */
    /* JADX WARN: Code duplicated, block: B:413:0x0838 A[LOOP:1: B:411:0x0832->B:413:0x0838, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:415:0x0856  */
    /* JADX WARN: Code duplicated, block: B:418:0x085c  */
    /* JADX WARN: Code duplicated, block: B:419:0x087a  */
    /* JADX WARN: Code duplicated, block: B:422:0x0883  */
    /* JADX WARN: Code duplicated, block: B:424:0x0886  */
    /* JADX WARN: Code duplicated, block: B:431:0x0892  */
    /* JADX WARN: Code duplicated, block: B:432:0x0894  */
    /* JADX WARN: Code duplicated, block: B:434:0x0897  */
    /* JADX WARN: Code duplicated, block: B:435:0x089d  */
    /* JADX WARN: Code duplicated, block: B:438:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:439:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:441:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:443:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:445:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:447:0x08e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:448:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:451:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:453:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:456:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:459:0x0901 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:460:0x0903  */
    /* JADX WARN: Code duplicated, block: B:462:0x0906  */
    /* JADX WARN: Code duplicated, block: B:464:0x0909  */
    /* JADX WARN: Code duplicated, block: B:466:0x090c  */
    /* JADX WARN: Code duplicated, block: B:469:0x0914  */
    /* JADX WARN: Code duplicated, block: B:471:0x0918  */
    /* JADX WARN: Code duplicated, block: B:472:0x091e  */
    /* JADX WARN: Code duplicated, block: B:473:0x0925  */
    /* JADX WARN: Code duplicated, block: B:474:0x092c  */
    /* JADX WARN: Code duplicated, block: B:477:0x0947  */
    /* JADX WARN: Code duplicated, block: B:478:0x094a  */
    /* JADX WARN: Code duplicated, block: B:481:0x0959  */
    /* JADX WARN: Code duplicated, block: B:483:0x095c  */
    /* JADX WARN: Code duplicated, block: B:484:0x095f  */
    /* JADX WARN: Code duplicated, block: B:486:0x0963  */
    /* JADX WARN: Code duplicated, block: B:489:0x0970  */
    /* JADX WARN: Code duplicated, block: B:491:0x0980  */
    /* JADX WARN: Code duplicated, block: B:504:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x0624 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x05f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Instruction removed from duplicated block: B:335:0x06a2, please report this as an issue */
    @Override // p.isw
    public final void a(Object obj, ysw yswVar) throws NoWhenBranchMatchedException {
        int i;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        String str;
        aky akyVar;
        aky akyVar2;
        kky kkyVar;
        SpannedString spannedString;
        bv11 bv11Var;
        CharSequence string;
        String strA;
        List listI0;
        fky fkyVar;
        wiy wiyVar;
        bv11 bv11Var2;
        String string2;
        String str2;
        wiy wiyVar2;
        wiy ziyVar;
        int iOrdinal;
        int i2;
        ArrayList arrayList;
        o5a1 o5a1Var;
        ArrayList arrayList2;
        Double d;
        boolean z;
        boolean z2;
        iix0 iix0Var;
        rrt0 rrt0Var;
        dky dkyVarA;
        View view8;
        ArrayList arrayList3;
        bs51 okyVar;
        bs51 bs51Var;
        mjy mjyVar;
        qiy qiyVar;
        int iOrdinal2;
        int i3;
        uiy uiyVar;
        int i4;
        qiy tiyVar;
        int i5;
        int i6;
        int iOrdinal3;
        int i7;
        riy riyVar;
        Set setB0;
        piy piyVar;
        int iC;
        int i8;
        cjy bjyVar;
        oiy oiyVar;
        ArrayList arrayList4;
        Iterator it;
        ArrayList arrayList5;
        boolean z3;
        dky dkyVar;
        boolean z4;
        boolean z5;
        dky dkyVar2;
        boolean z6;
        Long l;
        boolean z7;
        rle1 rle1VarZ;
        String strA2;
        String string3;
        xn70 xn70Var;
        String str3;
        String str4;
        iky ikyVar;
        int i9;
        tlb1 tlb1Var = (unb1) obj;
        boolean z8 = tlb1Var instanceof jmb1;
        iu30 iu30Var = this.b;
        yqg yqgVar = this.d;
        if (!z8) {
            if (tlb1Var instanceof inb1) {
                e();
                iu30Var.invoke(new yd00(new hve0(o4p1.B(yqgVar)), ((inb1) tlb1Var).a));
                return;
            } else if (!(tlb1Var instanceof tlb1)) {
                eg.o();
                return;
            } else {
                e();
                iu30Var.invoke(new yd00(new fve0(o4p1.B(yqgVar)), tlb1Var.a()));
                return;
            }
        }
        jmb1 jmb1Var = (jmb1) tlb1Var;
        uv11 uv11Var = jmb1Var.a;
        String str5 = uv11Var.a;
        uh uhVar = this.Q0;
        if (uhVar != null) {
            uhVar.a(uv11Var);
        }
        uh uhVar2 = this.R0;
        if (uhVar2 != null) {
            uhVar2.a(uv11Var);
        }
        uh uhVar3 = this.S0;
        if (uhVar3 != null) {
            uhVar3.a(uv11Var);
        }
        uh uhVar4 = this.T0;
        if (uhVar4 != null) {
            uhVar4.a(uv11Var);
        }
        uh uhVar5 = this.U0;
        if (uhVar5 != null) {
            uhVar5.a(uv11Var);
        }
        uh uhVar6 = this.V0;
        if (uhVar6 != null) {
            uhVar6.a(uv11Var);
        }
        dtw dtwVar = this.W0;
        if (dtwVar != null) {
            tka0 tka0Var = dtw.C;
            dtwVar.k(uv11Var, ioa0.a, null);
        }
        FrameLayout frameLayout = this.a1;
        jhc1.q(0, frameLayout).setVisibility(0);
        View view9 = this.b1;
        if (view9 != null) {
            view9.setVisibility(8);
        }
        int i10 = this.f != null ? 2 : 0;
        bu11 bu11Var = this.c;
        if (uhVar == null || (view = uhVar.c.w) == null) {
            i = i10;
            view = null;
        } else {
            i = i10;
            mp80 mp80VarJ = bu11Var.j(str5);
            if (mp80VarJ != null) {
                xhk1.c(view, mp80VarJ);
            }
        }
        if (uhVar2 == null || (view2 = uhVar2.c.w) == null) {
            view2 = null;
        } else {
            mp80 mp80VarQ = bu11Var.q();
            if (mp80VarQ != null) {
                xhk1.c(view2, mp80VarQ);
            }
        }
        if (uhVar3 == null || (view3 = uhVar3.c.w) == null) {
            view3 = null;
        } else {
            mp80 mp80VarE = bu11Var.e(str5);
            if (mp80VarE != null) {
                xhk1.c(view3, mp80VarE);
            }
        }
        if (uhVar4 == null || (view4 = uhVar4.c.w) == null) {
            view4 = null;
        } else {
            mp80 mp80VarH = bu11Var.h(str5);
            if (mp80VarH != null) {
                xhk1.c(view4, mp80VarH);
            }
        }
        if (uhVar5 == null || (view5 = uhVar5.c.w) == null) {
            view5 = null;
        } else {
            mp80 mp80VarT = bu11Var.t(str5);
            if (mp80VarT != null) {
                xhk1.c(view5, mp80VarT);
            }
        }
        if (uhVar6 == null || (view6 = uhVar6.c.w) == null) {
            view6 = null;
        } else {
            mp80 mp80VarK = bu11Var.k(str5);
            if (mp80VarK != null) {
                xhk1.c(view6, mp80VarK);
            }
        }
        List listI1 = f46.i0(new View[]{view3, view4, view5, view6});
        if (dtwVar == null || (view7 = dtwVar.w) == null) {
            view7 = null;
        } else {
            mp80 mp80VarF = bu11Var.f(str5);
            if (mp80VarF != null) {
                xhk1.c(view7, mp80VarF);
            }
        }
        Context context = frameLayout.getContext();
        bv11 bv11Var3 = jmb1Var.b;
        dt11 dt11Var = jmb1Var.g;
        me2 me2Var = jmb1Var.o;
        n6u n6uVar = jmb1Var.i;
        rrt0 rrt0Var2 = jmb1Var.f;
        iix0 iix0Var2 = jmb1Var.e;
        xn70 xn70Var2 = jmb1Var.c;
        View view10 = view;
        String str6 = bv11Var3.a;
        View view11 = view2;
        Long l2 = bv11Var3.o;
        boo1 boo1Var = bv11Var3.l;
        lky lkyVar = new lky(str6, 10, this.g);
        Integer num = uv11Var.c;
        ojy ojyVar = num != null ? new ojy(String.valueOf(num.intValue())) : null;
        String str7 = xn70Var2 != null ? xn70Var2.b : null;
        boolean z9 = jmb1Var.j;
        boolean z10 = me2Var instanceof he2;
        boolean z11 = this.N0;
        String str8 = str7;
        njy njyVar = this.c1;
        if (z10) {
            if (njyVar == null || !(boo1Var instanceof sz6)) {
                akyVar2 = null;
            } else {
                akyVar2 = new aky((String) null, f4p1.e(bv11Var3), njyVar, f4p1.d(bv11Var3), 9);
            }
        } else if (!k4p1.w(me2Var)) {
            sz6 sz6Var = boo1Var instanceof sz6 ? (sz6) boo1Var : null;
            if (sz6Var == null || (sz6Var.c == null && njyVar == null)) {
                sz6Var = null;
            }
            if (sz6Var != null) {
                boolean z12 = z9 || u890.j(n6uVar, m6u.a);
                pjy pjyVar = (z12 || (str = sz6Var.c) == null) ? null : new pjy(str);
                njy njyVar2 = z12 ? new njy(2131232009) : njyVar;
                u37 u37Var = sz6Var.d;
                if (u37Var == u37.a) {
                    akyVar = new aky(pjyVar, new ujy(1), njyVar2, null, new rjy(), 8);
                } else {
                    u37 u37Var2 = u37.b;
                    akyVar = (u37Var == u37Var2 && z11 && str8 != null) ? new aky(pjyVar, null, njyVar2, null, new rjy(), 10) : u37Var == u37Var2 ? new aky(pjyVar, null, njyVar2, null, null, 26) : new aky(pjyVar, null, njyVar2, null, null, 26);
                }
                akyVar2 = akyVar;
            } else {
                akyVar2 = null;
            }
        } else if (boo1Var instanceof sz6) {
            akyVar2 = new aky((String) null, f4p1.e(bv11Var3), new njy(2131231986), f4p1.d(bv11Var3), 9);
        } else {
            if (!u890.j(boo1Var, q17.c)) {
                eg.o();
                return;
            }
            akyVar2 = null;
        }
        ppc1 ppc1Var = this.Y;
        npc1 npc1Var = npc1.a;
        if (ppc1Var.equals(npc1Var)) {
            kkyVar = null;
        } else {
            String string4 = "";
            if (ppc1Var.equals(npc1Var)) {
                xn70Var = xn70Var2;
            } else {
                if (ppc1Var.equals(kpc1.a)) {
                    if (xn70Var2 != null && (str4 = xn70Var2.a) != null) {
                        string4 = str4;
                    }
                } else if (!ppc1Var.equals(opc1.a)) {
                    xn70Var = xn70Var2;
                    if (ppc1Var.equals(lpc1.a)) {
                        xn70 xn70Var3 = jmb1Var.d;
                        if (xn70Var3 != null && (str3 = xn70Var3.a) != null) {
                            string4 = str3;
                        }
                    } else if (!(ppc1Var instanceof mpc1)) {
                        eg.o();
                        return;
                    }
                } else if (l2 != null) {
                    long jLongValue = l2.longValue();
                    xn70Var = xn70Var2;
                    long j = bv11Var3.f16p;
                    string4 = jLongValue < j ? context.getString(2131961055, Long.valueOf(j)) : NumberFormat.getNumberInstance(new Locale(upn1.m())).format(l2.longValue());
                }
                xn70Var = xn70Var2;
            }
            string4.getClass();
            String str9 = xn70Var != null ? xn70Var.b : null;
            if (!z11) {
                str9 = null;
            }
            if (bv11Var3.m) {
                int iOrdinal4 = dt11Var.a(2).ordinal();
                if (iOrdinal4 == 0 || iOrdinal4 == 1) {
                    i9 = 1;
                } else if (iOrdinal4 == 2 || iOrdinal4 == 3) {
                    i9 = 2;
                } else {
                    if (iOrdinal4 != 4) {
                        eg.o();
                        return;
                    }
                    i9 = 3;
                }
                ikyVar = new iky(i9);
            } else {
                ikyVar = gky.a;
            }
            kkyVar = new kky(string4, str9, ikyVar);
        }
        c380 c380Var = bv11Var3.w;
        h540 h540Var = bv11Var3.i;
        Long l3 = bv11Var3.c;
        boolean zW = hon1.w(iix0Var2);
        wqo wqoVar = bv11Var3.r;
        po11 po11Var = bv11Var3.t;
        msv0 msv0Var = bv11Var3.u;
        ati1 ati1Var = bv11Var3.v;
        boolean zW2 = k4p1.w(me2Var);
        Context context2 = this.a;
        kky kkyVar2 = kkyVar;
        if (!zW2) {
            if (c380Var.isEmpty()) {
                if (ati1Var == null || ihc1.y0(ati1Var.a())) {
                    spannedString = null;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ago1.o(context2, 2130970419, 0));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) ati1Var.a());
                    spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                    spannedString = new SpannedString(spannableStringBuilder);
                }
                if (msv0Var != null) {
                    bv11Var = bv11Var3;
                    int iV = w3p1.v(msv0Var.a(), yqgVar);
                    int i11 = iV == 0 ? -1 : ut11.b[l1d.C(iV)];
                    if (i11 == 3) {
                        string2 = context2.getString(2131961051);
                    } else if (i11 != 4) {
                        if (i11 != 5) {
                            spannedString = spannedString;
                            bv11Var = bv11Var;
                            string = null;
                        } else {
                            string2 = context2.getString(2131961050, DateFormat.getPatternInstance("MMMd", new Locale(upn1.m())).format(new Date(msv0Var.a())));
                        }
                        if (string == null) {
                        }
                        if (wqoVar != 0) {
                            strA = wqoVar.a();
                            if (ihc1.y0(strA)) {
                                strA = null;
                            }
                        } else {
                            strA = null;
                        }
                        listI0 = f46.i0(new CharSequence[]{spannedString, string, strA});
                        if (((ArrayList) listI0).isEmpty()) {
                            bv11Var2 = bv11Var;
                            fkyVar = null;
                            wiyVar = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            o7h.x0(listI0, spannableStringBuilder2, " • ", (String) null, (String) null, (iu30) null, 124);
                            wiyVar = null;
                            fkyVar = new fky(spannableStringBuilder2, (eky) null, 14);
                            bv11Var2 = bv11Var;
                        }
                    } else {
                        int iD = d(yqgVar.b(), msv0Var.a());
                        string2 = context2.getResources().getQuantityString(2131820878, iD, Integer.valueOf(iD));
                    }
                    string2.getClass();
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    b(spannableStringBuilder3, 2130970419);
                    spannableStringBuilder3.append(" ");
                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(ago1.o(context2, 2130970419, 0));
                    int length2 = spannableStringBuilder3.length();
                    spannableStringBuilder3.append((CharSequence) string2);
                    spannableStringBuilder3.setSpan(foregroundColorSpan2, length2, spannableStringBuilder3.length(), 17);
                    string = new SpannedString(spannableStringBuilder3);
                    if (string == null) {
                    }
                    if (wqoVar != 0) {
                        strA = wqoVar.a();
                        if (ihc1.y0(strA)) {
                            strA = null;
                        }
                    } else {
                        strA = null;
                    }
                    listI0 = f46.i0(new CharSequence[]{spannedString, string, strA});
                    if (((ArrayList) listI0).isEmpty()) {
                        bv11Var2 = bv11Var;
                        fkyVar = null;
                        wiyVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        o7h.x0(listI0, spannableStringBuilder4, " • ", (String) null, (String) null, (iu30) null, 124);
                        wiyVar = null;
                        fkyVar = new fky(spannableStringBuilder4, (eky) null, 14);
                        bv11Var2 = bv11Var;
                    }
                } else {
                    spannedString = spannedString;
                    bv11Var = bv11Var3;
                    n6uVar = n6uVar;
                }
                if (po11Var == null) {
                    string = null;
                } else {
                    int iV2 = w3p1.v(po11Var.a(), yqgVar);
                    int i12 = iV2 == 0 ? -1 : ut11.b[l1d.C(iV2)];
                    if (i12 == -1) {
                        string = null;
                    } else if (i12 == 1) {
                        string = context2.getString(2131961048);
                    } else if (i12 == 2) {
                        string = context2.getString(2131961049);
                    } else if (i12 == 3) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        b(spannableStringBuilder5, 2130968791);
                        spannableStringBuilder5.append(" ");
                        spannableStringBuilder5.append((CharSequence) context2.getString(2131961053));
                        string = new SpannedString(spannableStringBuilder5);
                    } else if (i12 == 4) {
                        int iD2 = d(yqgVar.b(), po11Var.a());
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                        b(spannableStringBuilder6, 2130968791);
                        spannableStringBuilder6.append(" ");
                        spannableStringBuilder6.append((CharSequence) context2.getResources().getQuantityString(2131820879, iD2, Integer.valueOf(iD2)));
                        string = new SpannedString(spannableStringBuilder6);
                    } else {
                        if (i12 != 5) {
                            eg.o();
                            return;
                        }
                        String str10 = DateFormat.getPatternInstance("MMMd", new Locale(upn1.m())).format(new Date(po11Var.a()));
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        b(spannableStringBuilder7, 2130968791);
                        spannableStringBuilder7.append(" ");
                        spannableStringBuilder7.append((CharSequence) context2.getString(2131961052, str10));
                        string = new SpannedString(spannableStringBuilder7);
                    }
                }
                if (wqoVar != 0) {
                    strA = wqoVar.a();
                    if (ihc1.y0(strA)) {
                        strA = null;
                    }
                } else {
                    strA = null;
                }
                listI0 = f46.i0(new CharSequence[]{spannedString, string, strA});
                if (((ArrayList) listI0).isEmpty()) {
                    bv11Var2 = bv11Var;
                    fkyVar = null;
                    wiyVar = null;
                } else {
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                    o7h.x0(listI0, spannableStringBuilder8, " • ", (String) null, (String) null, (iu30) null, 124);
                    wiyVar = null;
                    fkyVar = new fky(spannableStringBuilder8, (eky) null, 14);
                    bv11Var2 = bv11Var;
                }
            } else {
                fkyVar = new fky(o7h.y0(c380Var, " • ", (String) null, (String) null, (iu30) null, 62), zW ? q9w.c1 : p9w.b1, 12);
            }
            str2 = bv11Var2.b;
            if (str2 != null) {
                wiyVar2 = new wiy(str2);
            } else {
                wiyVar2 = wiyVar;
            }
            if (view7 != null) {
                ziyVar = new ziy(view7);
            } else {
                ziyVar = wiyVar;
            }
            iOrdinal = rrt0Var2.ordinal();
            if (iOrdinal != 0) {
                i2 = 1;
            } else if (iOrdinal != 1) {
                i2 = 4;
            } else {
                if (iOrdinal == 2) {
                    eg.o();
                    return;
                }
                i2 = 3;
            }
            String strC = this.h.c(l3, yqgVar, context);
            arrayList = new ArrayList();
            o5a1Var = bv11Var2.q;
            wiy wiyVar3 = ziyVar;
            if (o5a1Var != null) {
                arrayList.add(mp10.A(context, o5a1Var, l3, yqgVar.b()));
                arrayList.add(mp10.y(context, false));
            }
            arrayList.add(yzo1.n(bv11Var2.j));
            arrayList.add(yzo1.m(bv11Var2.k));
            u380<lyl> u380Var = bv11Var2.e;
            arrayList2 = new ArrayList();
            for (lyl lylVar : u380Var) {
                if (!u890.j(lylVar, jyl.a) || u890.j(lylVar, jyl.b)) {
                    string3 = null;
                } else {
                    if (u890.j(lylVar, kyl.a)) {
                        eg.o();
                        return;
                    }
                    string3 = context.getString(2131963767);
                }
                if (string3 != null) {
                    arrayList2.add(string3);
                }
            }
            arrayList.addAll(arrayList2);
            arrayList.add(bv11Var2.n);
            arrayList.add(strC);
            d = jmb1Var.f56p;
            if (d != null) {
                arrayList.add(wm5.y(d.doubleValue()));
            }
            z = this.X;
            z2 = this.Z;
            if (iix0Var2 != null) {
                iix0Var = iix0Var2;
            } else {
                if (z) {
                    iix0Var = iix0Var2;
                    l = bv11Var2.d;
                    if (l != null) {
                        ytw0 ytw0Var = jfv.b;
                        context2 = context2;
                        long jL0 = fdg1.l0(l.longValue(), ngv.d);
                        rrt0Var = rrt0Var2;
                        if (rrt0Var == rrt0.a) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        arrayList.add(mth1.A(context, this.e, iix0Var, jL0, z7, this.Z));
                    }
                    ArrayList arrayListO0 = o7h.o0(arrayList);
                    if (i != 0) {
                        dkyVarA = null;
                    } else if (z) {
                        if (iix0Var instanceof hix0) {
                            dkyVar2 = new dky(((hix0) iix0Var).a, false, 0.0f, f(i), 22, (l1d) null);
                        } else if (iix0Var instanceof gix0) {
                            if (z2) {
                                z6 = false;
                            } else {
                                z6 = ((gix0) iix0Var).a;
                            }
                            gix0 gix0Var = (gix0) iix0Var;
                            long j2 = gix0Var.b;
                            dkyVar2 = new dky(z6, true, j2 > 0 ? gix0Var.c / j2 : 0.0f, f(i), 16, (l1d) null);
                        } else {
                            if (iix0Var == null) {
                                eg.o();
                                return;
                            }
                            dkyVar2 = new dky(false, false, 0.0f, 0, 30, (l1d) null);
                        }
                        dkyVarA = dky.a(dkyVar2);
                    } else {
                        if (rrt0Var != rrt0.b) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (iix0Var instanceof hix0) {
                            if (z2 || !z3) {
                                z5 = ((hix0) iix0Var).a;
                            } else {
                                z5 = false;
                            }
                            dkyVar = new dky(z5, z3, 0.0f, f(i), 20, (l1d) null);
                        } else if (iix0Var instanceof gix0) {
                            if (z2) {
                                z4 = false;
                            } else {
                                z4 = ((gix0) iix0Var).a;
                            }
                            gix0 gix0Var2 = (gix0) iix0Var;
                            long j3 = gix0Var2.b;
                            dkyVar = new dky(z4, z3, j3 > 0 ? gix0Var2.c / j3 : 0.0f, f(i), 16, (l1d) null);
                        } else {
                            if (iix0Var == null) {
                                eg.o();
                                return;
                            }
                            dkyVar = new dky(false, false, 0.0f, 0, 28, (l1d) null);
                        }
                        dkyVarA = dky.a(dkyVar);
                    }
                    bky bkyVar = new bky(arrayListO0, dkyVarA);
                    if (this.O0) {
                        arrayList5 = (ArrayList) listI1;
                        if (arrayList5.isEmpty() || view10 == null || view11 == 0) {
                            view8 = view10;
                            if (arrayList5.isEmpty() || view8 == null) {
                                bs51Var = null;
                            } else {
                                okyVar = c(view8);
                            }
                        } else {
                            view8 = view10;
                            okyVar = c(view11, view8);
                        }
                        bs51Var = okyVar;
                    } else {
                        view8 = view10;
                        arrayList3 = (ArrayList) listI1;
                        if (!arrayList3.isEmpty() && view8 != null && view11 != 0) {
                            okyVar = new nky(new oiy(new fiy(view11), 2), new oiy(new fiy(view8), 2));
                        } else if (arrayList3.isEmpty() || view8 == null) {
                            bs51Var = null;
                        } else {
                            okyVar = new oky(new oiy(new fiy(view8), 2), 1);
                        }
                        bs51Var = okyVar;
                    }
                    if (listI1.isEmpty()) {
                        mjyVar = null;
                    } else {
                        if (view8 != null) {
                            oiyVar = new oiy(new fiy(view8), 6);
                        } else {
                            oiyVar = null;
                        }
                        arrayList4 = new ArrayList(q7h.U(listI1, 10));
                        it = listI1.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(new oiy(new fiy((View) it.next()), 6));
                        }
                        mjyVar = new mjy(arrayList4, oiyVar, this.t);
                    }
                    if (jmb1Var.n) {
                        ComposeView composeView = new ComposeView(context2, null, 0, 6, null);
                        composeView.setContent(vcj.b);
                        qiyVar = new qiy(composeView, 58, "LockedBadge");
                    } else {
                        qiyVar = null;
                    }
                    iOrdinal2 = jmb1Var.h.ordinal();
                    if (iOrdinal2 != 0) {
                        i3 = 1;
                    } else if (iOrdinal2 != 1 || iOrdinal2 == 2) {
                        i3 = 2;
                    } else {
                        if (iOrdinal2 != 3) {
                            eg.o();
                            return;
                        }
                        i3 = 0;
                    }
                    if (i3 != 0) {
                        uiyVar = new uiy(i3);
                    } else {
                        uiyVar = null;
                    }
                    if (h540Var instanceof f540) {
                        ComposeView composeView2 = new ComposeView(context2, null, 0, 6, null);
                        i4 = 1;
                        composeView2.setContent(apo.j(1014008175, new wt11(jmb1Var, (byte) 1), true));
                        tiyVar = new qiy(composeView2, 1, ((f540) h540Var).a);
                    } else {
                        i4 = 1;
                        if (h540Var == null) {
                            i5 = bv11Var2.f;
                            if (i5 == 0) {
                                i6 = -1;
                            } else {
                                i6 = ut11.a[l1d.C(i5)];
                            }
                            if (i6 == -1) {
                                tiyVar = null;
                            } else if (i6 != 1) {
                                if (i6 != 2) {
                                    eg.o();
                                    return;
                                }
                                tiyVar = null;
                            } else {
                                tiyVar = new tiy(bv11Var2.g);
                            }
                            i4 = 1;
                        } else {
                            tiyVar = null;
                        }
                    }
                    iOrdinal3 = dt11Var.a(i4).ordinal();
                    if (iOrdinal3 != 0) {
                        i7 = 4;
                        riyVar = null;
                    } else if (iOrdinal3 != i4) {
                        if (iOrdinal3 != 2) {
                            if (iOrdinal3 != 3) {
                                riyVar = new riy(2);
                            } else {
                                if (iOrdinal3 == 4) {
                                    eg.o();
                                    return;
                                }
                                riyVar = new riy(3);
                            }
                            i4 = 1;
                        } else {
                            i4 = 1;
                            riyVar = new riy(1);
                        }
                        i7 = 4;
                    } else {
                        i7 = 4;
                        riyVar = new riy(4);
                    }
                    viy[] viyVarArr = new viy[i7];
                    viyVarArr[0] = qiyVar;
                    viyVarArr[i4] = uiyVar;
                    viyVarArr[2] = tiyVar;
                    viyVarArr[3] = riyVar;
                    setB0 = dm61.B0(viyVarArr);
                    if (setB0.isEmpty()) {
                        piyVar = null;
                    } else {
                        piyVar = new piy(setB0);
                    }
                    iC = l1d.C(this.e1);
                    if (iC != 0) {
                        i8 = 1;
                    } else {
                        if (iC == 1) {
                            eg.o();
                            return;
                        }
                        i8 = 3;
                    }
                    if (u890.j(n6uVar, j6u.a)) {
                        bjyVar = ajy.a;
                    } else {
                        bjyVar = new bjy(new xiy(new Object[0]));
                    }
                    cky ckyVar = new cky(lkyVar, akyVar2, fkyVar, kkyVar2, bs51Var, wiyVar2, wiyVar3, bkyVar, i2, piyVar, mjyVar, ojyVar, i8, bjyVar);
                    lly llyVar = this.Y0;
                    llyVar.getClass();
                    llyVar.f(ckyVar);
                    g();
                    llyVar.n(new d(jmb1Var, this, (byte) 19));
                    ((View) llyVar.c.getParent()).setTag(2131431182, new xu11(this.i, jmb1Var, iu30Var));
                    iu30Var.invoke(new yd00(new gve0(o4p1.B(yqgVar)), str5));
                }
                iix0Var = iix0Var2;
                rle1VarZ = mth1.z(context, iix0Var, z2);
                if (rle1VarZ != null) {
                    strA2 = rle1VarZ.a();
                } else {
                    strA2 = null;
                }
                arrayList.add(strA2);
            }
            rrt0Var = rrt0Var2;
            ArrayList arrayListO1 = o7h.o0(arrayList);
            if (i != 0) {
                dkyVarA = null;
            } else if (z) {
                if (iix0Var instanceof hix0) {
                    dkyVar2 = new dky(((hix0) iix0Var).a, false, 0.0f, f(i), 22, (l1d) null);
                } else if (iix0Var instanceof gix0) {
                    if (z2) {
                        z6 = false;
                    } else {
                        z6 = ((gix0) iix0Var).a;
                    }
                    gix0 gix0Var3 = (gix0) iix0Var;
                    long j4 = gix0Var3.b;
                    dkyVar2 = new dky(z6, true, j4 > 0 ? gix0Var3.c / j4 : 0.0f, f(i), 16, (l1d) null);
                } else {
                    if (iix0Var == null) {
                        eg.o();
                        return;
                    }
                    dkyVar2 = new dky(false, false, 0.0f, 0, 30, (l1d) null);
                }
                dkyVarA = dky.a(dkyVar2);
            } else {
                if (rrt0Var != rrt0.b) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (iix0Var instanceof hix0) {
                    if (z2) {
                        z5 = ((hix0) iix0Var).a;
                    } else {
                        z5 = ((hix0) iix0Var).a;
                    }
                    dkyVar = new dky(z5, z3, 0.0f, f(i), 20, (l1d) null);
                } else if (iix0Var instanceof gix0) {
                    if (z2) {
                        z4 = false;
                    } else {
                        z4 = ((gix0) iix0Var).a;
                    }
                    gix0 gix0Var4 = (gix0) iix0Var;
                    long j5 = gix0Var4.b;
                    dkyVar = new dky(z4, z3, j5 > 0 ? gix0Var4.c / j5 : 0.0f, f(i), 16, (l1d) null);
                } else {
                    if (iix0Var == null) {
                        eg.o();
                        return;
                    }
                    dkyVar = new dky(false, false, 0.0f, 0, 28, (l1d) null);
                }
                dkyVarA = dky.a(dkyVar);
            }
            bky bkyVar2 = new bky(arrayListO1, dkyVarA);
            if (this.O0) {
                arrayList5 = (ArrayList) listI1;
                if (arrayList5.isEmpty()) {
                    view8 = view10;
                    if (arrayList5.isEmpty()) {
                    }
                    bs51Var = null;
                } else {
                    view8 = view10;
                    if (arrayList5.isEmpty()) {
                    }
                    bs51Var = null;
                }
            } else {
                view8 = view10;
                arrayList3 = (ArrayList) listI1;
                if (!arrayList3.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                    }
                    bs51Var = null;
                } else {
                    if (arrayList3.isEmpty()) {
                    }
                    bs51Var = null;
                }
            }
            if (listI1.isEmpty()) {
                if (view8 != null) {
                    oiyVar = new oiy(new fiy(view8), 6);
                } else {
                    oiyVar = null;
                }
                arrayList4 = new ArrayList(q7h.U(listI1, 10));
                it = listI1.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new oiy(new fiy((View) it.next()), 6));
                }
                mjyVar = new mjy(arrayList4, oiyVar, this.t);
            } else {
                mjyVar = null;
            }
            if (jmb1Var.n) {
                ComposeView composeView3 = new ComposeView(context2, null, 0, 6, null);
                composeView3.setContent(vcj.b);
                qiyVar = new qiy(composeView3, 58, "LockedBadge");
            } else {
                qiyVar = null;
            }
            iOrdinal2 = jmb1Var.h.ordinal();
            if (iOrdinal2 != 0) {
                i3 = 1;
            } else if (iOrdinal2 != 1) {
                i3 = 2;
            } else {
                i3 = 2;
            }
            if (i3 != 0) {
                uiyVar = new uiy(i3);
            } else {
                uiyVar = null;
            }
            if (h540Var instanceof f540) {
                ComposeView composeView4 = new ComposeView(context2, null, 0, 6, null);
                i4 = 1;
                composeView4.setContent(apo.j(1014008175, new wt11(jmb1Var, (byte) 1), true));
                tiyVar = new qiy(composeView4, 1, ((f540) h540Var).a);
            } else {
                i4 = 1;
                if (h540Var == null) {
                    i5 = bv11Var2.f;
                    if (i5 == 0) {
                        i6 = -1;
                    } else {
                        i6 = ut11.a[l1d.C(i5)];
                    }
                    if (i6 == -1) {
                        tiyVar = null;
                    } else if (i6 != 1) {
                        if (i6 != 2) {
                            eg.o();
                            return;
                        }
                        tiyVar = null;
                    } else {
                        tiyVar = new tiy(bv11Var2.g);
                    }
                    i4 = 1;
                } else {
                    tiyVar = null;
                }
            }
            iOrdinal3 = dt11Var.a(i4).ordinal();
            if (iOrdinal3 != 0) {
                i7 = 4;
                riyVar = null;
            } else if (iOrdinal3 != i4) {
                if (iOrdinal3 != 2) {
                    if (iOrdinal3 != 3) {
                        riyVar = new riy(2);
                    } else {
                        if (iOrdinal3 == 4) {
                            eg.o();
                            return;
                        }
                        riyVar = new riy(3);
                    }
                    i4 = 1;
                } else {
                    i4 = 1;
                    riyVar = new riy(1);
                }
                i7 = 4;
            } else {
                i7 = 4;
                riyVar = new riy(4);
            }
            viy[] viyVarArr2 = new viy[i7];
            viyVarArr2[0] = qiyVar;
            viyVarArr2[i4] = uiyVar;
            viyVarArr2[2] = tiyVar;
            viyVarArr2[3] = riyVar;
            setB0 = dm61.B0(viyVarArr2);
            if (setB0.isEmpty()) {
                piyVar = null;
            } else {
                piyVar = new piy(setB0);
            }
            iC = l1d.C(this.e1);
            if (iC != 0) {
                i8 = 1;
            } else {
                if (iC == 1) {
                    eg.o();
                    return;
                }
                i8 = 3;
            }
            if (u890.j(n6uVar, j6u.a)) {
                bjyVar = new bjy(new xiy(new Object[0]));
            } else {
                bjyVar = ajy.a;
            }
            cky ckyVar2 = new cky(lkyVar, akyVar2, fkyVar, kkyVar2, bs51Var, wiyVar2, wiyVar3, bkyVar2, i2, piyVar, mjyVar, ojyVar, i8, bjyVar);
            lly llyVar2 = this.Y0;
            llyVar2.getClass();
            llyVar2.f(ckyVar2);
            g();
            llyVar2.n(new d(jmb1Var, this, (byte) 19));
            ((View) llyVar2.c.getParent()).setTag(2131431182, new xu11(this.i, jmb1Var, iu30Var));
            iu30Var.invoke(new yd00(new gve0(o4p1.B(yqgVar)), str5));
        }
        fkyVar = new fky(context.getString(2131961047), s9w.b1, 12);
        lkyVar = lkyVar;
        bv11Var2 = bv11Var3;
        n6uVar = n6uVar;
        wiyVar = null;
        str2 = bv11Var2.b;
        if (str2 != null) {
            wiyVar2 = new wiy(str2);
        } else {
            wiyVar2 = wiyVar;
        }
        if (view7 != null) {
            ziyVar = new ziy(view7);
        } else {
            ziyVar = wiyVar;
        }
        iOrdinal = rrt0Var2.ordinal();
        if (iOrdinal != 0) {
            i2 = 1;
        } else if (iOrdinal != 1) {
            i2 = 4;
        } else {
            if (iOrdinal == 2) {
                eg.o();
                return;
            }
            i2 = 3;
        }
        String strC2 = this.h.c(l3, yqgVar, context);
        arrayList = new ArrayList();
        o5a1Var = bv11Var2.q;
        wiy wiyVar4 = ziyVar;
        if (o5a1Var != null) {
            arrayList.add(mp10.A(context, o5a1Var, l3, yqgVar.b()));
            arrayList.add(mp10.y(context, false));
        }
        arrayList.add(yzo1.n(bv11Var2.j));
        arrayList.add(yzo1.m(bv11Var2.k));
        u380<lyl> u380Var2 = bv11Var2.e;
        arrayList2 = new ArrayList();
        while (r4.hasNext()) {
            if (!u890.j(lylVar, jyl.a)) {
                string3 = null;
            } else {
                if (u890.j(lylVar, kyl.a)) {
                    eg.o();
                    return;
                }
                string3 = context.getString(2131963767);
            }
            if (string3 != null) {
                arrayList2.add(string3);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.add(bv11Var2.n);
        arrayList.add(strC2);
        d = jmb1Var.f56p;
        if (d != null) {
            arrayList.add(wm5.y(d.doubleValue()));
        }
        z = this.X;
        z2 = this.Z;
        if (iix0Var2 != null) {
            iix0Var = iix0Var2;
        } else {
            if (z) {
                iix0Var = iix0Var2;
                l = bv11Var2.d;
                if (l != null) {
                    ytw0 ytw0Var2 = jfv.b;
                    context2 = context2;
                    long jL1 = fdg1.l0(l.longValue(), ngv.d);
                    rrt0Var = rrt0Var2;
                    if (rrt0Var == rrt0.a) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    arrayList.add(mth1.A(context, this.e, iix0Var, jL1, z7, this.Z));
                }
                ArrayList arrayListO2 = o7h.o0(arrayList);
                if (i != 0) {
                    dkyVarA = null;
                } else if (z) {
                    if (iix0Var instanceof hix0) {
                        dkyVar2 = new dky(((hix0) iix0Var).a, false, 0.0f, f(i), 22, (l1d) null);
                    } else if (iix0Var instanceof gix0) {
                        if (z2) {
                            z6 = false;
                        } else {
                            z6 = ((gix0) iix0Var).a;
                        }
                        gix0 gix0Var5 = (gix0) iix0Var;
                        long j6 = gix0Var5.b;
                        dkyVar2 = new dky(z6, true, j6 > 0 ? gix0Var5.c / j6 : 0.0f, f(i), 16, (l1d) null);
                    } else {
                        if (iix0Var == null) {
                            eg.o();
                            return;
                        }
                        dkyVar2 = new dky(false, false, 0.0f, 0, 30, (l1d) null);
                    }
                    dkyVarA = dky.a(dkyVar2);
                } else {
                    if (rrt0Var != rrt0.b) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (iix0Var instanceof hix0) {
                        if (z2) {
                            z5 = ((hix0) iix0Var).a;
                        } else {
                            z5 = ((hix0) iix0Var).a;
                        }
                        dkyVar = new dky(z5, z3, 0.0f, f(i), 20, (l1d) null);
                    } else if (iix0Var instanceof gix0) {
                        if (z2) {
                            z4 = false;
                        } else {
                            z4 = ((gix0) iix0Var).a;
                        }
                        gix0 gix0Var6 = (gix0) iix0Var;
                        long j7 = gix0Var6.b;
                        dkyVar = new dky(z4, z3, j7 > 0 ? gix0Var6.c / j7 : 0.0f, f(i), 16, (l1d) null);
                    } else {
                        if (iix0Var == null) {
                            eg.o();
                            return;
                        }
                        dkyVar = new dky(false, false, 0.0f, 0, 28, (l1d) null);
                    }
                    dkyVarA = dky.a(dkyVar);
                }
                bky bkyVar3 = new bky(arrayListO2, dkyVarA);
                if (this.O0) {
                    arrayList5 = (ArrayList) listI1;
                    if (arrayList5.isEmpty()) {
                        view8 = view10;
                        if (arrayList5.isEmpty()) {
                        }
                        bs51Var = null;
                    } else {
                        view8 = view10;
                        if (arrayList5.isEmpty()) {
                        }
                        bs51Var = null;
                    }
                } else {
                    view8 = view10;
                    arrayList3 = (ArrayList) listI1;
                    if (!arrayList3.isEmpty()) {
                        if (arrayList3.isEmpty()) {
                        }
                        bs51Var = null;
                    } else {
                        if (arrayList3.isEmpty()) {
                        }
                        bs51Var = null;
                    }
                }
                if (listI1.isEmpty()) {
                    if (view8 != null) {
                        oiyVar = new oiy(new fiy(view8), 6);
                    } else {
                        oiyVar = null;
                    }
                    arrayList4 = new ArrayList(q7h.U(listI1, 10));
                    it = listI1.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new oiy(new fiy((View) it.next()), 6));
                    }
                    mjyVar = new mjy(arrayList4, oiyVar, this.t);
                } else {
                    mjyVar = null;
                }
                if (jmb1Var.n) {
                    ComposeView composeView5 = new ComposeView(context2, null, 0, 6, null);
                    composeView5.setContent(vcj.b);
                    qiyVar = new qiy(composeView5, 58, "LockedBadge");
                } else {
                    qiyVar = null;
                }
                iOrdinal2 = jmb1Var.h.ordinal();
                if (iOrdinal2 != 0) {
                    i3 = 1;
                } else if (iOrdinal2 != 1) {
                    i3 = 2;
                } else {
                    i3 = 2;
                }
                if (i3 != 0) {
                    uiyVar = new uiy(i3);
                } else {
                    uiyVar = null;
                }
                if (h540Var instanceof f540) {
                    ComposeView composeView6 = new ComposeView(context2, null, 0, 6, null);
                    i4 = 1;
                    composeView6.setContent(apo.j(1014008175, new wt11(jmb1Var, (byte) 1), true));
                    tiyVar = new qiy(composeView6, 1, ((f540) h540Var).a);
                } else {
                    i4 = 1;
                    if (h540Var == null) {
                        i5 = bv11Var2.f;
                        if (i5 == 0) {
                            i6 = -1;
                        } else {
                            i6 = ut11.a[l1d.C(i5)];
                        }
                        if (i6 == -1) {
                            tiyVar = null;
                        } else if (i6 != 1) {
                            if (i6 != 2) {
                                eg.o();
                                return;
                            }
                            tiyVar = null;
                        } else {
                            tiyVar = new tiy(bv11Var2.g);
                        }
                        i4 = 1;
                    } else {
                        tiyVar = null;
                    }
                }
                iOrdinal3 = dt11Var.a(i4).ordinal();
                if (iOrdinal3 != 0) {
                    i7 = 4;
                    riyVar = null;
                } else if (iOrdinal3 != i4) {
                    if (iOrdinal3 != 2) {
                        if (iOrdinal3 != 3) {
                            riyVar = new riy(2);
                        } else {
                            if (iOrdinal3 == 4) {
                                eg.o();
                                return;
                            }
                            riyVar = new riy(3);
                        }
                        i4 = 1;
                    } else {
                        i4 = 1;
                        riyVar = new riy(1);
                    }
                    i7 = 4;
                } else {
                    i7 = 4;
                    riyVar = new riy(4);
                }
                viy[] viyVarArr3 = new viy[i7];
                viyVarArr3[0] = qiyVar;
                viyVarArr3[i4] = uiyVar;
                viyVarArr3[2] = tiyVar;
                viyVarArr3[3] = riyVar;
                setB0 = dm61.B0(viyVarArr3);
                if (setB0.isEmpty()) {
                    piyVar = null;
                } else {
                    piyVar = new piy(setB0);
                }
                iC = l1d.C(this.e1);
                if (iC != 0) {
                    i8 = 1;
                } else {
                    if (iC == 1) {
                        eg.o();
                        return;
                    }
                    i8 = 3;
                }
                if (u890.j(n6uVar, j6u.a)) {
                    bjyVar = new bjy(new xiy(new Object[0]));
                } else {
                    bjyVar = ajy.a;
                }
                cky ckyVar3 = new cky(lkyVar, akyVar2, fkyVar, kkyVar2, bs51Var, wiyVar2, wiyVar4, bkyVar3, i2, piyVar, mjyVar, ojyVar, i8, bjyVar);
                lly llyVar3 = this.Y0;
                llyVar3.getClass();
                llyVar3.f(ckyVar3);
                g();
                llyVar3.n(new d(jmb1Var, this, (byte) 19));
                ((View) llyVar3.c.getParent()).setTag(2131431182, new xu11(this.i, jmb1Var, iu30Var));
                iu30Var.invoke(new yd00(new gve0(o4p1.B(yqgVar)), str5));
            }
            iix0Var = iix0Var2;
            rle1VarZ = mth1.z(context, iix0Var, z2);
            if (rle1VarZ != null) {
                strA2 = rle1VarZ.a();
            } else {
                strA2 = null;
            }
            arrayList.add(strA2);
        }
        rrt0Var = rrt0Var2;
        ArrayList arrayListO3 = o7h.o0(arrayList);
        if (i != 0) {
            dkyVarA = null;
        } else if (z) {
            if (iix0Var instanceof hix0) {
                dkyVar2 = new dky(((hix0) iix0Var).a, false, 0.0f, f(i), 22, (l1d) null);
            } else if (iix0Var instanceof gix0) {
                if (z2) {
                    z6 = false;
                } else {
                    z6 = ((gix0) iix0Var).a;
                }
                gix0 gix0Var7 = (gix0) iix0Var;
                long j8 = gix0Var7.b;
                dkyVar2 = new dky(z6, true, j8 > 0 ? gix0Var7.c / j8 : 0.0f, f(i), 16, (l1d) null);
            } else {
                if (iix0Var == null) {
                    eg.o();
                    return;
                }
                dkyVar2 = new dky(false, false, 0.0f, 0, 30, (l1d) null);
            }
            dkyVarA = dky.a(dkyVar2);
        } else {
            if (rrt0Var != rrt0.b) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (iix0Var instanceof hix0) {
                if (z2) {
                    z5 = ((hix0) iix0Var).a;
                } else {
                    z5 = ((hix0) iix0Var).a;
                }
                dkyVar = new dky(z5, z3, 0.0f, f(i), 20, (l1d) null);
            } else if (iix0Var instanceof gix0) {
                if (z2) {
                    z4 = false;
                } else {
                    z4 = ((gix0) iix0Var).a;
                }
                gix0 gix0Var8 = (gix0) iix0Var;
                long j9 = gix0Var8.b;
                dkyVar = new dky(z4, z3, j9 > 0 ? gix0Var8.c / j9 : 0.0f, f(i), 16, (l1d) null);
            } else {
                if (iix0Var == null) {
                    eg.o();
                    return;
                }
                dkyVar = new dky(false, false, 0.0f, 0, 28, (l1d) null);
            }
            dkyVarA = dky.a(dkyVar);
        }
        bky bkyVar4 = new bky(arrayListO3, dkyVarA);
        if (this.O0) {
            arrayList5 = (ArrayList) listI1;
            if (arrayList5.isEmpty()) {
                view8 = view10;
                if (arrayList5.isEmpty()) {
                }
                bs51Var = null;
            } else {
                view8 = view10;
                if (arrayList5.isEmpty()) {
                }
                bs51Var = null;
            }
        } else {
            view8 = view10;
            arrayList3 = (ArrayList) listI1;
            if (!arrayList3.isEmpty()) {
                if (arrayList3.isEmpty()) {
                }
                bs51Var = null;
            } else {
                if (arrayList3.isEmpty()) {
                }
                bs51Var = null;
            }
        }
        if (listI1.isEmpty()) {
            if (view8 != null) {
                oiyVar = new oiy(new fiy(view8), 6);
            } else {
                oiyVar = null;
            }
            arrayList4 = new ArrayList(q7h.U(listI1, 10));
            it = listI1.iterator();
            while (it.hasNext()) {
                arrayList4.add(new oiy(new fiy((View) it.next()), 6));
            }
            mjyVar = new mjy(arrayList4, oiyVar, this.t);
        } else {
            mjyVar = null;
        }
        if (jmb1Var.n) {
            ComposeView composeView7 = new ComposeView(context2, null, 0, 6, null);
            composeView7.setContent(vcj.b);
            qiyVar = new qiy(composeView7, 58, "LockedBadge");
        } else {
            qiyVar = null;
        }
        iOrdinal2 = jmb1Var.h.ordinal();
        if (iOrdinal2 != 0) {
            i3 = 1;
        } else if (iOrdinal2 != 1) {
            i3 = 2;
        } else {
            i3 = 2;
        }
        if (i3 != 0) {
            uiyVar = new uiy(i3);
        } else {
            uiyVar = null;
        }
        if (h540Var instanceof f540) {
            ComposeView composeView8 = new ComposeView(context2, null, 0, 6, null);
            i4 = 1;
            composeView8.setContent(apo.j(1014008175, new wt11(jmb1Var, (byte) 1), true));
            tiyVar = new qiy(composeView8, 1, ((f540) h540Var).a);
        } else {
            i4 = 1;
            if (h540Var == null) {
                i5 = bv11Var2.f;
                if (i5 == 0) {
                    i6 = -1;
                } else {
                    i6 = ut11.a[l1d.C(i5)];
                }
                if (i6 == -1) {
                    tiyVar = null;
                } else if (i6 != 1) {
                    if (i6 != 2) {
                        eg.o();
                        return;
                    }
                    tiyVar = null;
                } else {
                    tiyVar = new tiy(bv11Var2.g);
                }
                i4 = 1;
            } else {
                tiyVar = null;
            }
        }
        iOrdinal3 = dt11Var.a(i4).ordinal();
        if (iOrdinal3 != 0) {
            i7 = 4;
            riyVar = null;
        } else if (iOrdinal3 != i4) {
            if (iOrdinal3 != 2) {
                if (iOrdinal3 != 3) {
                    riyVar = new riy(2);
                } else {
                    if (iOrdinal3 == 4) {
                        eg.o();
                        return;
                    }
                    riyVar = new riy(3);
                }
                i4 = 1;
            } else {
                i4 = 1;
                riyVar = new riy(1);
            }
            i7 = 4;
        } else {
            i7 = 4;
            riyVar = new riy(4);
        }
        viy[] viyVarArr4 = new viy[i7];
        viyVarArr4[0] = qiyVar;
        viyVarArr4[i4] = uiyVar;
        viyVarArr4[2] = tiyVar;
        viyVarArr4[3] = riyVar;
        setB0 = dm61.B0(viyVarArr4);
        if (setB0.isEmpty()) {
            piyVar = null;
        } else {
            piyVar = new piy(setB0);
        }
        iC = l1d.C(this.e1);
        if (iC != 0) {
            i8 = 1;
        } else {
            if (iC == 1) {
                eg.o();
                return;
            }
            i8 = 3;
        }
        if (u890.j(n6uVar, j6u.a)) {
            bjyVar = new bjy(new xiy(new Object[0]));
        } else {
            bjyVar = ajy.a;
        }
        cky ckyVar4 = new cky(lkyVar, akyVar2, fkyVar, kkyVar2, bs51Var, wiyVar2, wiyVar4, bkyVar4, i2, piyVar, mjyVar, ojyVar, i8, bjyVar);
        lly llyVar4 = this.Y0;
        llyVar4.getClass();
        llyVar4.f(ckyVar4);
        g();
        llyVar4.n(new d(jmb1Var, this, (byte) 19));
        ((View) llyVar4.c.getParent()).setTag(2131431182, new xu11(this.i, jmb1Var, iu30Var));
        iu30Var.invoke(new yd00(new gve0(o4p1.B(yqgVar)), str5));
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, int i) {
        Context context = this.a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165820);
        Drawable drawableG = x74.G(context, 2131232508);
        drawableG.getClass();
        drawableG.setTint(ago1.o(context, i, 0));
        drawableG.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.setSpan(new ImageSpan(drawableG, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }

    public final mky c(View... viewArr) {
        LinearLayout linearLayout = this.X0;
        if (linearLayout == null) {
            List<View> listQ0 = f46.Q0(viewArr);
            linearLayout = new LinearLayout(this.a);
            linearLayout.setOrientation(0);
            linearLayout.removeAllViews();
            int dimensionPixelSize = linearLayout.getContext().getResources().getDimensionPixelSize(2131165808);
            for (View view : listQ0) {
                view.setImportantForAccessibility(1);
                linearLayout.addView(view, new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            }
            this.X0 = linearLayout;
        }
        return new mky(linearLayout);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e() throws NoWhenBranchMatchedException {
        int i;
        FrameLayout frameLayout = this.a1;
        jhc1.q(0, frameLayout).setVisibility(8);
        View viewInflate = this.b1;
        if (viewInflate == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.a);
            int iC = l1d.C(this.d1);
            if (iC == 0) {
                i = 2131625581;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                i = 2131625582;
            }
            viewInflate = layoutInflaterFrom.inflate(i, (ViewGroup) frameLayout, false);
            this.b1 = viewInflate;
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
        }
        viewInflate.setVisibility(0);
    }

    public final void g() {
        ye yeVar = this.P0;
        ArrayList arrayListO0 = o7h.o0(p7h.M(new xe[]{yeVar.a, yeVar.b, yeVar.c, yeVar.d, yeVar.e, yeVar.f}));
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListO0) {
            if (!ihc1.y0(((xe) obj).a)) {
                arrayList.add(obj);
            }
        }
        this.Z0.b(arrayList);
    }

    @Override // p.isw
    public final View getView() {
        return this.a1;
    }
}
