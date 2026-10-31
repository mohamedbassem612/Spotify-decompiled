package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.watchfeed.component.model.v1.proto.AudioFile;
import com.spotify.watchfeed.component.model.v1.proto.BackgroundAudioPreview;
import com.spotify.watchfeed.component.model.v1.proto.Image;
import com.spotify.watchfeed.component.model.v1.proto.PlaybackControlsConfig;
import com.spotify.watchfeed.component.model.v1.proto.VideoFile;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qmo1 {
    public static b180 a;

    public static final ju7 A(AudioFile audioFile) {
        return new ju7(audioFile.n(), audioFile.r(), audioFile.t(), audioFile.p(), audioFile.q(), audioFile.s());
    }

    public static final clj1 B(VideoFile videoFile) {
        return new clj1(szr0.a[videoFile.s().ordinal()] == 1 ? 2 : 1, videoFile.r(), videoFile.o(), videoFile.getUri(), videoFile.p(), videoFile.q());
    }

    public static final qim0 C(qim0 qim0Var, boolean z, idn0 idn0Var, ga80 ga80Var, boolean z2, pm31 pm31Var, iu30 iu30Var) {
        nze1 nze1VarThen;
        if (ga80Var != null) {
            nze1VarThen = new nze1(z, idn0Var, ga80Var, false, z2, pm31Var, iu30Var);
        } else if (ga80Var == null) {
            nze1VarThen = new nze1(z, idn0Var, (ga80) null, false, z2, pm31Var, iu30Var);
        } else {
            nim0 nim0Var = nim0.a;
            nze1VarThen = idn0Var != null ? da80.a(nim0Var, idn0Var, ga80Var).then(new nze1(z, idn0Var, (ga80) null, false, z2, pm31Var, iu30Var)) : zr7.i(nim0Var, new qv51(ga80Var, z, z2, pm31Var, iu30Var, (byte) 1));
        }
        return qim0Var.then(nze1VarThen);
    }

    public static qim0 D(qim0 qim0Var, boolean z, boolean z2, pm31 pm31Var, iu30 iu30Var, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return qim0Var.then(new nze1(z, (idn0) null, (ga80) null, true, z2, pm31Var, iu30Var));
    }

    public static void E(x8 x8Var, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(x8Var.a().size());
        for (Map.Entry entry : x8Var.a().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static Context F(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static final void a(ArrayList arrayList, qim0 qim0Var, b0k b0kVar, int i) {
        czg czgVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-552183466);
        int i2 = (x340Var.i(arrayList) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            czg czgVar2 = czg.c;
            int iP = yoi1.p(arrayList.size(), 3, 5);
            if (iP != 3) {
                czgVar = iP != 4 ? czg.e : czg.d;
            } else {
                czgVar = czg.c;
            }
            List listD1 = o7h.d1(arrayList, czgVar.a.size());
            qim0 qim0VarR = d7e.r(1.0f / czgVar.b, qim0Var, false);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ys6.Z;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarR, (iu30) objT);
            boolean zG = x340Var.g(czgVar);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new hu6(czgVar, (byte) 0);
                x340Var.s0(objT2);
            }
            gfh0 gfh0Var = (gfh0) objT2;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(1836646786);
            Iterator it = listD1.iterator();
            while (it.hasNext()) {
                c((te6) it.next(), null, x340Var, 8);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vc0(arrayList, qim0Var, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0195  */
    /* JADX WARN: Code duplicated, block: B:118:0x019d  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01df  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    public static final void b(rb60 rb60Var, int i, jkr0 jkr0Var, boolean z, db60 db60Var, slx0 slx0Var, qim0 qim0Var, boolean z2, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        qim0 qim0Var2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        qim0 qim0Var3;
        boolean z5;
        h311 h311VarV;
        qim0 qim0VarX;
        qim0 qim0Var4;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean zI;
        Object objT;
        qim0 qim0VarC;
        int i7;
        qim0 qim0Var5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2038183310);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var.g(rb60Var) : x340Var.i(rb60Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(jkr0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? x340Var.g(db60Var) : x340Var.i(db60Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= (262144 & i2) == 0 ? x340Var.g(slx0Var) : x340Var.i(slx0Var) ? 131072 : 65536;
        }
        int i8 = i3 & 64;
        if (i8 == 0) {
            if ((1572864 & i2) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 1048576 : 524288;
            }
            i5 = i3 & 128;
            if (i5 != 0) {
                i4 |= 12582912;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i2 & 12582912) == 0) {
                    if (x340Var.h(z3)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
            }
            if ((i4 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i4 & 1, z4)) {
                qim0VarX = nim0.a;
                if (i8 != 0) {
                    qim0Var4 = qim0VarX;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (z6 && z) {
                    qim0VarX = j9k1.x(qim0VarX, new ut1(i, (Object) jkr0Var, (byte) 6));
                }
                qim0 qim0VarThen = qim0Var4.then(qim0VarX);
                if ((i4 & 14) != 4 || ((i4 & 8) != 0 && x340Var.i(rb60Var))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((i4 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zI = z7 | z8 | x340Var.i(jkr0Var) | ((i4 & 112) == 32);
                objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new tb60(rb60Var, z, jkr0Var, i);
                    x340Var.s0(objT);
                }
                qim0VarC = i541.C(qim0VarThen, (iu30) objT);
                if (rb60Var instanceof pb60) {
                    x340Var.i0(-189038248);
                    ta60 ta60Var = ((pb60) rb60Var).a;
                    qim0Var5 = qim0Var4;
                    otw.c(db60Var, new ta60(ta60Var.a, i, ta60Var.c, ta60Var.d, ta60Var.e, ta60Var.f, ta60Var.g), qim0VarC, (ipb1) null, x340Var, 8 | ((i4 >> 12) & 14), 8);
                    x340Var.r(false);
                } else {
                    i7 = i4;
                    qim0Var5 = qim0Var4;
                    if (rb60Var instanceof qb60) {
                        throw p3d1.k(x340Var, -189040191, false);
                    }
                    x340Var.i0(-189032259);
                    rlx0 rlx0Var = ((qb60) rb60Var).a;
                    otw.c(slx0Var, new rlx0(rlx0Var.a, i, rlx0Var.c, rlx0Var.d, rlx0Var.e, rlx0Var.f, rlx0Var.g, rlx0Var.h), qim0VarC, (ipb1) null, x340Var, ((i7 >> 15) & 14) | 72, 8);
                    x340Var.r(false);
                }
                qim0Var3 = qim0Var5;
                z5 = z6;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z5 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new sb60(rb60Var, i, jkr0Var, z, db60Var, slx0Var, qim0Var3, z5, i2, i3);
            }
        }
        i4 |= 1572864;
        qim0Var2 = qim0Var;
        i5 = i3 & 128;
        if (i5 != 0) {
            i4 |= 12582912;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 12582912) == 0) {
                if (x340Var.h(z3)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
        }
        if ((i4 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var.Y(i4 & 1, z4)) {
            qim0VarX = nim0.a;
            if (i8 != 0) {
                qim0Var4 = qim0VarX;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i5 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            if (z6) {
                qim0VarX = j9k1.x(qim0VarX, new ut1(i, (Object) jkr0Var, (byte) 6));
            }
            qim0 qim0VarThen2 = qim0Var4.then(qim0VarX);
            if ((i4 & 14) != 4) {
                z7 = true;
            } else {
                z7 = true;
            }
            if ((i4 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            zI = z7 | z8 | x340Var.i(jkr0Var) | ((i4 & 112) == 32);
            objT = x340Var.T();
            if (zI) {
                objT = new tb60(rb60Var, z, jkr0Var, i);
                x340Var.s0(objT);
            } else {
                objT = new tb60(rb60Var, z, jkr0Var, i);
                x340Var.s0(objT);
            }
            qim0VarC = i541.C(qim0VarThen2, (iu30) objT);
            if (rb60Var instanceof pb60) {
                x340Var.i0(-189038248);
                ta60 ta60Var2 = ((pb60) rb60Var).a;
                qim0Var5 = qim0Var4;
                otw.c(db60Var, new ta60(ta60Var2.a, i, ta60Var2.c, ta60Var2.d, ta60Var2.e, ta60Var2.f, ta60Var2.g), qim0VarC, (ipb1) null, x340Var, 8 | ((i4 >> 12) & 14), 8);
                x340Var.r(false);
            } else {
                i7 = i4;
                qim0Var5 = qim0Var4;
                if (rb60Var instanceof qb60) {
                    throw p3d1.k(x340Var, -189040191, false);
                }
                x340Var.i0(-189032259);
                rlx0 rlx0Var2 = ((qb60) rb60Var).a;
                otw.c(slx0Var, new rlx0(rlx0Var2.a, i, rlx0Var2.c, rlx0Var2.d, rlx0Var2.e, rlx0Var2.f, rlx0Var2.g, rlx0Var2.h), qim0VarC, (ipb1) null, x340Var, ((i7 >> 15) & 14) | 72, 8);
                x340Var.r(false);
            }
            qim0Var3 = qim0Var5;
            z5 = z6;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            z5 = z3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sb60(rb60Var, i, jkr0Var, z, db60Var, slx0Var, qim0Var3, z5, i2, i3);
        }
    }

    public static final void c(te6 te6Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1922532268);
        int i2 = (x340Var.i(te6Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            cwl1.g(new yk4(te6Var.a.a), (String) null, i1p1.q(u291.d(qim0Var2, 1.0f), er31.a), mif1.P0, 0, x340Var, 24624, 232);
            cwl1.g(new yk4(te6Var.b.a), (String) null, u291.d(qim0Var2, 1.0f), mif1.Q0, 0, x340Var, 25008, 232);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pp5(te6Var, qim0Var, i, (byte) 13);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(azh1 azh1Var, xyh1 xyh1Var, j2i j2iVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1043431124);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(azh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xyh1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            int i4 = i2;
            tob1 tob1VarB = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, CtaType.CTA_WAITLISTED_FIELD_NUMBER, null, 4), (String) null, (iu30) null, x340Var, 0, 28);
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new pad1(ven0Var, (lnm) null, (byte) 4);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            qim0 qim0VarK = d9y0.k(anm1.N("upsell-bottom-sheet-content", u291.f(nim0Var, 1.0f)), ((Number) tob1VarB.getValue()).floatValue());
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarK);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            if (azh1Var == null) {
                x340Var.i0(600374531);
                x340Var.r(false);
            } else {
                x340Var.i0(600374532);
                String str = azh1Var.a;
                String str2 = azh1Var.c;
                cvx cvxVar2 = cbx.b(x340Var).b;
                i(0, str, str2, x340Var, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 12.0f, 7));
                x340Var.r(false);
            }
            if (z2) {
                x340Var.i0(600643147);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                z = true;
                jw31 jw31VarA = ew31.a(new d36(cbx.b(x340Var).b.c, true, new um5(false)), een.Z, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                f(xyh1Var, x340Var, (i4 >> 3) & 14);
                j2iVar.J(new wnb0(1.0f, true), new a0e1((xyh1Var != null ? xyh1Var.b : 0) == 2 ? 5 : 3), x340Var, Integer.valueOf(i4 & 896));
                x340Var.r(true);
                x340Var.r(false);
            } else {
                z = true;
                x340Var.i0(601113851);
                g(xyh1Var, x340Var, (i4 & 112) | 6);
                j2iVar.J(nim0Var, new a0e1(3), x340Var, Integer.valueOf(6 | (i4 & 896)));
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(azh1Var, xyh1Var, j2iVar, i);
        }
    }

    public static final void e(jkr0 jkr0Var, szd szdVar, qim0 qim0Var, ru91 ru91Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        ru91 ru91VarJ;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1791735675);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(jkr0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(szdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i3 |= x340Var.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                ru91VarJ = ru91Var;
                int i4 = x340Var.i(ru91VarJ) ? 2048 : 1024;
                i3 |= i4;
            } else {
                ru91VarJ = ru91Var;
            }
            i3 |= i4;
        } else {
            ru91VarJ = ru91Var;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
                ru91VarJ = q0o1.j(jkr0Var, null, null, x340Var, i3 & 14, 30);
                i3 &= -7169;
            }
            ru91 ru91Var2 = ru91VarJ;
            x340Var.s();
            w0h1.c(jkr0Var, qim0Var2, uyn1.h(2, szdVar.c, 0.0f), new fdr0(szdVar.a), 0, szdVar.b, een.N0, ru91Var2, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(1908127642, new ub60(j2iVar, (byte) 0), x340Var), x340Var, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 12) & 29360128), 16144);
            x340Var = x340Var;
            ru91VarJ = ru91Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(jkr0Var, szdVar, qim0Var, ru91VarJ, j2iVar, i, i2, (byte) 9);
        }
    }

    public static final void f(xyh1 xyh1Var, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        h1i1 h1i1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1863206821);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xyh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            if ((xyh1Var != null ? xyh1Var.b : 0) != 2) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    h1i1Var = new h1i1(xyh1Var, i, (byte) 0);
                }
            } else {
                j(xyh1Var, anm1.N("upsell-bottom-sheet-landscape-image", u291.v(nim0.a, 120.0f)), x340Var, i2 & 14);
            }
            h311VarV.d = h1i1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h1i1Var = new h1i1(xyh1Var, i, (byte) 1);
            h311VarV.d = h1i1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(xyh1 xyh1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        h311 h311VarV;
        h1i1 h1i1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(760236089);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(xyh1Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            if (xyh1Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    h1i1Var = new h1i1(xyh1Var, i, (byte) 2);
                }
            } else {
                nim0 nim0Var = nim0.a;
                qim0 qim0VarN = anm1.N("upsell-bottom-sheet-portrait-image", nim0Var);
                int iC = l1d.C(xyh1Var.b);
                if (iC == 0) {
                    x340Var.i0(442449655);
                    k(xyh1Var, qim0VarN, x340Var, (i2 >> 3) & 14);
                    x340Var.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var, 442447520, false);
                    }
                    x340Var.i0(442453778);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    j(xyh1Var, uyn1.z(cbx.b(x340Var).b.e, 0.0f, 2, qim0VarF).then(qim0VarN), x340Var, (i2 >> 3) & 14);
                    x340Var.r(false);
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 16.0f));
            }
            h311VarV.d = h1i1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h1i1Var = new h1i1(xyh1Var, i, (byte) 3);
            h311VarV.d = h1i1Var;
        }
    }

    public static final void h(c380 c380Var, gmq gmqVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(429904708);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(gmqVar) : x340Var.i(gmqVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            tbr0 tbr0VarC = ((cir0) x340Var.k(k2r0.a)).c();
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                tnm tnmVar = (tnm) gmqVar.a.c;
                objT = new yjz0((los) ((jly0) tnmVar.d).get(), (hmq) ((jly0) tnmVar.g).get(), (wsl0) ((jly0) tnmVar.f).get());
                x340Var.s0(objT);
            }
            yjz0 yjz0Var = (yjz0) objT;
            boolean zI = x340Var.i(tbr0VarC);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xwb(tbr0VarC, (byte) 5);
                x340Var.s0(objT2);
            }
            otw.c(yjz0Var, new xjz0(c380Var, (iu30) objT2), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0((Object) c380Var, (Object) gmqVar, i, (byte) 29);
        }
    }

    public static final void i(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1364554025);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            wsx wsxVar = str2 != null ? wsx.c : null;
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            if (wsxVar != null) {
                x340Var.i0(-1667473621);
                long j = cbx.a(x340Var).b.c;
                zov0 zov0Var = cbx.b(x340Var).g;
                z = true;
                w0h1.a(wsxVar, isl.a, u291.r(nim0.a, 16.0f), j, 0L, false, x340Var, wsx.d | 48, 48);
                x340Var.r(false);
            } else {
                z = true;
                x340Var.i0(-1667235107);
                x340Var.r(false);
            }
            uwo1.e(str, null, cbx.d(x340Var).k, cbx.a(x340Var).b.c, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b071(str, str2, qim0Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    public static final void j(xyh1 xyh1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        jsl jslVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(852530584);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xyh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var.g(xyh1Var.a);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = Uri.parse(xyh1Var.a);
                x340Var.s0(objT);
            }
            objT.getClass();
            Uri uri = (Uri) objT;
            String str = xyh1Var.c;
            if (str == null) {
                jslVar = isl.a;
            } else {
                if (ihc1.y0(str)) {
                    str = null;
                }
                if (str != null) {
                    jslVar = new jsl(str);
                } else {
                    jslVar = isl.a;
                }
            }
            jsl jslVar2 = jslVar;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0Var, er31.b(8.0f)), cbx.a(x340Var).a.c, d4o1.a);
            cbx.a.getClass();
            ecx ecxVarD = uwr.d();
            h6m h6mVar = mif1.Q0;
            xtx xtxVar = xtx.c;
            eso1.e(uri, jslVar2, qim0VarF, (p3v) null, (zvx) null, ecxVarD, h6mVar, (tl3) null, (ColorFilter) null, new nux(xtxVar, xtxVar), false, false, x340Var, 1073769472, 0, 3456);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i1i1(xyh1Var, qim0Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    public static final void k(xyh1 xyh1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        jsl jslVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1449923508);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(xyh1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var.g(xyh1Var.a);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = Uri.parse(xyh1Var.a);
                x340Var.s0(objT);
            }
            objT.getClass();
            Uri uri = (Uri) objT;
            String str = xyh1Var.c;
            if (str == null) {
                jslVar = isl.a;
            } else {
                if (ihc1.y0(str)) {
                    str = null;
                }
                if (str != null) {
                    jslVar = new jsl(str);
                } else {
                    jslVar = isl.a;
                }
            }
            jsl jslVar2 = jslVar;
            int i3 = i2;
            p3v p3vVar = new p3v(120.0f);
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            box boxVar = box.c;
            eso1.e(uri, jslVar2, qim0Var, p3vVar, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, new nux(boxVar, boxVar), false, false, x340Var, ((i3 << 3) & 896) | 1073744896, 0, 3536);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i1i1(xyh1Var, qim0Var, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(p1i1 p1i1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1900156329);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(p1i1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            azh1 azh1Var = p1i1Var.c;
            zyh1 zyh1Var = p1i1Var.f;
            d(azh1Var, zyh1Var != null ? zyh1Var.a : null, apo.r(-869480582, new juy0(p1i1Var, iu30Var, (byte) 14), x340Var), x340Var, ((i3 << 3) & 7168) | 384);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(p1i1Var, iu30Var, qim0Var2, i, (byte) 27);
        }
    }

    public static twh0 m(adt0 adt0Var) {
        return new twh0(adt0Var);
    }

    public static final String n(String str, String str2) {
        return gvg.h("spotify:user:", str, ":folder:", str2);
    }

    public static uwh0 o(adt0 adt0Var) {
        return new uwh0();
    }

    public static final int p(int i, Object obj, esb0 esb0Var) {
        int iC;
        return (obj == null || esb0Var.a() == 0 || (i < esb0Var.a() && obj.equals(esb0Var.d(i))) || (iC = esb0Var.c(obj)) == -1) ? i : iC;
    }

    public static final hhc q(String str) {
        ArrayList<String> arrayListE0 = ihc1.e0(str);
        ArrayList arrayList = new ArrayList(q7h.U(arrayListE0, 10));
        for (String str2 : arrayListE0) {
            eth.h(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        byte[] bArrG1 = o7h.g1(arrayList);
        return phc.e(0, bArrG1, bArrG1.length);
    }

    public static final String r(omo1 omo1Var) {
        if (omo1Var instanceof sto0) {
            return ((sto0) omo1Var).c.c;
        }
        if (omo1Var instanceof vto0) {
            return ((vto0) omo1Var).c.c;
        }
        if (omo1Var instanceof uto0) {
            return ((uto0) omo1Var).c.c;
        }
        if (omo1Var instanceof tto0) {
            return ((tto0) omo1Var).c.c;
        }
        if (omo1Var instanceof wto0) {
            return ((wto0) omo1Var).c.c;
        }
        if (omo1Var instanceof qto0) {
            return ((qto0) omo1Var).c.c;
        }
        if (omo1Var instanceof rto0) {
            return "client:notification:action:preview:".concat(((rto0) omo1Var).c);
        }
        eg.o();
        return null;
    }

    public static final y8n s(o8n o8nVar, long j, vu30 vu30Var) {
        y8n y8nVar = new y8n();
        j0d1 j0d1Var = new j0d1(o8nVar.A(fkj0.W0));
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        bs50Var.getClass();
        y8nVar.Z = new w6b(y8nVar, vu30Var, j, smo1.e(flo1.l(bs50Var, o8nVar).y(j0d1Var)), new hx4(y8nVar, (byte) 22));
        return y8nVar;
    }

    public static void u(b8 b8Var, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collectionJ = b8Var.j(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collectionJ.add(objectInputStream.readObject());
            }
        }
    }

    public static final c9n v(c9n c9nVar, Function0 function0) {
        return smo1.u(c9nVar) ? c9nVar : smo1.e((o8n) function0.invoke());
    }

    public static final iw9 w(BackgroundAudioPreview backgroundAudioPreview) {
        return new iw9(A(backgroundAudioPreview.n()), backgroundAudioPreview.q(), backgroundAudioPreview.getEntityUri(), backgroundAudioPreview.p());
    }

    public static final RuntimeException x(yyq yyqVar) {
        if (!(yyqVar instanceof uyq)) {
            return new RuntimeException(yyqVar.getMessage());
        }
        uyq uyqVar = (uyq) yyqVar;
        RuntimeException runtimeException = new RuntimeException(uyqVar.getMessage());
        Iterator it = uyqVar.a.iterator();
        while (it.hasNext()) {
            j2h1.h(runtimeException, x((yyq) it.next()));
        }
        return runtimeException;
    }

    public static final dq70 y(Image image) {
        return new dq70(image.getUrl(), image.o());
    }

    public static final kxt0 z(PlaybackControlsConfig playbackControlsConfig) {
        return new kxt0(playbackControlsConfig.o(), playbackControlsConfig.r(), playbackControlsConfig.p(), playbackControlsConfig.q());
    }
}
