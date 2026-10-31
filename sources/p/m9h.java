package p;

import android.view.MotionEvent;
import android.view.View;
import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.metadata.proto.Metadata;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import spotify.collection.esperanto.proto.CollectionArtist;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m9h implements BiFunction, Function, twq0, s2i1, Predicate, BiPredicate, drw, hiy {
    public final /* synthetic */ byte a;
    public static final m9h b = new m9h(0);
    public static final m9h c = new m9h(1);
    public static final m9h d = new m9h(2);
    public static final m9h e = new m9h(3);
    public static final m9h f = new m9h(4);
    public static final m9h g = new m9h(5);
    public static final m9h h = new m9h(6);
    public static final m9h i = new m9h(7);
    public static final m9h t = new m9h(8);
    public static final m9h X = new m9h(9);
    public static final m9h Y = new m9h(10);
    public static final m9h Z = new m9h(11);
    public static final m9h N0 = new m9h(12);
    public static final m9h O0 = new m9h(13);
    public static final m9h P0 = new m9h(14);
    public static final m9h Q0 = new m9h(15);
    public static final m9h R0 = new m9h(16);
    public static final m9h S0 = new m9h(17);
    public static final pb4 T0 = new pb4(0);
    public static final pb4 U0 = new pb4(1);
    public static final pb4 V0 = new pb4(2);
    public static final m9h W0 = new m9h(19);
    public static final m9h X0 = new m9h(20);
    public static final m9h Y0 = new m9h(21);
    public static final m9h Z0 = new m9h(22);
    public static final m9h a1 = new m9h(23);
    public static final m9h b1 = new m9h(24);
    public static final m9h c1 = new m9h(25);
    public static final m9h d1 = new m9h(26);
    public static final m9h e1 = new m9h(27);
    public static final m9h f1 = new m9h(28);
    public static final m9h g1 = new m9h(29);

    public /* synthetic */ m9h(byte b2) {
        this.a = b2;
    }

    public void a(h6t h6tVar, brw brwVar) {
        p811 p811Var = new p811();
        p811 p811Var2 = new p811();
        l811 l811Var = new l811();
        kwf kwfVar = new kwf(l811Var, brwVar, p811Var2, (byte) 1);
        blu bluVar = new blu(p811Var, new clu(l811Var, brwVar, p811Var2, kwfVar), p811Var2, kwfVar, l811Var, brwVar);
        h6tVar.b.add(bluVar);
        if (h6tVar.a) {
            View view = h6tVar.d;
            view.getClass();
            bluVar.onViewAttachedToWindow(view);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                byte[] bArr = (byte[]) obj;
                try {
                    return AdDetectionOuterClass.DetectResponse.u(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass.DetectResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 11:
            case 13:
            case 17:
            case 18:
            default:
                return (eww0) ((spq0) obj).b();
            case 6:
                return new i5w0((g5v0) obj);
            case 9:
                return new a910(false, false);
            case 10:
                return new x49((bc20) obj);
            case 12:
                pfb pfbVar = ((gfb) obj).b;
                pfbVar.getClass();
                return pfbVar;
            case 14:
                return (Long) ((spq0) obj).b();
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return GetEntityResponse.o(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.metadata.esperanto.proto.GetEntityResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 16:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return Status.p(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_esperanto.proto.Status: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 19:
                return Boolean.valueOf(y7y0.L((Map) obj));
            case 20:
                return j5.a;
            case 21:
                return Integer.valueOf(((Status) obj).n());
            case 22:
                return Boolean.valueOf(((yz40) obj).equals(yz40.c));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                i9z i9zVar = (i9z) obj;
                if (i9zVar instanceof g9z) {
                    return Observable.error(new NoSuchElementException(((g9z) i9zVar).a));
                }
                if (i9zVar instanceof h9z) {
                    return Observable.just(i9zVar);
                }
                eg.o();
                return null;
        }
    }

    public boolean b(MotionEvent motionEvent, tyf0 tyf0Var) {
        return ((Boolean) tyf0Var.invoke(motionEvent)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02e2 A[LOOP:0: B:97:0x02ba->B:103:0x02e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:111:0x0310  */
    /* JADX WARN: Code duplicated, block: B:114:0x0338  */
    /* JADX WARN: Code duplicated, block: B:115:0x033a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0342  */
    /* JADX WARN: Code duplicated, block: B:119:0x0345  */
    /* JADX WARN: Code duplicated, block: B:121:0x0361  */
    /* JADX WARN: Code duplicated, block: B:124:0x0372  */
    /* JADX WARN: Code duplicated, block: B:125:0x0375  */
    /* JADX WARN: Code duplicated, block: B:127:0x0379  */
    /* JADX WARN: Code duplicated, block: B:128:0x038b  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c0  */
    public void c(sw2 sw2Var, vw2 vw2Var, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i2) {
        h311 h311VarV;
        ww2 ww2Var;
        m4c m4cVar;
        c380 c380Var;
        Iterator it;
        boolean z3;
        String str;
        Object objT;
        Object objT2;
        int i3;
        int i4;
        vw2 vw2Var2 = vw2Var;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1102900605);
        j06 j06Var = x340Var.a;
        int i5 = i2 | (x340Var.i(sw2Var) ? 4 : 2) | (x340Var.g(vw2Var2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
        if (x340Var.Y(i5 & 1, (i5 & 9363) != 9362)) {
            if (sw2Var instanceof qw2) {
                x340Var.i0(12326591);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ww2Var = new ww2(this, sw2Var, vw2Var2, z, z2, iu30Var, i2, (byte) 0);
                }
            } else if (sw2Var instanceof rw2) {
                x340Var.i0(12462402);
                String strO0 = cwl1.o0(x340Var, 2131952135);
                x340Var.i0(-969424833);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarY = uyn1.y(u291.f(anm1.N("row", nim0Var), 1.0f), 16.0f, 8.0f);
                rw2 rw2Var = (rw2) sw2Var;
                List list = rw2Var.e;
                String str2 = rw2Var.c;
                String str3 = rw2Var.b;
                if (str3 != null) {
                    x340Var.i0(-653560186);
                    boolean zI = ((i5 & 57344) == 16384) | x340Var.i(sw2Var);
                    Object objT3 = x340Var.T();
                    if (zI || objT3 == m4cVar2) {
                        objT3 = new xw2(iu30Var, sw2Var, (byte) 0);
                        x340Var.s0(objT3);
                    }
                    qim0VarY = bin.x(qim0VarY, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15);
                    x340Var.r(false);
                } else if (str2 != null) {
                    x340Var.i0(-653434946);
                    boolean zI2 = ((i5 & 57344) == 16384) | x340Var.i(sw2Var);
                    Object objT4 = x340Var.T();
                    if (zI2 || objT4 == m4cVar2) {
                        objT4 = new xw2(iu30Var, sw2Var, (byte) 1);
                        x340Var.s0(objT4);
                    }
                    qim0VarY = bin.x(qim0VarY, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-653327097);
                    x340Var.r(false);
                }
                qim0 qim0Var = qim0VarY;
                x340Var.r(false);
                boolean zI3 = x340Var.i(sw2Var) | x340Var.g(strO0);
                Object objT5 = x340Var.T();
                if (zI3 || objT5 == m4cVar2) {
                    objT5 = new d(sw2Var, strO0, (byte) 2);
                    x340Var.s0(objT5);
                }
                qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT5);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z4 = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z4) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                if (z) {
                    x340Var.i0(-1016204462);
                    sok.b(0, rw2Var.d, x340Var, (qim0) null);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1016147763);
                    x340Var.r(false);
                }
                wnb0 wnb0Var = new wnb0(1.0f, true);
                Object objT6 = x340Var.T();
                if (objT6 == m4cVar2) {
                    objT6 = fw2.h;
                    x340Var.s0(objT6);
                }
                qim0 qim0VarB2 = s161.b(wnb0Var, false, (iu30) objT6);
                cvx cvxVar2 = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(6.0f, true, new um5(false)), een.P0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                Object objT7 = x340Var.T();
                if (objT7 == m4cVar2) {
                    objT7 = fw2.i;
                    x340Var.s0(objT7);
                }
                uwo1.e(rw2Var.a, s161.b(nim0Var, false, (iu30) objT7), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
                boolean zG = x340Var.g(list);
                Object objT8 = x340Var.T();
                if (zG) {
                    m4cVar = m4cVar2;
                } else {
                    m4cVar = m4cVar2;
                    if (objT8 == m4cVar) {
                    }
                    c380Var = (c380) objT8;
                    if (c380Var != null || !c380Var.isEmpty()) {
                        it = c380Var.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((qm31) it.next()).b) {
                                    x340Var.i0(211611044);
                                    sok.j(c380Var, z2, (qim0) null, x340Var, (i5 >> 6) & 112);
                                    x340Var.r(false);
                                    z3 = false;
                                }
                            } else if (c380Var.isEmpty()) {
                                z3 = false;
                                x340Var.i0(212253891);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(211768214);
                                qim0 qim0VarN = anm1.N("role", nim0Var);
                                objT = x340Var.T();
                                if (objT == m4cVar) {
                                    objT = fw2.t;
                                    x340Var.s0(objT);
                                }
                                qim0 qim0VarB3 = s161.b(qim0VarN, false, (iu30) objT);
                                objT2 = x340Var.T();
                                if (objT2 == m4cVar) {
                                    objT2 = fw2.X;
                                    x340Var.s0(objT2);
                                }
                                String strY0 = o7h.y0(c380Var, " • ", (String) null, (String) null, (iu30) objT2, 30);
                                uwr uwrVar2 = cbx.a;
                                lee1 lee1Var = cbx.d(x340Var).j;
                                long j = cbx.a(x340Var).b.b;
                                if (z2) {
                                    i3 = 1;
                                } else {
                                    i3 = Integer.MAX_VALUE;
                                }
                                cjc0 cjc0Var = new cjc0(i3);
                                if (z2) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                z3 = false;
                                uwo1.e(strY0, qim0VarB3, lee1Var, j, new a0e1(5), (iu30) null, i4, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1696);
                                x340Var.r(false);
                            }
                        }
                    } else if (c380Var.isEmpty()) {
                        x340Var.i0(211768214);
                        qim0 qim0VarN2 = anm1.N("role", nim0Var);
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = fw2.t;
                            x340Var.s0(objT);
                        }
                        qim0 qim0VarB4 = s161.b(qim0VarN2, false, (iu30) objT);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = fw2.X;
                            x340Var.s0(objT2);
                        }
                        String strY1 = o7h.y0(c380Var, " • ", (String) null, (String) null, (iu30) objT2, 30);
                        uwr uwrVar3 = cbx.a;
                        lee1 lee1Var2 = cbx.d(x340Var).j;
                        long j2 = cbx.a(x340Var).b.b;
                        if (z2) {
                            i3 = 1;
                        } else {
                            i3 = Integer.MAX_VALUE;
                        }
                        cjc0 cjc0Var2 = new cjc0(i3);
                        if (z2) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                        z3 = false;
                        uwo1.e(strY1, qim0VarB4, lee1Var2, j2, new a0e1(5), (iu30) null, i4, false, cjc0Var2, 0, (qx8) null, x340Var, 0, 0, 1696);
                        x340Var.r(false);
                    } else {
                        z3 = false;
                        x340Var.i0(212253891);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    if (str3 == null) {
                    }
                    if (str != null) {
                        str = str3;
                        str = str2;
                        x340Var.i0(-1014746842);
                        vw2Var2 = vw2Var;
                        sok.m(str, vw2Var2, (qim0) null, x340Var, i5 & 112);
                        x340Var.r(z3);
                    } else {
                        str = str3;
                        str = str2;
                        vw2Var2 = vw2Var;
                        x340Var.i0(-1014647859);
                        x340Var.r(z3);
                    }
                    x340Var.r(true);
                    x340Var.r(z3);
                }
                objT8 = mqo1.A(list);
                x340Var.s0(objT8);
                c380Var = (c380) objT8;
                if (c380Var != null) {
                    it = c380Var.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((qm31) it.next()).b) {
                                x340Var.i0(211611044);
                                sok.j(c380Var, z2, (qim0) null, x340Var, (i5 >> 6) & 112);
                                x340Var.r(false);
                                z3 = false;
                            }
                        } else if (c380Var.isEmpty()) {
                            x340Var.i0(211768214);
                            qim0 qim0VarN3 = anm1.N("role", nim0Var);
                            objT = x340Var.T();
                            if (objT == m4cVar) {
                                objT = fw2.t;
                                x340Var.s0(objT);
                            }
                            qim0 qim0VarB5 = s161.b(qim0VarN3, false, (iu30) objT);
                            objT2 = x340Var.T();
                            if (objT2 == m4cVar) {
                                objT2 = fw2.X;
                                x340Var.s0(objT2);
                            }
                            String strY2 = o7h.y0(c380Var, " • ", (String) null, (String) null, (iu30) objT2, 30);
                            uwr uwrVar4 = cbx.a;
                            lee1 lee1Var3 = cbx.d(x340Var).j;
                            long j3 = cbx.a(x340Var).b.b;
                            if (z2) {
                                i3 = 1;
                            } else {
                                i3 = Integer.MAX_VALUE;
                            }
                            cjc0 cjc0Var3 = new cjc0(i3);
                            if (z2) {
                                i4 = 2;
                            } else {
                                i4 = 1;
                            }
                            z3 = false;
                            uwo1.e(strY2, qim0VarB5, lee1Var3, j3, new a0e1(5), (iu30) null, i4, false, cjc0Var3, 0, (qx8) null, x340Var, 0, 0, 1696);
                            x340Var.r(false);
                        } else {
                            z3 = false;
                            x340Var.i0(212253891);
                            x340Var.r(false);
                        }
                    }
                } else {
                    it = c380Var.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((qm31) it.next()).b) {
                                x340Var.i0(211611044);
                                sok.j(c380Var, z2, (qim0) null, x340Var, (i5 >> 6) & 112);
                                x340Var.r(false);
                                z3 = false;
                            }
                        } else if (c380Var.isEmpty()) {
                            x340Var.i0(211768214);
                            qim0 qim0VarN4 = anm1.N("role", nim0Var);
                            objT = x340Var.T();
                            if (objT == m4cVar) {
                                objT = fw2.t;
                                x340Var.s0(objT);
                            }
                            qim0 qim0VarB6 = s161.b(qim0VarN4, false, (iu30) objT);
                            objT2 = x340Var.T();
                            if (objT2 == m4cVar) {
                                objT2 = fw2.X;
                                x340Var.s0(objT2);
                            }
                            String strY3 = o7h.y0(c380Var, " • ", (String) null, (String) null, (iu30) objT2, 30);
                            uwr uwrVar5 = cbx.a;
                            lee1 lee1Var4 = cbx.d(x340Var).j;
                            long j4 = cbx.a(x340Var).b.b;
                            if (z2) {
                                i3 = 1;
                            } else {
                                i3 = Integer.MAX_VALUE;
                            }
                            cjc0 cjc0Var4 = new cjc0(i3);
                            if (z2) {
                                i4 = 2;
                            } else {
                                i4 = 1;
                            }
                            z3 = false;
                            uwo1.e(strY3, qim0VarB6, lee1Var4, j4, new a0e1(5), (iu30) null, i4, false, cjc0Var4, 0, (qx8) null, x340Var, 0, 0, 1696);
                            x340Var.r(false);
                        } else {
                            z3 = false;
                            x340Var.i0(212253891);
                            x340Var.r(false);
                        }
                    }
                }
                x340Var.r(true);
                if (str3 == null) {
                }
                if (str != null) {
                    str = str3;
                    str = str2;
                    x340Var.i0(-1014746842);
                    vw2Var2 = vw2Var;
                    sok.m(str, vw2Var2, (qim0) null, x340Var, i5 & 112);
                    x340Var.r(z3);
                } else {
                    str = str3;
                    str = str2;
                    vw2Var2 = vw2Var;
                    x340Var.i0(-1014647859);
                    x340Var.r(z3);
                }
                x340Var.r(true);
                x340Var.r(z3);
            } else {
                vw2Var2 = vw2Var;
                x340Var.i0(15109957);
                x340Var.r(false);
            }
            h311VarV.d = ww2Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ww2Var = new ww2(this, sw2Var, vw2Var2, z, z2, iu30Var, i2, (byte) 1);
            h311VarV.d = ww2Var;
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 5:
                String str3 = (String) linkedHashMap.get("track_id");
                if (str3 != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str3.charAt(i2);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new iy3(str3, xkg0Var, str2, str);
                }
                return null;
            case 13:
                return new cgc(xkg0Var, str2, str);
            default:
                return new zqk(xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        return u890.j(playerState.track(), playerState2.track()) && u890.j(playerState.contextUri(), playerState2.contextUri());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                return ((spq0) obj).c();
            case 24:
                return ((spq0) obj).c();
            default:
                return ((i9z) obj) instanceof h9z;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                return new mmr0((Boolean) obj, (Boolean) obj2);
            case 7:
                return new mmr0((Metadata.Artist) obj, (List) obj2);
            default:
                return new g900((EventCardInfoResponse) obj, (CollectionArtist) obj2);
        }
    }
}
