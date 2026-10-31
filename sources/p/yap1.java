package p;

import android.R;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.PathMeasure;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class yap1 {
    public static b180 a;
    public static b180 b;

    public static final void a(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(474359810);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958522);
            String strO1 = cwl1.o0(x340Var, R.string.cancel);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cb(function1, ven0Var, (byte) 14);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1211112295);
                String strO2 = cwl1.o0(x340Var, 2131958524);
                String strO3 = cwl1.o0(x340Var, 2131958532);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, null, null, strO2, strO3, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(1211659104);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 13);
        }
    }

    public static final void b(String str, lb50 lb50Var, max maxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2094851633);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(lb50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(maxVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.Y, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var3);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new kwd0(lb50Var, str, (byte) 3);
                x340Var2.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), new idx(4), null, maxVar, null, null, false, null, null, oxi.a, x340Var2, (i3 << 6) & 57344, 6, 1004);
            w0h1.a(pox.c, isl.a, uyn1.x(dug.f(u291.r(qim0Var3, 20.0f), u7h.f, er31.a), 3.0f), u7h.b, 0L, true, x340Var2, pox.d | 196656, 16);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, str, lb50Var, maxVar, qim0Var2, (byte) 18);
        }
    }

    public static final void c(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1441838313);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-162645883);
            ktx ktxVar = ktx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131960263));
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(ktxVar, jslVar, u291.r(qim0Var, 12.0f), cbx.a(x340Var).b.c, 0L, true, x340Var, ktx.d | 196608, 16);
            x340Var.r(false);
        } else {
            x340Var.i0(-162349895);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var, i, (byte) 28);
        }
    }

    public static final void d(ysf0 ysf0Var, qim0 qim0Var, Boolean bool, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1511284730);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ysf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(bool) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ssf0 ssf0Var = ysf0Var.d;
            ssf0 ssf0Var2 = ssf0Var instanceof ssf0 ? ssf0Var : null;
            int i3 = ssf0Var2 != null ? ssf0Var2.a : 0;
            int iL = p7h.L(ysf0Var.c);
            if (iL < 0) {
                iL = 0;
            }
            int iP = yoi1.p(i3, 0, iL);
            boolean z2 = ssf0Var2 != null ? ssf0Var2.c : false;
            ven0 ven0VarS = v8r.s(Integer.valueOf(iP), x340Var);
            ven0 ven0VarS2 = v8r.s(ysf0Var, x340Var);
            ven0 ven0VarS3 = v8r.s(bool, x340Var);
            boolean zG = x340Var.g(ven0VarS);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new g8y0(ven0VarS, (byte) 24);
                x340Var.s0(objT);
            }
            iu30Var2.invoke(objT);
            qim0 qim0VarR = i1p1.r(u291.d(anm1.N("#LyricsTextTag", qim0Var), 1.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z2) {
                x340Var.i0(-287267120);
                Integer numValueOf = Integer.valueOf(iP);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = er81.h;
                    x340Var.s0(objT2);
                }
                hm5.a(numValueOf, (qim0) null, (iu30) objT2, (tl3) null, "lyrics single line", (iu30) null, apo.r(144020527, new j5r(iu30Var, ven0VarS2, ven0VarS3, (byte) 1), x340Var), x340Var, 1597824, 42);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(-286793843);
                z = true;
                e(ysf0Var, iP, bool, iu30Var, x340Var, i2 & 8078);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71(ysf0Var, qim0Var, bool, iu30Var, iu30Var2, i);
        }
    }

    public static final void e(ysf0 ysf0Var, int i, Boolean bool, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        h311 h311VarV;
        jz81 jz81Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1453486146);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(ysf0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(bool) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ArrayList arrayList = ysf0Var.c;
            rsf0 rsf0Var = ysf0Var.e;
            bmf0 bmf0Var = (bmf0) o7h.t0(i, arrayList);
            if (bmf0Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    jz81Var = new jz81(ysf0Var, i, bool, iu30Var, i2, (byte) 1);
                }
            } else {
                qim0 qim0VarA = nim0.a;
                qim0 qim0VarD = u291.d(qim0VarA, 1.0f);
                if (bmf0Var.b.length() == 0) {
                    x340Var.i0(-935805003);
                    Object objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = er81.i;
                        x340Var.s0(objT);
                    }
                    qim0VarA = s161.a(qim0VarA, (iu30) objT);
                } else {
                    x340Var.i0(-935804090);
                }
                x340Var.r(false);
                qim0 qim0VarThen = qim0VarD.then(qim0VarA);
                float f = ysf0Var.h;
                boolean z = ysf0Var.b;
                boolean zG = i541.G(rsf0Var, bmf0Var.a);
                int iN = i541.n(rsf0Var, bmf0Var);
                boolean z2 = ysf0Var.f;
                boolean z3 = false;
                boolean z4 = ysf0Var.m;
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                }
                boolean zG2 = z3 | x340Var.g(bmf0Var);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new nlf0(iu30Var, bmf0Var, (byte) 2);
                    x340Var.s0(objT2);
                }
                wlf0.a(bmf0Var, zG, z, f, iN, z2, qim0VarThen, false, false, bool, z4, (iu30) objT2, x340Var, (i3 << 21) & 1879048192, 384);
            }
            h311VarV.d = jz81Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            jz81Var = new jz81(ysf0Var, i, bool, iu30Var, i2, (byte) 0);
            h311VarV.d = jz81Var;
        }
    }

    public static void f(ug30 ug30Var, Intent intent, gn10 gn10Var) {
        a690 parcelableExtra = intent.getParcelableExtra("FeatureIdentifier.InternalReferrer");
        if (parcelableExtra == null) {
            String stringExtra = intent.getStringExtra("FeatureIdentifier.InternalReferrer.Persistable");
            parcelableExtra = stringExtra != null ? new a690(new gn10(stringExtra)) : null;
        }
        if (!b690.a.equals(parcelableExtra)) {
            wwo1.J(ug30Var.b(), new a690(gn10Var));
            return;
        }
        zf30 zf30VarB = ug30Var.b();
        Bundle bundle = zf30VarB.f;
        if (bundle == null) {
            bundle = new Bundle();
            zf30VarB.T0(bundle);
        }
        bundle.putBoolean("FeatureIdentifier.InternalReferrer.Self", true);
    }

    public static final zqa g(s69 s69Var, xu30 xu30Var) {
        long jFloatToRawIntBits;
        tw4 tw4Var;
        boolean z;
        ArrayList arrayList;
        int i;
        tw4 tw4VarA = ww4.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Double dValueOf = s69Var != null ? Double.valueOf(s69Var.b) : null;
        Double dValueOf2 = s69Var != null ? Double.valueOf(s69Var.c) : null;
        if (s69Var == null) {
            return null;
        }
        ArrayList arrayList4 = s69Var.a;
        if (arrayList4.isEmpty()) {
            return null;
        }
        int i2 = 0;
        boolean z2 = true;
        for (Object obj : arrayList4) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            p69 p69Var = (p69) obj;
            if (p69Var.a.isEmpty()) {
                tw4Var = tw4VarA;
            } else {
                boolean z3 = i2 == 0;
                boolean z4 = i2 == p7h.L(arrayList4);
                List<y9v0> list = p69Var.a;
                ArrayList arrayList5 = new ArrayList(q7h.U(list, 10));
                for (y9v0 y9v0Var : list) {
                    double dDoubleValue = ((Number) xu30Var.invoke(Double.valueOf(y9v0Var.b), dValueOf, dValueOf2)).doubleValue();
                    double d = p69Var.b;
                    arrayList5.add(new Offset((((long) Float.floatToRawIntBits((float) yoi1.n(dDoubleValue, 0.0d, 1.0d))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) (((p69Var.c - d) * y9v0Var.a) + d))) << 32)));
                    z3 = z3;
                }
                boolean z5 = z3;
                Offset offset = (Offset) o7h.q0(arrayList5);
                long j = offset.a;
                if (z5) {
                    arrayList2.add(offset);
                    arrayList3.add(c14.a);
                }
                if (z2) {
                    tw4VarA.k(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
                    z = false;
                } else {
                    tw4VarA.j(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
                    z = z2;
                }
                int size = arrayList5.size();
                if (size != 2) {
                    if (size == 3) {
                        tw4Var = tw4VarA;
                        arrayList = arrayList5;
                        tw4Var.a.quadTo(Float.intBitsToFloat((int) (((Offset) arrayList.get(1)).a >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList.get(1)).a & 4294967295L)), Float.intBitsToFloat((int) (((Offset) arrayList.get(2)).a >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList.get(2)).a & 4294967295L)));
                    } else if (size != 4) {
                        if (!arrayList5.isEmpty()) {
                            tw4VarA.j(Float.intBitsToFloat((int) (((Offset) o7h.A0(arrayList5)).a >> 32)), Float.intBitsToFloat((int) (((Offset) o7h.A0(arrayList5)).a & 4294967295L)));
                        }
                        tw4Var = tw4VarA;
                        arrayList = arrayList5;
                    } else {
                        tw4Var = tw4VarA;
                        arrayList = arrayList5;
                        tw4Var.h(Float.intBitsToFloat((int) (((Offset) arrayList5.get(1)).a >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList5.get(1)).a & 4294967295L)), Float.intBitsToFloat((int) (((Offset) arrayList5.get(2)).a >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList5.get(2)).a & 4294967295L)), Float.intBitsToFloat((int) (((Offset) arrayList5.get(3)).a >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList5.get(3)).a & 4294967295L)));
                    }
                    i = 1;
                } else {
                    tw4Var = tw4VarA;
                    arrayList = arrayList5;
                    i = 1;
                    tw4Var.j(Float.intBitsToFloat((int) (((Offset) arrayList.get(1)).a >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList.get(1)).a & 4294967295L)));
                }
                if (arrayList.size() > i) {
                    arrayList2.add(o7h.A0(arrayList));
                    arrayList3.add(z4 ? c14.c : c14.b);
                }
                z2 = z;
            }
            tw4VarA = tw4Var;
            i2 = i3;
        }
        tw4 tw4Var2 = tw4VarA;
        vw4 vw4VarG = t3k1.g();
        vw4VarG.c(tw4Var2, false);
        PathMeasure pathMeasure = vw4VarG.a;
        float length = pathMeasure.getLength();
        ArrayList arrayList6 = new ArrayList();
        int i4 = 0;
        while (true) {
            float f = (i4 * length) / 400.0f;
            float[] fArr = vw4VarG.b;
            if (fArr == null) {
                fArr = new float[2];
                vw4VarG.b = fArr;
            }
            float[] fArr2 = vw4VarG.c;
            if (fArr2 == null) {
                fArr2 = new float[2];
                vw4VarG.c = fArr2;
            }
            if (pathMeasure.getPosTan(f, fArr, fArr2)) {
                float[] fArr3 = vw4VarG.b;
                fArr3.getClass();
                float f2 = fArr3[0];
                float[] fArr4 = vw4VarG.b;
                fArr4.getClass();
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(fArr4[1])) & 4294967295L);
            } else {
                jFloatToRawIntBits = 9205357640488583168L;
            }
            arrayList6.add(new Offset(jFloatToRawIntBits));
            if (i4 == 400) {
                break;
            }
            i4++;
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        return new zqa(arrayList6, arrayList2, arrayList3);
    }

    public static final g72 h(h72 h72Var) {
        i72 i72Var = (i72) h72Var.b;
        c8o.l(i72Var);
        ContentResolver contentResolver = (ContentResolver) h72Var.c;
        c8o.l(contentResolver);
        Flowable flowable = (Flowable) h72Var.d;
        c8o.l(flowable);
        Scheduler scheduler = (Scheduler) h72Var.e;
        c8o.l(scheduler);
        q8n q8nVar = (q8n) h72Var.f;
        c8o.l(q8nVar);
        Handler handler = new Handler(Looper.getMainLooper());
        mw7 mw7Var = (mw7) h72Var.t;
        c8o.l(mw7Var);
        ao0 ao0Var = (ao0) h72Var.X;
        c8o.l(ao0Var);
        o72 o72Var = new o72(handler, mw7Var, ao0Var);
        ark1 ark1Var = (ark1) h72Var.g;
        c8o.l(ark1Var);
        trd1 trd1Var = (trd1) h72Var.Y;
        c8o.l(trd1Var);
        eyh0 eyh0Var = new eyh0(i72Var, ao0Var, new ycc1(trd1Var, q8nVar), (byte) 22);
        mwt mwtVar = (mwt) h72Var.h;
        c8o.l(mwtVar);
        x8c0 x8c0Var = (x8c0) h72Var.i;
        c8o.l(x8c0Var);
        return new g72(i72Var, contentResolver, flowable, scheduler, q8nVar, o72Var, ark1Var, eyh0Var, mwtVar, x8c0Var);
    }

    public static hod0 i(r6h1 r6h1Var) {
        return new hod0(r6h1Var, (byte) 18);
    }

    public static final String j(long j) {
        ytw0 ytw0Var = jfv.b;
        if (j < 0) {
            j = 0;
        }
        long jL0 = fdg1.l0(j, ngv.d);
        return String.format(Locale.ROOT, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jfv.u(jL0, ngv.g)), Integer.valueOf(jfv.j(jL0)), Integer.valueOf(jfv.l(jL0))}, 3));
    }

    public static final b180 k() {
        b180 b180Var = a;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.Collection24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(14.5f, 2.134f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 0.0f);
        cwh0VarG.k(6.0f, 3.464f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 0.5f, 0.866f);
        cwh0VarG.u(21.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        cwh0VarG.i(-6.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        cwh0VarG.u(3.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 0.5f, -0.866f);
        cwh0VarG.l(16.0f, 4.732f);
        cwh0VarG.u(20.0f);
        cwh0VarG.i(4.0f);
        cwh0VarG.u(7.041f);
        cwh0VarG.e();
        cwh0VarG.l(3.0f, 22.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        cwh0VarG.u(3.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 2.0f, 0.0f);
        cwh0VarG.v(18.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        cwh0VarG.m(6.0f, 0.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        cwh0VarG.u(3.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 2.0f, 0.0f);
        cwh0VarG.v(18.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        a = b180VarB;
        return b180VarB;
    }

    public static final int l(View view, View view2) {
        ubk1 ubk1VarO = o(view);
        j1c j1cVar = o(view2).b;
        j1c j1cVar2 = ubk1VarO.b;
        int i = j1cVar2.c;
        int i2 = j1cVar2.d;
        int i3 = j1cVar2.b;
        int i4 = j1cVar2.a;
        int i5 = (i2 - i3) * (i - i4);
        if (!ubk1VarO.a || i5 == 0) {
            return 0;
        }
        int i6 = j1cVar.c;
        int i7 = j1cVar.b;
        int i8 = j1cVar.d;
        int i9 = j1cVar.a;
        if (i4 > i6 || i < i9 || i3 > i8 || i2 < i7) {
            return 0;
        }
        if (i2 - i3 > i8 - i7) {
            return 100;
        }
        return (int) ((((double) ((Math.min(i2, i8) - Math.max(i3, i7)) * (Math.min(i, i6) - Math.max(i4, i9)))) / ((double) i5)) * 100.0d);
    }

    public static final int m(f0u f0uVar) {
        switch (f0uVar.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return 22;
            case 1:
                return 12;
            case 2:
                return 20;
            case 3:
                return 15;
            case 4:
                return 18;
            case 5:
                return 21;
            case 6:
                return 4;
            case 7:
                return 19;
            case 8:
                return 2;
            case 9:
                return 13;
            case 10:
                return 10;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return 9;
            case grn1.d /* 12 */:
                return 3;
            case 13:
                return 16;
            case 14:
                return 11;
            case 15:
                return 23;
            case 16:
                return 14;
            case 17:
                return 17;
            default:
                eg.o();
                return 0;
        }
    }

    public static final boolean n(int i) {
        return i > 0 && dqz0.b.g(100) < i;
    }

    public static final ubk1 o(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new ubk1(view.getVisibility() == 0, new j1c(i, i2, view.getWidth() + i, (view.getHeight() + i2) - view.getPaddingBottom()));
    }
}
