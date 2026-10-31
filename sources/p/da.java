package p;

import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.geometry.Offset;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickActionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconName;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Text;
import com.spotify.pendragon.v1.proto.Disclaimer;
import com.spotify.pendragon.v1.proto.Header;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class da implements iu30, nyc {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public da(uku ukuVar, boolean z, ven0 ven0Var) {
        this.a = (byte) 22;
        this.b = ukuVar;
        this.c = ven0Var;
    }

    private final Object a(Object obj) {
        long j;
        nv91 nv91Var = (nv91) obj;
        synchronized (pv91.c) {
            j = pv91.e;
            pv91.e = 1 + j;
        }
        return new ten0(j, nv91Var, (iu30) this.b, (iu30) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:239:0x0655  */
    /* JADX WARN: Code duplicated, block: B:240:0x0657  */
    /* JADX WARN: Code duplicated, block: B:315:0x07d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:316:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:323:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:326:0x0803  */
    /* JADX WARN: Code duplicated, block: B:329:0x080d  */
    /* JADX WARN: Code duplicated, block: B:355:0x081b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:? A[LOOP:3: B:327:0x0807->B:356:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        jfg jfgVarS;
        Object objD;
        ArrayList arrayListA;
        Iterator it;
        q8a0 q8a0Var;
        InputConnection inputConnection;
        Enum r13;
        Button button;
        bm00 bm00VarE;
        String str;
        byte b = 2;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        Button button2 = null;
        switch (this.a) {
            case 0:
                uqs uqsVar = (uqs) this.b;
                o860 o860Var = (o860) uqsVar.d;
                e8b0 e8b0Var = ((fa) this.c).a;
                pf5 pf5Var = (pf5) obj;
                if (pf5Var instanceof dqb0) {
                    Object obj2 = o860Var.b;
                    if (((dqb0) pf5Var).g || ((wf5) uqsVar.e) == wf5.TYPE_PARAMETER_BOUNDS) {
                        z = true;
                    } else if (e8b0Var != null) {
                        ajn0 ajn0Var = g6b0.e;
                        jfgVarS = ((a8b0) e8b0Var).t0().s();
                        if (jfgVarS != null && g6b0.s(jfgVarS) != null) {
                            Object obj3 = o860Var.b;
                            LinkedHashMap linkedHashMap = zf5.c;
                            objD = zf5.d(pf5Var, rfb1.t);
                            if (objD != null) {
                                arrayListA = zf5.a(objD, false);
                                if (!arrayListA.isEmpty()) {
                                    it = arrayListA.iterator();
                                    while (it.hasNext()) {
                                        if (u890.j((String) it.next(), "TYPE")) {
                                            Object obj4 = o860Var.b;
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (e8b0Var != null) {
                    ajn0 ajn0Var2 = g6b0.e;
                    jfgVarS = ((a8b0) e8b0Var).t0().s();
                    if (jfgVarS != null) {
                        Object obj5 = o860Var.b;
                        LinkedHashMap linkedHashMap2 = zf5.c;
                        objD = zf5.d(pf5Var, rfb1.t);
                        if (objD != null) {
                            arrayListA = zf5.a(objD, false);
                            if (!arrayListA.isEmpty()) {
                                it = arrayListA.iterator();
                                while (it.hasNext()) {
                                    if (u890.j((String) it.next(), "TYPE")) {
                                        Object obj6 = o860Var.b;
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                n0h1 n0h1Var = (n0h1) this.b;
                q8a0[] q8a0VarArr = (q8a0[]) this.c;
                int iIntValue = ((Number) obj).intValue();
                if (n0h1Var == null || (q8a0Var = (q8a0) n0h1Var.a.get(Integer.valueOf(iIntValue))) == null) {
                    return (iIntValue < 0 || iIntValue >= q8a0VarArr.length) ? q8a0.f : q8a0VarArr[iIntValue];
                }
                return q8a0Var;
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                return ((nl) this.b).invoke(Integer.valueOf(iIntValue2), ((List) this.c).get(iIntValue2));
            case 3:
                pj80 pj80Var = (pj80) this.b;
                synchronized (pj80Var.c) {
                    try {
                        pj80Var.e = true;
                        bfn0 bfn0Var = pj80Var.d;
                        Object[] objArr = bfn0Var.a;
                        int i = bfn0Var.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            jep0 jep0Var = (jep0) ((egl1) objArr[i2]).get();
                            if (jep0Var != null && (inputConnection = jep0Var.b) != null) {
                                inputConnection.closeConnection();
                                jep0Var.b = null;
                            }
                        }
                        pj80Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                z8e1 z8e1Var = ((jx4) this.c).b;
                z8e1Var.b.set(null);
                z8e1Var.a.b();
                return rih1.a;
            case 4:
                v55 v55Var = (v55) this.b;
                x55 x55Var = (x55) this.c;
                synchronized (v55Var.e) {
                    v55Var.g.remove(x55Var);
                }
                return rih1.a;
            case 5:
                w55 w55Var = (w55) this.b;
                y55 y55Var = (y55) this.c;
                synchronized (w55Var.e) {
                    w55Var.g.remove(y55Var);
                }
                return rih1.a;
            case 6:
                ((z55) this.b).a.removeFrameCallback((x55) this.c);
                return rih1.a;
            case 7:
                ((Choreographer) ((a65) this.b).b).removeFrameCallback((y55) this.c);
                return rih1.a;
            case 8:
                rc9 rc9Var = (rc9) this.b;
                pnc1 pnc1Var = (pnc1) this.c;
                synchronized (rc9Var) {
                    pnc1Var.cancel();
                }
                return rih1.a;
            case 9:
                KeyEvent keyEvent = ((cpa0) obj).a;
                ven0 ven0Var = (ven0) this.c;
                if (!((w5f1) this.b).isVisible()) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 10:
                com.spotify.pendragon.v1.proto.Button button3 = (com.spotify.pendragon.v1.proto.Button) obj;
                String strQ = button3.q();
                String strT = button3.r().t();
                String string = ihc1.e1(button3.r().o()).toString();
                String string2 = ihc1.e1(button3.r().u()).toString();
                String strName = button3.r().s().q().name();
                Enum r4 = IconName.ICON_UNKNOWN;
                Enum[] enumArrValues = IconName.values();
                int length = enumArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        r13 = enumArrValues[i3];
                        if (!u890.j(r13.name(), strName)) {
                            i3++;
                        }
                    } else {
                        r13 = null;
                    }
                }
                if (r13 != null) {
                    r4 = r13;
                }
                Icon icon = new Icon(r4, ihc1.e1(button3.r().s().o()).toString());
                String strName2 = button3.r().q().name();
                Button button4 = ButtonType.UNKNOWN_BUTTON_TYPE;
                for (Button button5 : ButtonType.values()) {
                    if (u890.j(button5.name(), strName2)) {
                        button2 = button5;
                        if (button2 == null) {
                            button = button4;
                        } else {
                            button = button2;
                        }
                        return new Button(strQ, new ButtonStyle(strT, string, string2, icon, button, (EncoreFont) null, (ButtonIconAlignment) ((j141) this.c).invoke(button3.r().p()), 32, (DefaultConstructorMarker) null), (ClickAction) ((da) this.b).invoke(button3.o()));
                    }
                }
                if (button2 == null) {
                    button = button4;
                } else {
                    button = button2;
                }
                return new Button(strQ, new ButtonStyle(strT, string, string2, icon, button, (EncoreFont) null, (ButtonIconAlignment) ((j141) this.c).invoke(button3.r().p()), 32, (DefaultConstructorMarker) null), (ClickAction) ((da) this.b).invoke(button3.o()));
            case 11:
                com.spotify.pendragon.v1.proto.ClickAction clickAction = (com.spotify.pendragon.v1.proto.ClickAction) obj;
                String strName3 = ((ht4) ((dsp) ((ifl1) this.c).b).get()).c() ? ((ClickActionType) ((j141) this.b).invoke(clickAction.q())).name() : clickAction.p();
                strName3.getClass();
                String strO = clickAction.o();
                Button metadataMap = clickAction.getMetadataMap();
                return new ClickAction(strName3, strO, metadataMap.isEmpty() ? null : metadataMap);
            case 12:
                int iIntValue3 = ((Number) obj).intValue();
                return ((vx1) this.b).invoke(Integer.valueOf(iIntValue3), ((ArrayList) this.c).get(iIntValue3));
            case 13:
                return ((String) this.c).concat("_row");
            case 14:
                try {
                    ((jf01) this.b).cancel();
                    break;
                } catch (Throwable unused) {
                }
                return rih1.a;
            case 15:
                KeyEvent keyEvent2 = ((cpa0) obj).a;
                if (((r1c0) this.b).a() == zr50.b && keyEvent2.getKeyCode() == 4 && ern1.t(keyEvent2) == 1) {
                    ((x6e1) this.c).d((Offset) null);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 16:
                return ((uv4) this.b).invoke(((ArrayList) this.c).get(((Number) obj).intValue()));
            case 17:
                tr3 tr3Var = (tr3) obj;
                sxc0 sxc0Var = tr3Var.b;
                int iR = ryo1.r(sxc0Var.c);
                boolean zBooleanValue = ((Boolean) ((ryq) this.c).invoke(tr3Var)).booleanValue();
                bqq0 bqq0Var = sxc0Var.a;
                c380 c380VarA = mqo1.A(bqq0Var.d);
                qn90 qn90Var = sxc0Var.c;
                c380 c380VarA2 = mqo1.A(ryo1.t(qn90Var));
                w7c0 w7c0Var = tr3Var.c;
                Boolean bool = (Boolean) w7c0Var.a(qf90.a);
                boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
                lml lmlVarB = bqq0Var.b();
                vod1 vod1Var = lmlVarB != null ? new vod1(0, lmlVarB.a, lmlVarB.b) : null;
                int iU = ryo1.u(qn90Var);
                int i4 = sxc0Var.b.c;
                mml mmlVarA = tr3Var.a();
                iml imlVar = mmlVarA instanceof iml ? (iml) mmlVarA : null;
                String str2 = imlVar != null ? imlVar.a : null;
                mml mmlVar = bqq0Var.e;
                iml imlVar2 = mmlVar instanceof iml ? (iml) mmlVar : null;
                button2 = imlVar2 != null ? imlVar2.b : null;
                boolean z3 = (c380VarA2.isEmpty() && c380VarA.isEmpty()) ? false : true;
                z6x z6xVar = z6x.a;
                z030 z030Var = new z030(str2, button2, zBooleanValue, new uf20(iU, i4, z3, zBooleanValue2, false, vod1Var, c380VarA, c380VarA2, z6xVar, z6xVar));
                jvc0 jvc0VarA = ((u5s) this.b).a(tr3Var);
                List list = jvc0VarA.b;
                return new h230(bqq0Var.e, iR, zBooleanValue, (!(((qn90Var instanceof b8e0) || (qn90Var instanceof on90) || (qn90Var instanceof pn90)) ? true : qn90Var instanceof qn90 ? qn90Var.a instanceof b8e0 : false) || w7c0Var.a(x9v0.a) == null || w7c0Var.a(kf90.a) == null) ? false : true, z030Var, jvc0VarA.a, list, ((Boolean) w7c0Var.a(q2q0.a)).booleanValue() ? 2 : 1);
            case 18:
                mxr mxrVar = (mxr) this.b;
                wht whtVar = (wht) this.c;
                byp bypVar = whtVar.Y;
                ajn0 ajn0Var3 = (ajn0) obj;
                tfy0 tfy0Var = (tfy0) ((LinkedHashMap) mxrVar.a).get(ajn0Var3);
                if (tfy0Var != null) {
                    return x0z.r0((s1c1) ((ks6) bypVar.b).a, whtVar, ajn0Var3, (toe0) mxrVar.c, new nht((s1c1) ((ks6) bypVar.b).a, new na((Object) whtVar, (Object) tfy0Var, (byte) 11)), mka1.m0);
                }
                return null;
            case 19:
                Disclaimer disclaimer = (Disclaimer) obj;
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer(disclaimer.r() ? (MessageText) ((ryq) this.b).invoke(disclaimer.p()) : null, disclaimer.q() ? (Button) ((da) this.c).invoke(disclaimer.o()) : null);
            case 20:
                int iIntValue4 = ((Number) obj).intValue();
                return ((qeu) this.b).invoke(Integer.valueOf(iIntValue4), ((List) this.c).get(iIntValue4));
            case 21:
                int iIntValue5 = ((Number) obj).intValue();
                return ((du0) this.b).invoke(Integer.valueOf(iIntValue5), ((c380) this.c).get(iIntValue5));
            case 22:
                KeyEvent keyEvent3 = ((cpa0) obj).a;
                ven0 ven0Var2 = (ven0) this.c;
                uku ukuVar = (uku) this.b;
                if (ern1.t(keyEvent3) == 1) {
                    long jR = ern1.r(keyEvent3);
                    int i5 = toa0.P;
                    if (((toa0.a(jR, toa0.i) || toa0.a(jR, toa0.s) || toa0.a(jR, toa0.F)) ? 1 : 0) != 0 || toa0.a(mno1.d(keyEvent3.getKeyCode()), toa0.r)) {
                        ukuVar.invoke();
                    }
                }
                Boolean bool2 = Boolean.FALSE;
                ven0Var2.setValue(bool2);
                return bool2;
            case 23:
                return a(obj);
            case 24:
                Header header = (Header) obj;
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header((Text) ((tae1) this.b).invoke(header.p()), (Icon) ((ryq) this.c).invoke(header.o()));
            case 25:
                int iIntValue6 = ((Number) obj).intValue();
                return ((k7f) this.b).invoke(Integer.valueOf(iIntValue6), ((List) this.c).get(iIntValue6));
            case 26:
                String str3 = (String) obj;
                return ((g7h) this.b).c("", Collections.singletonList(str3), false).map(new akp1(str3, (byte) 7)).subscribeOn((Scheduler) this.c);
            case 27:
                lqb0 lqb0Var = (lqb0) this.b;
                o860 o860Var2 = (o860) this.c;
                ajn0 ajn0Var4 = (ajn0) obj;
                toe0 toe0Var = lqb0Var.r;
                beg begVar = lqb0Var.n;
                if (!((Set) toe0Var.invoke()).contains(ajn0Var4)) {
                    if (!((Set) lqb0Var.s.invoke()).contains(ajn0Var4)) {
                        sb11 sb11Var = (sb11) ((Map) lqb0Var.t.invoke()).get(ajn0Var4);
                        if (sb11Var == null) {
                            return null;
                        }
                        voe0 voe0Var = (voe0) ((uw0) o860Var2.b).d;
                        return x0z.r0(voe0Var, lqb0Var.n, ajn0Var4, new toe0(voe0Var, new iqb0(lqb0Var, b)), flo1.n(o860Var2, sb11Var), wdx0.b(sb11Var));
                    }
                    smc0 smc0VarN = k4p1.n();
                    Object obj7 = o860Var2.b;
                    smc0 smc0VarK = k4p1.k(smc0VarN);
                    int iB = smc0VarK.b();
                    if (iB == 0) {
                        return null;
                    }
                    if (iB == 1) {
                        return (beg) o7h.V0(smc0VarK);
                    }
                    bhn0.g(smc0VarK, "Multiple classes with same name are generated: ");
                    return null;
                }
                m7y0 m7y0Var = (m7y0) ((uw0) o860Var2.b).e;
                heg hegVarF = kht.f(begVar);
                hegVarF.getClass();
                heg hegVarD = hegVarF.d(ajn0Var4);
                kf30 kf30Var = hegVarD.a;
                String strReplace = hegVarD.b.a.a.replace('.', '$');
                if (!kf30Var.a.c()) {
                    strReplace = kf30Var.a.a + '.' + strReplace;
                }
                Class clsL = r1p1.l((ClassLoader) m7y0Var.b, strReplace);
                mb11 mb11Var = clsL != null ? new mb11(clsL) : null;
                if (mb11Var != null) {
                    return new hqb0(o860Var2, begVar, mb11Var, null);
                }
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                xw81 xw81Var = (xw81) this.b;
                lqb0 lqb0Var2 = (lqb0) this.c;
                ajn0 ajn0Var5 = (ajn0) obj;
                return u890.j(xw81Var.getName(), ajn0Var5) ? Collections.singletonList(xw81Var) : o7h.N0(lqb0Var2.L(ajn0Var5), lqb0Var2.K(ajn0Var5));
            default:
                tqb0 tqb0Var = (tqb0) this.b;
                o860 o860Var3 = tqb0Var.b;
                o860 o860Var4 = (o860) this.c;
                pqb0 pqb0Var = (pqb0) obj;
                nqb0 nqb0Var = tqb0Var.o;
                kf30 kf30Var2 = nqb0Var.f;
                ajn0 ajn0Var6 = pqb0Var.a;
                lf30 lf30Var = kf30Var2.a;
                kf30 kf30Var3 = kf30.c;
                lf30 lf30Var2 = lap1.s(ajn0Var6).a;
                String str4 = lf30Var2.a;
                lf30Var2.c();
                mb11 mb11Var2 = pqb0Var.b;
                uw0 uw0Var = (uw0) o860Var4.b;
                if (mb11Var2 != null) {
                    uqv0 uqv0Var = (uqv0) uw0Var.f;
                    ((u321) ((zht) ((uw0) o860Var3.b).g).c().c).getClass();
                    joj0 joj0Var = joj0.g;
                    kf30 kf30VarD = mb11Var2.d();
                    bm00VarE = (kf30VarD == null || (str = kf30VarD.a.a) == null) ? null : uqv0Var.e(str);
                } else {
                    uqv0 uqv0Var2 = (uqv0) uw0Var.f;
                    ((u321) ((zht) ((uw0) o860Var3.b).g).c().c).getClass();
                    joj0 joj0Var2 = joj0.g;
                    String strReplace2 = str4.replace('.', '$');
                    if (!lf30Var.c()) {
                        strReplace2 = kf30Var2 + '.' + strReplace2;
                    }
                    bm00VarE = uqv0Var2.e(strReplace2);
                }
                jc11 jc11Var = bm00VarE != null ? (jc11) bm00VarE.b : null;
                heg hegVarA = jc11Var != null ? bb11.a(jc11Var.a) : null;
                if (hegVarA != null && (hegVarA.g() || hegVarA.c)) {
                    return null;
                }
                Object qqb0Var = rqb0.c;
                if (jc11Var != null) {
                    if (((h6b0) jc11Var.b.c) == h6b0.CLASS) {
                        zht zhtVar = (zht) ((uw0) o860Var3.b).g;
                        ydg ydgVarG = zhtVar.g(jc11Var);
                        beg begVar2 = ydgVarG == null ? null : (beg) ((geg) zhtVar.c().S0).b.invoke(new feg(bb11.a(jc11Var.a), ydgVarG));
                        if (begVar2 != null) {
                            qqb0Var = new qqb0(begVar2);
                        }
                    } else {
                        qqb0Var = sqb0.c;
                    }
                }
                if (qqb0Var instanceof qqb0) {
                    return ((qqb0) qqb0Var).c;
                }
                if (qqb0Var instanceof sqb0) {
                    return null;
                }
                if (!(qqb0Var instanceof rqb0)) {
                    eg.o();
                    return null;
                }
                if (mb11Var2 == null) {
                    m7y0 m7y0Var2 = (m7y0) uw0Var.e;
                    String strReplace3 = str4.replace('.', '$');
                    if (!lf30Var.c()) {
                        strReplace3 = lf30Var.a + '.' + strReplace3;
                    }
                    Class clsL2 = r1p1.l((ClassLoader) m7y0Var2.b, strReplace3);
                    mb11Var2 = clsL2 != null ? new mb11(clsL2) : null;
                }
                kf30 kf30VarD2 = mb11Var2 != null ? mb11Var2.d() : null;
                if (kf30VarD2 == null || kf30VarD2.a.c() || !kf30VarD2.b().equals(nqb0Var.f)) {
                    return null;
                }
                return new hqb0(o860Var4, nqb0Var, mb11Var2, null);
        }
    }

    public void k(jf01 jf01Var, IOException iOException) {
        if (jf01Var.R0) {
            return;
        }
        ((ohd) this.c).resumeWith(new m231(iOException));
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        ((ohd) this.c).resumeWith(ry21Var);
    }

    public /* synthetic */ da(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
