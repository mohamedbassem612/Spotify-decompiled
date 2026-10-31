package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionListDisplay;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionsRow;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ggh extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggh(iu30 iu30Var, ven0 ven0Var, c9n c9nVar, ven0 ven0Var2) {
        super(1);
        this.a = (byte) 21;
        this.c = iu30Var;
        this.e = ven0Var;
        this.b = c9nVar;
        this.d = ven0Var2;
    }

    public final Object invoke(Object obj) throws Throwable {
        ReactionListDisplay reactionListDisplay;
        h290 h290VarO;
        Object obj2;
        String str;
        float f;
        View view;
        Drawable background;
        long j;
        byte b = this.a;
        byte b2 = 24;
        kfi1 kfi1Var = null;
        byte b3 = 1;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                wz20 wz20Var = (wz20) obj;
                ven0 ven0Var = (ven0) obj6;
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                ven0Var.setValue(Boolean.valueOf(wz20Var.b()));
                if (zBooleanValue && !wz20Var.b() && ((CharSequence) obj4).length() > 0) {
                    ((iu30) obj3).invoke(((y7e1) obj5).d().d.toString());
                }
                return rih1Var;
            case 1:
                e261 e261Var = (e261) obj;
                gal galVar = ((oih) obj4).d;
                Context context = (Context) obj3;
                fih fihVar = (fih) obj5;
                ReactionsRow reactionsRow = fihVar.l;
                StringBuilder sb = new StringBuilder();
                xhh xhhVar = fihVar.a;
                String name = xhhVar.getName();
                if (!ihc1.y0(name)) {
                    sb.append(context.getString(2131954076, name, ((xjh) galVar.c).a(fihVar.i, ((yqg) galVar.b).b())));
                    sb.append('\n');
                }
                whh whhVar = xhhVar instanceof whh ? (whh) xhhVar : null;
                if (whhVar != null && whhVar.d) {
                    sb.append(context.getString(2131954079));
                    sb.append('\n');
                }
                sb.append(fihVar.b);
                sb.append('\n');
                if (reactionsRow == null || (h290VarO = reactionsRow.o()) == null) {
                    reactionListDisplay = null;
                } else {
                    Iterator it = h290VarO.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((ReactionListDisplay) next).n() == 2) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    reactionListDisplay = (ReactionListDisplay) obj2;
                }
                if (reactionListDisplay != null) {
                    sb.append(context.getString(2131954077, reactionListDisplay.q().p(), reactionListDisplay.p()));
                    sb.append('\n');
                }
                int iP = reactionsRow != null ? reactionsRow.p() : 0;
                if (iP > 0) {
                    String quantityString = reactionListDisplay != null ? context.getResources().getQuantityString(2131820625, iP, Integer.valueOf(iP)) : context.getResources().getQuantityString(2131820626, iP, Integer.valueOf(iP));
                    quantityString.getClass();
                    sb.append(quantityString);
                    sb.append('\n');
                }
                if (fihVar.g) {
                    sb.append(context.getString(2131954078));
                    sb.append('\n');
                }
                b261.n(e261Var, ihc1.e1(sb.toString()).toString());
                b261.p(e261Var, (ArrayList) obj6);
                b261.B(e261Var, "comment_row");
                return rih1Var;
            case 2:
                Offset offset = (Offset) obj;
                long j2 = offset.a;
                ven0 ven0Var2 = (ven0) obj6;
                lhh lhhVar = ((mhh) obj4).f;
                String str2 = lhhVar.e;
                if (str2 != null && (str = lhhVar.d) != null) {
                    kfi1Var = new kfi1(str, str2);
                }
                ven0Var2.setValue(kfi1Var);
                ((ven0) obj3).setValue(offset);
                ((ven0) obj5).setValue(Boolean.TRUE);
                return rih1Var;
            case 3:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, (String) obj4);
                b261.B(e261Var2, "social_interactivity_comment_row_reactions");
                if (((Function0) obj3) == null) {
                    b261.p(e261Var2, Collections.singletonList(new epo((String) obj5, new ukf((Function0) obj6, (byte) 23))));
                }
                return rih1Var;
            case 4:
                return new sj4((ven0) obj6, (ven0) obj4, (xmh) obj3, (ven0) obj5, (byte) 1);
            case 5:
                e261 e261Var3 = (e261) obj;
                b261.C(e261Var3, new af5((String) obj4));
                b261.p(e261Var3, Collections.singletonList(new epo((String) obj3, new ame((View) obj5, (String) obj6, (byte) 25))));
                return rih1Var;
            case 6:
                int iIntValue = ((Number) obj).intValue();
                Float f2 = ((dwa1) obj4).c;
                if (f2 != null) {
                    ven0 ven0Var3 = (ven0) obj5;
                    ((ven0) obj6).setValue(Integer.valueOf(jch0.U(((iIntValue / 100.0f) + 1.0f) * f2.floatValue())));
                    ven0Var3.setValue(Integer.valueOf(((Number) ven0Var3.getValue()).intValue() + 1));
                }
                ((iu30) obj3).invoke(new bwa1(iIntValue));
                return rih1Var;
            case 7:
                iu30 iu30Var = (iu30) obj3;
                fad0 fad0Var = (fad0) obj5;
                rtb0 rtb0Var = (rtb0) obj;
                vme0 vme0Var = (vme0) obj4;
                List list = vme0Var.e;
                int i = vme0Var.c;
                List list2 = vme0Var.a;
                if (i == 1 && vme0Var.f.b != 1) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(-1545999104, new nzd((Object) vme0Var, (Object) fad0Var, (Object) iu30Var, (byte) 6), true), 3);
                }
                if (list2.isEmpty() && !list.isEmpty()) {
                    rtb0.c(rtb0Var, (Object) null, zdi.a, 3);
                    rtb0Var.e(list.size(), new kwd(list, (byte) 18), new kwd(list, (byte) 19), new j2i(2039820996, new qvj(list, fad0Var, vme0Var, (ven0) obj6, iu30Var, (byte) 0), true));
                } else if (!list2.isEmpty()) {
                    rtb0Var.e(list2.size(), new kwd(list2, (byte) 20), new kwd(list2, (byte) 21), new j2i(2039820996, new qvj(list2, fad0Var, vme0Var, (ven0) obj6, iu30Var, (byte) 1), true));
                }
                return rih1Var;
            case 8:
                ((hrr0) ((tck) obj4).k).setValue(new sck((String) obj3, (String) obj5, (String) obj6));
                return rih1Var;
            case 9:
                rtb0 rtb0Var2 = (rtb0) obj;
                i7d i7dVar = (i7d) obj4;
                nkk nkkVar = (nkk) obj5;
                iu30 iu30Var2 = (iu30) obj3;
                i7dVar.j(rtb0Var2, i7d.i(nkkVar.b), iu30Var2, 0);
                lkk lkkVar = nkkVar.c;
                if (lkkVar != null) {
                    err0 err0Var = (hdn0) obj6;
                    rtb0.f(rtb0Var2, "tabs", new j2i(1781940431, new wh(err0Var, lkkVar, (byte) 7), true), 2);
                    i7dVar.j(rtb0Var2, i7d.i(((mkk) lkkVar.a.get(err0Var.s())).c), iu30Var2, nkkVar.b.size());
                }
                return rih1Var;
            case 10:
                kd31 kd31Var = (kd31) obj;
                drr0 drr0Var = (drr0) obj4;
                kd31Var.q(drr0Var.s());
                kd31Var.r(drr0Var.s());
                ven0 ven0Var4 = (ven0) obj6;
                long jC = frm.c(drr0Var.s(), ((ni7) obj3).i(), (((long) Float.floatToRawIntBits((int) (((yr80) ven0Var4.getValue()).a & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (((yr80) ven0Var4.getValue()).a >> 32))) << 32));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC & 4294967295L));
                ven0 ven0Var5 = (ven0) obj5;
                kd31Var.C(yoi1.o(Float.intBitsToFloat((int) (((Offset) ven0Var5.getValue()).a >> 32)), -fIntBitsToFloat, fIntBitsToFloat));
                kd31Var.E(yoi1.o(Float.intBitsToFloat((int) (((Offset) ven0Var5.getValue()).a & 4294967295L)), -fIntBitsToFloat2, fIntBitsToFloat2));
                return rih1Var;
            case 11:
                int iIntValue2 = ((Number) obj).intValue();
                h72 h72Var = (h72) obj4;
                TextView textView = (TextView) obj3;
                textView.getClass();
                h360.l(h72Var, iIntValue2, textView);
                Toolbar toolbar = (Toolbar) h72Var.X;
                avn avnVar = (avn) obj5;
                idd1 idd1Var = avnVar.Y0;
                if (avnVar.Q0) {
                    h360.b(h72Var, iIntValue2);
                    h360.c(h72Var, ((Number) avnVar.Z0.getValue()).intValue(), iIntValue2, avnVar.W0);
                }
                int iIntValue3 = ((Number) idd1Var.getValue()).intValue();
                View view2 = avnVar.V0;
                kfi1 kfi1Var2 = (FrameLayout) view2.findViewById(2131428372);
                TextView textView2 = (TextView) view2.findViewById(2131428374);
                TextView textView3 = (TextView) view2.findViewById(2131428380);
                View viewFindViewById = view2.findViewById(2131428371);
                kfi1 kfi1Var3 = avnVar.g;
                if (kfi1Var3 == null) {
                    kfi1Var3 = kfi1Var2.getBottom() > toolbar.getHeight() ? kfi1Var2 : null;
                }
                if (kfi1Var3 != null) {
                    float bottom = kfi1Var3.getBottom() - toolbar.getHeight();
                    float fAbs = bottom - Math.abs(iIntValue3);
                    if (fAbs < 1.0f) {
                        fAbs = 1.0f;
                    }
                    float fO = yoi1.o(bottom + iIntValue2, 0.0f, fAbs) / fAbs;
                    kfi1Var2.setAlpha(fO);
                    textView2.setAlpha(fO);
                    textView3.setAlpha(fO);
                    viewFindViewById.setAlpha(fO);
                }
                if (avnVar.c != null) {
                    View view3 = (View) obj6;
                    int iIntValue4 = ((Number) idd1Var.getValue()).intValue();
                    view3.getClass();
                    float f3 = (-iIntValue2) / (-iIntValue4);
                    f = 1.0f;
                    view3.setAlpha(1.0f - yoi1.o(f3, 0.0f, 1.0f));
                } else {
                    f = 1.0f;
                }
                float totalScrollRange = ((BehaviorRetainingAppBarLayout) h72Var.b).getTotalScrollRange();
                float f4 = -iIntValue2;
                float fO2 = yoi1.o(f4 / (totalScrollRange < f ? f : totalScrollRange), 0.0f, f);
                View view4 = avnVar.X0;
                if (view4 != null && (background = view4.getBackground()) != null) {
                    background.setAlpha(jch0.U((f - fO2) * 255.0f));
                }
                if (avnVar.e && (view = avnVar.d) != null) {
                    view.setAlpha(yoi1.o(2.0f - (fO2 * 2.0f), 0.0f, 1.0f));
                }
                if (textView.getY() <= toolbar.getHeight()) {
                    float height = toolbar.getHeight();
                    float fO3 = yoi1.o(f4 / (height < 1.0f ? 1.0f : height), 0.0f, 1.0f);
                    toolbar.setAlpha(fO3);
                    ((TextView) h72Var.Y).setAlpha(fO3);
                }
                return rih1Var;
            case 12:
                h5o h5oVar = (j5o) obj4;
                Context context2 = (Context) obj5;
                iu30 iu30Var3 = (iu30) obj3;
                bzm bzmVar = new bzm((ven0) obj6, (byte) 5);
                if (h5oVar instanceof h5o) {
                    h5o h5oVar2 = h5oVar;
                    ArrayList arrayList = h5oVar2.b;
                    if (arrayList.size() == 1) {
                        iu30Var3.invoke(z4o.a);
                    } else {
                        iu30Var3.invoke(a5o.a);
                        Integer numL = cto1.l(h5oVar2.a, arrayList.size());
                        if (numL != null) {
                            kfi1 string = context2.getString(numL.intValue());
                            if (string.length() > 0) {
                                string = ((Object) String.valueOf(string.charAt(0)).toUpperCase(Locale.ROOT)) + string.substring(1);
                            }
                            kfi1Var = string;
                        }
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            e5o e5oVar = ((g5o) it2.next()).a;
                            arrayList2.add(new iy2(52, e5oVar.a, e5oVar.b, (String) null, (ArrayList) null));
                        }
                        bzmVar.invoke(new jy2(kfi1Var, arrayList2, new j3m(bzmVar, (byte) 28)));
                    }
                }
                return rih1Var;
            case 13:
                return new res((n4b) obj4, (ulc) obj3, (q8n) obj5, (wh71) obj6, (oud) obj);
            case 14:
                dlo dloVar = (dlo) obj4;
                mko mkoVarB = ((lko) obj5).b((String) obj6, (zob1) obj, (iu30) obj3);
                dloVar.c = mkoVarB;
                return new h961(new zko(dloVar, (byte) 0), new zko(dloVar, (byte) 1), new i0h(new qbk(mkoVarB.b().a(), dloVar, (byte) 24), (byte) 8));
            case 15:
                DrawScope drawScope = (DrawScope) obj;
                float fE = (Size.e(drawScope.j()) / 2.0f) * 0.9f;
                float fFloatValue = ((Number) ((tob1) obj4).getValue()).floatValue();
                long jO = zno1.o(drawScope.j());
                x9a0 x9a0Var = (x9a0) obj3;
                tob1 tob1Var = (tob1) obj5;
                tob1 tob1Var2 = (tob1) obj6;
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).s(fFloatValue, jO);
                    int i2 = 0;
                    while (i2 < 4) {
                        float f5 = i2 * 90.0f;
                        float fFloatValue2 = ((Number) tob1Var.getValue()).floatValue() * 90.0f;
                        float fFloatValue3 = ((Number) tob1Var2.getValue()).floatValue() * 90.0f;
                        int i3 = i2;
                        long j3 = x9a0Var.a;
                        float f6 = f5 + fFloatValue2;
                        float f7 = fFloatValue3 - fFloatValue2;
                        float f8 = fE;
                        DrawScope drawScope2 = drawScope;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.g1() >> 32)) - fE)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.g1() & 4294967295L)) - fE)) & 4294967295L);
                        drawScope2.j();
                        float f9 = 2.0f * f8;
                        drawScope = drawScope2;
                        x9a0 x9a0Var2 = x9a0Var;
                        tob1 tob1Var3 = tob1Var;
                        j = jU;
                        try {
                            DrawScope.i1(drawScope, j3, f6, f7, jFloatToRawIntBits, Size.a(f9, f9), new phc1((float) Math.ceil(Size.e(drawScope2.j()) * 0.06508876f), 0.0f, 1, 0, (uw4) null, 26), 832);
                            i2 = i3 + 1;
                            fE = f8;
                            jU = j;
                            x9a0Var = x9a0Var2;
                            tob1Var = tob1Var3;
                        } catch (Throwable th) {
                            th = th;
                            i3a.n(cabVarA1, j);
                            throw th;
                        }
                    }
                    i3a.n(cabVarA1, jU);
                    return rih1Var;
                } catch (Throwable th2) {
                    th = th2;
                    j = jU;
                }
                break;
            case 16:
                List list3 = (List) obj;
                return ((xu30) obj4).invoke(((l4r) obj3).e.invoke(list3.get(0)), ((l4r) obj5).e.invoke(list3.get(1)), ((l4r) obj6).e.invoke(list3.get(2)));
            case 17:
                rtb0 rtb0Var3 = (rtb0) obj;
                iu30 iu30Var4 = (iu30) obj3;
                oom0 oom0Var = (qom0) obj4;
                rtb0.c(rtb0Var3, "header", new j2i(-1266494171, new k8((zom0) obj5, iu30Var4, oom0Var, (uwl) obj6, (byte) 22), true), 2);
                rtb0.c(rtb0Var3, "divider", p2j.a, 2);
                if (oom0Var instanceof pom0) {
                    rtb0.c(rtb0Var3, "loading", p2j.b, 2);
                } else if (oom0Var instanceof mom0) {
                    rtb0.c(rtb0Var3, "error", p2j.c, 2);
                } else {
                    if (!(oom0Var instanceof oom0)) {
                        eg.o();
                        return null;
                    }
                    rtb0.c(rtb0Var3, "create_new_folder", new j2i(-1208402651, new ip0(iu30Var4, (byte) 26), true), 2);
                    ArrayList arrayList3 = oom0Var.b;
                    rtb0Var3.e(arrayList3.size(), new ry4(arrayList3, (byte) 14), new ry4(arrayList3, (byte) 15), new j2i(2039820996, new lmi(arrayList3, iu30Var4, b3), true));
                }
                return rih1Var;
            case 18:
                u2r u2rVar = (u2r) obj;
                List list4 = (List) obj4;
                if (list4 != null) {
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        u2rVar.b((l2r) it3.next());
                    }
                }
                List list5 = (List) obj5;
                if (list5 != null) {
                    Iterator it4 = list5.iterator();
                    while (it4.hasNext()) {
                        u2rVar.d((l2r) it4.next());
                    }
                }
                iu30 iu30Var5 = (iu30) obj3;
                if (iu30Var5 != null) {
                    iu30Var5.invoke(u2rVar);
                }
                List list6 = (List) obj6;
                if (list6 != null) {
                    Iterator it5 = list6.iterator();
                    while (it5.hasNext()) {
                        u2rVar.e.add((l20) it5.next());
                    }
                }
                return rih1Var;
            case 19:
                ((t6t) ((her) obj4).b).a((s6t) obj3, (String) obj5, (String) obj6);
                return rih1Var;
            case 20:
                fjl0 fjl0Var = (fjl0) obj6;
                mxr mxrVar = (mxr) obj3;
                dg30 dg30Var = (dg30) mxrVar.b;
                Set set = s4b1.f;
                String str3 = (String) obj4;
                if (uic.k(str3, wyu0.f, nyu0.e)) {
                    pbh0 pbh0Var = new pbh0(dg30Var, 0);
                    pbh0Var.f(2131954359);
                    ((uh3) pbh0Var).a.f = dg30Var.getString(2131954356, (String) obj5);
                    pbh0Var.d(2131954358, new j7b(mxrVar, fjl0Var, str3)).c(2131954357, new ln5(mxrVar, fjl0Var, (byte) 7)).create().show();
                } else {
                    n57.e("Trying to incorrectly delete uri : ".concat(str3));
                }
                return rih1Var;
            case 21:
                Offset offset2 = (Offset) obj;
                long j4 = offset2.a;
                ((ven0) obj6).setValue(Boolean.TRUE);
                o5v o5vVar = new o5v();
                fn31.T((c9n) obj4, (o8n) null, 0, new g6v(o5vVar, (lnm) null, (byte) 1), 3);
                ((ven0) obj5).setValue(o5vVar);
                ((iu30) obj3).invoke(offset2);
                return rih1Var;
            case 22:
                bs51.d((ven0) obj6, (ss50) obj4, (xtb0) obj3, (ven0) obj5, new q00((int) (((elb0) obj).b() & 4294967295L)));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                tv80 tv80Var = (tv80) obj;
                Parcelable u3i0Var = new u3i0((String) obj5, new o3i0((String) obj6), tv80Var.a.a, (o6i0) null, (String) null, 24);
                Bundle bundle = new Bundle();
                bundle.putParcelable("mediatrimmer.args", u3i0Var);
                ((f3b) obj4).a.a((String) obj3, tv80Var, bundle);
                return rih1Var;
            case 24:
                bw91 bw91Var = (bw91) obj5;
                ((ss50) obj4).a(0);
                Set set2 = (Set) ((vqv) obj3).b.b.a.getValue();
                if ((obj instanceof String) && set2.contains(obj) && set2.size() > 1) {
                    LinkedHashSet linkedHashSetU0 = dm61.u0(obj, set2);
                    ven0 ven0Var6 = (ven0) obj6;
                    String str4 = (String) obj;
                    u380 u380VarC = mqo1.C(set2);
                    ArrayList arrayList4 = new ArrayList();
                    ek60 ek60VarListIterator = bw91Var.listIterator();
                    while (true) {
                        ek60 ek60Var = ek60VarListIterator;
                        if (ek60Var.hasNext()) {
                            Object next2 = ek60Var.next();
                            if (linkedHashSetU0.contains(((ftv) next2).a)) {
                                arrayList4.add(next2);
                            }
                        } else {
                            List listD1 = o7h.d1(arrayList4, 2);
                            ArrayList arrayList5 = new ArrayList(q7h.U(listD1, 10));
                            Iterator it6 = listD1.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(((ftv) it6.next()).e);
                            }
                            ven0Var6.setValue(new nqm0(str4, u380VarC, mqo1.A(arrayList5)));
                            r7h.a0(bw91Var, new nqv(linkedHashSetU0, (byte) 0));
                        }
                    }
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                rtb0 rtb0Var4 = (rtb0) obj;
                rtb0.c(rtb0Var4, (Object) null, new j2i(-2095215373, new ywv((eyv) obj5, (bxv) obj6, (iu30) obj3), true), 3);
                jyo1.m(rtb0Var4, (q1d0) obj4, new d720(axv.c, b2));
                return rih1Var;
            case 26:
                maa maaVar = (maa) obj4;
                try {
                    return maaVar.a().a(obj5, obj6, (op80) obj);
                } catch (Exception e) {
                    loo1.o(e, ((iu30) obj3).invoke(obj5), obj6, maaVar.b());
                    throw null;
                }
            case 27:
                loo1.o((Throwable) obj, ((iu30) obj3).invoke(((ven0) obj6).getValue()), ((q811) obj4).a, ((maa) obj5).b());
                throw null;
            case 28:
                xa5 xa5Var = (xa5) obj;
                ln00 ln00Var = (ln00) obj5;
                bby bbyVar = (bby) obj3;
                return xa5Var.a(((Boolean) xa5Var.b()).booleanValue() ? hm5.P(((bby) obj4).a(bbyVar), ln00Var) : hm5.P(bbyVar, ((ln00) obj6).a(ln00Var)), hm5.h(2, (vu30) null));
            default:
                p5t0 p5t0Var = (p5t0) obj;
                q5t0 q5t0Var = (q5t0) obj6;
                q5t0 q5t0Var2 = (q5t0) obj5;
                p5t0Var.f((q5t0) obj4, 0, 0, 0.0f);
                Integer num = (Integer) obj3;
                if (num != null) {
                    if (q5t0Var2 != null) {
                        int iIntValue5 = num.intValue() - q5t0Var2.b;
                        if (iIntValue5 < 0) {
                            iIntValue5 = 0;
                        }
                        p5t0Var.f(q5t0Var2, 0, iIntValue5, 0.0f);
                    }
                    if (q5t0Var != null) {
                        int iIntValue6 = num.intValue() - q5t0Var.b;
                        if (iIntValue6 < 0) {
                            iIntValue6 = 0;
                        }
                        p5t0Var.f(q5t0Var, 0, iIntValue6, 0.0f);
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggh(Object obj, Object obj2, Object obj3, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggh(Object obj, Object obj2, iu30 iu30Var, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = iu30Var;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggh(Object obj, ven0 ven0Var, Object obj2, ven0 ven0Var2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.e = ven0Var;
        this.c = obj2;
        this.d = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggh(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggh(iu30 iu30Var, q811 q811Var, maa maaVar, ven0 ven0Var) {
        super(1);
        this.a = (byte) 27;
        this.c = iu30Var;
        this.b = q811Var;
        this.d = maaVar;
        this.e = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggh(ven0 ven0Var, Object obj, Object obj2, ven0 ven0Var2, byte b) {
        super(1);
        this.a = b;
        this.e = ven0Var;
        this.b = obj;
        this.c = obj2;
        this.d = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggh(dwa1 dwa1Var, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2) {
        super(1);
        this.a = (byte) 6;
        this.b = dwa1Var;
        this.c = iu30Var;
        this.e = ven0Var;
        this.d = ven0Var2;
    }
}
