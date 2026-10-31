package p;

import android.content.Context;
import android.graphics.CornerPathEffect;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.encoremobile.facepile.FaceView;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d4 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(rs0 rs0Var, Date date, Date date2) {
        super(1);
        this.a = (byte) 8;
        this.b = date;
        this.c = date2;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 3;
        byte b3 = 2;
        lnm date = null;
        byte b4 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qv00 qv00Var = (qv00) obj;
                String str = (String) obj2;
                qv00Var.a(str, zc8.class, false);
                qv00Var.a(str, f7l1.class, false);
                qv00Var.a(str, j7o.class, false);
                qv00Var.a(str, l98.class, false);
                qv00Var.a(str, jo70.class, false);
                qv00Var.a(str, pnt.class, false);
                e4 e4Var = (e4) obj3;
                if (e4Var.c) {
                    qv00Var.a(str, a7q0.class, false);
                }
                if (e4Var.d) {
                    qv00Var.a(str, r98.class, false);
                }
                return rih1Var;
            case 1:
                return new x4((uu00) obj2, (wh71) obj3, (oud) obj);
            case 2:
                DrawScope drawScope = (DrawScope) obj;
                float fH = drawScope.h();
                n041 n041Var = (n041) obj2;
                List list = (List) obj3;
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).t(fH, fH, 0L);
                    for (sr31 sr31Var : f8.c) {
                        tw4 tw4VarB = f8.b(sr31Var);
                        boolean z = n041Var.b;
                        vex vexVar = n041Var.c;
                        DrawScope.w0(drawScope, tw4VarB, z ? vexVar.k : vexVar.d, new phc1(1.0f, 0.0f, 1, 0, new uw4(new CornerPathEffect(sr31Var.a)), 10), 48);
                    }
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((mpg0) it.next()).b);
                    }
                    for (lit litVar : o7h.O0(f8.b, arrayList)) {
                        n041 n041Var2 = n041Var;
                        DrawScope.v(drawScope, n041Var.a(), (((long) Float.floatToRawIntBits(litVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(litVar.a)) << 32), (((long) Float.floatToRawIntBits(litVar.c)) << 32) | (((long) Float.floatToRawIntBits(litVar.d)) & 4294967295L), 120);
                        n041Var = n041Var2;
                        break;
                    }
                    return rih1Var;
                } finally {
                    i3a.n(cabVarA1, jU);
                }
            case 3:
                rtb0 rtb0Var = (rtb0) obj;
                pt ptVar = (pt) obj3;
                xs xsVar = (xs) obj2;
                vs vsVar = (vs) xsVar;
                ev evVar = vsVar.c;
                if (evVar != null) {
                    rtb0.c(rtb0Var, evVar.a, new j2i(-1391050056, new wf(ptVar, evVar, b3), true), 2);
                }
                c380 c380Var = vsVar.a;
                rtb0Var.e(c380Var.size(), new nt(c380Var, (byte) 0), new nt(c380Var, (byte) 1), new j2i(2039820996, new ot(c380Var, ptVar, (byte) 0), true));
                if (vsVar.b) {
                    rtb0.c(rtb0Var, -1, new j2i(1673270257, new wf(ptVar, xsVar, b2), true), 2);
                }
                return rih1Var;
            case 4:
                c380 c380Var2 = (c380) obj2;
                ((kex) obj).b(c380Var2.size(), new j2i(-1673449743, new wf((Object) c380Var2, obj3, (byte) 5), true), new s6(c380Var2, (byte) 2));
                return rih1Var;
            case 5:
                ve01 ve01Var = ((xd0) obj2).c;
                vbm[] vbmVarArr = q601.a;
                return new x010(ve01Var, new kge((Flowable) obj3), new l2(b2, date, b4), (byte) 1);
            case 6:
                er91 er91Var = (er91) obj3;
                wp0 wp0Var = (wp0) obj2;
                kt91 kt91Var = wp0Var.d;
                if (!kt91Var.g() || wp0Var.f.h(wp0Var.a)) {
                    kt91Var.o(er91Var);
                } else {
                    kt91Var.k(er91Var);
                }
                return rih1Var;
            case 7:
                return new x010((mr20) obj2, (bpb1) ((br0) obj3).c, new vm0(3, (lnm) null, (byte) 1), (byte) 1);
            case 8:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM AdOnAppOpenEntity WHERE id = ? AND expiresAt > ?");
                try {
                    d441VarG1.r(1, ((Date) obj2).getTime());
                    d441VarG1.r(2, ((Date) obj3).getTime());
                    int iW = y7y0.w(d441VarG1, "id");
                    int iW2 = y7y0.w(d441VarG1, "isShown");
                    int iW3 = y7y0.w(d441VarG1, "expiresAt");
                    if (d441VarG1.f1()) {
                        Long lValueOf = d441VarG1.isNull(iW) ? null : Long.valueOf(d441VarG1.getLong(iW));
                        Date date2 = lValueOf != null ? new Date(lValueOf.longValue()) : null;
                        if (date2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        boolean z2 = ((int) d441VarG1.getLong(iW2)) != 0;
                        Long lValueOf2 = d441VarG1.isNull(iW3) ? null : Long.valueOf(d441VarG1.getLong(iW3));
                        date = lValueOf2 != null ? new Date(lValueOf2.longValue()) : null;
                        if (date == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        date = new zs0(date2, z2, date);
                    }
                    d441VarG1.close();
                    return date;
                } catch (Throwable th) {
                    d441VarG1.close();
                    throw th;
                }
            case 9:
                ((rs0) obj2).b.D((y341) obj, (zs0) obj3);
                return rih1Var;
            case 10:
                ((qtr) obj).b(new gz0((iz0) obj2, (xu30) obj3, (lnm) null));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((frr0) obj3).t(((Number) obj).longValue());
                ((iu30) obj2).invoke(uy0.a);
                return rih1Var;
            case grn1.d /* 12 */:
                ((iu30) obj2).invoke(new ua1((String) obj));
                az20.a((az20) obj3);
                return rih1Var;
            case 13:
                ((iu30) ((ven0) obj2).getValue()).invoke(new ua1((String) obj));
                az20.a((az20) obj3);
                return rih1Var;
            case 14:
                String str2 = ((f9w) obj2).b;
                boolean z3 = ((jy21) obj) instanceof ey21;
                Context context = (Context) ((zd1) obj3).c;
                String string = z3 ? context.getString(2131963276) : context.getString(2131955714);
                string.getClass();
                return new ryz(string, str2);
            case 15:
                ((sb7) ((cp5) obj3).b).a((String) obj2, (tv80) obj);
                return rih1Var;
            case 16:
                a1r0.e((a1r0) ((ifl1) obj2).b, new dwn0((String) ((idd1) obj3).getValue(), "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0((tv80) obj)), (Bundle) null, 6);
                return rih1Var;
            case 17:
                Context context2 = (Context) obj;
                lh1 lh1Var = (lh1) obj2;
                td10 td10Var = new td10(lh1Var.a.equals("") ? null : lh1Var.a, lh1Var.b, (String) null, (sd10) null);
                FaceView faceView = new FaceView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                faceView.e((af10) obj3, td10Var);
                return faceView;
            case 18:
                ((sb7) ((yo31) obj3).b).a((String) obj2, (tv80) obj);
                return rih1Var;
            case 19:
                y6h1 y6h1Var = ((q1l0) obj).a;
                lk3 lk3Var = (kk3) obj3;
                if (!(lk3Var instanceof lk3)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                String strD = lk3Var.d();
                String str3 = (String) obj2;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (strD == null) {
                    strD = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", strD), new mmr0("item_to_be_added", str3 != null ? str3 : "")})), y6h1Var, r6h1.c, System.currentTimeMillis());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                am1 am1Var = (am1) obj;
                nm1 nm1Var = (nm1) obj2;
                d0r d0rVar = (d0r) nm1Var.g;
                return new vd0(d0rVar != null ? d3p1.H(d0rVar, (o3r) nm1Var.c, am1Var) : new huz(new gm1(am1Var.b, Boolean.valueOf(am1Var.e)), (byte) 10), am1Var, (bl3) obj3, (byte) 2);
            case 21:
                int iOrdinal = ((dcv) obj).ordinal();
                if (iOrdinal == 0) {
                    ((q01) obj2).invoke();
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    ((Function0) obj3).invoke();
                }
                return rih1Var;
            case 22:
                geo0 geo0Var = geo0.b;
                ozn1.o((c9n) obj2, new q4((ven0) obj3, (bhd) obj, (lnm) null, (byte) 20));
                return rih1Var;
            case 23:
                wt1 wt1Var = (wt1) obj2;
                gpk0 gpk0Var = wt1Var.b;
                i8h1 i8h1Var = wt1Var.a;
                int iOrdinal2 = ((wo1) obj).ordinal();
                if (iOrdinal2 == 0) {
                    i8h1Var.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), gpk0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (iOrdinal2 == 1) {
                    x6h1 x6h1VarC = gpk0Var.a.c();
                    x6h1VarC.i.add(new a7h1("outside_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = gpk0Var.a.c();
                    x6h1VarC2.i.add(new a7h1("back", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                ((xj0) obj3).invoke(ws1.a);
                return rih1Var;
            case 24:
                if (hx1.a[((via1) obj).ordinal()] == 1) {
                    ((ix1) obj2).g.invoke((pia1) obj3);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 25:
                ((jm1) obj2).invoke((pia1) obj);
                ((lx1) obj3).dismiss();
                return rih1Var;
            case 26:
                e261 e261Var = (e261) obj;
                if (((fu1) obj3).f) {
                    b261.t(e261Var, 1);
                    b261.n(e261Var, (String) obj2);
                }
                return rih1Var;
            case 27:
                oy1 oy1Var = (oy1) obj3;
                fn31.T(cto1.q(oy1Var.d), oy1Var.e, 0, new c6(oy1Var, (String) obj2, (tv80) obj, (lnm) null, (byte) 12), 2);
                return rih1Var;
            case 28:
                return new ia2(((na2) obj2).d.subscribe(new ha2((ven0) obj3, (byte) 0)), (byte) 0);
            default:
                ae0 ae0Var = new ae0((bab1) obj3, (byte) 1);
                dg30 dg30Var = (dg30) obj2;
                if (dg30Var != null) {
                    ((g0i) dg30Var).Y.add(ae0Var);
                }
                return new ht0(dg30Var, ae0Var, (byte) 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(byte b, Object obj, String str) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = str;
    }
}
