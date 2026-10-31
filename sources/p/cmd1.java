package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.thumb.ThumbButtonView;
import com.spotify.player.model.ContextTrack;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cmd1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmd1(tva1 tva1Var, k1r k1rVar, k1r k1rVar2) {
        super(1);
        this.a = (byte) 29;
        this.b = k1rVar;
        this.c = k1rVar2;
    }

    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150  */
    /* JADX WARN: Code duplicated, block: B:91:0x021a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        Object obj2;
        lhe1 lhe1Var;
        String strS;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 3;
        byte b3 = 5;
        byte b4 = -1;
        byte b5 = 0;
        z = false;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        String str = null;
        byte b6 = 1;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                omd1 omd1Var = (omd1) obj4;
                y1c1 y1c1Var = (y1c1) obj3;
                xpn1.p((os11) obj, omd1Var.b, omd1Var.k, omd1Var.l, omd1Var.f29p, omd1Var.q, omd1Var.t, omd1Var.r, omd1Var.s, new g2c1(y1c1Var), new dmo0(y1c1Var, (byte) 3), new dmo0(y1c1Var, (byte) 4), new dmo0(y1c1Var, (byte) 5), new dmo0(y1c1Var, (byte) 6), new dmo0(y1c1Var, (byte) 7), new dmo0(y1c1Var, (byte) 8), new dmo0(y1c1Var, (byte) 9), omd1Var.j, omd1Var.m, false, omd1Var.n.a(false), omd1Var.o, new tld1(omd1Var.B), omd1Var.i, true, omd1Var.a, omd1Var.A, omd1Var.F, false, omd1Var.G, omd1Var.H, omd1Var.C, omd1Var.K, 268435456, 0);
                return rih1Var;
            case 1:
                uv11 uv11Var = (uv11) obj;
                return new wcm(uv11Var.a, ((mmd1) obj4).c.a, (String) null, (ucm) null, (Function0) null, new k7a1(obj3, (Object) uv11Var, (byte) 22), false, (String) null, (String) null, 988);
            case 2:
                dnc0 dnc0Var = (dnc0) obj;
                String str2 = (String) obj3;
                omd1 omd1Var2 = (omd1) obj4;
                boolean z3 = omd1Var2.N;
                d0r d0rVar = omd1Var2.h;
                if (z3) {
                    two1.v(dnc0Var, new any(new x010(d3p1.H(d0rVar, lx60.a, str2), d3p1.H(d0rVar, vmd1.a, str2), new jmd1(omd1Var2, str, b5), (byte) 1), (byte) 18), true, new emd1(omd1Var2, b2));
                }
                two1.v(dnc0Var, z3 ? new any(h5p1.s(d3p1.H(d0rVar, alm0.a, str2), new ht20(d3p1.H(d0rVar, lx60.a, str2), new egv0(2, (lnm) null, (byte) 25)), d3p1.H(d0rVar, vmd1.a, str2), new w63(omd1Var2, str, (byte) 24)), (byte) 18) : new any(new x010(d3p1.H(d0rVar, alm0.a, str2), d3p1.H(d0rVar, vmd1.a, str2), new jmd1(omd1Var2, str, b6), (byte) 1), (byte) 18), true, new emd1(omd1Var2, b3));
                return rih1Var;
            case 3:
                ((vu30) obj4).invoke((ito) obj3, (yvg1) obj);
                return rih1Var;
            case 4:
                oq70 oq70Var = ((li7) obj).b.a;
                mmr0 mmr0Var = (oq70Var.getWidth() == -1 || oq70Var.getHeight() == -1) ? mpd1.a : new mmr0(Integer.valueOf(oq70Var.getWidth()), Integer.valueOf(oq70Var.getHeight()));
                ((ven0) obj4).setValue(mmr0Var);
                mpd1.b.put(((lpd1) obj3).a, mmr0Var);
                return rih1Var;
            case 5:
                String str3 = (String) obj;
                i8h1 i8h1Var = ((xud1) obj4).f;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-taste-profile";
                x6h1VarI.f = "3.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "tasteprofile");
                x6h1VarR.i.add(new a7h1("learn_more_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str3)), x6h1VarR.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj3).invoke(new iud1(str3));
                return rih1Var;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                lvc1 lvc1Var = (lvc1) obj4;
                char c = zBooleanValue ? (char) 2 : (char) 1;
                char c2 = zBooleanValue ? (char) 1 : (char) 2;
                i8h1 i8h1Var2 = (i8h1) ((idd1) lvc1Var.d).getValue();
                txk0 txk0Var = (txk0) lvc1Var.c;
                txk0Var.getClass();
                x6h1 x6h1VarC = txk0Var.b.c();
                x6h1VarC.i.add(new a7h1("parental_consent_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str4 = "checked";
                if (c == 1) {
                    obj2 = "checked";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    obj2 = "unchecked";
                }
                mmr0 mmr0Var2 = new mmr0("state_before_toggle", obj2);
                if (c2 != 1) {
                    if (c2 != 2) {
                        throw null;
                    }
                    str4 = "unchecked";
                }
                i8h1Var2.m(new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("state_after_toggle", str4)})), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj3).invoke(new ixz(zBooleanValue));
                return rih1Var;
            case 7:
                dhl dhlVar = (dhl) obj;
                u1p1.C(dhlVar, !((c380) obj4).isEmpty());
                dhlVar.e.o(((ihl) obj3).g, 12.0f, 12.0f);
                yf.p(dhlVar.g, dhlVar.c.g, 8.0f, 4);
                return rih1Var;
            case 8:
                List list = ((ufe1) obj4).a;
                ((rtb0) obj).e(list.size(), new rw11(list, (byte) 25), new rw11(list, (byte) 26), new j2i(2039820996, new ot(list, (a4f0) obj3, (byte) 23), true));
                return rih1Var;
            case 9:
                khe1 khe1Var = (khe1) obj;
                ((ThumbButtonView) obj4).a();
                int iOrdinal = khe1Var.c.ordinal();
                if (iOrdinal == 0) {
                    lhe1Var = lhe1.b;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    lhe1Var = lhe1.a;
                }
                ((iu30) obj3).invoke(new lie1(khe1Var.b, lhe1Var));
                return rih1Var;
            case 10:
                o95 o95Var = (o95) obj;
                fke1 fke1Var = (fke1) obj4;
                fke1Var.Z0 = ((Number) o95Var.e()).floatValue();
                dio1.z(fke1Var);
                l811 l811Var = (l811) obj3;
                if (!l811Var.a && Math.abs(((Number) o95Var.e()).floatValue()) >= 45.0f) {
                    l811Var.a = true;
                    fke1Var.Q0.invoke();
                }
                return rih1Var;
            case 11:
                p5t0.u((p5t0) obj, (q5t0) obj4, 0, 0, new dke1((fke1) obj3, b6), 4);
                return rih1Var;
            case 12:
                eqc eqcVar = (eqc) obj;
                float fH = eqcVar.h() * 16.0f;
                float fH2 = eqcVar.h() * 8.0f;
                float f = fH / 2.0f;
                float fH3 = eqcVar.h() * 24.0f;
                tw4 tw4VarA = ww4.a();
                tw4VarA.p(1);
                u8s0.c(tw4VarA, anm1.g(0L, eqcVar.a.j()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                float f2 = f * 2.0f;
                tw4VarA.e(ila0.h((((long) Float.floatToRawIntBits(fH3)) << 32) | (((long) Float.floatToRawIntBits(fH3)) & 4294967295L), anm1.g(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) - f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) - f2)) << 32))), 1);
                Paint paint = fdg1.l().a;
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setMaskFilter(new BlurMaskFilter(fH2, BlurMaskFilter.Blur.NORMAL));
                return eqcVar.a(new e971(obj4, (Object) paint, (Object) tw4VarA, obj3, (byte) 15));
            case 13:
                kd31 kd31Var = (kd31) obj;
                tob1 tob1Var = (tob1) obj4;
                kd31Var.b(((Number) ((o95) obj3).e()).floatValue() * ((Number) tob1Var.getValue()).floatValue());
                kd31Var.i(2);
                kd31Var.E(kd31Var.T0.h() * 50.0f * (1.0f - ((Number) tob1Var.getValue()).floatValue()));
                return rih1Var;
            case 14:
                return Integer.valueOf((int) ((((long) ((Number) obj).intValue()) * ((yy31) obj4).e) - ((nue1) obj3).b.a));
            case 15:
                int iIntValue = ((Number) obj).intValue();
                ArrayList arrayList = ((tse1) obj4).a;
                zsd1 zsd1Var = new zsd1((String) obj3, (byte) 3);
                if (arrayList.isEmpty()) {
                    return "";
                }
                for (int iP = yoi1.p(iIntValue, 0, arrayList.size() - 1); -1 < iP; iP--) {
                    x5r x5rVar = (yue1) arrayList.get(iP);
                    if (x5rVar instanceof x5r) {
                        x5r x5rVar2 = x5rVar;
                        d761 d761Var = x5rVar2.c;
                        return d761Var != null ? kh.b(d761Var) : (String) zsd1Var.invoke(x5rVar2.b, x5rVar2.a);
                    }
                }
                return "";
            case 16:
                DrawScope drawScope = (DrawScope) obj;
                jmr0.g((dui1) obj4, drawScope, drawScope.j(), 0.0f, new f2b(u7h.f, 5), 2);
                DrawScope.S0(drawScope, (mic0) obj3, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 5, 62);
                return rih1Var;
            case 17:
                p5t0 p5t0Var = (p5t0) obj;
                if (((Boolean) ((tob1) obj4).getValue()).booleanValue()) {
                    p5t0Var.f((q5t0) obj3, 0, 0, 0.0f);
                }
                return rih1Var;
            case 18:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(((Number) ((tob1) obj3).getValue()).floatValue() * ((Number) ((iyd) obj4).e.getValue()).floatValue());
                kd31Var2.i(2);
                return rih1Var;
            case 19:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.p(((sdn) obj4).d);
                float fFloatValue = ((Number) ((tob1) obj3).getValue()).floatValue();
                kd31Var3.b(fFloatValue);
                float f3 = (fFloatValue * 0.5f) + 0.5f;
                kd31Var3.q(f3);
                kd31Var3.r(f3);
                return rih1Var;
            case 20:
                String str5 = (String) obj;
                List list2 = ((z8f1) obj4).a;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((y8f1) it.next()).b.equals(str5)) {
                        b4 = b5;
                        if (b4 >= 0) {
                            ((iu30) obj3).invoke(new x8f1(b4, str5, ((y8f1) list2.get(b4)).a));
                        }
                        return rih1Var;
                    }
                    b5++;
                }
                if (b4 >= 0) {
                    ((iu30) obj3).invoke(new x8f1(b4, str5, ((y8f1) list2.get(b4)).a));
                }
                return rih1Var;
            case 21:
                kd31 kd31Var4 = (kd31) obj;
                kd31Var4.b(((Boolean) ((hrr0) ((ce6) obj4).e).getValue()).booleanValue() ? 1.0f : ((Number) ((tob1) obj3).getValue()).floatValue());
                kd31Var4.i(2);
                return rih1Var;
            case 22:
                return ((gdf1) obj4).d.b((xhm1) obj, (sjz) obj3);
            case 23:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                videoSurfaceView.setOnFirstFrameRendered((Function0) null);
                ((gdf1) obj4).c.b(videoSurfaceView);
                ((z2k1) obj3).b.setValue(Boolean.FALSE);
                return rih1Var;
            case 24:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                if (((d3k) obj4) == null && ((gdf1) obj3).f) {
                    z2 = true;
                }
                videoSurfaceView2.setBufferingThrobberEnabled(z2);
                return rih1Var;
            case 25:
                return ((FlowableSingleSingle) obj4).flatMapCompletable(new vnd1((im0) obj3, (tv80) obj, (byte) 7));
            case 26:
                ci4 ci4VarS0 = ((di4) obj3).s0();
                wfx wfxVar = ((zfx) obj4).b;
                evs evsVar = new evs(wfxVar.b, wfxVar.a, ci4VarS0);
                ((ConstraintLayout) evsVar.e.d).setTag(2131429147, evsVar);
                return evsVar;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                cpf1 cpf1Var = (cpf1) obj4;
                iof1 iof1Var = (iof1) obj3;
                ContextTrack contextTrack = iof1Var.a;
                vbs vbsVar = cpf1Var.g;
                boolean z4 = vbsVar.c;
                uof1 uof1Var = iof1Var.b;
                jo70 jo70Var = uof1Var.a;
                if (jo70Var == null) {
                    jo70Var = new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31);
                }
                if (l4o1.U(contextTrack) && iof1Var.a().a == ktl.b && !cpf1.f(iof1Var)) {
                    jo70 jo70VarB = iof1Var.b();
                    String strY0 = o7h.y0(jo70Var.d, ", ", (String) null, (String) null, smf1.i, 30);
                    io70 io70Var = jo70VarB.e;
                    strS = cpf1Var.g(2131959232, strY0, io70Var != null ? io70Var.a : null);
                    if (strS.length() <= 0) {
                        if (l4o1.P(contextTrack)) {
                            strS = l4o1.a0(contextTrack, "album_title");
                        } else {
                            strS = l4o1.l(contextTrack);
                        }
                        if (strS == null) {
                            return "";
                        }
                    }
                } else {
                    if (cpf1.f(iof1Var)) {
                        return o7h.y0(iof1Var.b().d, ", ", (String) null, (String) null, smf1.g, 30);
                    }
                    if (l4o1.U(contextTrack) && iof1Var.a().a == ktl.c) {
                        io70 io70Var2 = iof1Var.b().e;
                        str = io70Var2 != null ? io70Var2.a : null;
                        return str == null ? "" : str;
                    }
                    ktl ktlVar = iof1Var.a().a;
                    Boolean bool = uof1Var.d;
                    Boolean bool2 = Boolean.TRUE;
                    j341 j341VarJ = cev0.J(jo70Var, ktlVar, u890.j(bool, bool2), z4);
                    if (j341VarJ != null) {
                        strS = j341VarJ.a(new yof1(cpf1Var, (byte) 1));
                    } else {
                        ktl ktlVar2 = iof1Var.a().a;
                        if (vbsVar.b && u890.j(uof1Var.d, bool2) && z4) {
                            z = true;
                        }
                        strS = l0p1.s(jo70Var, ktlVar2, z);
                    }
                    if (strS.length() <= 0) {
                        if (l4o1.P(contextTrack)) {
                            strS = l4o1.a0(contextTrack, "album_title");
                        } else {
                            strS = l4o1.l(contextTrack);
                        }
                        if (strS == null) {
                            return "";
                        }
                    }
                }
                return strS;
            case 28:
                return ((FlowableSingleSingle) obj4).flatMapCompletable(new vnd1((mtf1) obj3, (tv80) obj, (byte) 9));
            default:
                oxf1 oxf1Var = (oxf1) obj;
                i1r i1rVar = (k1r) obj4;
                i1r i1rVar2 = (k1r) obj3;
                return new byf1(oxf1Var.a, oxf1Var.b, oxf1Var.c, (qtt0) (i1rVar instanceof i1r ? i1rVar.a : null), (zoy0) (i1rVar2 instanceof i1r ? i1rVar2.a : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cmd1(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
