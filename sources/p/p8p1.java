package p;

import android.content.Context;
import android.view.View;
import android.widget.ViewFlipper;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import com.spotify.userinteractivityservice.usercomments.v1.proto.UserAuthorMetadata;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class p8p1 {
    public static b180 a;
    public static b180 b;

    public static final long A(hav0 hav0Var) {
        return B(hav0Var, true);
    }

    public static final long B(hav0 hav0Var, boolean z) {
        long jF = Offset.f(hav0Var.c, hav0Var.g);
        if (z || !hav0Var.l()) {
            return jF;
        }
        return 0L;
    }

    public static final boolean C(hav0 hav0Var) {
        return !Offset.c(B(hav0Var, false), 0L);
    }

    public static final kp8 D(Comment comment) {
        int iP = comment.p();
        int i = iP == 0 ? -1 : anh.a[l1d.C(iP)];
        if (i != -1) {
            if (i == 1) {
                return new jp8(comment.E());
            }
            if (i == 2) {
                return new ip8(comment.B());
            }
            if (i != 3) {
                eg.o();
                return null;
            }
        }
        n57.e("Author metadata not set for comment " + comment.r());
        return new jp8(UserAuthorMetadata.n());
    }

    public static final kp8 E(Reply reply) {
        int iN = reply.n();
        int i = iN == 0 ? -1 : anh.b[l1d.C(iN)];
        if (i != -1) {
            if (i == 1) {
                return new jp8(reply.x());
            }
            if (i == 2) {
                return new ip8(reply.v());
            }
            if (i != 3) {
                eg.o();
                return null;
            }
        }
        n57.e("Author metadata not set for reply " + reply.o());
        return new jp8(UserAuthorMetadata.n());
    }

    public static String F(int i) {
        if (i == 0) {
            return "Blocking";
        }
        if (i == 1) {
            return "Optional";
        }
        return i == 2 ? "Async" : gvg.e(i, "Invalid(value=", ")");
    }

    public static final on71 G(wwy wwyVar) {
        return new on71(new f9d1(mqo1.F(dxo1.u(wwyVar.X, dxo1.w(wwyVar.b), wwyVar.Y))), new rn71(rc11.a.b(i9d1.class)));
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:114:0x030c  */
    /* JADX WARN: Code duplicated, block: B:115:0x030e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0317  */
    /* JADX WARN: Code duplicated, block: B:122:0x0329  */
    /* JADX WARN: Code duplicated, block: B:124:0x0385  */
    /* JADX WARN: Code duplicated, block: B:126:0x038b  */
    public static final void a(fu1 fu1Var, kw1 kw1Var, jw1 jw1Var, ow1 ow1Var, iu30 iu30Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        float f;
        qim0 qim0Var;
        m4c m4cVar;
        boolean z;
        String strO0;
        boolean z2;
        Object objT;
        Function0 function0;
        iu30 iu30Var2 = iu30Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        m4c m4cVar2 = fkj0.X;
        boolean z3 = kw1Var.d;
        boolean z4 = jw1Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(668023131);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(fu1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(kw1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(jw1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(ow1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(vzq0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zF = fu1Var.f();
            nim0 nim0Var = nim0.a;
            n4k n4kVar = hmb0.t1;
            if (zF) {
                x340Var.i0(-1801056069);
                qim0 qim0VarH = u291.h(uyn1.w(u291.f(nim0Var, 1.0f), vzq0Var), 160.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                xto1.e(anm1.N("content_loading", nim0Var), 0, 0L, 0L, x340Var, 6, 14);
                x340Var.r(true);
                x340Var.r(false);
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new co1(fu1Var, kw1Var, jw1Var, ow1Var, iu30Var2, vzq0Var, i, (byte) 0);
                    return;
                }
                return;
            }
            x340Var.i0(-1800737017);
            x340Var.r(false);
            jw1Var.a(fu1Var, z3);
            boolean zH = fu1Var.h(kw1Var.e);
            boolean z5 = zH && !kw1Var.c && (!z4 || z3);
            boolean z6 = z4 && z3 && z5;
            x340Var.i0(2020139180);
            wat watVar = (wat) x340Var.k(t4k.h);
            WeakHashMap weakHashMap = osl1.x;
            float fM0 = watVar.M0(lhc.g(x340Var).e.e().d);
            x340Var.r(false);
            if (z3 != 0) {
                x340Var.i0(2020144258);
                uwr uwrVar = cbx.a;
                f = cbx.b(x340Var).b.f;
                x340Var.r(false);
            } else {
                x340Var.i0(2020144733);
                x340Var.r(false);
                f = 0.0f;
            }
            c380 c380Var = fu1Var.k;
            c380 c380Var2 = fu1Var.l;
            boolean z7 = z5;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            boolean z8 = z6;
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar4);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
            nko1.F(x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar);
            xtb0 xtb0Var = kw1Var.b;
            x340Var.i0(149521350);
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            zzq0 zzq0Var = new zzq0(vzq0Var.b(flb0Var), vzq0Var.d(), vzq0Var.c(flb0Var), fM0 + f);
            x340Var.r(false);
            qim0 qim0VarI = too1.i(uyn1.B(anm1.N("lazy_column", u291.d(nim0Var, 1.0f)), 0.0f, z8 ? 0.0f : 13.0f, 0.0f, 13.0f, 5), vzq0Var);
            boolean zI = x340Var.i(fu1Var) | x340Var.h(z8) | ((i2 & 7168) == 2048);
            int i3 = i2 & 57344;
            boolean zI2 = zI | (i3 == 16384) | x340Var.i(jw1Var) | x340Var.i(c380Var) | x340Var.h(z7) | x340Var.h(zH) | x340Var.i(c380Var2);
            Object objT2 = x340Var.T();
            if (zI2) {
                qim0Var = qim0VarI;
                m4cVar = m4cVar2;
            } else {
                qim0Var = qim0VarI;
                if (objT2 != m4cVar) {
                    m4cVar = m4cVar2;
                    iu30Var2 = iu30Var;
                    z = false;
                }
                ujo1.d(qim0Var, xtb0Var, zzq0Var, false, null, null, null, false, null, (iu30) objT2, x340Var, 0, 504);
                x340Var = x340Var;
                if (z3) {
                    x340Var.i0(343674151);
                    strO0 = cwl1.o0(x340Var, 2131951928);
                    if (i3 == 16384) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    objT = x340Var.T();
                    if (z2 || objT == m4cVar) {
                        objT = new cr0(iu30Var2, (byte) 21);
                        x340Var.s0(objT);
                    }
                    function0 = (Function0) objT;
                    if (!ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar = new gbx(new y50(strO0), function0);
                    gdx gdxVarR = yla.r(x340Var);
                    idx idxVar = new idx(4);
                    qim0 qim0VarA = h2c.a.a(nim0Var, een.X);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    foo1.c(gbxVar, idxVar, anm1.N("done_button_floating", uyn1.B(qim0VarA, 0.0f, 0.0f, 0.0f, fM0 + 16.0f, 7)), null, gdxVarR, null, null, null, null, null, o4i.b, x340Var, 0, 48, 2008);
                    x340Var = x340Var;
                    x340Var.r(z);
                } else {
                    x340Var.i0(344300909);
                    x340Var.r(z);
                }
                x340Var.r(true);
            }
            m4cVar = m4cVar2;
            z = false;
            objT2 = new eo1(fu1Var, z8, jw1Var, c380Var, ow1Var, z7, zH, c380Var2, iu30Var);
            iu30Var2 = iu30Var;
            x340Var.s0(objT2);
            ujo1.d(qim0Var, xtb0Var, zzq0Var, false, null, null, null, false, null, (iu30) objT2, x340Var, 0, 504);
            x340Var = x340Var;
            if (z3) {
                x340Var.i0(343674151);
                strO0 = cwl1.o0(x340Var, 2131951928);
                if (i3 == 16384) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                objT = x340Var.T();
                if (z2) {
                    objT = new cr0(iu30Var2, (byte) 21);
                    x340Var.s0(objT);
                } else {
                    objT = new cr0(iu30Var2, (byte) 21);
                    x340Var.s0(objT);
                }
                function0 = (Function0) objT;
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar2 = new gbx(new y50(strO0), function0);
                gdx gdxVarR2 = yla.r(x340Var);
                idx idxVar2 = new idx(4);
                qim0 qim0VarA2 = h2c.a.a(nim0Var, een.X);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                foo1.c(gbxVar2, idxVar2, anm1.N("done_button_floating", uyn1.B(qim0VarA2, 0.0f, 0.0f, 0.0f, fM0 + 16.0f, 7)), null, gdxVarR2, null, null, null, null, null, o4i.b, x340Var, 0, 48, 2008);
                x340Var = x340Var;
                x340Var.r(z);
            } else {
                x340Var.i0(344300909);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new co1(fu1Var, kw1Var, jw1Var, ow1Var, iu30Var2, vzq0Var, i, (byte) 1);
        }
    }

    public static final void b(List list, String str, oih oihVar, xtb0 xtb0Var, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-558462063);
        int i2 = (x340Var.h(z) ? 1048576 : 524288) | i | (x340Var.i(list) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(oihVar) ? 256 : 128) | (x340Var.i(xtb0Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            zzq0 zzq0VarJ = uyn1.j(0.0f, 8.0f, 0.0f, 16.0f, 5);
            boolean zI = x340Var.i(list) | ((i2 & 112) == 32) | ((3670016 & i2) == 1048576) | ((i2 & 896) == 256 || x340Var.i(oihVar)) | ((57344 & i2) == 16384);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                o96 o96Var = new o96(list, str, z, oihVar, iu30Var, (byte) 2);
                x340Var.s0(o96Var);
                objT = o96Var;
            }
            ujo1.d(qim0Var, xtb0Var, zzq0VarJ, false, null, null, null, false, null, (iu30) objT, x340Var, ((i2 >> 15) & 14) | ((i2 >> 6) & 112), 504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(list, str, oihVar, xtb0Var, iu30Var, qim0Var, z, i);
        }
    }

    public static final void c(rph rphVar, xtb0 xtb0Var, b0k b0kVar, int i) {
        int i2;
        ijh ijhVar;
        uge1 uge1Var;
        List list;
        m4c m4cVar = fkj0.X;
        ebe0 ebe0Var = rphVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1777776124);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rphVar) : x340Var.i(rphVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xtb0Var) ? 32 : 16;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var.g(ebe0Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                ebe0 ebe0Var2 = ebe0Var instanceof ebe0 ? ebe0Var : null;
                if (ebe0Var2 == null || (ijhVar = (ijh) ebe0Var2.a) == null || (uge1Var = ijhVar.b) == null) {
                    objT = null;
                } else {
                    List list2 = uge1Var.a;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Comment) it.next()).r());
                    }
                    objT = arrayList;
                }
                x340Var.s0(objT);
            }
            List list3 = (List) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zI = x340Var.i(ven0Var) | x340Var.g(list3);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(rphVar))) {
                z = true;
            }
            boolean zI2 = zI | z | x340Var.i(xtb0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                list = list3;
                x4c x4cVar = new x4c(ven0Var, list, rphVar, xtb0Var, (lnm) null, (byte) 12);
                x340Var.s0(x4cVar);
                objT3 = x4cVar;
            } else {
                list = list3;
            }
            qxd0.t(list, x340Var, (vu30) objT3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(rphVar, xtb0Var, i, (byte) 1);
        }
    }

    public static final void d(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-604400470);
        int i4 = i | (x340Var.g(str) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0Var5 = i5 != 0 ? qim0Var4 : qim0Var2;
            qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            e(x340Var, 0);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(qim0Var4, 8.0f));
            uwo1.e(str, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i3 & 14, 0, 2034);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(qim0Var4, 8.0f));
            rqo1.g(0, 0, x340Var, new wnb0(1.0f, true));
            x340Var.r(true);
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zmh((byte) 0, i, i2, str, qim0Var3);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1875526526);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 32.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarR, u7h.b(cbx.a(x340Var).b.b, 0.15f, 0.0f, 0.0f, 0.0f, 14), er31.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w0h1.a(znx.c, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, znx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 26, i, false);
        }
    }

    public static final void f(int i, int i2, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var;
        qim0 qim0Var3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1546135432);
        int i4 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var2.i(qim0Var2) ? 2048 : 1024);
        }
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0Var5 = i5 != 0 ? qim0Var4 : qim0Var2;
            qim0 qim0VarX = bin.x(u291.f(qim0Var5, 1.0f), false, null, null, null, function0, 15);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX2);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            e(x340Var2, 0);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.r(qim0Var4, 8.0f));
            x340Var2.i0(-997409012);
            ye5 ye5Var = new ye5();
            ye5Var.g(str.concat(" "));
            int iO = ye5Var.o(new zma1(cbx.a(x340Var2).b.a, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530));
            try {
                ye5Var.g(str2);
                ye5Var.k(iO);
                af5 af5VarP = ye5Var.p();
                x340Var2.r(false);
                uwo1.d(af5VarP, cbx.a(x340Var2).b.b, new wnb0(1.0f, true), cbx.d(x340Var2).j, null, null, 0, false, null, 0, null, null, x340Var2, 0, 0, 4080);
                x340Var = x340Var2;
                x340Var.r(true);
                qim0Var3 = qim0Var5;
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jlf(str, str2, function0, qim0Var3, i, i2, (byte) 1);
        }
    }

    public static final af5 g(String str, Map map, Set set, b0k b0kVar) {
        Object next;
        uwr uwrVar = cbx.a;
        zma1 zma1Var = cbx.d(b0kVar).k.a;
        ye5 ye5Var = new ye5();
        while (str.length() > 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (true) {
                next = null;
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                int iW0 = ihc1.w0(str, str2, 0, false, 6);
                Integer numValueOf = Integer.valueOf(iW0);
                if (iW0 < 0) {
                    numValueOf = null;
                }
                next = numValueOf != null ? new mmr0(Integer.valueOf(numValueOf.intValue()), str2) : null;
                if (next != null) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int iIntValue = ((Number) ((mmr0) next).a).intValue();
                    do {
                        Object next2 = it2.next();
                        int iIntValue2 = ((Number) ((mmr0) next2).a).intValue();
                        if (iIntValue > iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it2.hasNext());
                }
            }
            mmr0 mmr0Var = (mmr0) next;
            if (mmr0Var == null) {
                ye5Var.g(str);
                break;
            }
            Object obj = mmr0Var.a;
            Object obj2 = mmr0Var.b;
            Number number = (Number) obj;
            ye5Var.g(str.substring(0, number.intValue()));
            String str3 = (String) sqg0.G(obj2, map);
            if (set.contains(obj2)) {
                ye5Var.o(zma1Var);
                ye5Var.g(str3);
                ye5Var.j();
            } else {
                ye5Var.g(str3);
            }
            str = str.substring(((String) obj2).length() + number.intValue());
        }
        return ye5Var.p();
    }

    public static final boolean h(hav0 hav0Var) {
        return (hav0Var.l() || hav0Var.h || !hav0Var.d) ? false : true;
    }

    public static final boolean i(hav0 hav0Var) {
        return !hav0Var.h && hav0Var.d;
    }

    public static final boolean j(hav0 hav0Var) {
        return (hav0Var.l() || !hav0Var.h || hav0Var.d) ? false : true;
    }

    public static final boolean k(hav0 hav0Var) {
        return hav0Var.h && !hav0Var.d;
    }

    public static fhe0 l(fhe0 fhe0Var, fhe0 fhe0Var2) {
        if (fhe0Var == null || fhe0Var.a.a.isEmpty()) {
            return fhe0.b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < fhe0Var2.c() + fhe0Var.c()) {
            Locale localeB = i < fhe0Var.c() ? fhe0Var.b(i) : fhe0Var2.b(i - fhe0Var.c());
            if (localeB != null) {
                linkedHashSet.add(localeB);
            }
            i++;
        }
        return fhe0.d(n8p1.j((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
    }

    public static final ThreadLocal m() {
        return new ThreadLocal();
    }

    public static m6e0 n(Observable observable) {
        return new m6e0(Observable.create(new fgp0(observable, new zeu(), new p811())), u0e0.X0, fnc0.Z0);
    }

    public static final void o(ViewFlipper viewFlipper, View view) {
        int iIndexOfChild = viewFlipper.indexOfChild(view);
        if (viewFlipper.getDisplayedChild() != iIndexOfChild) {
            viewFlipper.setDisplayedChild(iIndexOfChild);
        }
    }

    public static mre0 p(txk0 txk0Var) {
        return new mre0(txk0Var.b(), (byte) 12);
    }

    public static final boolean q(int i, int i2) {
        return i == i2;
    }

    public static ae21 r(List list, List list2, Set set, qtf1 qtf1Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            vd21 vd21Var = (vd21) obj;
            if (!set.contains(vd21Var.a)) {
                long j = qtf1Var.a;
                long j2 = qtf1Var.b;
                if (j2 > 0 && j >= vd21Var.a(j2)) {
                    arrayList.add(obj);
                }
            }
        }
        List<vd21> listA1 = o7h.a1(arrayList, new be21((byte) 0));
        for (vd21 vd21Var2 : listA1) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (vd21Var2.a.m((eyo0) it.next())) {
                        break;
                    }
                    i++;
                }
                int iP = yoi1.p(vd21Var2.b, 0, list.size() - 1);
                if (i != -1 && i != iP) {
                    ArrayList arrayList2 = new ArrayList(list);
                    arrayList2.add(iP, arrayList2.remove(i));
                    list = arrayList2;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(listA1, 10));
        Iterator it2 = listA1.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((vd21) it2.next()).a);
        }
        return new ae21(list, o7h.p1(arrayList3));
    }

    public static c410 s(Context context, String str) {
        return new c410(context.getString(2131959795), str);
    }

    public static d410 t(Context context, String str) {
        return new d410(gm50.p(context.getString(2131962449), Locale.getDefault()), (String) null, 2131233214, str);
    }

    public static d410 u(Context context, String str, pqs pqsVar) {
        hwt0 hwt0Var = pqsVar.b ? new hwt0(2131233214, gm50.p(context.getString(2131962449), Locale.getDefault()), context.getString(2131962582)) : new hwt0(2131233215, gm50.p(context.getString(2131962581), Locale.getDefault()), null);
        return new d410(hwt0Var.a, hwt0Var.b, hwt0Var.c, str);
    }

    public static final boolean v(long j, hav0 hav0Var) {
        long j2 = hav0Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat > ((float) i)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 > ((float) i2));
    }

    public static final boolean w(hav0 hav0Var, long j, long j2) {
        int i = hav0Var.i == 1 ? 1 : 0;
        long j3 = hav0Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final Integer x(bro1 bro1Var) {
        if (bro1Var instanceof ris0) {
            return 2131959705;
        }
        if (bro1Var instanceof qis0) {
            return 2131959704;
        }
        if (bro1Var instanceof vis0) {
            return 2131959708;
        }
        if (bro1Var instanceof uis0) {
            return 2131959707;
        }
        if (bro1Var instanceof wis0) {
            return 2131959709;
        }
        if (bro1Var instanceof sis0) {
            return 2131959706;
        }
        if (bro1Var instanceof tis0) {
            return null;
        }
        eg.o();
        return null;
    }

    public static final xj61 y(wwy wwyVar) {
        xj61 xj61Var = new xj61();
        if (wwyVar.i == null) {
            auu0 auu0Var = wwyVar.e;
            xj61Var.add(new dwy(auu0Var instanceof auu0 ? new on71(new syg(auu0Var.d), new rn71(rc11.a.b(vyg.class))) : G(wwyVar)));
        }
        return cwl1.j(xj61Var);
    }

    public static final long z(hav0 hav0Var) {
        return B(hav0Var, false);
    }
}
