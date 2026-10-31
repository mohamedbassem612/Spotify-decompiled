package p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.CancellationSignal;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class j6 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x034a  */
    /* JADX WARN: Code duplicated, block: B:147:0x039c  */
    public final Object invoke(Object obj) {
        int i;
        f2b f2bVar;
        jr70 jr70Var;
        jr70 jr70Var2;
        boolean z;
        long j;
        vid vidVar;
        cab cabVar;
        float f;
        float f2;
        long jU;
        String strConcat;
        int length;
        int i2;
        String str;
        byte b = this.a;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return obj == ((k6) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                cha0 cha0Var = (cha0) obj2;
                cha0Var.t((String) o7h.A0(cha0Var.a), (ega0) obj);
                return rih1Var;
            case 2:
                m7 m7Var = (m7) obj2;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == m7Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != m7Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 3:
                hk1 hk1Var = (hk1) obj2;
                hk1Var.Q0.invoke((d3e1) obj, lcc.z(hk1Var, AndroidCompositionLocals_androidKt.b));
                return rih1Var;
            case 4:
                am3 am3Var = (am3) obj2;
                bm3 bm3Var = (bm3) obj;
                if (bm3Var.A() != Integer.MAX_VALUE) {
                    if (bm3Var.c().b) {
                        bm3Var.k();
                    }
                    for (Map.Entry entry2 : bm3Var.c().i.entrySet()) {
                        am3Var.a((ul3) entry2.getKey(), ((Number) entry2.getValue()).intValue(), bm3Var.r());
                    }
                    ndo0 ndo0Var = ((ndo0) bm3Var.r()).Y0;
                    ndo0Var.getClass();
                    while (!ndo0Var.equals(am3Var.a.r())) {
                        for (ul3 ul3Var : am3Var.c(ndo0Var).keySet()) {
                            am3Var.a(ul3Var, am3Var.f(ndo0Var, ul3Var), ndo0Var);
                        }
                        ndo0Var = ndo0Var.Y0;
                        ndo0Var.getClass();
                    }
                }
                return rih1Var;
            case 5:
                return Boolean.valueOf(((d030) obj).N1(((yx20) obj2).a));
            case 6:
                return Boolean.valueOf(((or80) obj2).a(((v161) obj).f));
            case 7:
                return Boolean.valueOf(y1a1.D((v161) obj, (Resources) obj2));
            case 8:
                ((e261) obj).b(px51.a, new ox51(qr50.a, ((jyp0) obj2).a(), 2, true));
                return rih1Var;
            case 9:
                ((hmb0) obj2).a0((wat) obj);
                return rih1Var;
            case 10:
                return new rm((gea) obj2, (byte) 14);
            case 11:
                return new rm((w5f1) obj2, (byte) 16);
            case 12:
                oqb oqbVar = (oqb) obj2;
                eqc eqcVar = (eqc) obj;
                if (eqcVar.h() * oqbVar.R0 < 0.0f || Size.e(eqcVar.a.j()) <= 0.0f) {
                    return eqcVar.b(new z9((byte) 27));
                }
                float fMin = Math.min(p3v.c(oqbVar.R0, 0.0f) ? 1.0f : (float) Math.ceil(eqcVar.h() * oqbVar.R0), (float) Math.ceil(Size.e(eqcVar.a.j()) / 2.0f));
                float f3 = fMin / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) - fMin)) << 32);
                float f4 = fMin * 2.0f;
                boolean z3 = f4 > Size.e(eqcVar.a.j());
                htq0 htq0VarA = oqbVar.T0.a(eqcVar.a.j(), eqcVar.a.getLayoutDirection(), eqcVar);
                if (!(htq0VarA instanceof htq0)) {
                    if (!(htq0VarA instanceof jtq0)) {
                        boolean z4 = z3;
                        if (!(htq0VarA instanceof itq0)) {
                            eg.o();
                            return null;
                        }
                        Brush brush = oqbVar.S0;
                        long j2 = z4 ? 0L : jFloatToRawIntBits;
                        if (z4) {
                            jFloatToRawIntBits2 = eqcVar.a.j();
                        }
                        return eqcVar.b(new iqb(brush, j2, jFloatToRawIntBits2, z4 ? z520.a : new phc1(fMin, 0.0f, 0, 0, null, 30)));
                    }
                    Brush brush2 = oqbVar.S0;
                    vq31 vq31Var = ((jtq0) htq0VarA).c;
                    if (ila0.w(vq31Var)) {
                        return eqcVar.b(new mqb(z3, brush2, vq31Var.e, f3, fMin, jFloatToRawIntBits, jFloatToRawIntBits2, new phc1(fMin, 0.0f, 0, 0, null, 30)));
                    }
                    boolean z5 = z3;
                    hqb hqbVar = oqbVar.Q0;
                    if (hqbVar == null) {
                        hqbVar = new hqb();
                        oqbVar.Q0 = hqbVar;
                    }
                    tw4 tw4VarA = hqbVar.d;
                    if (tw4VarA == null) {
                        tw4VarA = ww4.a();
                        hqbVar.d = tw4VarA;
                    }
                    tw4VarA.n();
                    tw4VarA.e(vq31Var, 1);
                    if (!z5) {
                        tw4 tw4VarA2 = ww4.a();
                        tw4VarA2.e(new vq31(fMin, fMin, vq31Var.b() - fMin, vq31Var.a() - fMin, d1u.H(fMin, vq31Var.e), d1u.H(fMin, vq31Var.f), d1u.H(fMin, vq31Var.g), d1u.H(fMin, vq31Var.h)), 1);
                        tw4VarA.l(tw4VarA, tw4VarA2, 0);
                    }
                    return eqcVar.b(new b6(tw4VarA, brush2, (byte) 11));
                }
                n6a1 n6a1Var = oqbVar.S0;
                htq0 htq0Var = htq0VarA;
                tw4 tw4Var = htq0Var.c;
                if (z3) {
                    return eqcVar.b(new b6(htq0Var, n6a1Var, (byte) 12));
                }
                if (n6a1Var instanceof n6a1) {
                    f2bVar = new f2b(u7h.b(n6a1Var.a, 1.0f, 0.0f, 0.0f, 0.0f, 14), 5);
                    i = 1;
                } else {
                    i = 0;
                    f2bVar = null;
                }
                n511 n511VarI = tw4Var.i();
                float f5 = n511VarI.b;
                float f6 = n511VarI.a;
                hqb hqbVar2 = oqbVar.Q0;
                if (hqbVar2 == null) {
                    hqbVar2 = new hqb();
                    oqbVar.Q0 = hqbVar2;
                }
                tw4 tw4VarA3 = hqbVar2.d;
                if (tw4VarA3 == null) {
                    tw4VarA3 = ww4.a();
                    hqbVar2.d = tw4VarA3;
                }
                tw4VarA3.n();
                u8s0.c(tw4VarA3, n511VarI);
                tw4VarA3.l(tw4VarA3, tw4Var, 0);
                p811 p811Var = new p811();
                long jCeil = (((long) ((int) Math.ceil(n511VarI.d - f5))) & 4294967295L) | (((long) ((int) Math.ceil(n511VarI.c - f6))) << 32);
                hqb hqbVar3 = oqbVar.Q0;
                hqbVar3.getClass();
                yk4 yk4VarB = hqbVar3.a;
                u84 u84VarA = hqbVar3.b;
                if (yk4VarB != null) {
                    Bitmap.Config config = yk4VarB.a.getConfig();
                    config.getClass();
                    jr70Var = new jr70(no80.W(config));
                } else {
                    jr70Var = null;
                }
                if (jr70Var != null && jr70Var.a == 0) {
                    z = true;
                } else {
                    if (yk4VarB != null) {
                        Bitmap.Config config2 = yk4VarB.a.getConfig();
                        config2.getClass();
                        jr70Var2 = new jr70(no80.W(config2));
                    } else {
                        jr70Var2 = null;
                    }
                    if (jr70Var2 != null && i == jr70Var2.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                try {
                    try {
                        if (yk4VarB != null && u84VarA != null) {
                            j = jCeil;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32));
                            Bitmap bitmap = yk4VarB.a;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) > bitmap.getHeight() || !z) {
                            }
                            vidVar = hqbVar3.c;
                            if (vidVar == null) {
                                vidVar = new vid();
                                hqbVar3.c = vidVar;
                            }
                            cabVar = vidVar.b;
                            uid uidVar = vidVar.a;
                            long jR = o0c.R(j);
                            flb0 layoutDirection = eqcVar.a.getLayoutDirection();
                            vid vidVar2 = vidVar;
                            wat watVar = uidVar.a;
                            flb0 flb0Var = uidVar.b;
                            f2b f2bVar2 = f2bVar;
                            fid fidVar = uidVar.c;
                            tw4 tw4Var2 = tw4VarA3;
                            long j3 = uidVar.d;
                            uidVar.a = eqcVar;
                            uidVar.b = layoutDirection;
                            uidVar.c = u84VarA;
                            uidVar.d = jR;
                            u84VarA.q();
                            DrawScope.d0(vidVar2, u7h.b, 0L, jR, 0.0f, (phc1) null, (ColorFilter) null, 58);
                            f = -f6;
                            f2 = -f5;
                            ((dg8) cabVar.b).z(f, f2);
                            DrawScope.j1(vidVar2, htq0Var.c, n6a1Var, 0.0f, new phc1(f4, 0.0f, 0, 0, null, 30), 52);
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (vidVar2.j() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (vidVar2.j() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (vidVar2.j() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (vidVar2.j() & 4294967295L));
                            yk4 yk4Var = yk4VarB;
                            u84 u84Var = u84VarA;
                            long jG1 = vidVar2.g1();
                            jU = cabVar.u();
                            cabVar.p().q();
                            ((dg8) cabVar.b).t(fIntBitsToFloat2, fIntBitsToFloat3, jG1);
                            DrawScope.j1(vidVar2, tw4Var2, n6a1Var, 0.0f, (DrawStyle) null, 28);
                            cabVar.p().i();
                            cabVar.D(jU);
                            ((dg8) cabVar.b).z(-f, -f2);
                            u84Var.i();
                            uidVar.a = watVar;
                            uidVar.b = flb0Var;
                            uidVar.c = fidVar;
                            uidVar.d = j3;
                            yk4Var.a.prepareToDraw();
                            p811Var.a = yk4Var;
                            return eqcVar.b(new nqb(n511VarI, p811Var, j, f2bVar2, (byte) 0));
                        }
                        j = jCeil;
                        ((dg8) cabVar.b).t(fIntBitsToFloat2, fIntBitsToFloat3, jG1);
                        DrawScope.j1(vidVar2, tw4Var2, n6a1Var, 0.0f, (DrawStyle) null, 28);
                        cabVar.p().i();
                        cabVar.D(jU);
                        ((dg8) cabVar.b).z(-f, -f2);
                        u84Var.i();
                        uidVar.a = watVar;
                        uidVar.b = flb0Var;
                        uidVar.c = fidVar;
                        uidVar.d = j3;
                        yk4Var.a.prepareToDraw();
                        p811Var.a = yk4Var;
                        return eqcVar.b(new nqb(n511VarI, p811Var, j, f2bVar2, (byte) 0));
                    } catch (Throwable th) {
                        cabVar.p().i();
                        cabVar.D(jU);
                        throw th;
                    }
                    DrawScope.j1(vidVar2, htq0Var.c, n6a1Var, 0.0f, new phc1(f4, 0.0f, 0, 0, null, 30), 52);
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (vidVar2.j() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (vidVar2.j() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (vidVar2.j() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (vidVar2.j() & 4294967295L));
                    yk4 yk4Var2 = yk4VarB;
                    u84 u84Var2 = u84VarA;
                    long jG2 = vidVar2.g1();
                    jU = cabVar.u();
                    cabVar.p().q();
                } catch (Throwable th2) {
                    ((dg8) cabVar.b).z(-f, -f2);
                    throw th2;
                }
                yk4VarB = h1p1.b((int) (j >> 32), (int) (j & 4294967295L), i);
                hqbVar3.a = yk4VarB;
                u84VarA = v84.a(yk4VarB);
                hqbVar3.b = u84VarA;
                vidVar = hqbVar3.c;
                if (vidVar == null) {
                    vidVar = new vid();
                    hqbVar3.c = vidVar;
                }
                cabVar = vidVar.b;
                uid uidVar2 = vidVar.a;
                long jR2 = o0c.R(j);
                flb0 layoutDirection2 = eqcVar.a.getLayoutDirection();
                vid vidVar3 = vidVar;
                wat watVar2 = uidVar2.a;
                flb0 flb0Var2 = uidVar2.b;
                f2b f2bVar3 = f2bVar;
                fid fidVar2 = uidVar2.c;
                tw4 tw4Var3 = tw4VarA3;
                long j4 = uidVar2.d;
                uidVar2.a = eqcVar;
                uidVar2.b = layoutDirection2;
                uidVar2.c = u84VarA;
                uidVar2.d = jR2;
                u84VarA.q();
                DrawScope.d0(vidVar3, u7h.b, 0L, jR2, 0.0f, (phc1) null, (ColorFilter) null, 58);
                f = -f6;
                f2 = -f5;
                ((dg8) cabVar.b).z(f, f2);
                break;
            case 13:
                g5c g5cVar = (g5c) obj2;
                n511 n511Var = (n511) obj;
                if (((pim0) g5cVar).N0) {
                    fn31.T(g5cVar.v1(), null, 0, new w7a(g5cVar, n511Var, (lnm) null, (byte) 23), 3);
                }
                return rih1Var;
            case 14:
                CancellationSignal cancellationSignal = (CancellationSignal) obj2;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return rih1Var;
            case 15:
                qzj qzjVar = (qzj) obj2;
                w15 w15Var = qzjVar.x;
                if (w15Var != null) {
                    return w15Var;
                }
                w15 w15Var2 = new w15(qzjVar.a);
                qzjVar.x = w15Var2;
                return w15Var2;
            case 16:
                o811 o811Var = (o811) obj2;
                asl aslVar = (dpg1) obj;
                if (aslVar instanceof asl) {
                    o811Var.a = ((u7h) aslVar.O0.getValue()).a;
                } else {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 17:
                ((yrl) obj2).a.setValue((x4t) obj);
                return rih1Var;
            case 18:
                ((c7r0) ((ges) obj2).W0.b).a(j7r0.c);
                return rih1Var;
            case 19:
                return Boolean.valueOf(((mn31) obj).a((r9c) obj2));
            case 20:
                float fFloatValue = ((Float) obj).floatValue();
                b8f1 state = ((i191) obj2).k.getState();
                state.b(state.c.s() + fFloatValue);
                return rih1Var;
            case 21:
                float fFloatValue2 = ((Float) obj).floatValue();
                b8f1 state2 = ((szg1) obj2).o.getState();
                state2.b(state2.c.s() + fFloatValue2);
                return rih1Var;
            case 22:
                TimeZone timeZone = z4n1.a;
                ((beu) obj2).X = true;
                return rih1Var;
            case 23:
                ((ceu) obj2).Y = true;
                return rih1Var;
            case 24:
                return new e0i(obj2, obj, (byte) 19);
            case 25:
                x3v x3vVar = (x3v) obj2;
                d4v d4vVar = (d4v) obj;
                if (!((pim0) d4vVar).a.N0) {
                    return cpg1.b;
                }
                e4v e4vVar = d4vVar.Q0;
                if (e4vVar != null) {
                    e4vVar.I0(x3vVar);
                }
                d4vVar.Q0 = null;
                d4vVar.P0 = null;
                return cpg1.a;
            case 26:
                ((uvr) obj2).a.a.invoke(new Offset(((l4v) obj).a));
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                pj40 pj40Var = (pj40) obj;
                return Boolean.valueOf(pj40Var instanceof f6v ? ((Boolean) ((h5v) obj2).invoke(pj40Var)).booleanValue() : true);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Float) obj).getClass();
                wat watVarA = ((n8v) obj2).a();
                pxg1 pxg1Var = g8v.a;
                return Float.valueOf(watVarA.X0(56.0f));
            default:
                qqh qqhVar = (lov) obj;
                String str2 = ((lov) obj2) == qqhVar ? " > " : "   ";
                if (!(qqhVar instanceof qqh)) {
                    if (qqhVar instanceof dk61) {
                        dk61 dk61Var = (dk61) qqhVar;
                        length = dk61Var.a.b.length();
                        i2 = dk61Var.b;
                        str = "SetComposingTextCommand(text.length=";
                    } else if (qqhVar instanceof ck61) {
                        strConcat = ((ck61) qqhVar).toString();
                    } else if (qqhVar instanceof f9t) {
                        strConcat = ((f9t) qqhVar).toString();
                    } else if (qqhVar instanceof g9t) {
                        strConcat = ((g9t) qqhVar).toString();
                    } else if (qqhVar instanceof sl61) {
                        strConcat = ((sl61) qqhVar).toString();
                    } else if (qqhVar instanceof ii20) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (qqhVar instanceof m6t) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strR = rc11.a.b(qqhVar.getClass()).r();
                        if (strR == null) {
                            strR = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strR);
                    }
                    return str2.concat(strConcat);
                }
                qqh qqhVar2 = qqhVar;
                length = qqhVar2.a.b.length();
                i2 = qqhVar2.b;
                str = "CommitTextCommand(text.length=";
                strConcat = l1d.j(length, i2, str, ", newCursorPosition=", ")");
                return str2.concat(strConcat);
        }
    }

    public /* synthetic */ j6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
    }
}
