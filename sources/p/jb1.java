package p;

import android.net.Uri;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.libraryimportservice.tmm.ItemAlternative;
import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import defpackage.o;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jb1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(String str, Function0 function0, Uri uri, String str2, String str3) {
        super(3);
        this.a = (byte) 29;
        this.b = str;
        this.c = function0;
        this.d = uri;
        this.e = str2;
        this.f = str3;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        ham hamVar = (ham) this.f;
        iu30 iu30Var = (iu30) this.c;
        Object obj4 = this.e;
        gfx.b(7, apo.r(-921710276, new won(hamVar, iu30Var, (max) obj4, (byte) 0), b0kVar), b0kVar, 54);
        gdx gdxVarR = yla.r(b0kVar);
        qim0 qim0VarN = anm1.N(((ihm0) this.b).a, nim0.a);
        idx idxVar = new idx(4);
        String strO0 = cwl1.o0(b0kVar, 2131954668);
        Function0 function0 = (Function0) this.d;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        foo1.c(new gbx(new y50(strO0), function0), idxVar, qim0VarN, (max) obj4, gdxVarR, null, null, null, null, null, wgi.c, b0kVar, 0, 48, 1992);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        qzr qzrVar = (qzr) this.d;
        h230 h230Var = (h230) this.b;
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(vzq0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z = h230Var.d;
            nim0 nim0Var = nim0.a;
            if (!z) {
                x340Var2.i0(1757759301);
                qim0 qim0VarD = u291.d(too1.i(uyn1.w(nim0Var, vzq0Var), vzq0Var), 1.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
                xto1.e(null, 5, 0L, 0L, x340Var2, 48, 13);
                x340Var2.r(true);
                x340Var2.r(false);
            } else if (h230Var.c) {
                x340Var2.i0(1758166362);
                otw.c(qzrVar.d, ntm1.a, too1.i(uyn1.w(nim0Var, vzq0Var), vzq0Var), (ipb1) null, x340Var2, 48, 8);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1758484856);
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = nvr.X0;
                    x340Var2.s0(objT);
                }
                dgo1.c("your_library_folder_compose_page_main_section", (iu30) objT, apo.r(1668971116, new k40(vzq0Var, (qim0) this.e, qzrVar, h230Var, (upb0) this.f, (iu30) this.c), x340Var2), x340Var2, 438);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        mxr mxrVar = (mxr) this.d;
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        jwm1 jwm1Var = (jwm1) this.b;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(vzq0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z = jwm1Var.b;
            String str = jwm1Var.a;
            if (z) {
                x340Var2.i0(283318769);
                otw.c((p40) mxrVar.c, ihc1.y0(str) ? qtm1.a : new ptm1(str), anm1.N("search_compose_empty_state", too1.i(uyn1.w(nim0.a, vzq0Var), vzq0Var)), (ipb1) null, x340Var2, 0, 8);
                x340Var2.r(false);
            } else {
                x340Var2.i0(283949650);
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = d0t.P0;
                    x340Var2.s0(objT);
                }
                dgo1.c("your_library_search_page_search_results", (iu30) objT, apo.r(-909669212, new k40(mxrVar, jwm1Var, (qim0) this.e, vzq0Var, (upb0) this.f, (iu30) this.c), x340Var2), x340Var2, 438);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(vzq0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            ((vqv) this.b).j((htv) this.d, vzq0Var, (Function0) this.e, ((Boolean) ((ven0) this.f).getValue()).booleanValue(), (iu30) this.c, x340Var2, (iIntValue << 3) & 112);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ct10 ct10Var = (ct10) this.f;
        ven0 ven0Var = (ven0) this.e;
        Function0 function0 = (Function0) this.d;
        m4c m4cVar = fkj0.X;
        scx scxVar = (scx) this.b;
        x340 x340Var = (b0k) obj2;
        boolean zI = x340Var.i(scxVar);
        Function0 function1 = (Function0) this.c;
        boolean zG = zI | x340Var.g(function1);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = new bw10(scxVar, function1);
            x340Var.s0(objT);
        }
        Function0 function2 = (Function0) objT;
        boolean zI2 = x340Var.i(scxVar) | x340Var.g(function0) | x340Var.i(ven0Var) | x340Var.g(ct10Var);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new jzm(scxVar, function0, ct10Var, ven0Var);
            x340Var.s0(objT2);
        }
        cyo1.g(function2, (Function0) objT2, x340Var, 0);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        wz31 wz31Var = (wz31) this.d;
        Object obj4 = this.b;
        n041 n041Var = (n041) obj4;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            int i = kfa0.e;
            uwr uwrVar = cbx.a;
            uyx uyxVarD = cbx.d(x340Var2);
            yfu yfuVar = ajx.a;
            boolean zG = x340Var2.g(uyxVarD) | x340Var2.g(yfuVar);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                Object obj5 = yfuVar.b;
                bjx bjxVar = (bjx) yfuVar.c;
                i930 i930VarA = u7n0.A((FontWeight) bjxVar.g);
                i930 i930VarA2 = u7n0.A((FontWeight) bjxVar.f);
                lee1 lee1Var = uyxVarD.c;
                lee1 lee1Var2 = uyxVarD.n;
                objT = new jfa0(u7n0.z(i930VarA, lee1Var, vz31.a), u7n0.z(i930VarA, uyxVarD.c, kfa0.a), u7n0.E(lee1Var2), u7n0.z(i930VarA2, lee1Var2, kfa0.d));
                x340Var2.s0(objT);
            }
            jfa0 jfa0Var = (jfa0) objT;
            fj30.l(n041Var, x340Var2, 0);
            x340Var2.i0(-224725500);
            ArrayList arrayList = (ArrayList) this.c;
            n041 n041Var2 = (n041) obj4;
            int i2 = 0;
            for (Object obj6 : ifa0.i) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                ifa0 ifa0Var = (ifa0) obj6;
                String str = (String) arrayList.get(i2);
                fg91 fg91Var = (c380) o7h.t0(i2, wz31Var.e);
                if (fg91Var == null) {
                    fg91Var = fg91.b;
                }
                fj30.m(str, fg91Var, ifa0Var, n041Var2, jfa0Var, x340Var2, 0);
                i2 = i3;
            }
            x340Var2.r(false);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarD, 12.0f);
            Locale locale = (Locale) this.e;
            p041 p041Var = (p041) this.f;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String str2 = wz31Var.f;
            locale.getClass();
            vz31.a(0, n041Var.a(), str2.toUpperCase(locale), x340Var2, null, jfa0Var.a);
            kk0.s(1.0f, true, x340Var2);
            vz31.c(p041Var.d, n041Var, jfa0Var.d, null, x340Var2, 0);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object i(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        rcx rcxVar = (rcx) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Function0 function0 = (Function0) this.e;
        ven0 ven0Var = (ven0) this.f;
        sm21 sm21Var = (tm21) this.b;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(rcxVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z = sm21Var instanceof sm21;
            rm21 rm21Var = rm21.a;
            int i = 2131957867;
            if (z) {
                int iOrdinal = sm21Var.d.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2131957891;
                }
            } else if (!u890.j(sm21Var, rm21Var)) {
                eg.o();
                return null;
            }
            tm80.k(cwl1.o0(x340Var2, i), null, null, x340Var2, 0, 6);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var2).b.b;
            p3v p3vVar = rcxVar.a;
            float f2 = f + (p3vVar != null ? p3vVar.a : 0.0f);
            if (z) {
                x340Var2.i0(465917327);
                sm21 sm21Var2 = sm21Var;
                tm80.f(sm21Var2.a, sm21Var2.b, sm21Var2.c, (ArrayList) this.c, f2, new wnb0(1.0f, false), x340Var2, 0);
                x340Var2.r(false);
            } else {
                if (!u890.j(sm21Var, rm21Var)) {
                    throw p3d1.k(x340Var2, 465914963, false);
                }
                x340Var2.i0(465930424);
                y7e1 y7e1Var = (y7e1) this.d;
                boolean z2 = !((Boolean) ven0Var.getValue()).booleanValue();
                boolean zG = x340Var2.g(function0) | x340Var2.g(ven0Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new cb(function0, ven0Var, (byte) 24);
                    x340Var2.s0(objT);
                }
                tm80.b(y7e1Var, f2, z2, (Function0) objT, rcxVar.a(1.0f, nim0.a, true), x340Var2, 0);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        pbq pbqVar = (pbq) this.d;
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Object obj4 = this.b;
        h7g0 h7g0Var = (h7g0) obj4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(vzq0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zIsEmpty = h7g0Var.h.isEmpty();
            nim0 nim0Var = nim0.a;
            if (zIsEmpty && h7g0Var.g.isEmpty()) {
                x340Var2.i0(-1116689386);
                float fD = vzq0Var.d();
                uwr uwrVar = cbx.a;
                float f = fD + cbx.b(x340Var2).b.b;
                float fA = vzq0Var.a();
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0 qim0VarD = u291.d(uyn1.A(nim0Var, 16.0f, f, 16.0f, fA), 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
                kln1.g(h7g0Var, (md1) pbqVar.b, x340Var2, 0);
                x340Var2.r(true);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1116211025);
                flb0 flb0Var = (flb0) x340Var2.k(t4k.n);
                d0r d0rVar = (d0r) this.e;
                n8l0 n8l0Var = (n8l0) this.f;
                iu30 iu30Var = (iu30) this.c;
                float fD2 = vzq0Var.d();
                float fN = uyn1.n(vzq0Var, flb0Var);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                kln1.a((h7g0) obj4, d0rVar, pbqVar, n8l0Var, vzq0Var, iu30Var, u291.d(uyn1.B(nim0Var, fN + 16.0f, fD2, uyn1.m(vzq0Var, flb0Var), 0.0f, 8), 1.0f), x340Var2, (iIntValue << 12) & 57344);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        UnmatchedItem unmatchedItem = (UnmatchedItem) this.b;
        Set set = (Set) this.c;
        p410 p410Var = (p410) this.d;
        String str = (String) this.e;
        vu30 vu30Var = (vu30) this.f;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, nim0.a);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        x340Var3.i0(933162153);
        for (ItemAlternative itemAlternative : unmatchedItem.o()) {
            String id = unmatchedItem.getId();
            itemAlternative.getClass();
            boolean zContains = set.contains(itemAlternative.getId());
            boolean zG = x340Var3.g(vu30Var) | x340Var3.g(itemAlternative);
            Object objT = x340Var3.T();
            if (zG || objT == fkj0.X) {
                objT = new uah0(vu30Var, itemAlternative, (byte) 1);
                x340Var3.s0(objT);
            }
            r4o1.v(id, itemAlternative, zContains, p410Var, str, (iu30) objT, x340Var, 0);
        }
        x340Var3.r(false);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object m(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        vzq0 vzq0Var = (vzq0) this.d;
        dlk1 dlk1Var = (dlk1) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        pek0 pek0Var = (pek0) this.b;
        iu30 iu30Var = (iu30) this.c;
        zgk0 zgk0Var = (zgk0) this.e;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.e(dlk1Var.ordinal()) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            int iOrdinal = dlk1Var.ordinal();
            if (iOrdinal == 0) {
                x340Var2.i0(274573177);
                pek0Var.e(uyn1.w(u291.d(nim0.a, 1.0f), vzq0Var), x340Var2, 0);
                x340Var2.r(false);
            } else if (iOrdinal == 1) {
                x340Var2.i0(274713855);
                dub1 dub1Var = zgk0Var.e;
                c380 c380VarA = mqo1.A(zgk0Var.a);
                c380 c380VarA2 = mqo1.A(zgk0Var.c);
                int iS = ((hdn0) this.f).s();
                boolean zG = x340Var2.g(iu30Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new stj0(iu30Var, (byte) 25);
                    x340Var2.s0(objT);
                }
                pek0Var.c(dub1Var, c380VarA, c380VarA2, vzq0Var, iS, (Function0) objT, (qim0) null, x340Var2, 0);
                x340Var2.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw p3d1.k(x340Var2, 1948519018, false);
                }
                x340Var2.i0(275146770);
                pek0Var.d(!u890.j(zgk0Var.e, bub1.a), iu30Var, x340Var2, 0);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        gfq0 gfq0Var = (gfq0) obj;
        int iIntValue = ((Number) obj3).intValue();
        rzo0 rzo0Var = (rzo0) this.b;
        th61 th61Var = (th61) this.c;
        ods odsVar = (ods) this.d;
        r1q0 r1q0Var = (r1q0) this.e;
        ven0 ven0Var = (ven0) this.f;
        hzn0 hzn0Var = (hzn0) ven0Var.getValue();
        x340 x340Var = (b0k) obj2;
        boolean zI = x340Var.i(ven0Var);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new q2j0(ven0Var, (byte) 13);
            x340Var.s0(objT);
        }
        rzo0Var.k(gfq0Var, th61Var, odsVar, r1q0Var, hzn0Var, (Function0) objT, x340Var, iIntValue & 14);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        qwq0 qwq0Var = (qwq0) obj;
        int iIntValue = ((Number) obj3).intValue();
        Function0 function0 = (Function0) this.b;
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(function0);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new kek0(function0, (byte) 26);
            x340Var.s0(objT);
        }
        fj30.k(qwq0Var, (Function0) objT, (Function0) this.d, (vu30) this.e, (iu30) this.c, (Function0) this.f, x340Var, iIntValue & 14);
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        uwr uwrVar = cbx.a;
        hr80.d((qim0) null, 2.0f, cbx.a(x340Var).a.a.a(), x340Var, 0, 1);
        String strO0 = cwl1.o0(x340Var, 2131959772);
        String strO1 = cwl1.o0(x340Var, 2131959771);
        String strO2 = cwl1.o0(x340Var, 2131959769);
        nk nkVar = ((lbt0) this.b).b;
        String str = String.format(strO2, Arrays.copyOf(new Object[]{Integer.valueOf(nkVar.l), Integer.valueOf(nkVar.l - 1)}, 2));
        String strO3 = cwl1.o0(x340Var, 2131959770);
        c9n c9nVar = (c9n) this.d;
        vy71 vy71Var = (vy71) this.e;
        iu30 iu30Var = (iu30) this.c;
        x340 x340Var2 = x340Var;
        boolean zG = x340Var2.g(iu30Var);
        c10 c10Var = (c10) this.f;
        boolean zG2 = zG | x340Var2.g(c10Var);
        Object objT = x340Var2.T();
        if (zG2 || objT == fkj0.X) {
            objT = new lb80(iu30Var, c10Var, (byte) 2);
            x340Var2.s0(objT);
        }
        o.a(strO0, strO1, str, strO3, c9nVar, vy71Var, (Function0) objT, anm1.N("bottomsheet_confirm_button", uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 32.0f, 7)), x340Var2, 0);
        return rih1.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        Object obj4 = this.f;
        c10 c10Var = (c10) obj4;
        m4c m4cVar = fkj0.X;
        uwr uwrVar = cbx.a;
        hr80.d((qim0) null, 2.0f, cbx.a(x340Var).a.a.a(), x340Var, 0, 1);
        String strO0 = cwl1.o0(x340Var, 2131959773);
        c10 c10Var2 = (c10) this.b;
        Object obj5 = this.d;
        c9n c9nVar = (c9n) obj5;
        Object obj6 = this.e;
        vy71 vy71Var = (vy71) obj6;
        iu30 iu30Var = (iu30) this.c;
        x340 x340Var2 = x340Var;
        boolean zG = x340Var2.g(iu30Var);
        Object objT = x340Var2.T();
        if (zG || objT == m4cVar) {
            objT = new dgq0(iu30Var, (byte) 19);
            x340Var2.s0(objT);
        }
        l.a(strO0, c10Var2, c9nVar, vy71Var, (Function0) objT, (qim0) null, x340Var2, 0, 32);
        String strO1 = cwl1.o0(x340Var2, 2131959774);
        c10 c10Var3 = (c10) obj4;
        c9n c9nVar2 = (c9n) obj5;
        vy71 vy71Var2 = (vy71) obj6;
        boolean zG2 = x340Var2.g(iu30Var) | x340Var2.g(c10Var);
        Object objT2 = x340Var2.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new lb80(iu30Var, c10Var, (byte) 3);
            x340Var2.s0(objT2);
        }
        l.a(strO1, c10Var3, c9nVar2, vy71Var2, (Function0) objT2, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 16.0f, 7), x340Var2, 0, 0);
        return rih1.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        float fA = ((vzq0) obj).a();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, fA, 7);
        Function0 function0 = (Function0) this.b;
        qmc1 qmc1Var = (qmc1) this.d;
        String str = (String) this.e;
        iu30 iu30Var = (iu30) this.c;
        String str2 = (String) this.f;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(gfh0VarC, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        q3p1.b(6, 0, function0, x340Var, true);
        uwr uwrVar = cbx.a;
        j1e1.f((qim0) null, ((xex) ((gmt) zex.a.c).b).z, x340Var, 0, 1);
        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarD);
        mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        String strN0 = cwl1.n0(2131959595, new Object[]{str2}, x340Var);
        lee1 lee1Var = cbx.d(x340Var).c;
        qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var).b.d, 0.0f, 2, nim0Var);
        Object objT = x340Var3.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = q4r0.c1;
            x340Var3.s0(objT);
        }
        uwo1.e(strN0, s161.b(qim0VarZ2, false, (iu30) objT), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
        String strO0 = cwl1.o0(x340Var, 2131959594);
        lee1 lee1Var2 = cbx.d(x340Var).j;
        cvx cvxVar2 = cbx.b(x340Var).b;
        cvx cvxVar3 = cbx.b(x340Var).b;
        cvx cvxVar4 = cbx.b(x340Var).b;
        uwo1.e(strO0, uyn1.B(nim0Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), lee1Var2, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
        x340Var3.r(true);
        boolean zI = x340Var3.i(qmc1Var) | x340Var3.g(str) | x340Var3.g(iu30Var);
        Object objT2 = x340Var3.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new xur0(qmc1Var, str, iu30Var, (byte) 0);
            x340Var3.s0(objT2);
        }
        gbx gbxVar = new gbx(z50.c, (Function0) objT2);
        ldx ldxVar = ldx.c;
        qim0 qim0VarA = h2c.a.a(nim0Var, een.X);
        cvx cvxVar5 = cbx.b(x340Var).b;
        foo1.c(gbxVar, ldxVar, uyn1.B(qim0VarA, 0.0f, 0.0f, 0.0f, 16.0f, 7), null, null, null, null, null, null, null, w5j.c, x340Var, 0, 48, 2040);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:34:0x026b  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    private final Object s(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        maa maaVar;
        x340 x340Var;
        ?? r0;
        m4c m4cVar;
        x340 x340Var2;
        boolean zI;
        Object objT;
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var3 = (b0k) obj2;
        ((Number) obj3).intValue();
        hxa0 hxa0Var = (hxa0) this.b;
        yxa0 yxa0Var = hxa0Var.c;
        ewr0 ewr0Var = hxa0Var.a;
        if (yxa0Var instanceof xxa0) {
            x340 x340Var4 = x340Var3;
            x340Var4.i0(184941899);
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var3;
            x340Var5.i0(184909225);
            j1e1.f((qim0) null, 0L, x340Var5, 0, 3);
            x340Var5.r(false);
        }
        nim0 nim0Var = nim0.a;
        qim0 qim0VarH = l6o1.H(u291.d(nim0Var, 1.0f), (es41) this.d, false, 14);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var3).b;
        qim0 qim0VarW = uyn1.w(qim0VarH, lnn1.n(new zzq0(16.0f, 16.0f, 16.0f, 16.0f), vzq0Var));
        maa maaVar2 = (ywr0) this.e;
        qwr0 qwr0Var = (qwr0) this.f;
        iu30 iu30Var = (iu30) this.c;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
        x340 x340Var6 = x340Var3;
        int iHashCode = Long.hashCode(x340Var6.T);
        xos0 xos0VarM = x340Var6.m();
        qim0 qim0VarE = zr7.E(x340Var3, qim0VarW);
        hzj.A.getClass();
        x340 x340Var7 = x340Var3;
        if (x340Var7.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var7.m0();
        if (x340Var7.S) {
            x340Var7.l(hmb0.t1);
        } else {
            x340Var7.v0();
        }
        nko1.H(mbhVarA, x340Var3, y580.O0);
        nko1.H(xos0VarM, x340Var3, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
        nko1.F(x340Var3);
        nko1.H(qim0VarE, x340Var3, y580.Y);
        String strO0 = cwl1.o0(x340Var3, 2131957052);
        lee1 lee1Var = cbx.d(x340Var3).d;
        Object objT2 = x340Var7.T();
        m4c m4cVar2 = fkj0.X;
        if (objT2 == m4cVar2) {
            objT2 = wvr0.e;
            x340Var7.s0(objT2);
        }
        uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT2), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2040);
        ewr0 ewr0Var2 = hxa0Var.b;
        if (ewr0Var instanceof ewr0) {
            x340Var = x340Var7;
            x340Var.i0(1986935022);
            wwr0 wwr0Var = new wwr0(xwr0.a, ewr0Var.a);
            cvx cvxVar2 = cbx.b(x340Var3).b;
            maaVar = maaVar2;
            otw.c(maaVar, wwr0Var, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), (ipb1) null, x340Var3, 0, 8);
            r0 = 0;
            x340Var.r(false);
        } else {
            maaVar = maaVar2;
            x340Var = x340Var7;
            r0 = 0;
            x340Var.i0(1987168545);
            x340Var.r(false);
        }
        if (ewr0Var2 instanceof ewr0) {
            x340Var.i0(1987245177);
            wwr0 wwr0Var2 = new wwr0(xwr0.b, ewr0Var2.a);
            cvx cvxVar3 = cbx.b(x340Var3).b;
            otw.c(maaVar, wwr0Var2, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), (ipb1) null, x340Var3, 0, 8);
            x340Var.r((boolean) r0);
        } else {
            x340Var.i0(1987468129);
            x340Var.r((boolean) r0);
        }
        boolean zI2 = x340Var.i(hxa0Var) | x340Var.i(qwr0Var) | x340Var.g(iu30Var);
        Object objT3 = x340Var.T();
        if (!zI2) {
            m4cVar = m4cVar2;
            if (objT3 == m4cVar) {
            }
            zko1.c(yxa0Var, (Function0) objT3, x340Var3, r0);
            m4c m4cVar3 = m4cVar;
            x340Var2 = x340Var;
            uwo1.e(cwl1.o0(x340Var3, 2131957050), uyn1.B(nim0Var, 0.0f, cbx.b(x340Var3).b.a, 0.0f, 0.0f, 13), cbx.d(x340Var3).j, cbx.a(x340Var3).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var3, 0, 0, 2016);
            String strJ0 = ihc1.J0(ihc1.H0(cwl1.o0(x340Var3, 2131957051), "<mark>"), "</mark>");
            long jQ = f0o1.q(yxa0Var, x340Var3);
            cvx cvxVar4 = cbx.b(x340Var3).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            zI = x340Var2.i(qwr0Var) | x340Var2.g(iu30Var);
            objT = x340Var2.T();
            if (zI || objT == m4cVar3) {
                objT = new twr0(qwr0Var, iu30Var, (byte) 0);
                x340Var2.s0(objT);
            }
            kuo1.f(strJ0, "https://support.spotify.com/article/managed-accounts-for-premium-family/plain/", (iu30) objT, qim0VarB, jQ, x340Var3, 0, 0);
            x340Var2.r(true);
            return rih1.a;
        }
        m4cVar = m4cVar2;
        objT3 = new pcp0(hxa0Var, qwr0Var, iu30Var, (byte) 18);
        x340Var.s0(objT3);
        zko1.c(yxa0Var, (Function0) objT3, x340Var3, r0);
        m4c m4cVar4 = m4cVar;
        x340Var2 = x340Var;
        uwo1.e(cwl1.o0(x340Var3, 2131957050), uyn1.B(nim0Var, 0.0f, cbx.b(x340Var3).b.a, 0.0f, 0.0f, 13), cbx.d(x340Var3).j, cbx.a(x340Var3).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var3, 0, 0, 2016);
        String strJ1 = ihc1.J0(ihc1.H0(cwl1.o0(x340Var3, 2131957051), "<mark>"), "</mark>");
        long jQ2 = f0o1.q(yxa0Var, x340Var3);
        cvx cvxVar5 = cbx.b(x340Var3).b;
        qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
        zI = x340Var2.i(qwr0Var) | x340Var2.g(iu30Var);
        objT = x340Var2.T();
        if (zI) {
            objT = new twr0(qwr0Var, iu30Var, (byte) 0);
            x340Var2.s0(objT);
        } else {
            objT = new twr0(qwr0Var, iu30Var, (byte) 0);
            x340Var2.s0(objT);
        }
        kuo1.f(strJ1, "https://support.spotify.com/article/managed-accounts-for-premium-family/plain/", (iu30) objT, qim0VarB2, jQ2, x340Var3, 0, 0);
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        nim0 nim0Var;
        int i;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var2 = nim0.a;
        qim0 qim0VarD = u291.d(nim0Var2, 1.0f);
        fra fraVar = een.Z;
        Integer num = (Integer) this.b;
        if5 if5Var = (if5) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        Instant instant = (Instant) this.f;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
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
        wnb0 wnb0Var = new wnb0(1.0f, true);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        byo1.h(if5Var, x340Var, 8);
        uwr uwrVar = cbx.a;
        uwo1.e(str, null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
        if (str2 == null || ihc1.y0(str2)) {
            nim0Var = nim0Var2;
            i = 0;
            x340Var3.i0(-1431658216);
            ydh.l(nim0Var, cbx.b(x340Var).b.e, x340Var, x340Var3, false);
        } else {
            x340Var3.i0(-1431799638);
            i = 0;
            byo1.e(str2, x340Var, 0);
            nim0Var = nim0Var2;
            ydh.l(nim0Var, cbx.b(x340Var).b.b, x340Var, x340Var3, false);
        }
        byo1.d(instant, x340Var, i);
        x340Var3.r(true);
        zov0 zov0Var = cbx.b(x340Var).g;
        byo1.f(num, u291.r(nim0Var, 40.0f), x340Var, i);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:242:0x0b30  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        boolean z;
        x340 x340Var;
        long j;
        long j2;
        boolean z2;
        x340 x340Var2;
        long j3;
        tob1 tob1Var;
        boolean z3;
        boolean z4;
        byte b;
        fyc fycVar;
        o0i o0iVar;
        jax haxVar;
        byte b2 = this.a;
        z50 z50Var = z50.c;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.b;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                bb1 bb1Var = (bb1) obj6;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var3.g(vzq0Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    cvx cvxVar3 = cbx.b(x340Var4).b;
                    x4p1.a(f5p1.p(bb1Var), bb1Var.b, (iu30) obj8, (em0) obj7, (d0r) obj5, (g5l0) obj4, lnn1.n(vzq0Var, uyn1.j(16.0f, 16.0f, 16.0f, 0.0f, 8)), u291.d(nim0Var, 1.0f), x340Var4, 12582912);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                b2i b2iVar = (b2i) obj6;
                af5 af5VarF = pno1.f(b2iVar.h(x340Var5), (ib60) obj8, x340Var5);
                lee1 lee1Var = (lee1) obj7;
                if (lee1Var == null) {
                    x340Var = x340Var5;
                    x340Var.i0(-123446811);
                    lee1Var = (lee1) x340Var.k(rgx.a);
                    z = false;
                } else {
                    z = false;
                    x340Var = x340Var5;
                    x340Var.i0(-123447958);
                }
                x340Var.r(z);
                lee1 lee1Var2 = lee1Var;
                u7h u7hVar = (u7h) obj5;
                if (u7hVar == null) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(-123445019);
                    j = ((u7h) x340Var6.k(qgx.a)).a;
                    x340Var6.r(z);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(-123446042);
                    x340Var7.r(z);
                    j = u7hVar.a;
                }
                long j4 = j;
                dqs0 dqs0VarD = b2iVar.d(x340Var5);
                if (dqs0VarD == null) {
                    dqs0VarD = dqs0.e;
                }
                uwo1.d(af5VarF, j4, (qim0) obj4, lee1Var2, null, null, 0, false, null, 0, null, dqs0VarD, x340Var5, 0, 0, 2032);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                x340 x340Var8 = (b0k) obj2;
                x340Var8.i0(-1982228965);
                hf5 hf5Var = (hf5) obj6;
                af5 af5VarO = hf5Var.a.o(hf5Var.b, x340Var8);
                x340Var8.r(false);
                af5 af5VarF2 = pno1.f(af5VarO, (ib60) obj8, x340Var8);
                lee1 lee1Var3 = (lee1) obj7;
                if (lee1Var3 == null) {
                    x340Var8.i0(-1982225219);
                    lee1Var3 = (lee1) x340Var8.k(rgx.a);
                } else {
                    x340Var8.i0(-1982226366);
                }
                x340Var8.r(false);
                lee1 lee1Var4 = lee1Var3;
                u7h u7hVar2 = (u7h) obj5;
                if (u7hVar2 == null) {
                    x340Var8.i0(-1982223427);
                    j2 = ((u7h) x340Var8.k(qgx.a)).a;
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(-1982224450);
                    x340Var8.r(false);
                    j2 = u7hVar2.a;
                }
                long j5 = j2;
                x340Var8.i0(-1982222388);
                hf5Var.a.getClass();
                x340Var8.i0(684988580);
                x340Var8.r(false);
                x340Var8.r(false);
                uwo1.d(af5VarF2, j5, (qim0) obj4, lee1Var4, null, null, 0, false, null, 0, null, dqs0.e, x340Var8, 0, 0, 2032);
                return rih1Var;
            case 3:
                x340 x340Var9 = (b0k) obj2;
                ((Number) obj3).intValue();
                af5 af5VarF3 = pno1.f((String) obj6, (ib60) obj8, x340Var9);
                lee1 lee1Var5 = (lee1) obj7;
                if (lee1Var5 == null) {
                    x340Var2 = x340Var9;
                    x340Var2.i0(74405043);
                    lee1Var5 = (lee1) x340Var2.k(rgx.a);
                    z2 = false;
                } else {
                    z2 = false;
                    x340Var2 = x340Var9;
                    x340Var2.i0(74403896);
                }
                x340Var2.r(z2);
                lee1 lee1Var6 = lee1Var5;
                u7h u7hVar3 = (u7h) obj5;
                x340 x340Var10 = x340Var9;
                if (u7hVar3 == null) {
                    x340Var10.i0(74406835);
                    j3 = ((u7h) x340Var10.k(qgx.a)).a;
                    x340Var10.r(z2);
                } else {
                    x340Var10.i0(74405812);
                    x340Var10.r(z2);
                    j3 = u7hVar3.a;
                }
                uwo1.d(af5VarF3, j3, (qim0) obj4, lee1Var6, null, null, 0, false, null, 0, null, null, x340Var9, 0, 0, 4080);
                return rih1Var;
            case 4:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                l96 l96Var = (l96) obj6;
                fa6 fa6Var = (fa6) obj7;
                ven0 ven0Var = (ven0) obj5;
                iu30 iu30Var = (iu30) obj8;
                tob1 tob1Var2 = (ven0) obj4;
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var11, 0);
                x340 x340Var12 = x340Var11;
                int iHashCode = Long.hashCode(x340Var12.T);
                xos0 xos0VarM = x340Var12.m();
                qim0 qim0VarE = zr7.E(x340Var11, nim0Var);
                hzj.A.getClass();
                x340 x340Var13 = x340Var11;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(mbhVarA, x340Var11, y580.O0);
                nko1.H(xos0VarM, x340Var11, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var11, y580.R0);
                nko1.F(x340Var11);
                nko1.H(qim0VarE, x340Var11, y580.Y);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var11).b;
                op71.g(x340Var11, u291.h(nim0Var, 12.0f));
                ba6 ba6Var = l96Var.g;
                y86 y86Var = fa6Var.a;
                psk pskVar = fa6Var.b;
                boolean zE = ba6Var.e(y86Var, (String) tob1Var2.getValue());
                psk pskVar2 = psk.b;
                boolean z5 = pskVar == pskVar2 && fa6Var.d && !zE;
                boolean zI = x340Var13.i(ven0Var) | x340Var13.i(l96Var) | x340Var13.g(iu30Var) | x340Var13.i(tob1Var2) | x340Var13.h(zE);
                Object objT = x340Var13.T();
                if (zI || objT == fkj0.X) {
                    tob1Var = tob1Var2;
                    z3 = zE;
                    objT = new g96(l96Var, iu30Var, z3, ven0Var, tob1Var);
                    x340Var13.s0(objT);
                } else {
                    tob1Var = tob1Var2;
                    z3 = zE;
                }
                Function0 function0 = (Function0) objT;
                String str = (String) tob1Var.getValue();
                boolean z6 = y86Var.e;
                bro1 bro1Var = y86Var.B;
                if ((bro1Var instanceof yk7) || (bro1Var instanceof zk7)) {
                    boolean z7 = pskVar == psk.a;
                    boolean zEquals = str.equals(y86Var.c);
                    boolean z8 = (ihc1.y0(str) || y86Var.k) ? false : true;
                    boolean z9 = y86Var.u.isEmpty() || !zEquals;
                    if (!y86Var.j && ((z7 && !z6 && y86Var.g) || ((z7 && z6 && z8 && !zEquals) || ((pskVar == pskVar2 && z8 && z9) || (pskVar == psk.c && z8 && z3))))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                String strG = l96Var.g.g(pskVar, y86Var.w, z5);
                cvx cvxVar5 = cbx.b(x340Var11).b;
                r4o1.s(function0, z4, y86Var.j, !z5, strG, uyn1.z(16.0f, 0.0f, 2, nim0Var), x340Var11, 0);
                x340Var13.r(true);
                return rih1Var;
            case 5:
                int iIntValue2 = ((Number) obj).intValue();
                x340 x340Var14 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj8;
                ven0 ven0Var2 = (ven0) obj5;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var14.e(iIntValue2) ? 4 : 2;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    Object obj9 = ((List) obj6).get(iIntValue2);
                    x340Var15.i0(-323902440);
                    qim0 qim0VarN = anm1.N(c680.w(obj9, u890.j(obj9, ven0Var2.getValue()), (azb) obj7), nim0Var);
                    boolean zJ = u890.j(obj9, ven0Var2.getValue());
                    jgx jgxVar = new jgx(8);
                    boolean zG = x340Var15.g(ven0Var2) | x340Var15.i(obj9) | x340Var15.g(iu30Var2);
                    Object objT2 = x340Var15.T();
                    if (zG || objT2 == fkj0.X) {
                        b = 1;
                        objT2 = new uvb(obj9, iu30Var2, ven0Var2, (byte) 1);
                        x340Var15.s0(objT2);
                    } else {
                        b = 1;
                    }
                    s1p1.h(zJ, (iu30) objT2, jgxVar, qim0VarN, null, apo.r(709530408, new vvb((j2i) obj4, obj9, b), x340Var15), x340Var15, 196608);
                    x340Var15.r(false);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 6:
                fyc fycVar2 = (fyc) obj6;
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                ven0 ven0Var3 = (ven0) obj7;
                if (((t480) ven0Var3.getValue()) == null) {
                    bcl1 bcl1Var = (bcl1) fycVar2.b;
                    hp80 hp80Var = ((o0i) obj8).e;
                    bcl1Var.getClass();
                    p3m0 p3m0VarH = bcl1Var.h(hp80Var.b());
                    x6h1 x6h1VarC = p3m0VarH.a.c();
                    x6h1VarC.i.add(new a7h1("watch_feed_component", "chapter_navigation_list_sheet", (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = p3m0VarH.b.b.c;
                    ven0Var3.setValue(bcl1Var.b.p(k7h1Var.a(), Collections.singleton(c3h1.b)));
                }
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar6 = cbx.b(x340Var16).b;
                qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, cbx.b(x340Var16).b.d, 5);
                oje ojeVar = (oje) obj5;
                o0i o0iVar2 = (o0i) obj8;
                ven0 ven0Var4 = (ven0) obj7;
                scx scxVar = (scx) obj4;
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var16, 0);
                x340 x340Var17 = x340Var16;
                int iHashCode2 = Long.hashCode(x340Var17.T);
                xos0 xos0VarM2 = x340Var17.m();
                qim0 qim0VarE2 = zr7.E(x340Var16, qim0VarB);
                hzj.A.getClass();
                x340 x340Var18 = x340Var16;
                if (x340Var18.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var18.m0();
                if (x340Var18.S) {
                    x340Var18.l(n4kVar);
                } else {
                    x340Var18.v0();
                }
                nko1.H(mbhVarA2, x340Var16, y580.O0);
                nko1.H(xos0VarM2, x340Var16, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var16, y580.R0);
                nko1.F(x340Var16);
                nko1.H(qim0VarE2, x340Var16, y580.Y);
                x340Var18.i0(-2035000541);
                for (khe kheVar : ojeVar.b) {
                    boolean zEquals2 = kheVar.a.equals(ojeVar.c);
                    boolean zI2 = x340Var18.i(fycVar2) | x340Var18.i(o0iVar2) | x340Var18.g(kheVar) | x340Var18.i(ven0Var4) | x340Var18.i(scxVar);
                    Object objT3 = x340Var18.T();
                    if (zI2 || objT3 == fkj0.X) {
                        fycVar = fycVar2;
                        o0iVar = o0iVar2;
                        objT3 = new vt1(fycVar, o0iVar, kheVar, scxVar, ven0Var4);
                        x340Var18.s0(objT3);
                    } else {
                        fycVar = fycVar2;
                        o0iVar = o0iVar2;
                    }
                    omo1.b(kheVar, zEquals2, new gbx(z50Var, (Function0) objT3), null, x340Var16, 0);
                    fycVar2 = fycVar;
                    o0iVar2 = o0iVar;
                }
                x340Var18.r(false);
                x340Var18.r(true);
                return rih1Var;
            case 7:
                x340 x340Var19 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarY = voo1.y(u291.f(nim0Var2, 1.0f), voo1.f);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarN2 = anm1.N("child_login_email_collection_sheet", too1.y(qim0VarY, new bgc0(lhc.g(x340Var19).g, 32)));
                Function0 function1 = (Function0) obj8;
                tob1 tob1Var3 = (tob1) obj7;
                y7e1 y7e1Var = (y7e1) obj5;
                lz20 lz20Var = (lz20) obj6;
                y7e1 y7e1Var2 = (y7e1) obj4;
                era eraVar = een.P0;
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var19, 0);
                x340 x340Var20 = x340Var19;
                int iHashCode3 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM3 = x340Var20.m();
                qim0 qim0VarE3 = zr7.E(x340Var19, qim0VarN2);
                hzj.A.getClass();
                x340 x340Var21 = x340Var19;
                if (x340Var21.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var21.m0();
                if (x340Var21.S) {
                    x340Var21.l(n4kVar);
                } else {
                    x340Var21.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA3, x340Var19, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM3, x340Var19, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var19, lljVar3);
                nko1.F(x340Var19);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var19, lljVar4);
                qim0 qim0VarF2 = u291.f(nim0Var2, 1.0f);
                uwr uwrVar4 = cbx.a;
                mta mtaVar = cbx.b(x340Var19).d;
                qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF2);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var19, 0);
                int iHashCode4 = Long.hashCode(x340Var21.T);
                xos0 xos0VarM4 = x340Var21.m();
                qim0 qim0VarE4 = zr7.E(x340Var19, qim0VarJ);
                x340Var21.m0();
                if (x340Var21.S) {
                    x340Var21.l(n4kVar);
                } else {
                    x340Var21.v0();
                }
                nko1.H(jw31VarA, x340Var19, lljVar);
                nko1.H(xos0VarM4, x340Var19, lljVar2);
                i3a.l(iHashCode4, x340Var19, lljVar3, x340Var19);
                nko1.H(qim0VarE4, x340Var19, lljVar4);
                boolean zG2 = x340Var21.g(function1);
                Object objT4 = x340Var21.T();
                if (zG2 || objT4 == m4cVar) {
                    objT4 = new ukf(function1, (byte) 13);
                    x340Var21.s0(objT4);
                }
                gbx gbxVar = new gbx(z50Var, (Function0) objT4);
                ldx ldxVar = ldx.c;
                foo1.c(gbxVar, ldxVar, null, null, yla.s(x340Var19), null, null, null, null, null, jci.a, x340Var19, 0, 48, 2012);
                String strO0 = cwl1.o0(x340Var19, 2131953846);
                lee1 lee1Var7 = cbx.d(x340Var19).f;
                wnb0 wnb0Var = new wnb0(1.0f, true);
                cvx cvxVar7 = cbx.b(x340Var19).b;
                qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, wnb0Var);
                Object objT5 = x340Var21.T();
                if (objT5 == m4cVar) {
                    objT5 = tzf.d;
                    x340Var21.s0(objT5);
                }
                uwo1.e(strO0, s161.b(qim0VarZ, false, (iu30) objT5), lee1Var7, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var19, 0, 0, 2024);
                boolean zI3 = x340Var21.i(tob1Var3) | x340Var21.g(function1);
                Object objT6 = x340Var21.T();
                if (zI3 || objT6 == m4cVar) {
                    objT6 = new ame(function1, tob1Var3, (byte) 11);
                    x340Var21.s0(objT6);
                }
                gbx gbxVar2 = new gbx(z50Var, (Function0) objT6);
                if (((Boolean) tob1Var3.getValue()).booleanValue()) {
                    x340Var21.i0(621755026);
                    x340Var21.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var21.i0(621757191);
                    haxVar = new hax(cwl1.o0(x340Var19, 2131953855));
                    x340Var21.r(false);
                }
                foo1.c(gbxVar2, ldxVar, anm1.N("child_login_email_save", nim0Var2), haxVar, yla.s(x340Var19), null, null, null, null, null, jci.b, x340Var19, 0, 48, 1992);
                x340Var21.r(true);
                cvx cvxVar8 = cbx.b(x340Var19).b;
                rqo1.g(0, 0, x340Var19, uyn1.z(0.0f, 8.0f, 1, nim0Var2));
                qim0 qim0VarF3 = u291.f(nim0Var2, 1.0f);
                float f = cbx.b(x340Var19).b.a;
                cvx cvxVar9 = cbx.b(x340Var19).b;
                qim0 qim0VarY2 = uyn1.y(qim0VarF3, f, 16.0f);
                cvx cvxVar10 = cbx.b(x340Var19).b;
                mbh mbhVarA4 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var19, 0);
                int iHashCode5 = Long.hashCode(x340Var21.T);
                xos0 xos0VarM5 = x340Var21.m();
                qim0 qim0VarE5 = zr7.E(x340Var19, qim0VarY2);
                x340Var21.m0();
                if (x340Var21.S) {
                    x340Var21.l(n4kVar);
                } else {
                    x340Var21.v0();
                }
                nko1.H(mbhVarA4, x340Var19, lljVar);
                nko1.H(xos0VarM5, x340Var19, lljVar2);
                i3a.l(iHashCode5, x340Var19, lljVar3, x340Var19);
                nko1.H(qim0VarE5, x340Var19, lljVar4);
                uwo1.e(cwl1.o0(x340Var19, 2131953851), null, cbx.d(x340Var19).g, cbx.a(x340Var19).b.b, null, null, 0, false, null, 0, null, x340Var19, 0, 0, 2034);
                gyo1.e(y7e1Var, cwl1.o0(x340Var19, 2131953853), 6, anm1.N("child_login_email_field", vby0.p(nim0Var2, lz20Var)), x340Var19, 0);
                gyo1.e(y7e1Var2, cwl1.o0(x340Var19, 2131953850), 7, anm1.N("child_login_confirmation_email_field", nim0Var2), x340Var19, 0);
                String strO1 = cwl1.o0(x340Var19, 2131953852);
                lee1 lee1Var8 = cbx.d(x340Var19).m;
                long j6 = cbx.a(x340Var19).b.b;
                cvx cvxVar11 = cbx.b(x340Var19).b;
                uwo1.e(strO1, uyn1.B(nim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var8, j6, null, null, 0, false, null, 0, null, x340Var19, 0, 0, 2032);
                x340Var21.r(true);
                x340Var21.r(true);
                boolean zI4 = x340Var21.i(lz20Var);
                Object objT7 = x340Var21.T();
                if (zI4 || objT7 == m4cVar) {
                    objT7 = new fx1(lz20Var, null, (byte) 3);
                    x340Var21.s0(objT7);
                }
                qxd0.t(rih1Var, x340Var19, (vu30) objT7);
                return rih1Var;
            case 8:
                i2c i2cVar = (i2c) obj;
                x340 x340Var22 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var22.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    mod.b(t4k.h.a(new xat(hjl.i(i2cVar.b) / 320.0f, 1.0f)), apo.r(293885925, new k40(i2cVar, (String) obj6, (String) obj8, (String) obj7, (sxq0) obj5, (List) obj4, (byte) 16), x340Var23), x340Var23, 56);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                xmh xmhVar = (xmh) obj7;
                p8p1.b((List) obj6, xmhVar.Y, (oih) obj5, (xtb0) obj4, (iu30) obj8, u291.d(nim0Var, 1.0f).then((qim0) obj), xmhVar.t.a(), (b0k) obj2, 512);
                return rih1Var;
            case 10:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var25 = x340Var24;
                boolean zY = x340Var25.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16);
                j06 j06Var = x340Var25.a;
                if (!zY) {
                    x340Var25.b0();
                    return rih1Var;
                }
                String str2 = (String) obj6;
                String str3 = (String) obj8;
                xe51 xe51Var = (l4o1) obj7;
                Function0 function2 = (Function0) obj5;
                String str4 = (String) obj4;
                era eraVar2 = een.P0;
                mbh mbhVarA5 = jbh.a(f36Var, eraVar2, x340Var25, 0);
                int iHashCode6 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM6 = x340Var25.m();
                qim0 qim0VarE6 = zr7.E(x340Var25, nim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA5, x340Var25, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM6, x340Var25, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode6);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var25, lljVar7);
                nko1.F(x340Var25);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE6, x340Var25, lljVar8);
                Object objT8 = x340Var25.T();
                if (objT8 == fkj0.X) {
                    objT8 = afm.S0;
                    x340Var25.s0(objT8);
                }
                qim0 qim0VarB2 = s161.b(nim0Var, true, (iu30) objT8);
                mbh mbhVarA6 = jbh.a(f36Var, eraVar2, x340Var25, 0);
                int iHashCode7 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM7 = x340Var25.m();
                qim0 qim0VarE7 = zr7.E(x340Var25, qim0VarB2);
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(mbhVarA6, x340Var25, lljVar5);
                nko1.H(xos0VarM7, x340Var25, lljVar6);
                x0d.q(iHashCode7, x340Var25, lljVar7, x340Var25);
                nko1.H(qim0VarE7, x340Var25, lljVar8);
                uwo1.e(str2, null, null, 0L, null, null, 0, false, null, 0, null, x340Var25, 0, 0, 2046);
                uwr uwrVar5 = cbx.a;
                cvx cvxVar12 = cbx.b(x340Var25).b;
                op71.g(x340Var25, u291.h(nim0Var, 4.0f));
                uwo1.e(str3, null, null, cbx.a(x340Var25).b.b, null, null, 0, false, null, 0, null, x340Var25, 0, 0, 2038);
                x340Var25.r(true);
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA2 = ew31.a(h36.b, een.Z, x340Var25, 6);
                int iHashCode8 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM8 = x340Var25.m();
                qim0 qim0VarE8 = zr7.E(x340Var25, qim0VarF4);
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(jw31VarA2, x340Var25, lljVar5);
                nko1.H(xos0VarM8, x340Var25, lljVar6);
                x0d.q(iHashCode8, x340Var25, lljVar7, x340Var25);
                nko1.H(qim0VarE8, x340Var25, lljVar8);
                if (xe51Var instanceof xe51) {
                    x340Var25.i0(946912182);
                    gbx gbxVar3 = new gbx(z50Var, xe51Var.f);
                    jdx jdxVar = jdx.c;
                    gdx gdxVarS = yla.s(x340Var25);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    foo1.c(gbxVar3, jdxVar, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), null, gdxVarS, null, null, null, null, null, apo.r(780639605, new h1m(xe51Var, (byte) 8), x340Var25), x340Var25, 48, 48, 2008);
                    cvx cvxVar13 = cbx.b(x340Var25).b;
                    ab80.p(nim0Var, 12.0f, x340Var25, false);
                } else {
                    x340Var25.i0(947524339);
                    x340Var25.r(false);
                }
                gbx gbxVar4 = new gbx(z50Var, function2);
                idx idxVar = new idx();
                gdx gdxVarS2 = yla.s(x340Var25);
                qim0 qim0VarN3 = anm1.N(str4, nim0Var);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                foo1.c(gbxVar4, idxVar, qim0VarN3.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), null, gdxVarS2, null, null, null, null, null, apo.r(-599679568, new pji(str4, (byte) 20), x340Var25), x340Var25, 0, 48, 2008);
                x340Var25.r(true);
                x340Var25.r(true);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return a(obj, obj2, obj3);
            case grn1.d /* 12 */:
                return d(obj, obj2, obj3);
            case 13:
                return e(obj, obj2, obj3);
            case 14:
                return f(obj, obj2, obj3);
            case 15:
                return g(obj, obj2, obj3);
            case 16:
                return h(obj, obj2, obj3);
            case 17:
                return i(obj, obj2, obj3);
            case 18:
                return j(obj, obj2, obj3);
            case 19:
                return k(obj, obj2, obj3);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj3).intValue();
                String str5 = (String) obj6;
                hrr0 hrr0Var = (hrr0) obj8;
                x340 x340Var26 = (b0k) obj2;
                wmy wmyVar = (wmy) obj7;
                String str6 = (String) obj5;
                String str7 = (String) obj4;
                boolean zI5 = x340Var26.i(hrr0Var) | x340Var26.i(wmyVar) | x340Var26.g(str6) | x340Var26.g(str7);
                Object objT9 = x340Var26.T();
                if (zI5 || objT9 == fkj0.X) {
                    k7h0 k7h0Var = new k7h0(wmyVar, str6, str7, hrr0Var, (byte) 3);
                    x340Var26.s0(k7h0Var);
                    objT9 = k7h0Var;
                }
                rwo1.f(0, str5, (Function0) objT9, x340Var26);
                return rih1Var;
            case 21:
                return m(obj, obj2, obj3);
            case 22:
                return n(obj, obj2, obj3);
            case 23:
                return o(obj, obj2, obj3);
            case 24:
                return p(obj, obj2, obj3);
            case 25:
                return q(obj, obj2, obj3);
            case 26:
                return r(obj, obj2, obj3);
            case 27:
                return s(obj, obj2, obj3);
            case 28:
                return t(obj, obj2, obj3);
            default:
                x340 x340Var27 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
                WeakHashMap weakHashMap2 = osl1.x;
                qim0 qim0VarY3 = too1.y(qim0VarF5, lhc.g(x340Var27).e);
                String str8 = (String) obj6;
                Function0 function3 = (Function0) obj8;
                Uri uri = (Uri) obj7;
                String str9 = (String) obj5;
                String str10 = (String) obj4;
                mbh mbhVarA7 = jbh.a(f36Var, een.P0, x340Var27, 0);
                x340 x340Var28 = x340Var27;
                int iHashCode9 = Long.hashCode(x340Var28.T);
                xos0 xos0VarM9 = x340Var28.m();
                qim0 qim0VarE9 = zr7.E(x340Var27, qim0VarY3);
                hzj.A.getClass();
                x340 x340Var29 = x340Var27;
                if (x340Var29.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var29.m0();
                if (x340Var29.S) {
                    x340Var29.l(n4kVar);
                } else {
                    x340Var29.v0();
                }
                nko1.H(mbhVarA7, x340Var27, y580.O0);
                nko1.H(xos0VarM9, x340Var27, y580.N0);
                nko1.H(Integer.valueOf(iHashCode9), x340Var27, y580.R0);
                nko1.F(x340Var27);
                nko1.H(qim0VarE9, x340Var27, y580.Y);
                jto1.b(null, null, null, false, null, null, null, null, null, apo.r(-955805696, new z5w(uri, str9, (byte) 1), x340Var27), null, null, null, null, null, apo.r(645725147, new qdg0(str9, (byte) 29), x340Var27), x340Var27, 805306368, 196608, 32255);
                rqo1.g(0, 1, x340Var27, null);
                qim0 qim0VarN4 = anm1.N("profile_sheet_report_row", nim0Var);
                boolean zG3 = x340Var29.g(function3);
                Object objT10 = x340Var29.T();
                if (zG3 || objT10 == fkj0.X) {
                    objT10 = new isr0(function3, (byte) 28);
                    x340Var29.s0(objT10);
                }
                jto1.b(qim0VarN4, null, null, false, null, null, new gbx(new y50(str8), (Function0) objT10), null, x9j.a, null, null, null, null, null, null, apo.r(-1774700334, new iww0(str10, (byte) 0), x340Var27), x340Var27, 100663296, 196608, 32446);
                x340Var29.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb1(Object obj, Object obj2, Object obj3, Object obj4, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb1(Object obj, Object obj2, Object obj3, iu30 iu30Var, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = iu30Var;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(Function0 function0, qmc1 qmc1Var, String str, iu30 iu30Var, String str2) {
        super(3);
        this.a = (byte) 26;
        this.b = function0;
        this.d = qmc1Var;
        this.e = str;
        this.c = iu30Var;
        this.f = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(h7g0 h7g0Var, d0r d0rVar, pbq pbqVar, n8l0 n8l0Var, iu30 iu30Var) {
        super(3);
        this.a = (byte) 18;
        this.b = h7g0Var;
        this.e = d0rVar;
        this.d = pbqVar;
        this.f = n8l0Var;
        this.c = iu30Var;
    }
}
