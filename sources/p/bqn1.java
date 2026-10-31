package p;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import androidx.compose.ui.graphics.ColorFilter;
import com.microsoft.device.display.DisplayMask;
import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import defpackage.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class bqn1 {
    public static final xrj0 a = new xrj0((byte) 16, 10, 11);
    public static b180 b;

    public static final cdf0 A(Context context, int i) {
        cdf0 cdf0Var = new cdf0();
        fcf0 fcf0Var = kcf0.f(i, context, kcf0.l(context, i)).a;
        if (fcf0Var == null) {
            hhg1.n("Lottie composition cannot be null");
            return null;
        }
        cdf0Var.n(fcf0Var);
        p5r p5rVar = qpi1.a;
        cdf0Var.c = !(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f);
        return cdf0Var;
    }

    public static u0d B(String str) {
        Object next;
        Integer numC0;
        d7 d7Var = new d7(t0d.c, (byte) 0);
        while (true) {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
            char c = ((t0d) next).a;
            Character chValueOf = str.length() == 0 ? null : Character.valueOf(str.charAt(str.length() - 1));
            if (chValueOf != null && c == chValueOf.charValue()) {
                break;
            }
        }
        t0d t0dVar = (t0d) next;
        if (t0dVar != null && (numC0 = nhc1.c0(ihc1.m0(1, str))) != null) {
            int iIntValue = numC0.intValue();
            u0d u0dVar = new u0d(iIntValue, t0dVar);
            if (1 <= iIntValue && iIntValue < 13) {
                char c2 = t0dVar.a;
                StringBuilder sb = new StringBuilder();
                sb.append(iIntValue);
                sb.append(c2);
                if (str.equals(sb.toString())) {
                    return u0dVar;
                }
            }
        }
        return null;
    }

    public static final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1547802415);
        if (x340Var.Y(i & 1, i != 0)) {
            db80 db80VarR = t5p1.r("chevronHint", x340Var, 0);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = k74.f;
                x340Var.s0(objT);
            }
            cb80 cb80VarG = t5p1.g(db80VarR, 0.0f, 1.0f, irn1.Y(irn1.e0((iu30) objT), 1, 0L, 4), "chevronHintProgress", x340Var, 29112, 0);
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(8.0f);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            qlx qlxVar = qlx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131958842));
            qim0 qim0VarN = anm1.N("mixing_presets_v2_expand_collapse_button", nim0.a);
            boolean zG = x340Var.g(cb80VarG) | x340Var.d(fX0);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new na5(fX0, cb80VarG, (byte) 0);
                x340Var.s0(objT2);
            }
            w0h1.a(qlxVar, jslVar, i541.C(qim0VarN, (iu30) objT2), j, 0L, false, x340Var, qlx.d, 48);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 18, i, false);
        }
    }

    public static final void b(n960 n960Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        byte b2;
        zvx zvxVar;
        int i2 = n960Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1216261220);
        int i3 = (b0kVar3.g(n960Var) ? 4 : 2) | i | (b0kVar3.i(qim0Var) ? 32 : 16);
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z = i2 == 1;
            Uri uri = Uri.parse(n960Var.a);
            if (z) {
                b0kVar3.i0(1294202617);
                b0kVar3.r(false);
                zvxVar = null;
            } else {
                b0kVar3.i0(595938667);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                cua cuaVar2 = cbx.b(b0kVar3).f;
                zvxVar = new zvx();
                b0kVar3.r(false);
            }
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            pux puxVarU = flo1.u(b0kVar3, i2);
            qim0 qim0VarQ = nim0.a;
            if (z) {
                qim0VarQ = i1p1.q(qim0VarQ, er31.a);
            }
            qim0 qim0VarThen = qim0Var.then(qim0VarQ);
            b0kVar2 = b0kVar3;
            b2 = 0;
            eso1.e(uri, isl.a, qim0VarThen, (p3v) null, zvxVar, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, puxVarU, false, false, b0kVar2, 1073744944, 0, 3520);
        } else {
            b0kVar2 = b0kVar3;
            b2 = 0;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lf50(n960Var, qim0Var, i, b2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, byte] */
    public static final void c(hwq hwqVar, boolean z, qim0 qim0Var, boolean z2, byp bypVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z3;
        zuc0 zuc0Var;
        ?? r4;
        xu30 xu30VarR;
        j2i j2iVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(753216011);
        int i2 = i | (x340Var.i(hwqVar) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 384 | (x340Var.g(bypVar) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 65534;
            x340Var.i0(166611895);
            j7e0 j7e0Var = hwqVar.g;
            j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
            qim0 qim0Var4 = nim0.a;
            if (j7e0Var2 == null || (zuc0Var = j7e0Var2.a) == null) {
                qim0Var3 = qim0Var4;
                z3 = false;
            } else {
                x4i1 x4i1Var = zuc0Var.d;
                boolean z4 = z2 && hwqVar.f.b > 1;
                boolean zX = byp.x(zuc0Var);
                x340Var.i0(1200256545);
                j2i j2iVarR = apo.r(-392694200, new o3((Object) bypVar, (Object) zuc0Var, zuc0Var.j, (byte) 17), x340Var);
                x340Var.r(false);
                fvu fvuVar = byp.x(zuc0Var) ? null : new fvu((String) bypVar.b, byp.E(zuc0Var), zuc0Var.n, 6);
                if (fvuVar == null) {
                    x340Var.i0(-1446344498);
                    r4 = 0;
                    x340Var.r(false);
                    xu30VarR = null;
                } else {
                    r4 = 0;
                    x340Var.i0(-1446344497);
                    xu30VarR = apo.r(1101204744, new cex(bypVar, fvuVar, (byte) 6), x340Var);
                    x340Var.r(false);
                }
                if (!z4 || x4i1Var == null) {
                    x340Var.i0(-1444765978);
                    x340Var.r((boolean) r4);
                    j2iVar = null;
                } else {
                    x340Var.i0(-1445084378);
                    j2i j2iVarR2 = apo.r(167142266, new nzd(bypVar, x4i1Var, zuc0Var, (byte) 29), x340Var);
                    x340Var.r((boolean) r4);
                    j2iVar = j2iVarR2;
                }
                qim0Var3 = qim0Var4;
                k(qim0Var3, zX, apo.r(1914277191, new x9z(bypVar, zuc0Var, r4), x340Var), j2iVarR, apo.r(1906278217, new x9z(bypVar, zuc0Var, (byte) 1), x340Var), j2iVar, xu30VarR, apo.r(-253203892, new tf((Object) bypVar, (Object) zuc0Var, (Object) hwqVar, z, (byte) 9), x340Var), bypVar, x340Var, ((i3 << 12) & 234881024) | 12607878);
                z3 = false;
            }
            x340Var.r(z3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(hwqVar, z, qim0Var2, z2, bypVar, i);
        }
    }

    public static final void d(s2m s2mVar, d0r d0rVar, nu nuVar, nu nuVar2, vky vkyVar, cx0 cx0Var, cx0 cx0Var2, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        cx0 cx0Var3;
        x340 x340Var;
        boolean z;
        boolean z2;
        m4c m4cVar = fkj0.X;
        String str = s2mVar.b;
        c9 c9VarF = s2mVar.e;
        c9 c9VarF2 = s2mVar.d;
        k620 k620Var = s2mVar.g;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1310770215);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var2.g(s2mVar) : x340Var2.i(s2mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(d0rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(nuVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(nuVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(vkyVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= (i & 262144) == 0 ? x340Var2.g(cx0Var) : x340Var2.i(cx0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var2.i(cx0Var2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG = x340Var2.g(c9VarF2) | x340Var2.e(k620Var.ordinal());
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                EntityType entityTypeV = rqo1.v(k620Var);
                if (entityTypeV != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c9VarF2.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        Object next = it2.next();
                        if (((hby) next).b == entityTypeV) {
                            arrayList.add(next);
                        }
                        it = it2;
                    }
                    c9VarF2 = mqo1.F(arrayList);
                }
                x340Var2.s0(c9VarF2);
                objT2 = c9VarF2;
            }
            c380 c380Var = (c380) objT2;
            boolean zG2 = x340Var2.g(c9VarF) | x340Var2.e(k620Var.ordinal());
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == m4cVar) {
                EntityType entityTypeV2 = rqo1.v(k620Var);
                if (entityTypeV2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = c9VarF.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        Iterator it4 = it3;
                        if (((hby) next2).b == entityTypeV2) {
                            arrayList2.add(next2);
                        }
                        it3 = it4;
                    }
                    c9VarF = mqo1.F(arrayList2);
                }
                x340Var2.s0(c9VarF);
                objT3 = c9VarF;
            }
            c380 c380Var2 = (c380) objT3;
            i6o0 i6o0VarQ = k1o1.q(x340Var2);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarL = bmq0.L(u291.d(nim0Var, 1.0f), i6o0VarQ, (g6o0) null);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarL);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            int i4 = i3 & 29360128;
            boolean z4 = i4 == 8388608;
            Object objT4 = x340Var2.T();
            if (z4 || objT4 == m4cVar) {
                objT4 = new usj(iu30Var, (byte) 22);
                x340Var2.s0(objT4);
            }
            iu30 iu30Var2 = (iu30) objT4;
            boolean z5 = i4 == 8388608;
            Object objT5 = x340Var2.T();
            if (z5 || objT5 == m4cVar) {
                objT5 = new jzk(iu30Var, (byte) 9);
                x340Var2.s0(objT5);
            }
            Function0 function0 = (Function0) objT5;
            boolean zI = x340Var2.i(ven0Var);
            Object objT6 = x340Var2.T();
            if (zI || objT6 == m4cVar) {
                objT6 = new f4g(ven0Var, (byte) 24);
                x340Var2.s0(objT6);
            }
            x340Var = x340Var2;
            otw.c(cx0Var, new rb51(str, iu30Var2, function0, (iu30) objT6, null), (qim0) null, (ipb1) null, x340Var, 8 | ((i3 >> 15) & 14), 12);
            c380 c380Var3 = s2mVar.f;
            boolean z6 = i4 == 8388608;
            Object objT7 = x340Var.T();
            if (z6 || objT7 == m4cVar) {
                objT7 = new usj(iu30Var, (byte) 23);
                x340Var.s0(objT7);
            }
            otw.c(nuVar2, new a920(k620Var, c380Var3, (iu30) objT7), (qim0) null, (ipb1) null, x340Var, (i3 >> 9) & 14, 12);
            if (s2mVar.i) {
                x340Var.i0(1962219293);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                op71.g(x340Var, u291.h(nim0Var, 200.0f));
                xto1.e(null, 5, 0L, 0L, x340Var, 48, 13);
                z = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                z = true;
                if (s2mVar.j != null) {
                    x340Var.i0(1962541042);
                    otw.c(nuVar, h8x.a, (qim0) null, (ipb1) null, x340Var, ((i3 >> 6) & 14) | 48, 12);
                    x340Var.r(false);
                } else {
                    if (str.length() > 0) {
                        x340Var.i0(1962710488);
                        if (s2mVar.c.isEmpty()) {
                            z2 = false;
                            if (s2mVar.h) {
                                x340Var.i0(1963220531);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1963071576);
                                otw.c(nuVar, new j8x(str), (qim0) null, (ipb1) null, x340Var, (i3 >> 6) & 14, 12);
                                x340Var.r(false);
                            }
                        } else {
                            x340Var.i0(1962744867);
                            z2 = false;
                            g(d0rVar, 1, s2mVar.a, s2mVar.c, vkyVar, iu30Var, null, null, x340Var, (14 & (i3 >> 3)) | 48 | (i3 & 57344) | (458752 & (i3 >> 6)), 192);
                            x340Var = x340Var;
                            x340Var.r(false);
                        }
                        x340Var.r(z2);
                    } else {
                        boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                        i8x i8xVar = i8x.a;
                        if (zBooleanValue) {
                            x340Var.i0(1963346050);
                            if (c380Var2.isEmpty()) {
                                cx0Var3 = cx0Var2;
                                x340Var.i0(1964102109);
                                otw.c(nuVar, i8xVar, (qim0) null, (ipb1) null, x340Var, ((i3 >> 6) & 14) | 48, 12);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1963389977);
                                cx0Var3 = cx0Var2;
                                g(d0rVar, 3, s2mVar.a, c380Var2, vkyVar, iu30Var, cwl1.o0(x340Var, 2131953589), apo.r(1338636286, new jjk(cx0Var3, iu30Var, (byte) 14), x340Var), x340Var, (14 & (i3 >> 3)) | 12582960 | (i3 & 57344) | (458752 & (i3 >> 6)), 0);
                                x340Var = x340Var;
                                x340Var.r(false);
                            }
                            x340Var.r(false);
                        } else {
                            cx0Var3 = cx0Var2;
                            x340Var.i0(1964333152);
                            if (c380Var.isEmpty()) {
                                x340Var.i0(1964783613);
                                otw.c(nuVar, i8xVar, (qim0) null, (ipb1) null, x340Var, ((i3 >> 6) & 14) | 48, 12);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1964378040);
                                g(d0rVar, 2, s2mVar.a, c380Var, vkyVar, iu30Var, cwl1.o0(x340Var, 2131953590), null, x340Var, (14 & (i3 >> 3)) | 48 | (i3 & 57344) | (458752 & (i3 >> 6)), 128);
                                x340Var = x340Var;
                                x340Var.r(false);
                            }
                            x340Var.r(false);
                        }
                    }
                    x340Var.r(z);
                }
            }
            cx0Var3 = cx0Var2;
            x340Var.r(z);
        } else {
            cx0Var3 = cx0Var2;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(s2mVar, d0rVar, nuVar, nuVar2, vkyVar, cx0Var, cx0Var3, iu30Var, i);
        }
    }

    public static final void e(String str, Function0 function0, long j, max maxVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-894513309);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.f(j) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(maxVar) ? 2048 : 1024;
        }
        int i3 = i2 | (b0kVar3.g(qim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = false;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            ldx ldxVar = ldx.c;
            if ((i3 & 112) == 32) {
                z = true;
            }
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new z9t(function0, (byte) 21);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(str), function1), ldxVar, qim0Var, maxVar, null, zzq0Var, null, null, null, null, apo.r(-621429214, new icc((byte) 4, j, str), b0kVar3), b0kVar2, ((i3 >> 6) & 896) | 1572912 | ((i3 << 3) & 57344), 48, 1960);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new dpv(str, function0, j, maxVar, qim0Var, i);
        }
    }

    public static final void f(y7e1 y7e1Var, boolean z, b0k b0kVar, int i) {
        y7e1 y7e1Var2 = y7e1Var;
        boolean z2 = z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-841662214);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(y7e1Var2) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            pbh pbhVar = pbh.a;
            qim0 qim0VarA = pbhVar.a(1.0f, qim0VarB, true);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            long j = cbx.a(x340Var).b.a;
            long jA = cbx.a(x340Var).a.a.a();
            long j2 = cbx.a(x340Var).c.b;
            long j3 = cbx.a(x340Var).c.d;
            String strO0 = cwl1.o0(x340Var, 2131960587);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarA2 = pbhVar.a(1.0f, uyn1.z(16.0f, 0.0f, 2, qim0VarF), true);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT;
            boolean zI = x340Var.i(lz20Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new fx1(lz20Var, null, (byte) 9);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            c6e1 c6e1Var = new c6e1(0, 0, 3);
            z2 = z;
            y7e1Var2 = y7e1Var;
            rwo1.b(y7e1Var2, vby0.p(anm1.N("prompt-bottom-sheet-prompt-field", pbhVar.a(1.0f, u291.f(nim0Var, 1.0f), true)), lz20Var), null, strO0, null, null, false, z2, null, cbx.d(x340Var).g, new kua0(3, Boolean.TRUE, 0, 7, 116), null, c6e1Var, null, null, null, null, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), 0.0f, false, new zxx(j, j, j2, j3, jA, jA, cbx.a(x340Var).b.c, 0L, 896), x340Var, ((i2 >> 3) & 14) | ((i2 << 15) & 29360128), 0, 911732);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2((Object) y7e1Var2, z2, i, (byte) 17);
        }
    }

    public static final void g(d0r d0rVar, int i, String str, c380 c380Var, vky vkyVar, iu30 iu30Var, String str2, vu30 vu30Var, b0k b0kVar, int i2, int i3) {
        int i4;
        iu30 iu30Var2;
        String str3;
        vu30 vu30Var2;
        b0k b0kVar2;
        String str4;
        vu30 vu30Var3;
        String str5;
        vu30 vu30Var4;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1435264008);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.i(d0rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.e(l1d.C(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.g(c380Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar3.i(vkyVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            iu30Var2 = iu30Var;
            i4 |= b0kVar3.i(iu30Var2) ? 131072 : 65536;
        } else {
            iu30Var2 = iu30Var;
        }
        int i5 = i3 & 64;
        if (i5 != 0) {
            i4 |= 1572864;
            str3 = str2;
        } else {
            str3 = str2;
            if ((i2 & 1572864) == 0) {
                i4 |= b0kVar3.g(str3) ? 1048576 : 524288;
            }
        }
        int i6 = i3 & 128;
        if (i6 != 0) {
            i4 |= 12582912;
            vu30Var2 = vu30Var;
        } else {
            vu30Var2 = vu30Var;
            if ((i2 & 12582912) == 0) {
                i4 |= b0kVar3.i(vu30Var2) ? 8388608 : 4194304;
            }
        }
        if (b0kVar3.Y(i4 & 1, (i4 & 4793491) != 4793490)) {
            if (i5 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                vu30Var2 = null;
            }
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            boolean zI = b0kVar3.i(xtb0VarA);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new pw1(xtb0VarA, (lnm) null, (byte) 2);
                b0kVar3.s0(objT);
            }
            qxd0.t(c380Var, b0kVar3, (vu30) objT);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarH = uyn1.h(2, 4.0f, 0.0f);
            WeakHashMap weakHashMap = osl1.x;
            hdh hdhVarN = lnn1.n(zzq0VarH, hqq0.C(lhc.g(b0kVar3).g, b0kVar3));
            boolean zI2 = ((3670016 & i4) == 1048576) | ((i4 & 7168) == 2048) | b0kVar3.i(d0rVar) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((458752 & i4) == 131072) | b0kVar3.i(vkyVar) | ((i4 & 29360128) == 8388608);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                str5 = str3;
                vu30Var4 = vu30Var2;
                uv1 uv1Var = new uv1(str5, c380Var, vu30Var4, d0rVar, i, str, iu30Var2, vkyVar);
                b0kVar3.s0(uv1Var);
                objT2 = uv1Var;
            } else {
                str5 = str3;
                vu30Var4 = vu30Var2;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarD, xtb0VarA, hdhVarN, false, null, null, null, false, null, (iu30) objT2, b0kVar2, 0, 504);
            str4 = str5;
            vu30Var3 = vu30Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            str4 = str3;
            vu30Var3 = vu30Var2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m3m(d0rVar, i, str, c380Var, vkyVar, iu30Var, str4, vu30Var3, i2, i3);
        }
    }

    public static final void h(int i, hby hbyVar, d0r d0rVar, int i2, String str, iu30 iu30Var, vky vkyVar, b0k b0kVar, int i3) {
        int i4;
        d0r d0rVar2;
        vky vkyVar2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(368852436);
        if ((i3 & 6) == 0) {
            i4 = (b0kVar3.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar3.g(hbyVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            d0rVar2 = d0rVar;
            i4 |= b0kVar3.i(d0rVar2) ? 256 : 128;
        } else {
            d0rVar2 = d0rVar;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.e(l1d.C(i2)) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar3.g(str) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= b0kVar3.i(iu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            vkyVar2 = vkyVar;
            i4 |= b0kVar3.i(vkyVar2) ? 1048576 : 524288;
        } else {
            vkyVar2 = vkyVar;
        }
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            String str2 = hbyVar.a;
            boolean z = false;
            EntityType entityType = hbyVar.b;
            boolean z2 = (458752 & i4) == 131072;
            if ((i4 & 112) == 32) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new gmj(iu30Var, hbyVar, (byte) 23);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            i1o1.e(vkyVar2, new sky(str2, entityType, i, i2, str, (Function0) objT), d0rVar2, null, null, mfi.a, mfi.b, 0, null, b0kVar2, ((i4 >> 18) & 14) | 1769472 | (i4 & 896), 204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n3m(i, hbyVar, d0rVar, i2, str, iu30Var, vkyVar, i3);
        }
    }

    public static final void i(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1586182879);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ArrayList<List> arrayListS1 = o7h.s1((Iterable) (c380Var.size() > 6 ? o7h.d1(c380Var, 6) : c380Var), 3, 3);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float f = 4.0f;
            qim0 qim0VarN = anm1.N("grid-artwork-highlight-tag", uyn1.x(qim0VarF, 4.0f));
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            x340Var.i0(-1043313039);
            for (List list : arrayListS1) {
                qim0 qim0VarF2 = u291.f(nim0.a, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(f, true, new um5(false)), een.Z, x340Var, 0);
                n4k n4kVar2 = n4kVar;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar2);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                x340Var.i0(-890694027);
                for (int i3 = 0; i3 < 3; i3++) {
                    n960 n960Var = (n960) o7h.t0(i3, list);
                    if (n960Var != null) {
                        x340Var.i0(-75037638);
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        b(n960Var, d7e.r(1.0f, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false), x340Var, 0);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-74927402);
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        op71.g(x340Var, d7e.r(1.0f, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false));
                        x340Var.r(false);
                    }
                }
                x340Var.r(false);
                x340Var.r(true);
                n4kVar = n4kVar2;
                f = 4.0f;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e(c380Var, qim0Var, i, (byte) 6);
        }
    }

    public static final void j(Function0 function0, boolean z, qim0 qim0Var, int i, int i2, b0k b0kVar, int i3) {
        int i4;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1919400254);
        j06 j06Var = x340Var2.a;
        if ((i3 & 6) == 0) {
            i4 = (x340Var2.i(function0) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var2.h(z) ? 32 : 16;
        }
        int i5 = i4 | 384;
        if ((i3 & 3072) == 0) {
            i5 |= x340Var2.e(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= x340Var2.e(i2) ? 16384 : 8192;
        }
        if (x340Var2.Y(i5 & 1, (i5 & 9363) != 9362)) {
            x340Var2.d0();
            int i6 = i3 & 1;
            qim0 qim0Var3 = nim0.a;
            if (i6 == 0 || x340Var2.E()) {
                qim0Var2 = qim0Var3;
            } else {
                x340Var2.b0();
                qim0Var2 = qim0Var;
            }
            x340Var2.s();
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            qim0 qim0Var4 = qim0Var2;
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            gra graVar = een.h;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0Var3, graVar);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0Var = qim0Var4;
            uwo1.e(z ? x0d.k(x340Var2, 448759036, i2, x340Var2, false) : x0d.k(x340Var2, 448760184, i, x340Var2, false), uyn1.z(16.0f, 0.0f, 2, qim0VarA), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            qim0 qim0VarN = anm1.N("prompt-bottom-sheet-cancel-button", h2cVar.a(qim0Var3, een.g));
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var2);
            String strO0 = cwl1.o0(x340Var2, 2131960584);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldxVar, qim0VarN, null, gdxVarS, null, null, null, null, null, haj.a, x340Var2, 0, 48, 2008);
            x340Var = x340Var2;
            x340Var.r(true);
            rqo1.g(0, 1, x340Var, null);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        qim0 qim0Var5 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ppx0(function0, z, qim0Var5, i, i2, i3);
        }
    }

    public static final void k(qim0 qim0Var, boolean z, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, byp bypVar, b0k b0kVar, int i) {
        int i2;
        xu30 xu30Var7;
        vu30 vu30Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        xu30 xu30Var8 = xu30Var;
        xu30 xu30Var9 = xu30Var6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2024141051);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(xu30Var8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(xu30Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(xu30Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(xu30Var5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(xu30Var9) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? x340Var.g(bypVar) : x340Var.i(bypVar) ? 67108864 : 33554432;
        }
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            int i3 = i2 & 268435454;
            gra graVar = een.d;
            x340Var.i0(-353815458);
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z8 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z8) {
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
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var2);
            boolean zA = ((f6g1) bypVar.h).a();
            nim0 nim0Var = nim0.a;
            h2c h2cVar = h2c.a;
            if (zA) {
                x340Var.i0(1105406374);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                if (xu30Var9 != null) {
                    x340Var.i0(1105476496);
                    qim0 qim0VarN = anm1.N("episode_row_controls_context_menu_button", nim0Var);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    vu30Var = vu30Var2;
                    nko1.H(qim0VarE2, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 18) & 112), xu30Var9, h2cVar, x340Var, true);
                    z6 = false;
                    x340Var.r(false);
                } else {
                    vu30Var = vu30Var2;
                    z6 = false;
                    x340Var.i0(1105614880);
                    x340Var.r(false);
                }
                if (xu30Var3 != null) {
                    x340Var.i0(1105651987);
                    qim0 qim0VarN2 = anm1.N("episode_row_controls_share_button", nim0Var);
                    gfh0 gfh0VarC2 = t1c.c(graVar, z6);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 9) & 112), xu30Var3, h2cVar, x340Var, true);
                    z6 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1105756736);
                    x340Var.r(z6);
                }
                if (xu30Var5 != null) {
                    x340Var.i0(1105797687);
                    qim0 qim0VarN3 = anm1.N("episode_row_controls_download_button", nim0Var);
                    gfh0 gfh0VarC3 = t1c.c(graVar, z6);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarN3);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 15) & 112), xu30Var5, h2cVar, x340Var, true);
                    z6 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1105929344);
                    x340Var.r(z6);
                }
                if (xu30Var2 != null) {
                    x340Var.i0(1105966389);
                    qim0 qim0VarN4 = anm1.N("episode_row_controls_add_button", nim0Var);
                    gfh0 gfh0VarC4 = t1c.c(graVar, z6);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, qim0VarN4);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var, lljVar);
                    nko1.H(xos0VarM5, x340Var, lljVar2);
                    x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE5, x340Var, vu30Var);
                    xu30Var7 = xu30Var2;
                    hrt.k(6 | ((i3 >> 6) & 112), xu30Var7, h2cVar, x340Var, true);
                    z7 = false;
                    x340Var.r(false);
                } else {
                    z7 = z6;
                    xu30Var7 = xu30Var2;
                    x340Var.i0(1106069216);
                    x340Var.r(z7);
                }
                x340Var.r(z7);
                xu30Var9 = xu30Var6;
                z3 = z7;
            } else {
                vu30Var = vu30Var2;
                x340Var.i0(1106104742);
                if (xu30Var2 != null) {
                    x340Var.i0(1106121141);
                    qim0 qim0VarN5 = anm1.N("episode_row_controls_add_button", nim0Var);
                    gfh0 gfh0VarC5 = t1c.c(graVar, false);
                    xu30Var7 = xu30Var2;
                    int iHashCode6 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM6 = x340Var.m();
                    qim0 qim0VarE6 = zr7.E(x340Var, qim0VarN5);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var, lljVar);
                    nko1.H(xos0VarM6, x340Var, lljVar2);
                    x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE6, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 6) & 112), xu30Var7, h2cVar, x340Var, true);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    xu30Var7 = xu30Var2;
                    z2 = false;
                    x340Var.i0(1106223968);
                    x340Var.r(false);
                }
                if (xu30Var5 != null) {
                    x340Var.i0(1106264919);
                    qim0 qim0VarN6 = anm1.N("episode_row_controls_download_button", nim0Var);
                    gfh0 gfh0VarC6 = t1c.c(graVar, z2);
                    int iHashCode7 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM7 = x340Var.m();
                    qim0 qim0VarE7 = zr7.E(x340Var, qim0VarN6);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC6, x340Var, lljVar);
                    nko1.H(xos0VarM7, x340Var, lljVar2);
                    x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE7, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 15) & 112), xu30Var5, h2cVar, x340Var, true);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1106396576);
                    x340Var.r(z2);
                }
                if (xu30Var3 != null) {
                    x340Var.i0(1106433683);
                    qim0 qim0VarN7 = anm1.N("episode_row_controls_share_button", nim0Var);
                    gfh0 gfh0VarC7 = t1c.c(graVar, z2);
                    int iHashCode8 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM8 = x340Var.m();
                    qim0 qim0VarE8 = zr7.E(x340Var, qim0VarN7);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC7, x340Var, lljVar);
                    nko1.H(xos0VarM8, x340Var, lljVar2);
                    x0d.q(iHashCode8, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE8, x340Var, vu30Var);
                    hrt.k(6 | ((i3 >> 9) & 112), xu30Var3, h2cVar, x340Var, true);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1106538432);
                    x340Var.r(z2);
                }
                if (xu30Var6 != null) {
                    x340Var.i0(1106582576);
                    qim0 qim0VarN8 = anm1.N("episode_row_controls_context_menu_button", nim0Var);
                    gfh0 gfh0VarC8 = t1c.c(graVar, z2);
                    int iHashCode9 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM9 = x340Var.m();
                    qim0 qim0VarE9 = zr7.E(x340Var, qim0VarN8);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC8, x340Var, lljVar);
                    nko1.H(xos0VarM9, x340Var, lljVar2);
                    x0d.q(iHashCode9, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE9, x340Var, vu30Var);
                    xu30Var9 = xu30Var6;
                    hrt.k(6 | ((i3 >> 18) & 112), xu30Var9, h2cVar, x340Var, true);
                    x340Var.r(false);
                } else {
                    xu30Var9 = xu30Var6;
                    x340Var.i0(1106720960);
                    x340Var.r(z2);
                }
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                z3 = false;
                x340Var.r(false);
            }
            if (xu30Var4 != null) {
                x340Var.i0(1106812627);
                qim0 qim0VarN9 = anm1.N("episode_row_controls_profile_button", nim0Var);
                gfh0 gfh0VarC9 = t1c.c(graVar, z3);
                int iHashCode10 = Long.hashCode(x340Var.T);
                xos0 xos0VarM10 = x340Var.m();
                qim0 qim0VarE10 = zr7.E(x340Var, qim0VarN9);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC9, x340Var, lljVar);
                nko1.H(xos0VarM10, x340Var, lljVar2);
                x0d.q(iHashCode10, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE10, x340Var, vu30Var);
                hrt.k(6 | ((i3 >> 12) & 112), xu30Var4, h2cVar, x340Var, true);
                z4 = false;
                x340Var.r(false);
            } else {
                z4 = z3;
                x340Var.i0(1106917376);
                x340Var.r(z4);
            }
            if (xu30Var != null) {
                x340Var.i0(1106953832);
                qim0 qim0VarN10 = anm1.N("episode_row_controls_play_button", pqo.h(nim0Var, z));
                gfh0 gfh0VarC10 = t1c.c(graVar, z4);
                int iHashCode11 = Long.hashCode(x340Var.T);
                xos0 xos0VarM11 = x340Var.m();
                qim0 qim0VarE11 = zr7.E(x340Var, qim0VarN10);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC10, x340Var, lljVar);
                nko1.H(xos0VarM11, x340Var, lljVar2);
                x0d.q(iHashCode11, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE11, x340Var, vu30Var);
                xu30Var8 = xu30Var;
                z5 = true;
                hrt.k(6 | ((i3 >> 3) & 112), xu30Var8, h2cVar, x340Var, true);
                z4 = false;
                x340Var.r(false);
            } else {
                xu30Var8 = xu30Var;
                z5 = true;
                x340Var.i0(1107130656);
                x340Var.r(z4);
            }
            x340Var.r(z5);
            x340Var.r(z4);
        } else {
            xu30Var7 = xu30Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ob8((Object) qim0Var, z, (Object) xu30Var8, (Object) xu30Var7, (cv30) xu30Var3, (cv30) xu30Var4, (cv30) xu30Var5, (cv30) xu30Var9, (Object) bypVar, i, (byte) 2);
        }
    }

    public static final void l(ceg0 ceg0Var, iu30 iu30Var, o3e0 o3e0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-963174309);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ceg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(o3e0Var) : x340Var.i(o3e0Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            bgc0 bgc0Var = new bgc0(lhc.g(x340Var).g, 32);
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, azi.b, null, bgc0Var, apo.r(-1655085182, new iwf0(ceg0Var, o3e0Var, iu30Var, (byte) 9), x340Var), x340Var, ((i3 >> 9) & 14) | 24624, 4);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, ceg0Var, iu30Var, o3e0Var, qim0Var2, (byte) 26);
        }
    }

    public static final void m(mpn0 mpn0Var, qim0 qim0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(139280073);
        int i2 = i | (x340Var.g(mpn0Var) ? 4 : 2) | 48 | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(null, 0, 0L, 0L, x340Var, 0, 15);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(ydh.g(16.0f, 2131957706, x340Var, x340Var, qim0Var3), null, null, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2038);
            x340Var = x340Var;
            x340Var.r(true);
            if (mpn0Var instanceof jpn0) {
                x340Var.i0(354984361);
                String strO0 = cwl1.o0(x340Var, 2131952662);
                String strO1 = cwl1.o0(x340Var, 2131952661);
                String strO2 = cwl1.o0(x340Var, 2131953887);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = fsm0.P0;
                    x340Var.s0(objT);
                }
                yoi1.e(new j0f0(strO0, strO1, (hux) null, new h0f0(strO2, (Function0) objT), (h0f0) null, (i3u) null, function0, (Function0) null, 180), function1, 0, x340Var, ((i2 >> 6) & 112) | 8);
                x340Var.r(false);
            } else {
                x340Var.i0(355614777);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(mpn0Var, qim0Var2, function0, function1, i);
        }
    }

    public static final void n(String str, b0k b0kVar, int i) {
        avk1 avk1Var;
        h311 h311VarV;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1120770705);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            if (str == null || ihc1.y0(str)) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    avk1Var = new avk1(str, i, (byte) 7);
                }
            } else {
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = gbm1.V0;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT);
                zic0 zic0Var = new zic0(1);
                uwr uwrVar = cbx.a;
                uwo1.e(str, qim0VarB, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, zic0Var, 0, null, x340Var, i2 & 14, 0, 1712);
            }
            h311VarV.d = avk1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            avk1Var = new avk1(str, i, (byte) 8);
            h311VarV.d = avk1Var;
        }
    }

    public static final void o(String str, String str2, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1081490749);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.h(z2) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new mj10((byte) 12, z);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0.a, true, (iu30) objT);
            if (z2) {
                b0kVar3.i0(69486519);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(69488309);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131958141));
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, null, haxVar, false, null, null, new gbx(z50.c, function0), null, null, null, null, apo.r(-1900974597, new qdg0(str2, (byte) 0), b0kVar3), apo.r(634632828, new epe0((byte) 1, z), b0kVar3), null, null, apo.r(-348479489, new qdg0(str, (byte) 1), b0kVar3), b0kVar2, 0, 197040, 26554);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rdg0(str, str2, z, z2, function0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0281  */
    public static final void p(String str, vu30 vu30Var, Function0 function0, qim0 qim0Var, int i, int i2, int i3, int i4, b0k b0kVar, int i5) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        boolean zI;
        Object objT;
        String str2 = str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1139470115);
        j06 j06Var = x340Var.a;
        int i6 = i5 | (x340Var.g(str2) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072 | (x340Var.e(i) ? 16384 : 8192) | (x340Var.e(i2) ? 131072 : 65536) | (x340Var.e(i3) ? 1048576 : 524288) | (x340Var.e(i4) ? 8388608 : 4194304);
        if (x340Var.Y(i6 & 1, (4793491 & i6) != 4793490)) {
            x340Var.d0();
            int i7 = i5 & 1;
            qim0 qim0Var4 = nim0.a;
            if (i7 == 0 || x340Var.E()) {
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            y7e1 y7e1VarD = c4p1.D(0, 2, str2 == null ? "" : str2, x340Var);
            Object objT2 = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean z2 = y7e1VarD.d().d.length() > 2000;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT3);
            }
            c9n c9nVar = (c9n) objT3;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.a.a(), d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarN = anm1.N("prompt-bottom-sheet-content", too1.y(qim0VarF, new bgc0(lhc.g(x340Var).g, 32)));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            boolean z4 = !(str2 == null || ihc1.y0(str2));
            int i8 = i6 >> 3;
            qim0 qim0Var5 = qim0Var3;
            j(function0, z4, null, i, i2, x340Var, ((i6 >> 6) & 14) | (i8 & 7168) | (i8 & 57344));
            f(y7e1VarD, z2, x340Var, 6);
            qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF2, 0.0f, 8.0f, 0.0f, 16.0f, 5);
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA2 = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (ihc1.y0(y7e1VarD.d().d) || z2) {
                str2 = str;
            } else {
                str2 = str;
                if (!u890.j(y7e1VarD.d().d.toString(), str2) && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    z = true;
                }
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                cvx cvxVar4 = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var4);
                zI = x340Var.i(ven0Var) | x340Var.i(c9nVar) | x340Var.i(vu30Var) | x340Var.i(y7e1VarD);
                objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    odp0 odp0Var = new odp0(c9nVar, ven0Var, vu30Var, y7e1VarD, (byte) 9);
                    x340Var.s0(odp0Var);
                    objT = odp0Var;
                }
                q((Function0) objT, z, z4, zBooleanValue, qim0VarZ, i3, i4, x340Var, i8 & 4128768);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(true);
                qim0Var2 = qim0Var5;
            }
            z = false;
            boolean zBooleanValue2 = ((Boolean) ven0Var.getValue()).booleanValue();
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0Var4);
            zI = x340Var.i(ven0Var) | x340Var.i(c9nVar) | x340Var.i(vu30Var) | x340Var.i(y7e1VarD);
            objT = x340Var.T();
            if (zI) {
                odp0 odp0Var2 = new odp0(c9nVar, ven0Var, vu30Var, y7e1VarD, (byte) 9);
                x340Var.s0(odp0Var2);
                objT = odp0Var2;
            } else {
                odp0 odp0Var3 = new odp0(c9nVar, ven0Var, vu30Var, y7e1VarD, (byte) 9);
                x340Var.s0(odp0Var3);
                objT = odp0Var3;
            }
            q((Function0) objT, z, z4, zBooleanValue2, qim0VarZ2, i3, i4, x340Var, i8 & 4128768);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xla(str2, vu30Var, function0, qim0Var2, i, i2, i3, i4, i5);
        }
    }

    public static final void q(Function0 function0, boolean z, boolean z2, boolean z3, qim0 qim0Var, int i, int i2, b0k b0kVar, int i3) {
        int i4;
        b0k b0kVar2;
        String strK;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-828879411);
        if ((i3 & 6) == 0) {
            i4 = (b0kVar3.i(function0) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar3.h(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.h(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar3.i(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= b0kVar3.e(i) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= b0kVar3.e(i2) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            b0kVar3.d0();
            if ((i3 & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            if (z3) {
                strK = x0d.k(b0kVar3, -1984154076, 2131960590, b0kVar3, false);
            } else {
                strK = z2 ? x0d.k(b0kVar3, -1984151288, i2, b0kVar3, false) : x0d.k(b0kVar3, -1984150230, i, b0kVar3, false);
            }
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(b0kVar3);
            if (z) {
                b0kVar3.i0(-1984143679);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(-1984142189);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131960588));
                b0kVar3.r(false);
            }
            boolean z4 = (i4 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z4 || objT == fkj0.X) {
                objT = new lpx0(function0, (byte) 1);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strK)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strK), function1), idxVar, anm1.N("prompt-bottom-sheet-submit-button", u291.f(qim0Var, 1.0f)), haxVar, gdxVarR, null, null, null, null, null, apo.r(-555795316, new psr0(strK, (byte) 27), b0kVar3), b0kVar2, 0, 48, 1992);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qpx0(function0, z, z2, z3, qim0Var, i, i2, i3);
        }
    }

    public static final void r(oom1 oom1Var, b0k b0kVar, int i) {
        oom1 oom1Var2;
        String str;
        boolean z;
        qim0 qim0Var;
        lee1 lee1Var;
        long j;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(84696654);
        int i2 = i | (x340Var.i(oom1Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            lom1 lom1Var = oom1Var.f;
            lom1 lom1Var2 = lom1Var instanceof lom1 ? lom1Var : null;
            String str2 = lom1Var2 != null ? lom1Var2.a : null;
            String str3 = oom1Var.c;
            if ((str2 == null || ihc1.y0(str2)) && (str3 == null || ihc1.y0(str3))) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vom1(oom1Var, i, (byte) 0);
                    return;
                }
                return;
            }
            uwr uwrVar = cbx.a;
            lee1 lee1Var2 = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.b;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (str2 == null || ihc1.y0(str2)) {
                str = str2;
                z = false;
                qim0Var = qim0Var2;
                lee1Var = lee1Var2;
                j = j2;
                x340Var.i0(73917552);
                x340Var.r(false);
            } else {
                x340Var.i0(73615798);
                boolean zI = x340Var.i(lom1Var2);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new c4m1(lom1Var2, (byte) 12);
                    x340Var.s0(objT);
                }
                lee1Var = lee1Var2;
                j = j2;
                str = str2;
                z = false;
                qim0Var = qim0Var2;
                uwo1.e(str, s161.b(qim0Var2, false, (iu30) objT), lee1Var, j, null, null, 0, false, new zic0(1), 0, null, x340Var, 0, 0, 1776);
                x340Var.r(false);
            }
            if (str == null || ihc1.y0(str) || 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 460
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.bqn1.r(p.oom1, p.b0k, int):void");
        }

        public static final void s(oom1 oom1Var, b0k b0kVar, int i) {
            long j;
            nom1 nom1Var = oom1Var.f;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-2130067926);
            int i2 = (x340Var.i(oom1Var) ? 4 : 2) | i;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (nom1Var instanceof mom1) {
                    x340Var.i0(1749835602);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    qim0 qim0VarR = u291.r(nim0Var, 12.0f);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = gbm1.X0;
                        x340Var.s0(objT);
                    }
                    c0p1.b(qim0VarR.then(new uul1(new mi31((iu30) objT))), x340Var, 0);
                    cvx cvxVar = cbx.b(x340Var).b;
                    ab80.p(nim0Var, 4.0f, x340Var, false);
                } else {
                    x340Var.i0(1750060476);
                    x340Var.r(false);
                }
                String strN0 = cwl1.n0(2131963962, new Object[]{oom1Var.a, oom1Var.b}, x340Var);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                if (nom1Var instanceof mom1) {
                    x340Var.i0(-1744654382);
                    j = cbx.a(x340Var).b.c;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1744653110);
                    j = cbx.a(x340Var).b.a;
                    x340Var.r(false);
                }
                uwo1.e(strN0, new vul1(xl3.a), lee1Var, j, null, null, 2, false, new zic0(1), 0, null, x340Var, 0, 0, 1712);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vom1(oom1Var, i, (byte) 2);
            }
        }

        public static final void t(oom1 oom1Var, qim0 qim0Var, b0k b0kVar, int i) {
            int i2;
            b0k b0kVar2;
            qim0 qim0Var2;
            jax haxVar;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-1910061284);
            if ((i & 6) == 0) {
                i2 = (b0kVar3.i(oom1Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            int i3 = i2 | 48;
            if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
                lom1 lom1Var = oom1Var.f;
                lom1 lom1Var2 = lom1Var instanceof lom1 ? lom1Var : null;
                String strK = zko1.k(lom1Var instanceof mom1, oom1Var.a, oom1Var.b, lom1Var2 != null ? lom1Var2.b : null, oom1Var.e, b0kVar3, 0);
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                boolean zG = b0kVar3.g(strK);
                Object objT = b0kVar3.T();
                if (zG || objT == fkj0.X) {
                    objT = new bek1(strK, (byte) 18);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                uvx uvxVar = new uvx((pgx) null, 2, (tvx) null, new p3v(32.0f), 11);
                if (oom1Var.g) {
                    b0kVar3.i0(-1617833232);
                    b0kVar3.r(false);
                    haxVar = jax.a;
                } else {
                    b0kVar3.i0(-1617831439);
                    haxVar = new hax(cwl1.o0(b0kVar3, 2131963961));
                    b0kVar3.r(false);
                }
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarB, uvxVar, haxVar, false, null, null, null, null, null, apo.r(2013296851, new wom1(oom1Var, (byte) 0), b0kVar3), apo.r(-934588077, new wom1(oom1Var, (byte) 1), b0kVar3), apo.r(-1637183916, new wom1(oom1Var, (byte) 2), b0kVar3), null, null, null, apo.r(-152599976, new wom1(oom1Var, (byte) 3), b0kVar3), b0kVar2, 805306432, 196662, 29176);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new exk1(oom1Var, qim0Var2, i, (byte) 10);
            }
        }

        public static final lo8 u(hp9 hp9Var, gaa gaaVar) {
            return new lo8(hp9Var, gaaVar, (byte) 14);
        }

        public static final af5 v(af5 af5Var, zma1 zma1Var, zma1 zma1Var2, zma1 zma1Var3, Function0 function0, yae1 yae1Var, lee1 lee1Var, int i, int i2, boolean z, b0k b0kVar, int i3, int i4) {
            Object obj = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-223630023);
            boolean z2 = (i4 & 512) != 0 ? false : z;
            String strM = l1d.m(" ", cwl1.o0(x340Var, 2131962704));
            int i5 = yae1.b(yae1Var, af5Var, lee1Var, 0, false, 0, jjl.b(0, i, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1980).b.f;
            if (i5 <= i2 && !z2) {
                x340Var.r(false);
                return af5Var;
            }
            boolean z3 = true;
            if (i5 > i2 || !z2) {
                x340Var.i0(-664689687);
                x340Var.r(false);
                af5 af5VarF = af5Var.f(0, w(af5Var, strM, zma1Var, zma1Var2, lee1Var, yae1Var, i, i2));
                ye5 ye5Var = new ye5();
                ye5Var.h(af5VarF);
                int iO = ye5Var.o(zma1Var);
                try {
                    ye5Var.g("...");
                    ye5Var.k(iO);
                    pae1 pae1Var = new pae1(zma1Var2, zma1Var3, 6);
                    if ((((i3 & 57344) ^ 24576) <= 16384 || !x340Var.g(function0)) && (i3 & 24576) != 16384) {
                        z3 = false;
                    }
                    Object objT = x340Var.T();
                    if (z3 || objT == obj) {
                        objT = new nbg(function0, (byte) 8);
                        x340Var.s0(objT);
                    }
                    int iL = ye5Var.l(new kjc0("see_more", pae1Var, (rjc0) objT));
                    try {
                        ye5Var.g(strM);
                        ye5Var.k(iL);
                        af5 af5VarP = ye5Var.p();
                        x340Var.r(false);
                        return af5VarP;
                    } catch (Throwable th) {
                        ye5Var.k(iL);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ye5Var.k(iO);
                    throw th2;
                }
            }
            x340Var.i0(-666578052);
            ye5 ye5Var2 = new ye5();
            ye5Var2.h(af5Var);
            int iO2 = ye5Var2.o(zma1Var);
            try {
                ye5Var2.g("...");
                ye5Var2.k(iO2);
                int iO3 = ye5Var2.o(zma1Var2);
                try {
                    ye5Var2.g(strM);
                    ye5Var2.k(iO3);
                    if (yae1.b(yae1Var, ye5Var2.p(), lee1Var, 0, false, 0, jjl.b(0, i, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1980).b.f <= i2) {
                        x340Var.i0(-666102357);
                        ye5 ye5Var3 = new ye5();
                        ye5Var3.h(af5Var);
                        int iO4 = ye5Var3.o(zma1Var);
                        try {
                            ye5Var3.g("...");
                            ye5Var3.k(iO4);
                            pae1 pae1Var2 = new pae1(zma1Var2, zma1Var3, 6);
                            if ((((i3 & 57344) ^ 24576) <= 16384 || !x340Var.g(function0)) && (i3 & 24576) != 16384) {
                                z3 = false;
                            }
                            Object objT2 = x340Var.T();
                            if (z3 || objT2 == obj) {
                                objT2 = new nbg(function0, (byte) 5);
                                x340Var.s0(objT2);
                            }
                            int iL2 = ye5Var3.l(new kjc0("see_more", pae1Var2, (rjc0) objT2));
                            try {
                                ye5Var3.g(strM);
                                ye5Var3.k(iL2);
                                af5 af5VarP2 = ye5Var3.p();
                                x340Var.r(false);
                                x340Var.r(false);
                                x340Var.r(false);
                                return af5VarP2;
                            } catch (Throwable th3) {
                                ye5Var3.k(iL2);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            ye5Var3.k(iO4);
                            throw th4;
                        }
                    }
                    x340Var.i0(-665673751);
                    x340Var.r(false);
                    af5 af5VarF2 = af5Var.f(0, w(af5Var, strM, zma1Var, zma1Var2, lee1Var, yae1Var, i, i2));
                    ye5 ye5Var4 = new ye5();
                    ye5Var4.h(af5VarF2);
                    int iO5 = ye5Var4.o(zma1Var);
                    try {
                        ye5Var4.g("...");
                        ye5Var4.k(iO5);
                        pae1 pae1Var3 = new pae1(zma1Var2, zma1Var3, 6);
                        if ((((i3 & 57344) ^ 24576) <= 16384 || !x340Var.g(function0)) && (i3 & 24576) != 16384) {
                            z3 = false;
                        }
                        Object objT3 = x340Var.T();
                        if (z3 || objT3 == obj) {
                            objT3 = new nbg(function0, (byte) 7);
                            x340Var.s0(objT3);
                        }
                        int iL3 = ye5Var4.l(new kjc0("see_more", pae1Var3, (rjc0) objT3));
                        try {
                            ye5Var4.g(strM);
                            ye5Var4.k(iL3);
                            af5 af5VarP3 = ye5Var4.p();
                            x340Var.r(false);
                            x340Var.r(false);
                            return af5VarP3;
                        } catch (Throwable th5) {
                            ye5Var4.k(iL3);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        ye5Var4.k(iO5);
                        throw th6;
                    }
                } catch (Throwable th7) {
                    ye5Var2.k(iO3);
                    throw th7;
                }
            } catch (Throwable th8) {
                ye5Var2.k(iO2);
                throw th8;
            }
        }

        public static final int w(af5 af5Var, String str, zma1 zma1Var, zma1 zma1Var2, lee1 lee1Var, yae1 yae1Var, int i, int i2) {
            String str2 = af5Var.b;
            int length = str2.length();
            int length2 = str2.length() / 2;
            int i3 = 0;
            while (i3 <= length) {
                int i4 = (i3 + length) / 2;
                ye5 ye5Var = new ye5();
                ye5Var.h(af5Var.f(0, i4));
                int iO = ye5Var.o(zma1Var);
                try {
                    ye5Var.g("...");
                    ye5Var.k(iO);
                    int iO2 = ye5Var.o(zma1Var2);
                    try {
                        ye5Var.g(str);
                        ye5Var.k(iO2);
                        if (yae1.b(yae1Var, ye5Var.p(), lee1Var, 0, false, 0, jjl.b(0, i, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1980).b.f <= i2) {
                            i3 = i4 + 1;
                            length2 = i4;
                        } else {
                            length = i4 - 1;
                        }
                    } catch (Throwable th) {
                        ye5Var.k(iO2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ye5Var.k(iO);
                    throw th2;
                }
            }
            return length2;
        }

        public static tma0 x() {
            return tma0.c;
        }

        public static tma0 y(oma0 oma0Var) {
            return new tma0(1, oma0Var);
        }

        public static boolean z(Activity activity) {
            DisplayMask displayMaskFromResourcesRectApproximation;
            int rotation;
            Rect rect = null;
            if (activity.getPackageManager().hasSystemFeature("com.microsoft.device.display.displaymask") && (displayMaskFromResourcesRectApproximation = DisplayMask.fromResourcesRectApproximation(activity)) != null) {
                try {
                    rotation = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation();
                } catch (IllegalStateException unused) {
                    rotation = 0;
                }
                List<Rect> boundingRectsForRotation = displayMaskFromResourcesRectApproximation.getBoundingRectsForRotation(rotation);
                rect = boundingRectsForRotation.size() == 0 ? new Rect(0, 0, 0, 0) : boundingRectsForRotation.get(0);
            }
            Rect rect2 = new Rect();
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
            if (rect == null || rect2.width() <= 0 || rect2.height() <= 0) {
                return false;
            }
            return rect.intersect(rect2);
        }
    }
