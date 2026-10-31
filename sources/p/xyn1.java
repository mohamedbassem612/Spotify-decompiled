package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xyn1 {
    public static b180 a;

    public static FrameLayout A(View view, iu30 iu30Var) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view);
        kgr0 kgr0Var = new kgr0(frameLayout.getContext());
        kgr0Var.setId(2131430276);
        kgr0Var.setBackground(rgr0.a);
        kgr0Var.addOnLayoutChangeListener(new x37(new n811(), iu30Var, (byte) 13));
        frameLayout.addView(kgr0Var);
        return frameLayout;
    }

    public static final void a(String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-137965127);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gfx.b(13, apo.r(-65222428, new qgd(str, iu30Var, (byte) 0), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rgd(str, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(jgd jgdVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1427407930);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? x340Var.g(jgdVar) : x340Var.i(jgdVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            i(jgdVar, x340Var, (i3 & 14) | 8);
            cvx cvxVar2 = cbx.b(x340Var).b;
            a(ydh.g(16.0f, 2131953438, x340Var, x340Var, qim0Var3), iu30Var, null, x340Var, i3 & 112);
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.b));
            j(jgdVar.f, x340Var, 0);
            x0d.s(qim0Var3, cbx.b(x340Var).b.c, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b((byte) 5, i, jgdVar, iu30Var, qim0Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:63:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void c(Function0 function0, qim0 qim0Var, long j, max maxVar, String str, gdx gdxVar, b0k b0kVar, int i, int i2) {
        gdx gdxVarR;
        int i3;
        boolean z;
        gdx gdxVar2;
        qim0 qim0Var2;
        h311 h311VarV;
        int i4;
        int i5;
        qim0 qim0Var3;
        gdx gdxVar3;
        String strO0;
        String strO1;
        ven0 ven0VarS;
        boolean zG;
        Object objT;
        qim0 qim0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-935633873);
        int i6 = i | (x340Var.i(function0) ? 4 : 2) | 48 | (x340Var.f(j) ? 256 : 128) | (x340Var.i(maxVar) ? 2048 : 1024) | (x340Var.g(str) ? 16384 : 8192);
        if ((i2 & 32) == 0) {
            gdxVarR = gdxVar;
            int i7 = x340Var.i(gdxVarR) ? 131072 : 65536;
            i3 = i6 | i7;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    i4 = i2 & 32;
                    qim0 qim0Var5 = nim0.a;
                    if (i4 != 0) {
                        gdxVarR = yla.r(x340Var);
                        i3 &= -458753;
                    }
                    gdx gdxVar4 = gdxVarR;
                    i5 = i3;
                    qim0Var3 = qim0Var5;
                    gdxVar3 = gdxVar4;
                } else {
                    x340Var.b0();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    gdxVar3 = gdxVarR;
                    i5 = i3;
                    qim0Var3 = qim0Var;
                }
                x340Var.s();
                strO0 = cwl1.o0(x340Var, 2131954292);
                if (str != null && !ihc1.y0(str)) {
                    strO0 = xcg1.i(strO0, ", ", str);
                }
                strO1 = cwl1.o0(x340Var, 2131954344);
                ven0VarS = v8r.s(strO0, x340Var);
                zG = x340Var.g(qim0Var3);
                objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = s161.b(anm1.N("context_menu_button_test_tag", qim0Var3), false, new f4g(ven0VarS, (byte) 26));
                    x340Var.s0(objT);
                }
                qim0Var4 = (qim0) objT;
                if (!ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    wro1.l(new gbx(new y50(strO1), function0), qim0Var4, maxVar, gdxVar3, null, apo.r(-852954, new sre((byte) 11, j), x340Var), x340Var, ((i5 >> 3) & 896) | 196608 | ((i5 >> 6) & 7168), 16);
                    qim0Var2 = qim0Var3;
                    gdxVar2 = gdxVar3;
                }
            } else {
                x340Var.b0();
                gdxVar2 = gdxVarR;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jdm(function0, qim0Var2, j, maxVar, str, gdxVar2, i, i2);
            }
        }
        gdxVarR = gdxVar;
        i3 = i6 | i7;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                i4 = i2 & 32;
                qim0 qim0Var6 = nim0.a;
                if (i4 != 0) {
                    gdxVarR = yla.r(x340Var);
                    i3 &= -458753;
                }
                gdx gdxVar5 = gdxVarR;
                i5 = i3;
                qim0Var3 = qim0Var6;
                gdxVar3 = gdxVar5;
            } else {
                i4 = i2 & 32;
                qim0 qim0Var7 = nim0.a;
                if (i4 != 0) {
                    gdxVarR = yla.r(x340Var);
                    i3 &= -458753;
                }
                gdx gdxVar6 = gdxVarR;
                i5 = i3;
                qim0Var3 = qim0Var7;
                gdxVar3 = gdxVar6;
            }
            x340Var.s();
            strO0 = cwl1.o0(x340Var, 2131954292);
            if (str != null) {
                strO0 = xcg1.i(strO0, ", ", str);
            }
            strO1 = cwl1.o0(x340Var, 2131954344);
            ven0VarS = v8r.s(strO0, x340Var);
            zG = x340Var.g(qim0Var3);
            objT = x340Var.T();
            if (zG) {
                objT = s161.b(anm1.N("context_menu_button_test_tag", qim0Var3), false, new f4g(ven0VarS, (byte) 26));
                x340Var.s0(objT);
            } else {
                objT = s161.b(anm1.N("context_menu_button_test_tag", qim0Var3), false, new f4g(ven0VarS, (byte) 26));
                x340Var.s0(objT);
            }
            qim0Var4 = (qim0) objT;
            if (!ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                wro1.l(new gbx(new y50(strO1), function0), qim0Var4, maxVar, gdxVar3, null, apo.r(-852954, new sre((byte) 11, j), x340Var), x340Var, ((i5 >> 3) & 896) | 196608 | ((i5 >> 6) & 7168), 16);
                qim0Var2 = qim0Var3;
                gdxVar2 = gdxVar3;
            }
        } else {
            x340Var.b0();
            gdxVar2 = gdxVarR;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jdm(function0, qim0Var2, j, maxVar, str, gdxVar2, i, i2);
        }
    }

    public static final void d(hux huxVar, String str, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-23182776);
        int i2 = i | ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            nim0 nim0Var = nim0.a;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var, 56 | (i2 & 14), 56);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, null, ktd.l(nim0Var, 6.0f, x340Var, x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2042);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sgd(huxVar, str, qim0Var, i, (byte) 0);
        }
    }

    public static final void e(s8w s8wVar, c8w c8wVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(215760317);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(s8wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(c8wVar) : x340Var.i(c8wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            irn1.u(null, apo.r(1716066288, new utt(es41VarC, (byte) 26), x340Var), null, null, apo.r(124356022, new k8((Object) es41VarC, (Object) s8wVar, (Object) c8wVar, (Object) iu30Var, (byte) 27), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(s8wVar, c8wVar, iu30Var, i, (byte) 19);
        }
    }

    public static final void f(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-271806318);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
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
            cnx cnxVar = cnx.c;
            jsl jslVar = new jsl(str);
            qim0 qim0VarR = u291.r(nim0Var, 16.0f);
            uwr uwrVar = cbx.a;
            w0h1.a(cnxVar, jslVar, qim0VarR, cbx.a(x340Var).c.e, 0L, false, x340Var, cnx.d, 48);
            uwo1.e(str, null, ktd.l(nim0Var, 8.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0((byte) 5, i, str, false);
        }
    }

    public static final void g(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(713982793);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            f(str, x340Var, i2 & 14);
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            o6p1.c(48, 1, x340Var, null, false);
            qim0 qim0VarB = h2c.a.b(nim0Var);
            mbh mbhVarA2 = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            k(function0, x340Var, (i2 >> 3) & 14);
            x340Var.r(true);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, function0, qim0Var, i, (byte) 6);
        }
    }

    public static final void h(wux wuxVar, jgd jgdVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2035971182);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(wuxVar) : x340Var.i(wuxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(jgdVar) : x340Var.i(jgdVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cvx cvxVar = wuxVar.b;
            fc11.a(mqo1.A(p7h.M(new phx[]{jgdVar.a, jgdVar.b})), anm1.N("cancelJoinRequestFacePile", uyn1.x(nim0.a, 16.0f)), hcx.d, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var, 392, 504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tgd(wuxVar, jgdVar, i, (byte) 0);
        }
    }

    public static final void i(jgd jgdVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1394566565);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(jgdVar) : x340Var.i(jgdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            Object obj = null;
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
            uwr uwrVar = cbx.a;
            int i3 = ((i2 << 3) & 112) | 64;
            h(cbx.b(x340Var), jgdVar, x340Var, i3);
            cvx cvxVar = cbx.b(x340Var).b;
            l(ywx0.k(nim0Var, 16.0f, x340Var, x340Var), jgdVar, x340Var, i3);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 4.0f));
            String str = jgdVar.e;
            d7 d7Var = new d7(kda0.f, (byte) 0);
            while (d7Var.hasNext()) {
                Object next = d7Var.next();
                if (((kda0) next).a.equalsIgnoreCase(str)) {
                    obj = next;
                    break;
                }
            }
            kda0 kda0Var = (kda0) obj;
            if (kda0Var == null) {
                kda0Var = kda0.b;
            }
            if (kda0Var == kda0.c) {
                x340Var.i0(791922720);
                d(hmx.c, cwl1.n0(2131953441, new Object[]{jgdVar.c}, x340Var), anm1.N("deviceRow", nim0Var), x340Var, hmx.d);
                x340Var.r(false);
            } else {
                x340Var.i0(792156243);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) jgdVar, i, (byte) 8);
        }
    }

    public static final void j(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1111829272);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("disclaimerText", nim0.a);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, z ? 2131953440 : 2131953439), qim0VarN, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dr0((byte) 5, i, z);
        }
    }

    public static final void k(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1939435392);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ivw(function0, (byte) 25);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(8), null, null, yla.s(x340Var), null, null, null, bni.a, null, bni.b, x340Var, 805306368, 48, 1500);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 9, i, function0, false);
        }
    }

    public static final void l(wux wuxVar, jgd jgdVar, b0k b0kVar, int i) {
        int i2;
        byte b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1471406881);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? x340Var.g(wuxVar) : x340Var.i(wuxVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(jgdVar) : x340Var.i(jgdVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar = wuxVar.b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            uwr uwrVar = cbx.a;
            xto1.e(null, 0, cbx.a(x340Var).b.b, 0L, x340Var, 0, 11);
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            b = 1;
            uwo1.e(cwl1.n0(2131953442, new Object[]{jgdVar.b.c}, x340Var), kx40.h(1.0f, anm1.N("waitingTitle", nim0Var), true), cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            ab80.p(nim0Var, 8.0f, x340Var, true);
        } else {
            b = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tgd(wuxVar, jgdVar, i, b);
        }
    }

    public static Context m(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    public static c1h1 n(ArrayList arrayList, c1h1 c1h1Var, rma0 rma0Var, ClassLoader classLoader) {
        ArrayList<qma0> arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a4b0 a4b0Var = (a4b0) it.next();
            String str = a4b0Var.b;
            int iC = l1d.C(a4b0Var.d);
            int i = 1;
            if (iC != 0) {
                if (iC == 1) {
                    i = 2;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
            }
            mgc mgcVar = xm7.z;
            mma0 mma0Var = xm7.a[52];
            mgcVar.D(a4b0Var);
            arrayList2.add(new qma0((y0h1) null, rma0Var, str, i));
        }
        ba80 ba80VarU1 = o7h.u1(arrayList);
        int iS = zno1.s(q7h.U(ba80VarU1, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        ca80 it2 = ba80VarU1.iterator();
        while (true) {
            ca80 ca80Var = it2;
            if (!((Iterator) ca80Var.c).hasNext()) {
                break;
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            linkedHashMap.put(Integer.valueOf(((a4b0) aa80Var.b).c), arrayList2.get(aa80Var.a));
        }
        c1h1 c1h1Var2 = new c1h1(arrayList2, linkedHashMap, c1h1Var);
        int i2 = 0;
        for (qma0 qma0Var : arrayList2) {
            int i3 = i2 + 1;
            ArrayList arrayList3 = ((a4b0) arrayList.get(i2)).e;
            ?? arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(ajo1.B((y3b0) it3.next(), classLoader, c1h1Var2, null));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = Collections.singletonList(pfb1.b);
            }
            qma0Var.f = (List) arrayList4;
            i2 = i3;
        }
        return c1h1Var2;
    }

    public static Map o(fq50 fq50Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itF = fq50Var.f();
        while (itF.hasNext()) {
            Object objA = fq50Var.a(itF.next());
            Object n811Var = linkedHashMap.get(objA);
            if (n811Var == null && !linkedHashMap.containsKey(objA)) {
                n811Var = new n811();
            }
            n811 n811Var2 = (n811) n811Var;
            n811Var2.a++;
            linkedHashMap.put(objA, n811Var2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if ((entry instanceof ola0) && !(entry instanceof rla0)) {
                w0h1.O(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((n811) entry.getValue()).a));
        }
        return w0h1.k(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007b A[EDGE_INSN: B:36:0x007b->B:37:0x007f BREAK  A[LOOP:1: B:10:0x002f->B:63:0x002f]] */
    public static bg11 p(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            w280 w280Var = b380.b;
            return bg11.e;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        int iT = t(byteBufferAsReadOnlyBuffer, byteBufferAsReadOnlyBuffer.position()) + 3;
        n3p1.j(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        boolean z = true;
        int i2 = iT;
        while (iT < byteBufferAsReadOnlyBuffer.limit()) {
            if (!z) {
                int iT2 = t(byteBufferAsReadOnlyBuffer, iT);
                if (iT2 == byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                i2 = iT2 + 3;
                iT = i2;
                z = true;
            } else {
                while (true) {
                    if (iT > byteBufferAsReadOnlyBuffer.limit() - 4) {
                        if (iT != byteBufferAsReadOnlyBuffer.limit() - 3) {
                            iT = byteBufferAsReadOnlyBuffer.limit();
                            break;
                        }
                        short s = byteBufferAsReadOnlyBuffer.getShort(iT);
                        byte b = byteBufferAsReadOnlyBuffer.get(iT + 2);
                        if (s != 0 || (b != 0 && b != 1)) {
                            iT = byteBufferAsReadOnlyBuffer.limit();
                            break;
                        }
                        break;
                        break;
                    }
                    int i3 = byteBufferAsReadOnlyBuffer.getInt(iT);
                    int i4 = i3 & (-256);
                    if (i4 == 0 || i4 == 256) {
                        break;
                    }
                    int i5 = 16777215 & i3;
                    if (i5 == 0 || i5 == 1) {
                        iT++;
                        break;
                    }
                    if ((65535 & i3) == 0) {
                        iT += 2;
                    } else {
                        iT = (i3 & 255) == 0 ? iT + 3 : iT + 4;
                    }
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.position(i2);
                byteBufferDuplicate.limit((iT - i2) + i2);
                ByteBuffer byteBufferSlice = byteBufferDuplicate.slice();
                byteBufferSlice.getClass();
                int i6 = i + 1;
                int iB = o280.b(objArrCopyOf.length, i6);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i] = byteBufferSlice;
                z = false;
                i = i6;
            }
        }
        return b380.l(i, objArrCopyOf);
    }

    public static final ItemExtensionPolicy q(clc0 clc0Var, hz00 hz00Var) {
        fj90 fj90VarN = ItemExtensionPolicy.n();
        fj90VarN.r(clc0Var);
        fj90VarN.n(hz00Var);
        return fj90VarN.build();
    }

    public static mv61 r(int i, r6h1 r6h1Var) {
        return new mv61(new swl0(new opl0(i, r6h1Var, (byte) 10)));
    }

    public static qim0 s(qim0 qim0Var, jmr0 jmr0Var, tl3 tl3Var, j6m j6mVar, float f, ColorFilter colorFilter, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            tl3Var = een.h;
        }
        tl3 tl3Var2 = tl3Var;
        if ((i & 8) != 0) {
            j6mVar = mif1.T0;
        }
        j6m j6mVar2 = j6mVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            colorFilter = null;
        }
        return qim0Var.then(new kmr0(jmr0Var, z, tl3Var2, j6mVar2, f2, colorFilter));
    }

    public static int t(ByteBuffer byteBuffer, int i) {
        while (true) {
            boolean z = false;
            if (i > byteBuffer.limit() - 4) {
                if (i <= byteBuffer.limit() - 3) {
                    dm5.z(byteBuffer.getShort(i) == 0, "Invalid NAL units");
                    byte b = byteBuffer.get(i + 2);
                    if (b == 1) {
                        break;
                    }
                    dm5.z(b == 0, "Invalid NAL units");
                } else {
                    while (i < byteBuffer.limit()) {
                        dm5.z(byteBuffer.get(i) == 0, "Invalid NAL units");
                        i++;
                    }
                }
                return byteBuffer.limit();
            }
            int i2 = byteBuffer.getInt(i);
            int i3 = i2 & (-256);
            if (i3 == 256) {
                break;
            }
            dm5.z(i3 == 0, "Invalid Nal units");
            int i4 = i2 & 255;
            if (i4 == 1) {
                return i + 1;
            }
            if (i4 == 0) {
                z = true;
            }
            dm5.z(z, "Invalid Nal units");
            i++;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(smy smyVar, r2a1 r2a1Var, onm onmVar) {
        dhb1 dhb1Var;
        if (onmVar instanceof dhb1) {
            dhb1Var = (dhb1) onmVar;
            int i = dhb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dhb1Var.c = i - Integer.MIN_VALUE;
            } else {
                dhb1Var = new dhb1(onmVar);
            }
        } else {
            dhb1Var = new dhb1(onmVar);
        }
        Object objA = dhb1Var.b;
        int i2 = dhb1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            pmy pmyVar = smyVar instanceof pmy ? (pmy) smyVar : null;
            x8d1 x8d1Var = pmyVar != null ? pmyVar.e : null;
            int iA = smyVar.a();
            dhb1Var.a = smyVar;
            dhb1Var.c = 1;
            objA = r2a1Var.a(iA, x8d1Var, dhb1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            smyVar = dhb1Var.a;
            hm5.M(objA);
        }
        String strB = smyVar.b();
        String strD = smyVar.d();
        String strC = smyVar.c();
        int iA2 = smyVar.a();
        ArrayList arrayList = ((y8d1) objA).a;
        omy omyVar = smyVar instanceof omy ? (omy) smyVar : null;
        return new rgb1(strB, strD, strC, iA2, arrayList, omyVar != null ? omyVar.e : null);
    }

    public static final p6r0 v(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("KID_ACCOUNT_CREATION_BIRTHDAY", "kid-account-creation/birthday", 875, "kid-account-creation");
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("KID_ACCOUNT_TRANSITION_BIRTHDAY", "kid-account-transition/birthday", 888, "kid-account-transition");
        }
        eg.o();
        return null;
    }

    public static final gjf1 w(ContextTrack contextTrack, boolean z, String str, String str2, iu30 iu30Var) {
        String strF0;
        int i;
        boolean z2;
        String strC0 = l4o1.c0(contextTrack);
        String strUri = contextTrack.uri();
        String str3 = "";
        if (str2 == null) {
            strF0 = l4o1.E(contextTrack) ? (String) contextTrack.metadata().get("advertiser") : l4o1.f0(contextTrack);
            if (strF0 == null) {
                strF0 = "";
            }
        } else {
            strF0 = str2;
        }
        if (str == null) {
            String str4 = (String) contextTrack.metadata().get(l4o1.P(contextTrack) ? "album_title" : "artist_name");
            if (str4 != null) {
                str3 = str4;
            }
        } else {
            str3 = str;
        }
        String strA0 = l4o1.E(contextTrack) ? l4o1.a0(contextTrack, "thumbnail_image_url") : l4o1.a0(contextTrack, "image_url");
        String strY = l4o1.y(contextTrack);
        if (l4o1.E(contextTrack)) {
            i = 1;
            z2 = true;
        } else {
            i = 2;
            z2 = true;
        }
        boolean zJ = l4o1.J(contextTrack);
        boolean z3 = z2;
        boolean zS = l4o1.S(contextTrack);
        if (!z || !((Boolean) iu30Var.invoke(contextTrack)).booleanValue()) {
            z3 = false;
        }
        return new gjf1(strC0, strUri, strF0, str3, strA0, strY, i, zJ, zS, z3, contextTrack.metadata());
    }

    public static final lik1 x(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            return nik1.u3;
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            return nik1.L3;
        }
        eg.o();
        return null;
    }

    public static final Set y(zgb1 zgb1Var, int i) {
        return r2p1.o(zgb1Var.N0, ehb1.a, new on71(new f9d1(dxo1.u(zgb1Var.Y, i, zgb1Var.X)), new rn71(rc11.a.b(i9d1.class))));
    }

    public static LinearLayout z(View view) {
        LinearLayout linearLayout = new LinearLayout(view.getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        kgr0 kgr0Var = new kgr0(linearLayout.getContext());
        kgr0Var.setId(2131430276);
        linearLayout.addView(kgr0Var);
        linearLayout.addView(view);
        return linearLayout;
    }
}
