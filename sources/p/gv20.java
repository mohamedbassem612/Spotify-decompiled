package p;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gv20 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gv20(xgn0 xgn0Var, wgn0 wgn0Var) {
        this.a = (byte) 26;
        this.b = xgn0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invoke(Object obj) {
        lpb0 lpb0Var;
        ptb0 ptb0Var;
        yub0 yub0Var;
        byte b = this.a;
        float f = 0.0f;
        ptb0 ptb0Var2 = null;
        int i = 0;
        rih1 rih1Var = rih1.a;
        char c = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                bfn0 bfn0Var = (bfn0) obj2;
                Object[] objArr = bfn0Var.a;
                int i2 = bfn0Var.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((hfh0) objArr[i3]).a();
                }
                return rih1Var;
            case 1:
                g930 g930Var = (g930) obj2;
                c2h1 c2h1Var = (c2h1) obj;
                c2h1 c2h1Var2 = new c2h1((FontFamily) null, c2h1Var.b, c2h1Var.c, c2h1Var.d, c2h1Var.e);
                return g930Var.c.v(c2h1Var2, new b6(g930Var, c2h1Var2, (byte) 23)).getValue();
            case 2:
                bbc bbcVar = (bbc) obj2;
                if (sv40.b.compareAndSet(false, true)) {
                    bbcVar.l(rih1Var);
                }
                return rih1Var;
            case 3:
                DrawScope drawScope = (DrawScope) obj;
                fid fidVarP = drawScope.a1().p();
                vu30 vu30Var = ((ge50) obj2).d;
                if (vu30Var != null) {
                    vu30Var.invoke(fidVarP, (be50) drawScope.a1().c);
                }
                return rih1Var;
            case 4:
                ej50 ej50Var = (ej50) obj2;
                ari1 ari1Var = (ari1) obj;
                ej50Var.g(ari1Var);
                iu30 iu30Var = ej50Var.i;
                if (iu30Var != null) {
                    iu30Var.invoke(ari1Var);
                }
                return rih1Var;
            case 5:
                l811 l811Var = (l811) obj2;
                if (!((cy60) obj).Q0) {
                    return cpg1.a;
                }
                l811Var.a = false;
                return cpg1.c;
            case 6:
                zk70 zk70Var = (zk70) obj2;
                final eqc eqcVar = (eqc) obj;
                hx4 hx4Var = eqcVar.d;
                hx4Var.getClass();
                be50 be50VarB = ((yd50) hx4Var.invoke()).b();
                final pv40 pv40Var = new pv40((byte) 2);
                final flb0 layoutDirection = eqcVar.a.getLayoutDirection();
                long jP = o0c.P(eqcVar.a.j());
                final lsl lslVar = eqcVar.c;
                lslVar.getClass();
                final wat watVarR = lslVar.a1().r();
                final flb0 flb0VarT = lslVar.a1().t();
                final byte b2 = 2;
                lslVar.V(jP, new iu30() { // from class: p.kqb
                    public final Object invoke(Object obj3) {
                        byte b3 = b2;
                        rih1 rih1Var2 = rih1.a;
                        Object obj4 = flb0VarT;
                        Object obj5 = watVarR;
                        Object obj6 = layoutDirection;
                        Object obj7 = eqcVar;
                        Object obj8 = lslVar;
                        Object obj9 = pv40Var;
                        switch (b3) {
                            case 0:
                                m811 m811Var = (m811) obj8;
                                p811 p811Var = (p811) obj7;
                                tw4 tw4Var = (u8s0) obj6;
                                jtq0 jtq0Var = (jtq0) obj5;
                                Brush brush = (Brush) obj4;
                                DrawScope drawScope2 = (DrawScope) obj3;
                                Function0 function0 = (Function0) ((ne) obj9).b;
                                function0.getClass();
                                float f2 = ((p3v) function0.invoke()).a;
                                float fMin = Math.min(p3v.c(f2, 0.0f) ? 1.0f : (float) Math.ceil(drawScope2.X0(f2)), (float) Math.ceil(hrt.f(drawScope2, 2.0f)));
                                float f3 = fMin < 0.0f ? 0.0f : fMin;
                                boolean z = 2.0f * f3 > Size.e(drawScope2.j());
                                if (m811Var.a == f3) {
                                    rih1Var2 = rih1Var2;
                                } else {
                                    vq31 vq31Var = jtq0Var.c;
                                    tw4 tw4Var2 = tw4Var;
                                    tw4Var2.n();
                                    tw4Var2.e(vq31Var, 1);
                                    if (!z) {
                                        tw4 tw4VarA = ww4.a();
                                        tw4VarA.e(new vq31(f3, f3, vq31Var.b() - f3, vq31Var.a() - f3, w0h1.L(f3, vq31Var.e), w0h1.L(f3, vq31Var.f), w0h1.L(f3, vq31Var.g), w0h1.L(f3, vq31Var.h)), 1);
                                        tw4Var2.l(tw4Var2, tw4VarA, 0);
                                    }
                                    p811Var.a = tw4Var2;
                                    m811Var.a = f3;
                                }
                                Object obj10 = p811Var.a;
                                obj10.getClass();
                                DrawScope.j1(drawScope2, (u8s0) obj10, brush, 0.0f, (DrawStyle) null, 60);
                                return rih1Var2;
                            case 1:
                                q5t0[] q5t0VarArr = (q5t0[]) obj9;
                                List list = (List) obj8;
                                ifh0 ifh0Var = (ifh0) obj7;
                                n811 n811Var = (n811) obj6;
                                n811 n811Var2 = (n811) obj5;
                                w1c w1cVar = (w1c) obj4;
                                p5t0 p5t0Var = (p5t0) obj3;
                                int length = q5t0VarArr.length;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length) {
                                    t1c.d(p5t0Var, q5t0VarArr[i4], (afh0) list.get(i5), ifh0Var.getLayoutDirection(), n811Var.a, n811Var2.a, w1cVar.a);
                                    i4++;
                                    i5++;
                                }
                                return rih1Var2;
                            default:
                                pv40 pv40Var2 = (pv40) obj9;
                                lsl lslVar2 = (lsl) obj8;
                                wat watVar = (wat) obj5;
                                flb0 flb0Var = (flb0) obj4;
                                DrawScope drawScope3 = (DrawScope) obj3;
                                cab cabVarA1 = drawScope3.a1();
                                cabVarA1.A((eqc) obj7);
                                cabVarA1.C((flb0) obj6);
                                try {
                                    pv40Var2.invoke(lslVar2);
                                    return rih1Var2;
                                } finally {
                                    cab cabVarA2 = drawScope3.a1();
                                    cabVarA2.A(watVar);
                                    cabVarA2.C(flb0Var);
                                }
                        }
                    }
                }, be50VarB);
                o811 o811Var = new o811();
                o811Var.a = u7h.k;
                return eqcVar.b(new k95((Object) zk70Var, (Object) o811Var, (Object) new p811(), (Object) be50VarB, (byte) 2));
            case 7:
                return (oq70) obj2;
            case 8:
                n811 n811Var = (n811) obj2;
                StringBuilder sb = new StringBuilder();
                int i4 = n811Var.a;
                n811Var.a = i4 + 1;
                sb.append(i4);
                sb.append(':');
                sb.append(((hxg) obj).a);
                return sb.toString();
            case 9:
                ja80 ja80Var = (ja80) obj2;
                eqc eqcVar2 = (eqc) obj;
                float fH = eqcVar2.h() * ((p3v) ja80Var.a1.e()).a;
                tw4 tw4VarA = ww4.a();
                hw61 hw61VarA = ja80Var.Z0;
                if (hw61VarA == null) {
                    hw61VarA = px61.a((mx61) lcc.z(ja80Var, px61.a), 6);
                }
                vpb1.l(tw4VarA, hw61VarA.a(eqcVar2.a.j(), eqcVar2.a.getLayoutDirection(), eqcVar2));
                tw4 tw4VarA2 = ww4.a();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)) - fH;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L));
                if (Float.isNaN(0.0f) || Float.isNaN(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat3)) {
                    ww4.b("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = tw4VarA2.b;
                if (rectF == null) {
                    rectF = new RectF();
                    tw4VarA2.b = rectF;
                }
                rectF.set(0.0f, fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3);
                Path path = tw4VarA2.a;
                RectF rectF2 = tw4VarA2.b;
                rectF2.getClass();
                path.addRect(rectF2, ww4.c(1));
                tw4 tw4VarA3 = ww4.a();
                tw4VarA3.l(tw4VarA2, tw4VarA, 1);
                return eqcVar2.b(new b6(tw4VarA3, ja80Var, (byte) 25));
            case 10:
                pj80 pj80Var = (pj80) obj2;
                jep0 jep0Var = (jep0) obj;
                InputConnection inputConnection = jep0Var.b;
                if (inputConnection != null) {
                    inputConnection.closeConnection();
                    jep0Var.b = null;
                }
                bfn0 bfn0Var2 = pj80Var.d;
                Object[] objArr2 = bfn0Var2.a;
                int i5 = bfn0Var2.c;
                while (true) {
                    if (i >= i5) {
                        i = -1;
                    } else if (!u890.j((egl1) objArr2[i], jep0Var)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    bfn0Var2.l(i);
                }
                if (bfn0Var2.c == 0) {
                    pj80Var.b.invoke();
                }
                return rih1Var;
            case 11:
                return Integer.valueOf(((rpb0) obj2).c(((Integer) obj).intValue()));
            case 12:
                upb0 upb0Var = (upb0) obj2;
                zc80 zc80Var = upb0Var.p;
                j5s j5sVar = upb0Var.a;
                boolean z = upb0Var.i;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || upb0Var.d()) && (f2 <= 0.0f || upb0Var.c())) {
                    if (Math.abs(upb0Var.g) > 0.5f) {
                        tf80.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = upb0Var.g + f2;
                    upb0Var.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = upb0Var.g;
                        int iU = jch0.U(f4);
                        ptb0 ptb0VarF = ((lpb0) upb0Var.e.getValue()).f(iU, !upb0Var.b);
                        if (ptb0VarF == null || (lpb0Var = upb0Var.c) == null) {
                            ptb0Var2 = ptb0VarF;
                        } else {
                            lpb0 lpb0VarF = lpb0Var.f(iU, true);
                            if (lpb0VarF != null) {
                                upb0Var.c = lpb0VarF;
                                ptb0Var2 = ptb0VarF;
                            }
                        }
                        if (ptb0Var2 != null) {
                            upb0Var.g(ptb0Var2, upb0Var.b, true);
                            s8p1.r(upb0Var.r);
                            float f5 = f4 - upb0Var.g;
                            if (z) {
                                j5sVar.b(zc80Var, f5, ptb0Var2);
                            }
                        } else {
                            hmb0 hmb0Var = upb0Var.j;
                            if (hmb0Var != null) {
                                hmb0Var.l();
                            }
                            float f6 = f4 - upb0Var.g;
                            lpb0 lpb0VarH = upb0Var.h();
                            if (z) {
                                j5sVar.b(zc80Var, f6, lpb0VarH);
                            }
                        }
                    }
                    if (Math.abs(upb0Var.g) > 0.5f) {
                        f2 -= upb0Var.g;
                        upb0Var.g = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 13:
                return new k6r((csb0) obj2, (byte) 17);
            case 14:
                return new psb0((nsb0) obj2, (byte) 0);
            case 15:
                ((Integer) obj).getClass();
                return obj2;
            case 16:
                ntb0 ntb0Var = (ntb0) obj2;
                return ntb0Var.v1(((Integer) obj).intValue(), ntb0Var.e);
            case 17:
                xtb0 xtb0Var = (xtb0) obj2;
                float f7 = -((Float) obj).floatValue();
                if ((f7 >= 0.0f || xtb0Var.d()) && (f7 <= 0.0f || xtb0Var.c())) {
                    if (Math.abs(xtb0Var.h) > 0.5f) {
                        tf80.c("entered drag with non-zero pending scroll");
                    }
                    xtb0Var.d = true;
                    float f8 = xtb0Var.h + f7;
                    xtb0Var.h = f8;
                    if (Math.abs(f8) > 0.5f) {
                        float f9 = xtb0Var.h;
                        int iRound = Math.round(f9);
                        ptb0 ptb0VarF2 = ((ptb0) xtb0Var.f.getValue()).f(iRound, !xtb0Var.b);
                        if (ptb0VarF2 == null || (ptb0Var = xtb0Var.c) == null) {
                            ptb0Var2 = ptb0VarF2;
                        } else {
                            ptb0 ptb0VarF3 = ptb0Var.f(iRound, true);
                            if (ptb0VarF3 != null) {
                                xtb0Var.c = ptb0VarF3;
                                ptb0Var2 = ptb0VarF2;
                            }
                        }
                        if (ptb0Var2 != null) {
                            xtb0Var.g(ptb0Var2, xtb0Var.b, true);
                            s8p1.r(xtb0Var.w);
                            xtb0Var.i(f9 - xtb0Var.h, ptb0Var2);
                        } else {
                            hmb0 hmb0Var2 = xtb0Var.l;
                            if (hmb0Var2 != null) {
                                hmb0Var2.l();
                            }
                            xtb0Var.i(f9 - xtb0Var.h, xtb0Var.h());
                        }
                    }
                    if (Math.abs(xtb0Var.h) > 0.5f) {
                        f7 -= xtb0Var.h;
                        xtb0Var.h = 0.0f;
                    }
                    f = f7;
                }
                return Float.valueOf(-f);
            case 18:
                nd41 nd41Var = (nd41) obj2;
                return Boolean.valueOf(nd41Var != null ? nd41Var.d(obj) : true);
            case 19:
                jcx0 jcx0Var = (jcx0) obj2;
                ((Integer) obj).getClass();
                return jcx0Var;
            case 20:
                fvb0 fvb0Var = (fvb0) obj2;
                float f10 = -((Float) obj).floatValue();
                hrr0 hrr0Var = fvb0Var.d;
                if ((f10 >= 0.0f || fvb0Var.d()) && (f10 <= 0.0f || fvb0Var.c())) {
                    if (Math.abs(fvb0Var.o) > 0.5f) {
                        tf80.c("entered drag with non-zero pending scroll");
                    }
                    float f11 = fvb0Var.o + f10;
                    fvb0Var.o = f11;
                    if (Math.abs(f11) > 0.5f) {
                        float f12 = fvb0Var.o;
                        int iU2 = jch0.U(f12);
                        ptb0 ptb0VarF4 = ((yub0) hrr0Var.getValue()).f(iU2, !fvb0Var.a);
                        if (ptb0VarF4 == null || (yub0Var = fvb0Var.b) == null) {
                            ptb0Var2 = ptb0VarF4;
                        } else {
                            yub0 yub0VarF = yub0Var.f(iU2, true);
                            if (yub0VarF != null) {
                                fvb0Var.b = yub0VarF;
                                ptb0Var2 = ptb0VarF4;
                            }
                        }
                        if (ptb0Var2 != null) {
                            fvb0Var.f(ptb0Var2, fvb0Var.a, true);
                            s8p1.r(fvb0Var.u);
                            fvb0Var.h(f12 - fvb0Var.o, ptb0Var2);
                        } else {
                            hmb0 hmb0Var3 = fvb0Var.h;
                            if (hmb0Var3 != null) {
                                hmb0Var3.l();
                            }
                            fvb0Var.h(f12 - fvb0Var.o, (yub0) hrr0Var.getValue());
                        }
                    }
                    if (Math.abs(fvb0Var.o) > 0.5f) {
                        f10 -= fvb0Var.o;
                        fvb0Var.o = 0.0f;
                    }
                    f = f10;
                }
                return Float.valueOf(-f);
            case 21:
                ((lsl) obj2).s1();
                return rih1Var;
            case 22:
                return ((lbh0) obj2).c(((Integer) obj).intValue());
            case 23:
                int i6 = MediaButtonReceiver.h;
                ((kb61) obj).h().d((KeyEvent) obj2, new swg0((byte) (c == true ? 1 : 0)));
                return rih1Var;
            case 24:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue = ((Number) ((o95) obj2).e()).floatValue();
                float fD = dem0.d(kd31Var, fFloatValue);
                float fE = dem0.e(kd31Var, fFloatValue);
                kd31Var.r(fE == 0.0f ? 1.0f : fD / fE);
                kd31Var.A(dem0.a);
                return rih1Var;
            case 25:
                tdm0 tdm0Var = (tdm0) obj2;
                tdm0Var.show();
                return new k6r(tdm0Var, (byte) 28);
            case 26:
                ((xgn0) obj2).c((Object) null);
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Boolean.valueOf(((x5o0) obj).b == ((znm0) obj2));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((wdn0) obj2).b((oim0) obj);
                return Boolean.TRUE;
            default:
                ((g5q0) obj2).H1((ho11) obj);
                return rih1Var;
        }
    }

    public /* synthetic */ gv20(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
