package p;

import android.view.MotionEvent;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gub0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gub0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    public final Object invoke(Object obj) {
        pae1 pae1VarB;
        pae1 pae1VarB2;
        pae1 pae1VarB3;
        y9e1 y9e1Var;
        tw4 tw4VarK;
        byte b = 3;
        nae1 nae1VarD = null;
        switch (this.a) {
            case 0:
                return new hub0((nd41) this.b, (Map) obj, (kd41) this.c);
            case 1:
                p5t0 p5t0Var = (p5t0) obj;
                ArrayList arrayListL = jch0.L((List) this.b, (Function0) ((hu6) this.c).b);
                if (arrayListL != null) {
                    int size = arrayListL.size();
                    for (int i = 0; i < size; i++) {
                        mmr0 mmr0Var = (mmr0) arrayListL.get(i);
                        q5t0 q5t0Var = (q5t0) mmr0Var.a;
                        Function0 function0 = (Function0) mmr0Var.b;
                        p5t0.i(p5t0Var, q5t0Var, function0 != null ? ((qr80) function0.invoke()).a : 0L);
                    }
                }
                return rih1.a;
            case 2:
                nma0 nma0Var = (nma0) this.b;
                nma0 nma0Var2 = (nma0) this.c;
                neg negVar = (neg) obj;
                neg.b(negVar, "key", nma0Var.getDescriptor(), 12);
                neg.b(negVar, "value", nma0Var2.getDescriptor(), 12);
                return rih1.a;
            case 3:
                vy71 vy71Var = (vy71) this.b;
                o95 o95Var = (o95) this.c;
                kd31 kd31Var = (kd31) obj;
                float fS = ((drr0) vy71Var.e.Y).s();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (kd31Var.R0 & 4294967295L));
                if (!Float.isNaN(fS) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) o95Var.e()).floatValue();
                    kd31Var.q(dem0.d(kd31Var, fFloatValue));
                    kd31Var.r(dem0.e(kd31Var, fFloatValue));
                    kd31Var.A(sgc1.u(0.5f, (fS + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return rih1.a;
            case 4:
                String str = (String) this.b;
                Function0 function1 = (Function0) this.c;
                e261 e261Var = (e261) obj;
                b261.G(e261Var, 1.0f);
                b261.n(e261Var, str);
                b261.g(e261Var, (String) null, new zxs(function1, b));
                return rih1.a;
            case 5:
                ((bvm0) this.b).v1(obj, (r261) this.c);
                return rih1.a;
            case 6:
                ((xab1) this.b).d((CancellationException) null);
                ((ssw0) this.c).l((ojl) obj);
                return rih1.a;
            case 7:
                iyp0 iyp0Var = (iyp0) this.b;
                q5t0 q5t0Var2 = (q5t0) this.c;
                p5t0 p5t0Var2 = (p5t0) obj;
                boolean z = iyp0Var.Q0;
                float f = iyp0Var.O0;
                if (z) {
                    p5t0Var2.k(q5t0Var2, p5t0Var2.i0(f), p5t0Var2.i0(iyp0Var.P0), 0.0f);
                } else {
                    p5t0Var2.f(q5t0Var2, p5t0Var2.i0(f), p5t0Var2.i0(iyp0Var.P0), 0.0f);
                }
                return rih1.a;
            case 8:
                lyp0 lyp0Var = (lyp0) this.b;
                q5t0 q5t0Var3 = (q5t0) this.c;
                p5t0 p5t0Var3 = (p5t0) obj;
                long j = ((qr80) lyp0Var.O0.invoke(p5t0Var3)).a;
                if (lyp0Var.P0) {
                    p5t0.n(p5t0Var3, q5t0Var3, (int) (j >> 32), (int) (j & 4294967295L), (iu30) null, 12);
                } else {
                    p5t0.u(p5t0Var3, q5t0Var3, (int) (j >> 32), (int) (j & 4294967295L), (iu30) null, 12);
                }
                return rih1.a;
            case 9:
                szq0 szq0Var = (szq0) this.b;
                q5t0 q5t0Var4 = (q5t0) this.c;
                p5t0 p5t0Var4 = (p5t0) obj;
                boolean z2 = szq0Var.S0;
                float f2 = szq0Var.O0;
                if (z2) {
                    p5t0Var4.k(q5t0Var4, p5t0Var4.i0(f2), p5t0Var4.i0(szq0Var.P0), 0.0f);
                } else {
                    p5t0Var4.f(q5t0Var4, p5t0Var4.i0(f2), p5t0Var4.i0(szq0Var.P0), 0.0f);
                }
                return rih1.a;
            case 10:
                ((vu30) this.b).invoke(Integer.valueOf(((kov0) obj).a), Integer.valueOf(((rzo0) this.c).u().b));
                return rih1.a;
            case 11:
                ven0 ven0Var = (ven0) this.b;
                ((p5t0) obj).x(new sd4((ArrayList) this.c, (byte) 2));
                ven0Var.getValue();
                return rih1.a;
            case 12:
                oav0 oav0Var = (oav0) this.b;
                pav0 pav0Var = (pav0) this.c;
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent.getActionMasked() == 0) {
                    oav0Var.a = ((Boolean) pav0Var.a().invoke(motionEvent)).booleanValue() ? (byte) 2 : (byte) 3;
                } else {
                    pav0Var.a().invoke(motionEvent);
                }
                return rih1.a;
            case 13:
                ((jnv0) this.b).b.D((y341) obj, (hnv0) this.c);
                return rih1.a;
            case 14:
                tob1 tob1Var = (tob1) this.b;
                tob1 tob1Var2 = (tob1) this.c;
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(2.0f);
                float f3 = fX0 / 2.0f;
                DrawScope.b0(drawScope, ((u7h) tob1Var.getValue()).a, drawScope.X0(10.0f) - f3, 0L, 0.0f, new phc1(fX0, 0.0f, 0, 0, null, 30), 108);
                if (p3v.b(((p3v) tob1Var2.getValue()).a, 0.0f) > 0) {
                    DrawScope.b0(drawScope, ((u7h) tob1Var.getValue()).a, drawScope.X0(((p3v) tob1Var2.getValue()).a) - f3, 0L, 0.0f, z520.a, 108);
                }
                return rih1.a;
            case 15:
                h4k h4kVar = (h4k) this.b;
                oen0 oen0Var = (oen0) this.c;
                h4kVar.z(obj);
                if (oen0Var != null) {
                    oen0Var.a(obj);
                }
                return rih1.a;
            case 16:
                p311 p311Var = (p311) this.b;
                Throwable th = (Throwable) this.c;
                Throwable th2 = (Throwable) obj;
                synchronized (p311Var.d) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                j2h1.h(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    p311Var.f = th;
                    bpb1 bpb1Var = p311Var.v;
                    l311 l311Var = l311.a;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, l311Var);
                }
                return rih1.a;
            case 17:
                ((ffn0) this.b).a.setValue(new wl00((erl1) this.c, (erl1) obj));
                return rih1.a;
            case 18:
                ((efn0) this.b).a.setValue(new wl00((in20) this.c, (erl1) obj));
                return rih1.a;
            case 19:
                cu41 cu41Var = (cu41) this.b;
                du41 du41Var = (du41) this.c;
                l4v l4vVar = (l4v) obj;
                float f4 = l4vVar.b ? -1.0f : 1.0f;
                long j2 = l4vVar.a;
                cu41Var.a(1, Offset.h(f4, du41Var.d == qqq0.b ? Offset.a(j2, 1, 0.0f, 0.0f) : Offset.a(j2, 2, 0.0f, 0.0f)));
                return rih1.a;
            case 20:
                p5t0.u((p5t0) obj, (q5t0) this.b, 0, 0, ((yw81) this.c).i1, 4);
                return rih1.a;
            case 21:
                ((p5t0) obj).f((q5t0) this.b, 0, 0, ((Number) ((tob1) this.c).getValue()).floatValue());
                return rih1.a;
            case 22:
                ((zdd1) this.b).b.D((y341) obj, (xdd1) this.c);
                return rih1.a;
            case 23:
                tob1 tob1Var3 = (tob1) this.b;
                ven0 ven0Var2 = (ven0) this.c;
                Size size2 = (Size) obj;
                float fFloatValue2 = ((Number) tob1Var3.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size2.a >> 32)) * fFloatValue2;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (size2.a & 4294967295L)) * fFloatValue2;
                if (Float.intBitsToFloat((int) (((Size) ven0Var2.getValue()).a >> 32)) != fIntBitsToFloat2 || Float.intBitsToFloat((int) (((Size) ven0Var2.getValue()).a & 4294967295L)) != fIntBitsToFloat3) {
                    ven0Var2.setValue(new Size((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L)));
                }
                return rih1.a;
            case 24:
                eqc eqcVar = (eqc) obj;
                return eqcVar.a(new gub0(((hw61) this.b).a(eqcVar.a.j(), eqcVar.a.getLayoutDirection(), eqcVar), (ml70) this.c, (byte) 25));
            case 25:
                vpb1.w((DrawScope) obj, (z1a1) this.b, ((ml70) this.c).a(), (phc1) null, 60);
                return rih1.a;
            case 26:
                return new w9d0((ven0) this.b, (idn0) this.c, (byte) 21);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Function0 function2 = (Function0) this.b;
                Function0 function3 = (Function0) this.c;
                r3e1 r3e1Var = (r3e1) obj;
                function2.invoke();
                if (function3 != null ? ((Boolean) function3.invoke()).booleanValue() : true) {
                    r3e1Var.close();
                }
                return rih1.a;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ze5 ze5Var = (ze5) this.b;
                err0 err0Var = ((ykc0) this.c).b;
                h0e1 h0e1Var = (h0e1) obj;
                mjc0 mjc0Var = (mjc0) ze5Var.a;
                pae1 pae1VarB4 = mjc0Var.b();
                zma1 zma1Var = pae1VarB4 != null ? pae1VarB4.a : null;
                zma1 zma1VarD = ((err0Var.s() & 1) == 0 || (pae1VarB3 = mjc0Var.b()) == null) ? null : pae1VarB3.b;
                if (zma1Var != null) {
                    zma1VarD = zma1Var.d(zma1VarD);
                }
                zma1 zma1VarD2 = ((err0Var.s() & 2) == 0 || (pae1VarB2 = mjc0Var.b()) == null) ? null : pae1VarB2.c;
                if (zma1VarD != null) {
                    zma1VarD2 = zma1VarD.d(zma1VarD2);
                }
                if ((err0Var.s() & 4) != 0 && (pae1VarB = mjc0Var.b()) != null) {
                    nae1VarD = pae1VarB.d;
                }
                if (zma1VarD2 != null) {
                    nae1VarD = zma1VarD2.d(nae1VarD);
                }
                l811 l811Var = new l811();
                af5 af5Var = h0e1Var.a;
                pg pgVar = new pg((Object) l811Var, (Object) ze5Var, (Object) nae1VarD, (byte) 29);
                af5Var.getClass();
                ye5 ye5Var = new ye5(af5Var);
                ye5Var.i(pgVar);
                h0e1Var.b = ye5Var.p();
                return rih1.a;
            default:
                oae1 oae1Var = (oae1) this.b;
                ze5 ze5Var2 = (ze5) this.c;
                kd31 kd31Var2 = (kd31) obj;
                af5 af5Var2 = oae1Var.b;
                hrr0 hrr0Var = oae1Var.a;
                y9e1 y9e1Var2 = (y9e1) hrr0Var.getValue();
                if (u890.j(af5Var2, y9e1Var2 != null ? y9e1Var2.a.a : null) && (y9e1Var = (y9e1) hrr0Var.getValue()) != null) {
                    zrm0 zrm0Var = y9e1Var.b;
                    ze5 ze5VarC = oae1.c(ze5Var2, y9e1Var);
                    if (ze5VarC == null) {
                        tw4VarK = null;
                    } else {
                        int i2 = ze5VarC.c;
                        int i3 = ze5VarC.b;
                        tw4VarK = y9e1Var.k(i3, i2);
                        n511 n511VarB = y9e1Var.b(i3);
                        int i4 = i2 - 1;
                        tw4VarK.r(((((long) Float.floatToRawIntBits(zrm0Var.d(i3) == zrm0Var.d(i4) ? Math.min(y9e1Var.b(i4).a, n511VarB.a) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(n511VarB.b)) & 4294967295L)) ^ (-9223372034707292160L));
                    }
                } else {
                    tw4VarK = null;
                }
                nae1VarD = tw4VarK != null ? new nae1(tw4VarK) : null;
                if (nae1VarD != null) {
                    kd31Var2.w(nae1VarD);
                    kd31Var2.f(true);
                }
                return rih1.a;
        }
    }

    public /* synthetic */ gub0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
    }
}
