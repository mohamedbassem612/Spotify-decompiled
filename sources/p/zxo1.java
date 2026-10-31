package p;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.view.View;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zxo1 {
    public static b180 a;
    public static b180 b;

    public static final boolean A(Collection collection, Collection collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection.isEmpty()) {
            return collection2 == null || collection2.isEmpty();
        }
        return false;
    }

    public static final b380 B(Parcel parcel) {
        ArrayList arrayList = new ArrayList(parcel.readInt());
        parcel.readTypedList(arrayList, gd70.CREATOR);
        return b380.p(arrayList);
    }

    public static final hv21 C(zgz0 zgz0Var, Float f) {
        float fFloatValue;
        lee1 lee1Var = (lee1) zgz0Var.b;
        FontFamily fontFamily = lee1Var.a.f;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            uwr uwrVar = cbx.a;
            Object obj = ajx.a.b;
            fFloatValue = 96.0f;
        }
        return new hv21(lee1Var, fontFamily, fFloatValue);
    }

    public static final hv21 D(dr31 dr31Var, Float f) {
        return new hv21((lee1) dr31Var.b, ((lee1) dr31Var.c).a.f, f != null ? f.floatValue() : dr31Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        boolean z3;
        int i3;
        int i4;
        byte b2;
        boolean z4;
        boolean z5;
        qim0 qim0Var2;
        h311 h311VarV;
        boolean z6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1147426628);
        int i5 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | 384 | (x340Var.h(z) ? 2048 : 1024);
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i5 |= x340Var.h(z3) ? 16384 : 8192;
            }
            if (x340Var.i(iu30Var)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i4 = i5 | i3;
            b2 = 1;
            if ((74899 & i4) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i4 & 1, z4)) {
                if (i6 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                qim0 qim0Var3 = nim0.a;
                c(str, apo.r(-1376041318, new nl(str2, b2), x340Var), qim0Var3, z, z6, iu30Var, x340Var, (i4 & 14) | 432 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                qim0Var2 = qim0Var3;
                z5 = z6;
            } else {
                x340Var.b0();
                z5 = z3;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tl(str, str2, qim0Var2, z, z5, iu30Var, i, i2);
            }
        }
        i5 |= 24576;
        z3 = z2;
        if (x340Var.i(iu30Var)) {
            i3 = 131072;
        } else {
            i3 = 65536;
        }
        i4 = i5 | i3;
        b2 = 1;
        if ((74899 & i4) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var.Y(i4 & 1, z4)) {
            if (i6 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            qim0 qim0Var4 = nim0.a;
            c(str, apo.r(-1376041318, new nl(str2, b2), x340Var), qim0Var4, z, z6, iu30Var, x340Var, (i4 & 14) | 432 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            qim0Var2 = qim0Var4;
            z5 = z6;
        } else {
            x340Var.b0();
            z5 = z3;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tl(str, str2, qim0Var2, z, z5, iu30Var, i, i2);
        }
    }

    public static final void b(String str, af5 af5Var, cqs0 cqs0Var, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1452506025);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(af5Var) ? 32 : 16) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536) | (x340Var.i(iu30Var) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            c(str, apo.r(-98161479, new ul(af5Var, cqs0Var, (byte) 0), x340Var), qim0Var, z, z2, iu30Var, x340Var, i3 | 432 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(str, af5Var, cqs0Var, qim0Var, z, z2, iu30Var, i, (byte) 0);
        }
    }

    public static final void c(String str, j2i j2iVar, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-718044405);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= b0kVar2.h(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 131072 : 65536;
        }
        if (b0kVar2.Y(i2 & 1, (74899 & i2) != 74898)) {
            fra fraVar = een.N0;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarY = uyn1.y(qim0VarZ, 16.0f, 8.0f);
            pm31 pm31Var = new pm31(2);
            boolean z4 = (458752 & i2) == 131072;
            Object objT = b0kVar2.T();
            if (z4 || objT == m4cVar) {
                objT = new qj(iu30Var, (byte) 1);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarD = qmo1.D(qim0VarY, z3, z2, pm31Var, (iu30) objT, 8);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = h3.c1;
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarN = anm1.N("account-details-toggle-row-root", s161.b(qim0VarD, true, (iu30) objT2));
            jw31 jw31VarA = ew31.a(h36.g, fraVar, b0kVar2, 54);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z5 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            lee1 lee1Var = cbx.d(b0kVar2).g;
            long j = cbx.a(b0kVar2).b.a;
            nim0 nim0Var = nim0.a;
            uwo1.e(str, anm1.N("account-details-toggle-row-title", nim0Var), lee1Var, j, new a0e1(5), null, 0, false, null, 0, null, b0kVar2, (i3 & 14) | 48, 0, 2016);
            j2iVar.invoke(b0kVar2, Integer.valueOf((i3 >> 3) & 14));
            b0kVar2.r(true);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(nim0Var, 12.0f));
            tad1 tad1VarM = hxo1.m(cbx.a(b0kVar2).b.a, cbx.a(b0kVar2).b.f, cbx.a(b0kVar2).b.b, cbx.a(b0kVar2).a.b.a(), cbx.a(b0kVar2).b.b, b0kVar2, 65420);
            b0kVar2 = b0kVar2;
            ljo1.j(z, null, anm1.N("account-details-toggle-row-switch", nim0Var), z2, tad1VarM, null, b0kVar2, ((i3 >> 9) & 14) | 432 | (i3 & 57344), 72);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wl(str, j2iVar, qim0Var, z, z2, iu30Var, i, (byte) 0);
        }
    }

    public static final void d(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(994189713);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
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
            klx klxVar = klx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.f;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(klxVar, isl.a, uyn1.z(0.0f, 3.0f, 1, u291.h(u291.v(nim0Var, 12.0f), 18.0f)), j, 0L, false, x340Var, klx.d | 48, 48);
            String strO0 = cwl1.o0(x340Var, i);
            lee1 lee1Var = cbx.d(x340Var).j;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 8, i, i2);
        }
    }

    public static final void e(int i, long j, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        h311 h311VarV;
        hpo hpoVar;
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2131472296);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.f(j) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            WeakHashMap weakHashMap = osl1.x;
            int i3 = lhc.g(x340Var).e.e().d;
            if (i3 <= ((int) watVar.X0(24.0f))) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    hpoVar = new hpo(j, qim0Var, i, (byte) 0);
                }
            } else {
                qim0Var2 = qim0Var;
                boolean z = (i2 & 14) == 4;
                Object objT = x340Var.T();
                float f2 = 1.0f;
                if (z || objT == fkj0.X) {
                    tr80 tr80Var = new tr80(0, 10, 1);
                    ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
                    lr80 it = tr80Var.iterator();
                    while (((sr80) it).c) {
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new u7h(u7h.b(j, f2 - ((float) Math.pow(f2 - (it.nextInt() / 10.0f), 1.5d)), 0.0f, 0.0f, 0.0f, 14)));
                        arrayList = arrayList2;
                        f2 = f2;
                    }
                    f = f2;
                    objT = v9c.s(arrayList, 0.0f, 0.0f, 14);
                    x340Var.s0(objT);
                } else {
                    f = 1.0f;
                }
                t1c.a(dug.e(u291.h(u291.f(qim0Var2, f), watVar.M0(i3)), (Brush) objT, null, 0.0f, 6), x340Var, 0);
            }
            h311VarV.d = hpoVar;
        }
        qim0Var2 = qim0Var;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            hpoVar = new hpo(j, qim0Var2, i, (byte) 1);
            h311VarV.d = hpoVar;
        }
    }

    public static final void f(final boolean z, final qim0 qim0Var, boolean z2, final hvf hvfVar, b0k b0kVar, final int i) {
        int i2;
        final boolean z3;
        boolean z4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1406741137);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i((Object) null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= x340Var.g(hvfVar) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                z4 = true;
            } else {
                x340Var.b0();
                z4 = z2;
            }
            x340Var.s();
            float fFloor = (float) Math.floor(((wat) x340Var.k(t4k.h)).X0(2.0f));
            rze1 rze1VarN = kbb.n(z);
            x340Var.i0(2066218639);
            x340Var.r(false);
            o(rze1VarN, null, new phc1(fFloor, 0.0f, 2, 0, (uw4) null, 26), new phc1(fFloor, 0.0f, 0, 0, (uw4) null, 30), qim0Var, z4, hvfVar, x340Var, (i4 << 6) & 33546240);
            z3 = z4;
        } else {
            x340Var.b0();
            z3 = z2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.jvf
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zxo1.f(z, qim0Var, z3, hvfVar, (b0k) obj, czo1.p(i | 1));
                    return rih1.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01de  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:127:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:129:0x0202  */
    /* JADX WARN: Code duplicated, block: B:130:0x0205  */
    /* JADX WARN: Code duplicated, block: B:132:0x0209  */
    /* JADX WARN: Code duplicated, block: B:133:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0241  */
    /* JADX WARN: Code duplicated, block: B:137:0x0247  */
    /* JADX WARN: Code duplicated, block: B:139:0x024a  */
    /* JADX WARN: Code duplicated, block: B:142:0x024e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0252  */
    /* JADX WARN: Code duplicated, block: B:145:0x0255  */
    /* JADX WARN: Code duplicated, block: B:146:0x0258  */
    /* JADX WARN: Code duplicated, block: B:148:0x025e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0261  */
    /* JADX WARN: Code duplicated, block: B:152:0x0264  */
    /* JADX WARN: Code duplicated, block: B:153:0x0267  */
    /* JADX WARN: Code duplicated, block: B:155:0x026b  */
    /* JADX WARN: Code duplicated, block: B:156:0x026e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0272  */
    /* JADX WARN: Code duplicated, block: B:159:0x0295  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e7  */
    public static final void g(boolean z, rze1 rze1Var, qim0 qim0Var, hvf hvfVar, final phc1 phc1Var, final phc1 phc1Var2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        float f;
        float f2;
        float f3;
        ni20 zu91Var;
        final fhg1 fhg1VarO;
        Object objT;
        Object obj;
        final jtf jtfVar;
        long j;
        final tob1 tob1VarA;
        x340 x340Var2;
        int iOrdinal;
        long j2;
        final tob1 tob1VarS;
        int iOrdinal2;
        long j3;
        tob1 tob1VarS2;
        boolean zG;
        Object objT2;
        int i3;
        int iOrdinal3;
        int iOrdinal4;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-891330208);
        if ((i & 6) == 0) {
            i2 = (x340Var3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var3.e(rze1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var3.g(hvfVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var3.i(phc1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var3.i(phc1Var2) ? 131072 : 65536;
        }
        if (x340Var3.Y(i2 & 1, (74899 & i2) != 74898)) {
            bjg1 bjg1VarY = bno1.y(rze1Var, null, x340Var3, (i2 >> 3) & 14, 2);
            hrr0 hrr0Var = ((mhg1) bjg1VarY).d;
            k9 k9Var = ((mhg1) bjg1VarY).a;
            ni20 ni20VarW = t890.w(x340Var3, 1);
            rze1 rze1Var2 = (rze1) k9Var.P0();
            x340Var3.i0(-768316570);
            int iOrdinal5 = rze1Var2.ordinal();
            float f4 = 0.0f;
            if (iOrdinal5 == 0) {
                f = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    eg.o();
                    return;
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            x340Var3.r(false);
            Float fValueOf = Float.valueOf(f);
            rze1 rze1Var3 = (rze1) hrr0Var.getValue();
            x340Var3.i0(-768316570);
            int iOrdinal6 = rze1Var3.ordinal();
            if (iOrdinal6 == 0) {
                f2 = 1.0f;
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    eg.o();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            x340Var3.r(false);
            Float fValueOf2 = Float.valueOf(f2);
            dhg1 dhg1VarF = bjg1VarY.f();
            x340Var3.i0(1780794470);
            Object objE = dhg1VarF.e();
            rze1 rze1Var4 = rze1.b;
            ni20 zu91Var2 = (objE != rze1Var4 && dhg1VarF.b() == rze1Var4) ? new zu91(100) : ni20VarW;
            x340Var3.r(false);
            tzg1 tzg1Var = rno1.a;
            final fhg1 fhg1VarO2 = bno1.o(bjg1VarY, fValueOf, fValueOf2, zu91Var2, tzg1Var, x340Var3, 0);
            rze1 rze1Var5 = (rze1) k9Var.P0();
            x340Var3.i0(1840054703);
            int iOrdinal7 = rze1Var5.ordinal();
            if (iOrdinal7 == 0 || iOrdinal7 == 1) {
                f3 = 0.0f;
            } else {
                if (iOrdinal7 != 2) {
                    eg.o();
                    return;
                }
                f3 = 1.0f;
            }
            x340Var3.r(false);
            Float fValueOf3 = Float.valueOf(f3);
            rze1 rze1Var6 = (rze1) hrr0Var.getValue();
            x340Var3.i0(1840054703);
            int iOrdinal8 = rze1Var6.ordinal();
            if (iOrdinal8 != 0 && iOrdinal8 != 1) {
                if (iOrdinal8 != 2) {
                    eg.o();
                    return;
                }
                f4 = 1.0f;
            }
            x340Var3.r(false);
            Float fValueOf4 = Float.valueOf(f4);
            dhg1 dhg1VarF2 = bjg1VarY.f();
            x340Var3.i0(630790831);
            if (dhg1VarF2.e() == rze1Var4) {
                ni20VarW = irn1.j0();
            } else {
                if (dhg1VarF2.b() == rze1Var4) {
                    zu91Var = new zu91(100);
                }
                x340Var3.r(false);
                fhg1VarO = bno1.o(bjg1VarY, fValueOf3, fValueOf4, zu91Var, tzg1Var, x340Var3, 0);
                objT = x340Var3.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = new jtf();
                    x340Var3.s0(objT);
                }
                jtfVar = (jtf) objT;
                if (rze1Var == rze1Var4) {
                    j = hvfVar.b;
                } else {
                    j = hvfVar.a;
                }
                tob1VarA = w191.a(j, hvf.a(rze1Var, x340Var3), null, x340Var3, 0, 12);
                x340Var2 = x340Var3;
                if (z) {
                    iOrdinal4 = rze1Var.ordinal();
                    if (iOrdinal4 == 0) {
                        j2 = hvfVar.c;
                    } else if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            eg.o();
                            return;
                        }
                        j2 = hvfVar.c;
                    } else {
                        j2 = hvfVar.d;
                    }
                } else {
                    iOrdinal = rze1Var.ordinal();
                    if (iOrdinal != 0) {
                        j2 = hvfVar.e;
                    } else if (iOrdinal != 1) {
                        j2 = hvfVar.f;
                    } else {
                        if (iOrdinal == 2) {
                            eg.o();
                            return;
                        }
                        j2 = hvfVar.g;
                    }
                }
                if (z) {
                    x340Var2.i0(496051715);
                    tob1VarS = w191.a(j2, hvf.a(rze1Var, x340Var2), null, x340Var2, 0, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(496141925);
                    tob1VarS = v8r.s(new u7h(j2), x340Var2);
                    x340Var2.r(false);
                }
                if (z) {
                    iOrdinal3 = rze1Var.ordinal();
                    if (iOrdinal3 == 0) {
                        x340Var2 = x340Var2;
                        x340Var2 = x340Var2;
                        j3 = hvfVar.h;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            x340Var2 = x340Var2;
                            eg.o();
                            return;
                        }
                        x340Var2 = x340Var2;
                        x340Var2 = x340Var2;
                        j3 = hvfVar.h;
                    } else {
                        j3 = hvfVar.i;
                    }
                } else {
                    iOrdinal2 = rze1Var.ordinal();
                    if (iOrdinal2 != 0) {
                        j3 = hvfVar.j;
                    } else if (iOrdinal2 != 1) {
                        j3 = hvfVar.k;
                    } else {
                        if (iOrdinal2 == 2) {
                            x340Var2 = x340Var2;
                            eg.o();
                            return;
                        }
                        j3 = hvfVar.l;
                    }
                }
                if (z) {
                    x340Var2 = x340Var2;
                    x340Var2 = x340Var2;
                    x340Var2 = x340Var2;
                    x340Var2 = x340Var2;
                    x340Var2.i0(633231558);
                    x340 x340Var4 = x340Var2;
                    tob1VarS2 = w191.a(j3, hvf.a(rze1Var, x340Var2), null, x340Var4, 0, 12);
                    x340Var = x340Var4;
                    x340Var.r(false);
                } else {
                    x340Var2 = x340Var2;
                    x340Var2 = x340Var2;
                    x340Var2 = x340Var2;
                    x340Var2 = x340Var2;
                    long j4 = j3;
                    x340Var = x340Var2;
                    x340Var.i0(633321768);
                    tob1VarS2 = v8r.s(new u7h(j4), x340Var);
                    x340Var.r(false);
                }
                qim0 qim0VarM = u291.m(u291.B(qim0Var, een.h, 2), 20.0f);
                zG = x340Var.g(tob1VarS) | x340Var.g(tob1VarS2) | x340Var.i(phc1Var2) | x340Var.g(tob1VarA) | x340Var.g(fhg1VarO2) | x340Var.g(fhg1VarO) | x340Var.i(phc1Var);
                objT2 = x340Var.T();
                if (!zG || objT2 == obj) {
                    final tob1 tob1Var = tob1VarS2;
                    i3 = 0;
                    iu30 iu30Var = new iu30() { // from class: p.lvf
                        public final Object invoke(Object obj2) {
                            float f5;
                            DrawScope drawScope = (DrawScope) obj2;
                            long j5 = ((u7h) tob1VarS.getValue()).a;
                            long j6 = ((u7h) tob1Var.getValue()).a;
                            float fX0 = drawScope.X0(2.0f);
                            phc1 phc1Var3 = phc1Var2;
                            float f6 = phc1Var3.a;
                            float f7 = f6 / 2.0f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                            int i4 = u7h.l;
                            boolean zB = z4h1.b(j5, j6);
                            z520 z520Var = z520.a;
                            if (zB) {
                                f5 = 0.0f;
                                DrawScope.g0(drawScope, j5, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), z520Var, 0.0f, 0, 226);
                            } else {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
                                float f8 = fIntBitsToFloat - (2.0f * f6);
                                long jFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
                                long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(f8)) & 4294967295L;
                                float fMax = Math.max(0.0f, fX0 - f6);
                                f5 = 0.0f;
                                DrawScope.g0(drawScope, j5, jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), z520Var, 0.0f, 0, 224);
                                float f9 = fIntBitsToFloat - f6;
                                float f10 = fX0 - f7;
                                DrawScope.g0(drawScope, j6, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), phc1Var3, 0.0f, 0, 224);
                            }
                            long j7 = ((u7h) tob1VarA.getValue()).a;
                            float fFloatValue = ((Number) fhg1VarO2.getValue()).floatValue();
                            float fFloatValue2 = ((Number) fhg1VarO.getValue()).floatValue();
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                            float fT = dm5.T(0.4f, 0.5f, fFloatValue2);
                            float fT2 = dm5.T(0.7f, 0.5f, fFloatValue2);
                            float fT3 = dm5.T(0.5f, 0.5f, fFloatValue2);
                            float fT4 = dm5.T(0.3f, 0.5f, fFloatValue2);
                            jtf jtfVar2 = jtfVar;
                            tw4 tw4Var = jtfVar2.a;
                            tw4 tw4Var2 = jtfVar2.c;
                            tw4Var.o();
                            tw4 tw4Var3 = jtfVar2.a;
                            tw4Var3.k(0.2f * fIntBitsToFloat2, fT3 * fIntBitsToFloat2);
                            tw4Var3.j(fT * fIntBitsToFloat2, fT2 * fIntBitsToFloat2);
                            tw4Var3.j(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fT4);
                            vw4 vw4Var = jtfVar2.b;
                            vw4Var.c(tw4Var3, false);
                            tw4Var2.o();
                            vw4Var.b(f5, vw4Var.a.getLength() * fFloatValue, tw4Var2);
                            DrawScope.w0(drawScope, tw4Var2, j7, phc1Var, 52);
                            return rih1.a;
                        }
                    };
                    x340Var.s0(iu30Var);
                    objT2 = iu30Var;
                } else {
                    i3 = 0;
                }
                j0o1.b(i3, x340Var, (iu30) objT2, qim0VarM);
            }
            zu91Var = ni20VarW;
            x340Var3.r(false);
            fhg1VarO = bno1.o(bjg1VarY, fValueOf3, fValueOf4, zu91Var, tzg1Var, x340Var3, 0);
            objT = x340Var3.T();
            obj = fkj0.X;
            if (objT == obj) {
                objT = new jtf();
                x340Var3.s0(objT);
            }
            jtfVar = (jtf) objT;
            if (rze1Var == rze1Var4) {
                j = hvfVar.b;
            } else {
                j = hvfVar.a;
            }
            tob1VarA = w191.a(j, hvf.a(rze1Var, x340Var3), null, x340Var3, 0, 12);
            x340Var2 = x340Var3;
            if (z) {
                iOrdinal4 = rze1Var.ordinal();
                if (iOrdinal4 == 0) {
                    j2 = hvfVar.c;
                } else if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        eg.o();
                        return;
                    }
                    j2 = hvfVar.c;
                } else {
                    j2 = hvfVar.d;
                }
            } else {
                iOrdinal = rze1Var.ordinal();
                if (iOrdinal != 0) {
                    j2 = hvfVar.e;
                } else if (iOrdinal != 1) {
                    j2 = hvfVar.f;
                } else {
                    if (iOrdinal == 2) {
                        eg.o();
                        return;
                    }
                    j2 = hvfVar.g;
                }
            }
            if (z) {
                x340Var2.i0(496051715);
                tob1VarS = w191.a(j2, hvf.a(rze1Var, x340Var2), null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else {
                x340Var2.i0(496141925);
                tob1VarS = v8r.s(new u7h(j2), x340Var2);
                x340Var2.r(false);
            }
            if (z) {
                iOrdinal3 = rze1Var.ordinal();
                if (iOrdinal3 == 0) {
                    x340Var2 = x340Var2;
                    x340Var2 = x340Var2;
                    j3 = hvfVar.h;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        x340Var2 = x340Var2;
                        eg.o();
                        return;
                    }
                    x340Var2 = x340Var2;
                    x340Var2 = x340Var2;
                    j3 = hvfVar.h;
                } else {
                    j3 = hvfVar.i;
                }
            } else {
                iOrdinal2 = rze1Var.ordinal();
                if (iOrdinal2 != 0) {
                    j3 = hvfVar.j;
                } else if (iOrdinal2 != 1) {
                    j3 = hvfVar.k;
                } else {
                    if (iOrdinal2 == 2) {
                        x340Var2 = x340Var2;
                        eg.o();
                        return;
                    }
                    j3 = hvfVar.l;
                }
            }
            if (z) {
                x340Var2 = x340Var2;
                x340Var2 = x340Var2;
                x340Var2 = x340Var2;
                x340Var2 = x340Var2;
                x340Var2.i0(633231558);
                x340 x340Var5 = x340Var2;
                tob1VarS2 = w191.a(j3, hvf.a(rze1Var, x340Var2), null, x340Var5, 0, 12);
                x340Var = x340Var5;
                x340Var.r(false);
            } else {
                x340Var2 = x340Var2;
                x340Var2 = x340Var2;
                x340Var2 = x340Var2;
                x340Var2 = x340Var2;
                long j5 = j3;
                x340Var = x340Var2;
                x340Var.i0(633321768);
                tob1VarS2 = v8r.s(new u7h(j5), x340Var);
                x340Var.r(false);
            }
            qim0 qim0VarM2 = u291.m(u291.B(qim0Var, een.h, 2), 20.0f);
            zG = x340Var.g(tob1VarS) | x340Var.g(tob1VarS2) | x340Var.i(phc1Var2) | x340Var.g(tob1VarA) | x340Var.g(fhg1VarO2) | x340Var.g(fhg1VarO) | x340Var.i(phc1Var);
            objT2 = x340Var.T();
            if (zG) {
                final tob1 tob1Var2 = tob1VarS2;
                i3 = 0;
                iu30 iu30Var2 = new iu30() { // from class: p.lvf
                    public final Object invoke(Object obj2) {
                        float f5;
                        DrawScope drawScope = (DrawScope) obj2;
                        long j6 = ((u7h) tob1VarS.getValue()).a;
                        long j7 = ((u7h) tob1Var2.getValue()).a;
                        float fX0 = drawScope.X0(2.0f);
                        phc1 phc1Var3 = phc1Var2;
                        float f6 = phc1Var3.a;
                        float f7 = f6 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                        int i4 = u7h.l;
                        boolean zB = z4h1.b(j6, j7);
                        z520 z520Var = z520.a;
                        if (zB) {
                            f5 = 0.0f;
                            DrawScope.g0(drawScope, j6, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), z520Var, 0.0f, 0, 226);
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
                            float f8 = fIntBitsToFloat - (2.0f * f6);
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
                            long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(f8)) & 4294967295L;
                            float fMax = Math.max(0.0f, fX0 - f6);
                            f5 = 0.0f;
                            DrawScope.g0(drawScope, j6, jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), z520Var, 0.0f, 0, 224);
                            float f9 = fIntBitsToFloat - f6;
                            float f10 = fX0 - f7;
                            DrawScope.g0(drawScope, j7, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), phc1Var3, 0.0f, 0, 224);
                        }
                        long j8 = ((u7h) tob1VarA.getValue()).a;
                        float fFloatValue = ((Number) fhg1VarO2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) fhg1VarO.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                        float fT = dm5.T(0.4f, 0.5f, fFloatValue2);
                        float fT2 = dm5.T(0.7f, 0.5f, fFloatValue2);
                        float fT3 = dm5.T(0.5f, 0.5f, fFloatValue2);
                        float fT4 = dm5.T(0.3f, 0.5f, fFloatValue2);
                        jtf jtfVar2 = jtfVar;
                        tw4 tw4Var = jtfVar2.a;
                        tw4 tw4Var2 = jtfVar2.c;
                        tw4Var.o();
                        tw4 tw4Var3 = jtfVar2.a;
                        tw4Var3.k(0.2f * fIntBitsToFloat2, fT3 * fIntBitsToFloat2);
                        tw4Var3.j(fT * fIntBitsToFloat2, fT2 * fIntBitsToFloat2);
                        tw4Var3.j(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fT4);
                        vw4 vw4Var = jtfVar2.b;
                        vw4Var.c(tw4Var3, false);
                        tw4Var2.o();
                        vw4Var.b(f5, vw4Var.a.getLength() * fFloatValue, tw4Var2);
                        DrawScope.w0(drawScope, tw4Var2, j8, phc1Var, 52);
                        return rih1.a;
                    }
                };
                x340Var.s0(iu30Var2);
                objT2 = iu30Var2;
            } else {
                final tob1 tob1Var3 = tob1VarS2;
                i3 = 0;
                iu30 iu30Var3 = new iu30() { // from class: p.lvf
                    public final Object invoke(Object obj2) {
                        float f5;
                        DrawScope drawScope = (DrawScope) obj2;
                        long j6 = ((u7h) tob1VarS.getValue()).a;
                        long j7 = ((u7h) tob1Var3.getValue()).a;
                        float fX0 = drawScope.X0(2.0f);
                        phc1 phc1Var3 = phc1Var2;
                        float f6 = phc1Var3.a;
                        float f7 = f6 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                        int i4 = u7h.l;
                        boolean zB = z4h1.b(j6, j7);
                        z520 z520Var = z520.a;
                        if (zB) {
                            f5 = 0.0f;
                            DrawScope.g0(drawScope, j6, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), z520Var, 0.0f, 0, 226);
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
                            float f8 = fIntBitsToFloat - (2.0f * f6);
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
                            long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(f8)) & 4294967295L;
                            float fMax = Math.max(0.0f, fX0 - f6);
                            f5 = 0.0f;
                            DrawScope.g0(drawScope, j6, jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), z520Var, 0.0f, 0, 224);
                            float f9 = fIntBitsToFloat - f6;
                            float f10 = fX0 - f7;
                            DrawScope.g0(drawScope, j7, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), phc1Var3, 0.0f, 0, 224);
                        }
                        long j8 = ((u7h) tob1VarA.getValue()).a;
                        float fFloatValue = ((Number) fhg1VarO2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) fhg1VarO.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                        float fT = dm5.T(0.4f, 0.5f, fFloatValue2);
                        float fT2 = dm5.T(0.7f, 0.5f, fFloatValue2);
                        float fT3 = dm5.T(0.5f, 0.5f, fFloatValue2);
                        float fT4 = dm5.T(0.3f, 0.5f, fFloatValue2);
                        jtf jtfVar2 = jtfVar;
                        tw4 tw4Var = jtfVar2.a;
                        tw4 tw4Var2 = jtfVar2.c;
                        tw4Var.o();
                        tw4 tw4Var3 = jtfVar2.a;
                        tw4Var3.k(0.2f * fIntBitsToFloat2, fT3 * fIntBitsToFloat2);
                        tw4Var3.j(fT * fIntBitsToFloat2, fT2 * fIntBitsToFloat2);
                        tw4Var3.j(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fT4);
                        vw4 vw4Var = jtfVar2.b;
                        vw4Var.c(tw4Var3, false);
                        tw4Var2.o();
                        vw4Var.b(f5, vw4Var.a.getLength() * fFloatValue, tw4Var2);
                        DrawScope.w0(drawScope, tw4Var2, j8, phc1Var, 52);
                        return rih1.a;
                    }
                };
                x340Var.s0(iu30Var3);
                objT2 = iu30Var3;
            }
            j0o1.b(i3, x340Var, (iu30) objT2, qim0VarM2);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ifa(z, rze1Var, qim0Var, hvfVar, phc1Var, phc1Var2, i);
        }
    }

    public static final void h(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1024485232);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, i);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 9, i, i2);
        }
    }

    public static final void i(int i, long j, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-135094316);
        int i2 = i | 22;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.d0();
            int i3 = i & 1;
            qim0 qim0Var3 = nim0.a;
            if (i3 == 0 || x340Var.E()) {
                j = u7h.b(u7h.f, 0.4f, 0.0f, 0.0f, 0.0f, 14);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            x340Var.s();
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, u291.f(qim0Var2, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            t1c.a(dug.f(u291.s(qim0Var3, 32.0f, 4.0f), j, er31.b(2.0f)), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        long j2 = j;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e82(qim0Var2, j2, i, (byte) 2);
        }
    }

    public static final void j(String str, String str2, String str3, float f, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-627243864);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            int iX0 = (int) ((wat) x340Var.k(t4k.h)).X0(f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new yk4(mno1.z(new td10(str, str2, str3, (sd10) null).h(context), iX0, iX0, 4));
                x340Var.s0(objT);
            }
            yk4 yk4Var = (yk4) objT;
            isl islVar = isl.a;
            qim0 qim0Var3 = nim0.a;
            if (str == null || str.length() == 0) {
                x340Var.i0(1181276002);
                eso1.f(yk4Var, islVar, anm1.N("plan-member-face-view-no-uri", qim0Var3), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 48, 504);
                x340Var.r(false);
            } else {
                x340Var.i0(1181475580);
                eso1.e(Uri.parse(str), islVar, anm1.N("plan-member-face-view", i1p1.q(qim0Var3, er31.a)), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, new pux((jmr0) null, new pxa(yk4Var)), false, false, x340Var, 1075314736, 0, 3512);
                x340Var = x340Var;
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e0a(str, str2, str3, f, qim0Var2, i, (byte) 5);
        }
    }

    public static final void k(String str, String str2, boolean z, cy10 cy10Var, boolean z2, iu30 iu30Var, qim0 qim0Var, boolean z3, boolean z4, long j, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2;
        m4c m4cVar;
        int i3;
        m4c m4cVar2;
        boolean z5;
        int i4;
        jax haxVar;
        iu30 iu30Var2 = iu30Var;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1435723177);
        j06 j06Var = x340Var3.a;
        if ((i & 6) == 0) {
            i2 = (x340Var3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var3.e(cy10Var == null ? -1 : cy10Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var3.h(z2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var3.i(iu30Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var3.i(qim0Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var3.h(z3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= x340Var3.h(z4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= x340Var3.f(j) ? 536870912 : 268435456;
        }
        if (x340Var3.Y(i2 & 1, (i2 & 306783379) != 306783378)) {
            x340Var3.d0();
            if ((i & 1) != 0 && !x340Var3.E()) {
                x340Var3.b0();
            }
            x340Var3.s();
            Object objT = x340Var3.T();
            m4c m4cVar3 = fkj0.X;
            if (objT == m4cVar3) {
                objT = v8r.q(cy10Var);
                x340Var3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var3.i(ven0Var) | ((i2 & 7168) == 2048);
            Object objT2 = x340Var3.T();
            if (zI || objT2 == m4cVar3) {
                objT2 = new h210(cy10Var, ven0Var, (lnm) null, (byte) 3);
                x340Var3.s0(objT2);
            }
            qxd0.t(cy10Var, x340Var3, (vu30) objT2);
            fra fraVar = een.N0;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarThen = qim0Var.then(z3 ? u291.f(qim0Var2, 1.0f) : qim0Var2);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw 0;
            }
            x340Var3.m0();
            boolean z6 = x340Var3.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var3, lljVar3);
            nko1.F(x340Var3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var3, lljVar4);
            if (str2 != null) {
                x340Var3.i0(258709901);
                boolean z7 = ((i2 & 458752) == 131072) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objT3 = x340Var3.T();
                if (z7 || objT3 == m4cVar3) {
                    objT3 = new xvy(iu30Var2, str, str2, (byte) 6);
                    x340Var3.s0(objT3);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT3);
                ldx ldxVar = ldx.c;
                gdx gdxVarS = yla.s(x340Var3);
                if (z) {
                    x340Var3.i0(258940231);
                    x340Var3.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var3.i0(258993892);
                    haxVar = new hax(cwl1.o0(x340Var3, 2131958264));
                    x340Var3.r(false);
                }
                jax jaxVar = haxVar;
                qim0 qim0VarN = anm1.N("feedback_actions_copy_button", qim0Var2);
                j2i j2iVarR = apo.r(1342514023, new sre((byte) 19, j), x340Var3);
                m4cVar = m4cVar3;
                i3 = 2;
                foo1.c(gbxVar, ldxVar, qim0VarN, jaxVar, gdxVarS, null, null, null, null, null, j2iVarR, x340Var3, 0, 48, 1992);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            } else {
                x340Var2 = x340Var3;
                m4cVar = m4cVar3;
                i3 = 2;
                x340Var2.i0(259400085);
                x340Var2.r(false);
            }
            cy10 cy10Var2 = (cy10) ven0Var.getValue();
            cy10 cy10Var3 = cy10.a;
            boolean z8 = cy10Var2 == cy10Var3;
            cy10 cy10Var4 = (cy10) ven0Var.getValue();
            cy10 cy10Var5 = cy10.b;
            boolean z9 = cy10Var4 != cy10Var5;
            ceo ceoVar = klv.a;
            m4c m4cVar4 = m4cVar;
            int i5 = i2;
            x340 x340Var4 = x340Var2;
            fq7.f(z9, (qim0) null, xay.e(i3, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, ceoVar, i3)), xay.f(i3, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, ceoVar, i3)), (String) null, apo.r(-1483610651, new or10(z2, iu30Var2, str, z, j, z8), x340Var2), x340Var4, 1572870, 18);
            boolean z10 = ((cy10) ven0Var.getValue()) == cy10Var5;
            boolean z11 = ((cy10) ven0Var.getValue()) != cy10Var3;
            bby bbyVarE = xay.e(2, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, ceoVar, 2));
            ln00 ln00VarF = xay.f(2, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, ceoVar, 2));
            pr10 pr10Var = new pr10(iu30Var, str, z, j, z10);
            iu30Var2 = iu30Var;
            fq7.f(z11, (qim0) null, bbyVarE, ln00VarF, (String) null, apo.r(1316567964, pr10Var, x340Var4), x340Var4, 1572870, 18);
            x340Var = x340Var4;
            if (z3) {
                x340Var.i0(262311512);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                gfh0 gfh0VarC = t1c.c(een.i, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
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
                mbh mbhVarA = jbh.a(h36.c, een.R0, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                String strO0 = cwl1.o0(x340Var, 2131958267);
                uwr uwrVar = cbx.a;
                lee1 lee1VarA = lee1.a(cbx.d(x340Var).m, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.c, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16773119);
                zsc zscVar = zex.a;
                long j2 = ((vex) zscVar.e).k;
                qim0 qim0VarN2 = anm1.N("feedback_actions_disclaimer_link_text", qim0Var2);
                String strO1 = cwl1.o0(x340Var, 2131958267);
                pm31 pm31Var = new pm31(0);
                i4 = 131072;
                boolean z12 = (i5 & 458752) == 131072;
                Object objT4 = x340Var.T();
                if (z12) {
                    m4cVar2 = m4cVar4;
                } else {
                    m4cVar2 = m4cVar4;
                    if (objT4 == m4cVar2) {
                    }
                    uwo1.e(strO0, bin.x(qim0VarN2, false, strO1, pm31Var, null, (Function0) objT4, 9), lee1VarA, j2, new a0e1(6), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                    uwo1.e(cwl1.o0(x340Var, 2131958266), anm1.N("feedback_actions_disclaimer_text", qim0Var2), cbx.d(x340Var).m, ((vex) zscVar.e).k, new a0e1(6), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                    x340Var = x340Var;
                    z5 = true;
                    us71.m(x340Var, true, true, false);
                }
                objT4 = new yx00(iu30Var2, (byte) 13);
                x340Var.s0(objT4);
                uwo1.e(strO0, bin.x(qim0VarN2, false, strO1, pm31Var, null, (Function0) objT4, 9), lee1VarA, j2, new a0e1(6), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                uwo1.e(cwl1.o0(x340Var, 2131958266), anm1.N("feedback_actions_disclaimer_text", qim0Var2), cbx.d(x340Var).m, ((vex) zscVar.e).k, new a0e1(6), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                x340Var = x340Var;
                z5 = true;
                us71.m(x340Var, true, true, false);
            } else {
                m4cVar2 = m4cVar4;
                z5 = true;
                i4 = 131072;
                x340Var.i0(263415701);
                x340Var.r(false);
            }
            x340Var.r(z5);
            if (z4) {
                x340Var.i0(-1944633936);
                int i6 = i5 & 458752;
                boolean z13 = i6 == i4 ? z5 : false;
                Object objT5 = x340Var.T();
                if (z13 || objT5 == m4cVar2) {
                    objT5 = new yx00(iu30Var2, (byte) 14);
                    x340Var.s0(objT5);
                }
                Function0 function0 = (Function0) objT5;
                boolean z14 = i6 == i4 ? z5 : false;
                Object objT6 = x340Var.T();
                if (z14 || objT6 == m4cVar2) {
                    objT6 = new yx00(iu30Var2, (byte) 15);
                    x340Var.s0(objT6);
                }
                b2u.c(function0, (Function0) objT6, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1944471527);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qr10(str, str2, z, cy10Var, z2, iu30Var2, qim0Var, z3, z4, j, i);
        }
    }

    public static final void l(a9t0 a9t0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        float f;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1677651405);
        int i2 = i | (b0kVar3.g(a9t0Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                b0kVar3.i0(1610270206);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                b0kVar3.r(false);
                f = 48.0f;
            } else {
                b0kVar3.i0(1610272254);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar3).g;
                b0kVar3.r(false);
                f = 64.0f;
            }
            qim0 qim0VarN = anm1.N("plan-member-row-" + a9t0Var.b, nim0.a);
            uvx uvxVarB = uvx.b((uvx) b0kVar3.k(vvx.a), 0, (tvx) null, new p3v(f), 15);
            boolean z2 = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new isr0(function0, (byte) 17);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVarB, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, apo.r(-1141227580, new ye6((Object) a9t0Var, f, (byte) 7), b0kVar3), null, apo.r(2026133253, new g9t0(a9t0Var, (byte) 0), b0kVar3), null, null, null, apo.r(-971648503, new g9t0(a9t0Var, (byte) 1), b0kVar3), b0kVar2, 805306432, 196656, 30140);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0((Object) a9t0Var, z, (Object) function0, i, (byte) 14);
        }
    }

    public static final void m(boolean z, x8t0 x8t0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1304796095);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(x8t0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (x8t0Var instanceof u8t0) {
            x340Var.i0(1726578242);
            d(2131959763, x340Var, 0);
            x340Var.r(false);
        } else if (x8t0Var instanceof w8t0) {
            x340Var.i0(1726691764);
            if (z) {
                x340Var.i0(1726708814);
                d(2131959764, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1726799210);
                h(2131959765, x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(false);
        } else if (x8t0Var instanceof t8t0) {
            x340Var.i0(1726938028);
            if (z) {
                x340Var.i0(1726954954);
                d(2131958147, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1727049318);
                h(2131958148, x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(false);
        } else if (x8t0Var instanceof r8t0) {
            x340Var.i0(1727197250);
            if (z) {
                x340Var.i0(1727214021);
                d(2131956121, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1727313345);
                h(2131956122, x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            if (!(x8t0Var instanceof v8t0)) {
                throw p3d1.k(x340Var, -221399254, false);
            }
            x340Var.i0(1727472468);
            if (((v8t0) x8t0Var).a) {
                x340Var.i0(1727500864);
                if (z) {
                    x340Var.i0(1727521262);
                    d(2131951753, x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1727602947);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(1727670248);
                if (z) {
                    x340Var.i0(1727689034);
                    d(2131959764, x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1727783398);
                    h(2131959765, x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2(z, (Object) x8t0Var, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0165  */
    /* JADX WARN: Code duplicated, block: B:106:0x0172  */
    /* JADX WARN: Code duplicated, block: B:107:0x017f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0194  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:119:0x0208  */
    /* JADX WARN: Code duplicated, block: B:121:0x0216  */
    /* JADX WARN: Code duplicated, block: B:122:0x0218  */
    /* JADX WARN: Code duplicated, block: B:125:0x021f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0221  */
    /* JADX WARN: Code duplicated, block: B:129:0x0238  */
    /* JADX WARN: Code duplicated, block: B:130:0x023a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0249  */
    /* JADX WARN: Code duplicated, block: B:138:0x0270  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:148:0x0328  */
    /* JADX WARN: Code duplicated, block: B:149:0x032c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0341  */
    /* JADX WARN: Code duplicated, block: B:153:0x0343  */
    /* JADX WARN: Code duplicated, block: B:156:0x0360  */
    /* JADX WARN: Code duplicated, block: B:158:0x036c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0384 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x0386  */
    /* JADX WARN: Code duplicated, block: B:165:0x039c  */
    /* JADX WARN: Code duplicated, block: B:167:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:168:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:171:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:180:0x040d  */
    /* JADX WARN: Code duplicated, block: B:182:0x042c  */
    /* JADX WARN: Code duplicated, block: B:185:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x044c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0471 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x0473  */
    /* JADX WARN: Code duplicated, block: B:195:0x0506 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x0508  */
    /* JADX WARN: Code duplicated, block: B:199:0x0521 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x0523  */
    /* JADX WARN: Code duplicated, block: B:203:0x053d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0542  */
    /* JADX WARN: Code duplicated, block: B:207:0x059f  */
    /* JADX WARN: Code duplicated, block: B:209:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:212:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:213:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:216:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:221:0x0611 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x0613  */
    /* JADX WARN: Code duplicated, block: B:224:0x0640  */
    /* JADX WARN: Code duplicated, block: B:226:0x0645  */
    /* JADX WARN: Code duplicated, block: B:229:0x0665  */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0143  */
    /* JADX WARN: Code duplicated, block: B:96:0x0150  */
    /* JADX WARN: Code duplicated, block: B:97:0x0153  */
    /* JADX WARN: Code duplicated, block: B:99:0x0157  */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v59 */
    public static final void n(upo upoVar, int i, iu30 iu30Var, qim0 qim0Var, long j, hw61 hw61Var, long j2, boolean z, boolean z2, boolean z3, boolean z4, float f, Function0 function0, o8n o8nVar, j2i j2iVar, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        int i6;
        char c;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        j2i j2iVar2;
        long j3;
        boolean z6;
        boolean z7;
        boolean z8;
        float f2;
        Function0 function1;
        o8n o8nVar2;
        qim0 qim0Var3;
        x340 x340Var;
        hw61 hw61Var2;
        boolean z9;
        h311 h311VarV;
        int i14;
        o8n o8nVar3;
        qim0 qim0VarV;
        int i15;
        boolean z10;
        Function0 function2;
        qim0 qim0Var4;
        Function0 function3;
        hw61 hw61Var3;
        int i16;
        boolean z11;
        float f3;
        boolean z12;
        boolean z13;
        boolean z14;
        o8n o8nVar4;
        Object objT;
        Object objT2;
        c9n c9nVar;
        ven0 ven0VarS;
        ven0 ven0VarS2;
        float f4;
        View view;
        wat watVar;
        Function0 function4;
        float fX0;
        boolean zI;
        Object objT3;
        lnm lnmVar;
        o8n o8nVar5;
        boolean z15;
        gra graVar;
        gfh0 gfh0VarC;
        o8n o8nVar6;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z16;
        n4k n4kVar;
        vu30 vu30Var;
        int i17;
        vu30 vu30Var2;
        int i18;
        float fO;
        upo upoVar2;
        o8n o8nVar7;
        qim0 qim0Var5;
        int i19;
        boolean zI2;
        Object objT4;
        float f5;
        boolean zG;
        Object objT5;
        vu30 vu30Var3;
        vu30 vu30Var4;
        c9n c9nVar2;
        x340 x340Var2;
        float f6;
        d6o0 d6o0Var;
        boolean zI3;
        Object objT6;
        boolean zI4;
        Object objT7;
        qim0 qim0VarL;
        boolean z17;
        boolean zH;
        Object objT8;
        Object objT9;
        idn0 idn0Var;
        boolean zD;
        Object objT10;
        ?? r5;
        boolean z18;
        boolean z19;
        boolean z20;
        Object objT11;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        Object objT12;
        int i20;
        int i21;
        upo upoVar3 = upoVar;
        m4c m4cVar = fkj0.X;
        drr0 drr0Var = upoVar3.a;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-104878928);
        j06 j06Var = x340Var3.a;
        if ((i2 & 6) == 0) {
            i4 = (x340Var3.i(upoVar3) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var3.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var3.i(iu30Var) ? 256 : 128;
        }
        int i22 = i3 & 8;
        if (i22 == 0) {
            if ((i2 & 3072) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var3.i(qim0Var2) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                if (x340Var3.f(j)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i4 |= i21;
            }
            if ((196608 & i2) == 0) {
                i4 |= 65536;
            }
            if ((1572864 & i2) == 0) {
                if (x340Var3.f(j2)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i4 |= i20;
            }
            i5 = 918552576 | i4;
            i6 = i3 & 1024;
            if (i6 != 0) {
                i7 = 24582;
            } else {
                if (x340Var3.h(z4)) {
                    c = 4;
                } else {
                    c = 2;
                }
                i7 = 24576 | c;
            }
            i8 = i7;
            i9 = i8 | 48;
            i10 = i3 & 4096;
            if (i10 != 0) {
                i11 = i8 | 432;
            } else {
                i11 = i9 | (x340Var3.i(function0) ? (char) 256 : (char) 128);
            }
            i12 = i3 & 8192;
            if (i12 != 0) {
                i13 = i11 | 3072;
            } else {
                i13 = i11 | (x340Var3.i(o8nVar) ? (char) 2048 : (char) 1024);
            }
            if ((i5 & 306783379) == 306783378 || (i13 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var3.Y(i5 & 1, z5)) {
                x340Var3.d0();
                i14 = i2 & 1;
                o8nVar3 = o6x.a;
                qim0VarV = nim0.a;
                if (i14 != 0 || x340Var3.E()) {
                    if (i22 != 0) {
                        qim0Var2 = qim0VarV;
                    }
                    hw61 hw61VarD = er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12);
                    i15 = i5 & (-458753);
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i10 != 0) {
                        objT = x340Var3.T();
                        if (objT == m4cVar) {
                            objT = lmm.a1;
                            x340Var3.s0(objT);
                        }
                        function2 = (Function0) objT;
                    } else {
                        function2 = function0;
                    }
                    Function0 function5 = function2;
                    qim0Var4 = qim0Var2;
                    function3 = function5;
                    hw61Var3 = hw61VarD;
                    if (i12 != 0) {
                        o8nVar4 = o8nVar3;
                        i16 = i15;
                        z11 = z10;
                        f3 = 640.0f;
                        z12 = true;
                        z13 = true;
                        z14 = true;
                    } else {
                        i16 = i15;
                        z11 = z10;
                        f3 = 640.0f;
                        z12 = true;
                        z13 = true;
                        z14 = true;
                    }
                    x340Var3.s();
                    objT2 = x340Var3.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o8nVar3, x340Var3);
                        x340Var3.s0(objT2);
                    }
                    c9nVar = (c9n) objT2;
                    ven0VarS = v8r.s(iu30Var, x340Var3);
                    ven0VarS2 = v8r.s(function3, x340Var3);
                    f4 = f3;
                    view = (View) x340Var3.k(AndroidCompositionLocals_androidKt.f);
                    watVar = (wat) x340Var3.k(t4k.h);
                    function4 = function3;
                    upoVar3.d.setValue(Integer.valueOf(i));
                    WeakHashMap weakHashMap = osl1.x;
                    upoVar3.e.setValue(Integer.valueOf(lhc.g(x340Var3).e.e().d));
                    fX0 = watVar.X0(800.0f);
                    zI = x340Var3.i(upoVar3);
                    objT3 = x340Var3.T();
                    lnmVar = null;
                    if (zI || objT3 == m4cVar) {
                        objT3 = new sv1(upoVar3, lnmVar, (byte) 1);
                        x340Var3.s0(objT3);
                    }
                    qxd0.t(upoVar3, x340Var3, (vu30) objT3);
                    if (z13) {
                        x340Var3.i0(-2005077741);
                        if (upoVar3.c() != wy71.c) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if ((i13 & 896) == 256) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        boolean zI5 = z22 | x340Var3.i(c9nVar) | x340Var3.i(o8nVar4) | x340Var3.i(upoVar3);
                        if ((i16 & 896) == 256) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        z24 = z23 | zI5;
                        objT12 = x340Var3.T();
                        if (!z24 || objT12 == m4cVar) {
                            o8n o8nVar8 = o8nVar4;
                            objT12 = new mpo(function4, c9nVar, o8nVar8, upoVar, iu30Var, (byte) 0);
                            o8nVar5 = o8nVar8;
                            x340Var3.s0(objT12);
                        } else {
                            o8nVar5 = o8nVar4;
                        }
                        function4 = function4;
                        z15 = false;
                        q3p1.b(0, 0, (Function0) objT12, x340Var3, z21);
                        x340Var3.r(false);
                    } else {
                        o8nVar5 = o8nVar4;
                        z15 = false;
                        x340Var3.i0(-2004863438);
                        x340Var3.r(false);
                    }
                    qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
                    graVar = een.d;
                    qim0Var3 = qim0Var4;
                    gfh0VarC = t1c.c(graVar, z15);
                    o8nVar6 = o8nVar5;
                    iHashCode = Long.hashCode(x340Var3.T);
                    xos0VarM = x340Var3.m();
                    qim0VarE = zr7.E(x340Var3, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var3.m0();
                    z16 = x340Var3.S;
                    n4kVar = hmb0.t1;
                    if (z16) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    vu30Var = y580.O0;
                    nko1.H(gfh0VarC, x340Var3, vu30Var);
                    llj lljVar = y580.N0;
                    nko1.H(xos0VarM, x340Var3, lljVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    i17 = i16;
                    llj lljVar2 = y580.R0;
                    nko1.H(numValueOf, x340Var3, lljVar2);
                    nko1.F(x340Var3);
                    vu30Var2 = y580.Y;
                    nko1.H(qim0VarE, x340Var3, vu30Var2);
                    x340Var3.i0(-718308973);
                    float fM0 = watVar.M0(lhc.g(x340Var3).f.e().b);
                    x340Var3.r(false);
                    qim0 qim0VarB = uyn1.B(too1.j(u291.d(qim0VarV, 1.0f), lhc.g(x340Var3).f), 0.0f, fM0, 0.0f, 0.0f, 13);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    i18 = i13;
                    int iHashCode2 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM2 = x340Var3.m();
                    qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarB);
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var3, vu30Var);
                    nko1.H(xos0VarM2, x340Var3, lljVar);
                    x0d.q(iHashCode2, x340Var3, lljVar2, x340Var3);
                    nko1.H(qim0VarE2, x340Var3, vu30Var2);
                    if (upoVar.d() == 0) {
                        fO = 0.0f;
                    } else {
                        fO = 1.0f - yoi1.o(drr0Var.s() / upoVar.d(), 0.0f, 1.0f);
                    }
                    if (z4h1.b(j, u7h.k)) {
                        upoVar2 = upoVar;
                        function4 = function4;
                        o8nVar7 = o8nVar6;
                        qim0Var5 = qim0VarV;
                        i19 = i17;
                        x340Var3.i0(595342630);
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(594640139);
                        objT9 = x340Var3.T();
                        if (objT9 == m4cVar) {
                            objT9 = ktd.n(x340Var3);
                        }
                        idn0Var = (idn0) objT9;
                        qim0 qim0VarD2 = u291.d(qim0VarV, 1.0f);
                        zD = x340Var3.d(fO);
                        objT10 = x340Var3.T();
                        if (zD || objT10 == m4cVar) {
                            objT10 = new jc5((byte) 18, fO);
                            x340Var3.s0(objT10);
                        }
                        qim0 qim0VarF = dug.f(i541.C(qim0VarD2, (iu30) objT10), j, d4o1.a);
                        if (z12) {
                            x340Var3.i0(594920007);
                            if ((i18 & 896) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            o8nVar7 = o8nVar6;
                            boolean zI6 = z18 | x340Var3.i(c9nVar) | x340Var3.i(o8nVar7) | x340Var3.i(upoVar);
                            i19 = i17;
                            if ((i19 & 896) == 256) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z20 = zI6 | z19;
                            objT11 = x340Var3.T();
                            if (!z20 || objT11 == m4cVar) {
                                objT11 = new mpo(function4, c9nVar, o8nVar7, upoVar, iu30Var, (byte) 1);
                                upoVar2 = upoVar;
                                x340Var3.s0(objT11);
                            } else {
                                upoVar2 = upoVar;
                            }
                            qim0Var5 = qim0VarV;
                            qim0VarV = bin.v(qim0Var5, idn0Var, null, false, null, null, (Function0) objT11, 28);
                            r5 = 0;
                            x340Var3.r(false);
                        } else {
                            upoVar2 = upoVar;
                            function4 = function4;
                            o8nVar7 = o8nVar6;
                            qim0Var5 = qim0VarV;
                            i19 = i17;
                            r5 = 0;
                            x340Var3.i0(595264696);
                            x340Var3.r(false);
                        }
                        t1c.a(qim0VarF.then(qim0VarV), x340Var3, (int) r5);
                        x340Var3.r((boolean) r5);
                    }
                    zI2 = x340Var3.i(upoVar2);
                    objT4 = x340Var3.T();
                    if (zI2 || objT4 == m4cVar) {
                        objT4 = new npo(upoVar2, (byte) 2);
                        x340Var3.s0(objT4);
                    }
                    r6v r6vVarC = k6v.c((iu30) objT4, x340Var3);
                    f5 = fX0;
                    zG = x340Var3.g(upoVar2) | x340Var3.d(f5) | x340Var3.g(o8nVar7);
                    objT5 = x340Var3.T();
                    if (!zG || objT5 == m4cVar) {
                        hnf hnfVar = new hnf(ven0VarS, (byte) 18);
                        vu30Var3 = vu30Var;
                        o8n o8nVar9 = o8nVar7;
                        vu30Var4 = vu30Var2;
                        c9nVar2 = c9nVar;
                        x340Var2 = x340Var3;
                        f6 = 1.0f;
                        rpo rpoVar = new rpo(new l811(), upoVar, new l811(), c9nVar2, o8nVar9, f5, new hnf(ven0VarS2, (byte) 19), hnfVar);
                        upoVar2 = upoVar;
                        f5 = f5;
                        o8nVar7 = o8nVar9;
                        x340Var2.s0(rpoVar);
                        objT5 = rpoVar;
                    } else {
                        vu30Var3 = vu30Var;
                        vu30Var4 = vu30Var2;
                        c9nVar2 = c9nVar;
                        x340Var2 = x340Var3;
                        f6 = 1.0f;
                    }
                    d6o0Var = (d6o0) objT5;
                    gra graVar2 = een.X;
                    h2c h2cVar = h2c.a;
                    qim0 qim0VarC = u291.c(u291.f(u291.x(0.0f, f4, 1, h2cVar.a(qim0Var5, graVar2)), f6), f6);
                    zI3 = x340Var2.i(upoVar2);
                    objT6 = x340Var2.T();
                    if (zI3 || objT6 == m4cVar) {
                        objT6 = new npo(upoVar2, (byte) 0);
                        x340Var2.s0(objT6);
                    }
                    qim0 qim0VarC2 = i541.C(qim0VarC, (iu30) objT6);
                    zI4 = x340Var2.i(upoVar2);
                    objT7 = x340Var2.T();
                    if (zI4 || objT7 == m4cVar) {
                        objT7 = new npo(upoVar2, (byte) 1);
                        x340Var2.s0(objT7);
                    }
                    qim0 qim0VarF2 = dug.f(lrn1.u(qim0VarC2, (iu30) objT7), j2, hw61Var3);
                    if (z11) {
                        qim0VarL = bmq0.L(qim0Var5, d6o0Var, (g6o0) null);
                    } else {
                        qim0VarL = qim0Var5;
                    }
                    float f7 = f5;
                    upo upoVar4 = upoVar2;
                    Function0 function6 = function4;
                    o8n o8nVar10 = o8nVar7;
                    upoVar3 = upoVar4;
                    qim0 qim0VarX = ern1.x(k6v.b(qim0VarF2.then(qim0VarL), r6vVarC, qqq0.a, false, (idn0) null, false, new xx0(upoVar2, (lnm) null, (byte) 3), new ppo(c9nVar2, o8nVar10, upoVar4, f7, function6, iu30Var, null), false, 156), new y0o(upoVar3, view, (byte) 5));
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode3 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM3 = x340Var2.m();
                    qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarX);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, vu30Var3);
                    nko1.H(xos0VarM3, x340Var2, lljVar);
                    x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                    nko1.H(qim0VarE3, x340Var2, vu30Var4);
                    if (z14) {
                        x340Var2.i0(-1873966098);
                        z17 = false;
                        i(0, 0L, x340Var2, null);
                        x340Var2.r(false);
                    } else {
                        z17 = false;
                        x340Var2.i0(-1873933424);
                        x340Var2.r(false);
                    }
                    j2iVar2 = j2iVar;
                    j2iVar2.invoke(pbh.a, x340Var2, 54);
                    x340Var2.r(true);
                    x340Var2.r(true);
                    if (upoVar3.d() > 0 && drr0Var.s() < upoVar3.d()) {
                        z17 = true;
                    }
                    qim0 qim0VarA = h2cVar.a(qim0Var5, graVar2);
                    zH = x340Var2.h(z17);
                    objT8 = x340Var2.T();
                    if (zH || objT8 == m4cVar) {
                        objT8 = new gy((byte) 17, z17);
                        x340Var2.s0(objT8);
                    }
                    qim0 qim0VarC3 = i541.C(qim0VarA, (iu30) objT8);
                    j3 = j2;
                    e((i19 >> 18) & 14, j3, x340Var2, qim0VarC3);
                    x340Var2.r(true);
                    function1 = function6;
                    o8nVar2 = o8nVar10;
                    hw61Var2 = hw61Var3;
                    x340Var = x340Var2;
                    f2 = f4;
                    z6 = z12;
                    z7 = z13;
                    z9 = z14;
                    z8 = z11;
                } else {
                    x340Var3.b0();
                    hw61Var3 = hw61Var;
                    z12 = z;
                    z13 = z2;
                    z14 = z3;
                    z11 = z4;
                    f3 = f;
                    i16 = i5 & (-458753);
                    qim0Var4 = qim0Var2;
                    function3 = function0;
                }
                o8nVar4 = o8nVar;
                x340Var3.s();
                objT2 = x340Var3.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o8nVar3, x340Var3);
                    x340Var3.s0(objT2);
                }
                c9nVar = (c9n) objT2;
                ven0VarS = v8r.s(iu30Var, x340Var3);
                ven0VarS2 = v8r.s(function3, x340Var3);
                f4 = f3;
                view = (View) x340Var3.k(AndroidCompositionLocals_androidKt.f);
                watVar = (wat) x340Var3.k(t4k.h);
                function4 = function3;
                upoVar3.d.setValue(Integer.valueOf(i));
                WeakHashMap weakHashMap2 = osl1.x;
                upoVar3.e.setValue(Integer.valueOf(lhc.g(x340Var3).e.e().d));
                fX0 = watVar.X0(800.0f);
                zI = x340Var3.i(upoVar3);
                objT3 = x340Var3.T();
                lnmVar = null;
                if (zI) {
                    objT3 = new sv1(upoVar3, lnmVar, (byte) 1);
                    x340Var3.s0(objT3);
                } else {
                    objT3 = new sv1(upoVar3, lnmVar, (byte) 1);
                    x340Var3.s0(objT3);
                }
                qxd0.t(upoVar3, x340Var3, (vu30) objT3);
                if (z13) {
                    x340Var3.i0(-2005077741);
                    if (upoVar3.c() != wy71.c) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i13 & 896) == 256) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean zI7 = z22 | x340Var3.i(c9nVar) | x340Var3.i(o8nVar4) | x340Var3.i(upoVar3);
                    if ((i16 & 896) == 256) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    z24 = z23 | zI7;
                    objT12 = x340Var3.T();
                    if (z24) {
                        o8n o8nVar11 = o8nVar4;
                        objT12 = new mpo(function4, c9nVar, o8nVar11, upoVar, iu30Var, (byte) 0);
                        o8nVar5 = o8nVar11;
                        x340Var3.s0(objT12);
                    } else {
                        o8n o8nVar12 = o8nVar4;
                        objT12 = new mpo(function4, c9nVar, o8nVar12, upoVar, iu30Var, (byte) 0);
                        o8nVar5 = o8nVar12;
                        x340Var3.s0(objT12);
                    }
                    function4 = function4;
                    z15 = false;
                    q3p1.b(0, 0, (Function0) objT12, x340Var3, z21);
                    x340Var3.r(false);
                } else {
                    o8nVar5 = o8nVar4;
                    z15 = false;
                    x340Var3.i0(-2004863438);
                    x340Var3.r(false);
                }
                qim0 qim0VarD3 = u291.d(qim0Var4, 1.0f);
                graVar = een.d;
                qim0Var3 = qim0Var4;
                gfh0VarC = t1c.c(graVar, z15);
                o8nVar6 = o8nVar5;
                iHashCode = Long.hashCode(x340Var3.T);
                xos0VarM = x340Var3.m();
                qim0VarE = zr7.E(x340Var3, qim0VarD3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                z16 = x340Var3.S;
                n4kVar = hmb0.t1;
                if (z16) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                vu30Var = y580.O0;
                nko1.H(gfh0VarC, x340Var3, vu30Var);
                llj lljVar3 = y580.N0;
                nko1.H(xos0VarM, x340Var3, lljVar3);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                i17 = i16;
                llj lljVar4 = y580.R0;
                nko1.H(numValueOf2, x340Var3, lljVar4);
                nko1.F(x340Var3);
                vu30Var2 = y580.Y;
                nko1.H(qim0VarE, x340Var3, vu30Var2);
                x340Var3.i0(-718308973);
                float fM1 = watVar.M0(lhc.g(x340Var3).f.e().b);
                x340Var3.r(false);
                qim0 qim0VarB2 = uyn1.B(too1.j(u291.d(qim0VarV, 1.0f), lhc.g(x340Var3).f), 0.0f, fM1, 0.0f, 0.0f, 13);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                i18 = i13;
                int iHashCode4 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM4 = x340Var3.m();
                qim0 qim0VarE4 = zr7.E(x340Var3, qim0VarB2);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC3, x340Var3, vu30Var);
                nko1.H(xos0VarM4, x340Var3, lljVar3);
                x0d.q(iHashCode4, x340Var3, lljVar4, x340Var3);
                nko1.H(qim0VarE4, x340Var3, vu30Var2);
                if (upoVar.d() == 0) {
                    fO = 0.0f;
                } else {
                    fO = 1.0f - yoi1.o(drr0Var.s() / upoVar.d(), 0.0f, 1.0f);
                }
                if (z4h1.b(j, u7h.k)) {
                    x340Var3.i0(594640139);
                    objT9 = x340Var3.T();
                    if (objT9 == m4cVar) {
                        objT9 = ktd.n(x340Var3);
                    }
                    idn0Var = (idn0) objT9;
                    qim0 qim0VarD4 = u291.d(qim0VarV, 1.0f);
                    zD = x340Var3.d(fO);
                    objT10 = x340Var3.T();
                    if (zD) {
                        objT10 = new jc5((byte) 18, fO);
                        x340Var3.s0(objT10);
                    } else {
                        objT10 = new jc5((byte) 18, fO);
                        x340Var3.s0(objT10);
                    }
                    qim0 qim0VarF3 = dug.f(i541.C(qim0VarD4, (iu30) objT10), j, d4o1.a);
                    if (z12) {
                        x340Var3.i0(594920007);
                        if ((i18 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        o8nVar7 = o8nVar6;
                        boolean zI8 = z18 | x340Var3.i(c9nVar) | x340Var3.i(o8nVar7) | x340Var3.i(upoVar);
                        i19 = i17;
                        if ((i19 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = zI8 | z19;
                        objT11 = x340Var3.T();
                        if (z20) {
                            objT11 = new mpo(function4, c9nVar, o8nVar7, upoVar, iu30Var, (byte) 1);
                            upoVar2 = upoVar;
                            x340Var3.s0(objT11);
                        } else {
                            objT11 = new mpo(function4, c9nVar, o8nVar7, upoVar, iu30Var, (byte) 1);
                            upoVar2 = upoVar;
                            x340Var3.s0(objT11);
                        }
                        qim0Var5 = qim0VarV;
                        qim0VarV = bin.v(qim0Var5, idn0Var, null, false, null, null, (Function0) objT11, 28);
                        r5 = 0;
                        x340Var3.r(false);
                    } else {
                        upoVar2 = upoVar;
                        function4 = function4;
                        o8nVar7 = o8nVar6;
                        qim0Var5 = qim0VarV;
                        i19 = i17;
                        r5 = 0;
                        x340Var3.i0(595264696);
                        x340Var3.r(false);
                    }
                    t1c.a(qim0VarF3.then(qim0VarV), x340Var3, (int) r5);
                    x340Var3.r((boolean) r5);
                } else {
                    upoVar2 = upoVar;
                    function4 = function4;
                    o8nVar7 = o8nVar6;
                    qim0Var5 = qim0VarV;
                    i19 = i17;
                    x340Var3.i0(595342630);
                    x340Var3.r(false);
                }
                zI2 = x340Var3.i(upoVar2);
                objT4 = x340Var3.T();
                if (zI2) {
                    objT4 = new npo(upoVar2, (byte) 2);
                    x340Var3.s0(objT4);
                } else {
                    objT4 = new npo(upoVar2, (byte) 2);
                    x340Var3.s0(objT4);
                }
                r6v r6vVarC2 = k6v.c((iu30) objT4, x340Var3);
                f5 = fX0;
                zG = x340Var3.g(upoVar2) | x340Var3.d(f5) | x340Var3.g(o8nVar7);
                objT5 = x340Var3.T();
                if (zG) {
                    hnf hnfVar2 = new hnf(ven0VarS, (byte) 18);
                    vu30Var3 = vu30Var;
                    o8n o8nVar13 = o8nVar7;
                    vu30Var4 = vu30Var2;
                    c9nVar2 = c9nVar;
                    x340Var2 = x340Var3;
                    f6 = 1.0f;
                    rpo rpoVar2 = new rpo(new l811(), upoVar, new l811(), c9nVar2, o8nVar13, f5, new hnf(ven0VarS2, (byte) 19), hnfVar2);
                    upoVar2 = upoVar;
                    f5 = f5;
                    o8nVar7 = o8nVar13;
                    x340Var2.s0(rpoVar2);
                    objT5 = rpoVar2;
                } else {
                    hnf hnfVar3 = new hnf(ven0VarS, (byte) 18);
                    vu30Var3 = vu30Var;
                    o8n o8nVar14 = o8nVar7;
                    vu30Var4 = vu30Var2;
                    c9nVar2 = c9nVar;
                    x340Var2 = x340Var3;
                    f6 = 1.0f;
                    rpo rpoVar3 = new rpo(new l811(), upoVar, new l811(), c9nVar2, o8nVar14, f5, new hnf(ven0VarS2, (byte) 19), hnfVar3);
                    upoVar2 = upoVar;
                    f5 = f5;
                    o8nVar7 = o8nVar14;
                    x340Var2.s0(rpoVar3);
                    objT5 = rpoVar3;
                }
                d6o0Var = (d6o0) objT5;
                gra graVar3 = een.X;
                h2c h2cVar2 = h2c.a;
                qim0 qim0VarC4 = u291.c(u291.f(u291.x(0.0f, f4, 1, h2cVar2.a(qim0Var5, graVar3)), f6), f6);
                zI3 = x340Var2.i(upoVar2);
                objT6 = x340Var2.T();
                if (zI3) {
                    objT6 = new npo(upoVar2, (byte) 0);
                    x340Var2.s0(objT6);
                } else {
                    objT6 = new npo(upoVar2, (byte) 0);
                    x340Var2.s0(objT6);
                }
                qim0 qim0VarC5 = i541.C(qim0VarC4, (iu30) objT6);
                zI4 = x340Var2.i(upoVar2);
                objT7 = x340Var2.T();
                if (zI4) {
                    objT7 = new npo(upoVar2, (byte) 1);
                    x340Var2.s0(objT7);
                } else {
                    objT7 = new npo(upoVar2, (byte) 1);
                    x340Var2.s0(objT7);
                }
                qim0 qim0VarF4 = dug.f(lrn1.u(qim0VarC5, (iu30) objT7), j2, hw61Var3);
                if (z11) {
                    qim0VarL = bmq0.L(qim0Var5, d6o0Var, (g6o0) null);
                } else {
                    qim0VarL = qim0Var5;
                }
                float f8 = f5;
                upo upoVar5 = upoVar2;
                Function0 function7 = function4;
                o8n o8nVar15 = o8nVar7;
                upoVar3 = upoVar5;
                qim0 qim0VarX2 = ern1.x(k6v.b(qim0VarF4.then(qim0VarL), r6vVarC2, qqq0.a, false, (idn0) null, false, new xx0(upoVar2, (lnm) null, (byte) 3), new ppo(c9nVar2, o8nVar15, upoVar5, f8, function7, iu30Var, null), false, 156), new y0o(upoVar3, view, (byte) 5));
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode5 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM5 = x340Var2.m();
                qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarX2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, vu30Var3);
                nko1.H(xos0VarM5, x340Var2, lljVar3);
                x0d.q(iHashCode5, x340Var2, lljVar4, x340Var2);
                nko1.H(qim0VarE5, x340Var2, vu30Var4);
                if (z14) {
                    x340Var2.i0(-1873966098);
                    z17 = false;
                    i(0, 0L, x340Var2, null);
                    x340Var2.r(false);
                } else {
                    z17 = false;
                    x340Var2.i0(-1873933424);
                    x340Var2.r(false);
                }
                j2iVar2 = j2iVar;
                j2iVar2.invoke(pbh.a, x340Var2, 54);
                x340Var2.r(true);
                x340Var2.r(true);
                if (upoVar3.d() > 0) {
                    z17 = true;
                }
                qim0 qim0VarA2 = h2cVar2.a(qim0Var5, graVar3);
                zH = x340Var2.h(z17);
                objT8 = x340Var2.T();
                if (zH) {
                    objT8 = new gy((byte) 17, z17);
                    x340Var2.s0(objT8);
                } else {
                    objT8 = new gy((byte) 17, z17);
                    x340Var2.s0(objT8);
                }
                qim0 qim0VarC6 = i541.C(qim0VarA2, (iu30) objT8);
                j3 = j2;
                e((i19 >> 18) & 14, j3, x340Var2, qim0VarC6);
                x340Var2.r(true);
                function1 = function7;
                o8nVar2 = o8nVar15;
                hw61Var2 = hw61Var3;
                x340Var = x340Var2;
                f2 = f4;
                z6 = z12;
                z7 = z13;
                z9 = z14;
                z8 = z11;
            } else {
                j2iVar2 = j2iVar;
                j3 = j2;
                x340Var3.b0();
                z6 = z;
                z7 = z2;
                z8 = z4;
                f2 = f;
                function1 = function0;
                o8nVar2 = o8nVar;
                qim0Var3 = qim0Var2;
                x340Var = x340Var3;
                hw61Var2 = hw61Var;
                z9 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new opo(upoVar3, i, iu30Var, qim0Var3, j, hw61Var2, j3, z6, z7, z9, z8, f2, function1, o8nVar2, j2iVar2, i2, i3);
            }
        }
        i4 |= 3072;
        qim0Var2 = qim0Var;
        if ((i2 & 24576) == 0) {
            if (x340Var3.f(j)) {
                i21 = 16384;
            } else {
                i21 = 8192;
            }
            i4 |= i21;
        }
        if ((196608 & i2) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            if (x340Var3.f(j2)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i4 |= i20;
        }
        i5 = 918552576 | i4;
        i6 = i3 & 1024;
        if (i6 != 0) {
            i7 = 24582;
        } else {
            if (x340Var3.h(z4)) {
                c = 4;
            } else {
                c = 2;
            }
            i7 = 24576 | c;
        }
        i8 = i7;
        i9 = i8 | 48;
        i10 = i3 & 4096;
        if (i10 != 0) {
            i11 = i8 | 432;
        } else {
            i11 = i9 | (x340Var3.i(function0) ? (char) 256 : (char) 128);
        }
        i12 = i3 & 8192;
        if (i12 != 0) {
            i13 = i11 | 3072;
        } else {
            i13 = i11 | (x340Var3.i(o8nVar) ? (char) 2048 : (char) 1024);
        }
        if ((i5 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (x340Var3.Y(i5 & 1, z5)) {
            x340Var3.d0();
            i14 = i2 & 1;
            o8nVar3 = o6x.a;
            qim0VarV = nim0.a;
            if (i14 != 0) {
                if (i22 != 0) {
                    qim0Var2 = qim0VarV;
                }
                hw61 hw61VarD2 = er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12);
                i15 = i5 & (-458753);
                if (i6 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i10 != 0) {
                    objT = x340Var3.T();
                    if (objT == m4cVar) {
                        objT = lmm.a1;
                        x340Var3.s0(objT);
                    }
                    function2 = (Function0) objT;
                } else {
                    function2 = function0;
                }
                Function0 function8 = function2;
                qim0Var4 = qim0Var2;
                function3 = function8;
                hw61Var3 = hw61VarD2;
                if (i12 != 0) {
                    o8nVar4 = o8nVar3;
                    i16 = i15;
                    z11 = z10;
                    f3 = 640.0f;
                    z12 = true;
                    z13 = true;
                    z14 = true;
                } else {
                    i16 = i15;
                    z11 = z10;
                    f3 = 640.0f;
                    z12 = true;
                    z13 = true;
                    z14 = true;
                    o8nVar4 = o8nVar;
                }
            } else {
                if (i22 != 0) {
                    qim0Var2 = qim0VarV;
                }
                hw61 hw61VarD3 = er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12);
                i15 = i5 & (-458753);
                if (i6 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i10 != 0) {
                    objT = x340Var3.T();
                    if (objT == m4cVar) {
                        objT = lmm.a1;
                        x340Var3.s0(objT);
                    }
                    function2 = (Function0) objT;
                } else {
                    function2 = function0;
                }
                Function0 function9 = function2;
                qim0Var4 = qim0Var2;
                function3 = function9;
                hw61Var3 = hw61VarD3;
                if (i12 != 0) {
                    o8nVar4 = o8nVar3;
                    i16 = i15;
                    z11 = z10;
                    f3 = 640.0f;
                    z12 = true;
                    z13 = true;
                    z14 = true;
                } else {
                    i16 = i15;
                    z11 = z10;
                    f3 = 640.0f;
                    z12 = true;
                    z13 = true;
                    z14 = true;
                    o8nVar4 = o8nVar;
                }
            }
            x340Var3.s();
            objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o8nVar3, x340Var3);
                x340Var3.s0(objT2);
            }
            c9nVar = (c9n) objT2;
            ven0VarS = v8r.s(iu30Var, x340Var3);
            ven0VarS2 = v8r.s(function3, x340Var3);
            f4 = f3;
            view = (View) x340Var3.k(AndroidCompositionLocals_androidKt.f);
            watVar = (wat) x340Var3.k(t4k.h);
            function4 = function3;
            upoVar3.d.setValue(Integer.valueOf(i));
            WeakHashMap weakHashMap3 = osl1.x;
            upoVar3.e.setValue(Integer.valueOf(lhc.g(x340Var3).e.e().d));
            fX0 = watVar.X0(800.0f);
            zI = x340Var3.i(upoVar3);
            objT3 = x340Var3.T();
            lnmVar = null;
            if (zI) {
                objT3 = new sv1(upoVar3, lnmVar, (byte) 1);
                x340Var3.s0(objT3);
            } else {
                objT3 = new sv1(upoVar3, lnmVar, (byte) 1);
                x340Var3.s0(objT3);
            }
            qxd0.t(upoVar3, x340Var3, (vu30) objT3);
            if (z13) {
                x340Var3.i0(-2005077741);
                if (upoVar3.c() != wy71.c) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if ((i13 & 896) == 256) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean zI9 = z22 | x340Var3.i(c9nVar) | x340Var3.i(o8nVar4) | x340Var3.i(upoVar3);
                if ((i16 & 896) == 256) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                z24 = z23 | zI9;
                objT12 = x340Var3.T();
                if (z24) {
                    o8n o8nVar16 = o8nVar4;
                    objT12 = new mpo(function4, c9nVar, o8nVar16, upoVar, iu30Var, (byte) 0);
                    o8nVar5 = o8nVar16;
                    x340Var3.s0(objT12);
                } else {
                    o8n o8nVar17 = o8nVar4;
                    objT12 = new mpo(function4, c9nVar, o8nVar17, upoVar, iu30Var, (byte) 0);
                    o8nVar5 = o8nVar17;
                    x340Var3.s0(objT12);
                }
                function4 = function4;
                z15 = false;
                q3p1.b(0, 0, (Function0) objT12, x340Var3, z21);
                x340Var3.r(false);
            } else {
                o8nVar5 = o8nVar4;
                z15 = false;
                x340Var3.i0(-2004863438);
                x340Var3.r(false);
            }
            qim0 qim0VarD5 = u291.d(qim0Var4, 1.0f);
            graVar = een.d;
            qim0Var3 = qim0Var4;
            gfh0VarC = t1c.c(graVar, z15);
            o8nVar6 = o8nVar5;
            iHashCode = Long.hashCode(x340Var3.T);
            xos0VarM = x340Var3.m();
            qim0VarE = zr7.E(x340Var3, qim0VarD5);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            z16 = x340Var3.S;
            n4kVar = hmb0.t1;
            if (z16) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            vu30Var = y580.O0;
            nko1.H(gfh0VarC, x340Var3, vu30Var);
            llj lljVar5 = y580.N0;
            nko1.H(xos0VarM, x340Var3, lljVar5);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            i17 = i16;
            llj lljVar6 = y580.R0;
            nko1.H(numValueOf3, x340Var3, lljVar6);
            nko1.F(x340Var3);
            vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var3, vu30Var2);
            x340Var3.i0(-718308973);
            float fM2 = watVar.M0(lhc.g(x340Var3).f.e().b);
            x340Var3.r(false);
            qim0 qim0VarB3 = uyn1.B(too1.j(u291.d(qim0VarV, 1.0f), lhc.g(x340Var3).f), 0.0f, fM2, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC4 = t1c.c(graVar, false);
            i18 = i13;
            int iHashCode6 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM6 = x340Var3.m();
            qim0 qim0VarE6 = zr7.E(x340Var3, qim0VarB3);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC4, x340Var3, vu30Var);
            nko1.H(xos0VarM6, x340Var3, lljVar5);
            x0d.q(iHashCode6, x340Var3, lljVar6, x340Var3);
            nko1.H(qim0VarE6, x340Var3, vu30Var2);
            if (upoVar.d() == 0) {
                fO = 0.0f;
            } else {
                fO = 1.0f - yoi1.o(drr0Var.s() / upoVar.d(), 0.0f, 1.0f);
            }
            if (z4h1.b(j, u7h.k)) {
                x340Var3.i0(594640139);
                objT9 = x340Var3.T();
                if (objT9 == m4cVar) {
                    objT9 = ktd.n(x340Var3);
                }
                idn0Var = (idn0) objT9;
                qim0 qim0VarD6 = u291.d(qim0VarV, 1.0f);
                zD = x340Var3.d(fO);
                objT10 = x340Var3.T();
                if (zD) {
                    objT10 = new jc5((byte) 18, fO);
                    x340Var3.s0(objT10);
                } else {
                    objT10 = new jc5((byte) 18, fO);
                    x340Var3.s0(objT10);
                }
                qim0 qim0VarF5 = dug.f(i541.C(qim0VarD6, (iu30) objT10), j, d4o1.a);
                if (z12) {
                    x340Var3.i0(594920007);
                    if ((i18 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    o8nVar7 = o8nVar6;
                    boolean zI10 = z18 | x340Var3.i(c9nVar) | x340Var3.i(o8nVar7) | x340Var3.i(upoVar);
                    i19 = i17;
                    if ((i19 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = zI10 | z19;
                    objT11 = x340Var3.T();
                    if (z20) {
                        objT11 = new mpo(function4, c9nVar, o8nVar7, upoVar, iu30Var, (byte) 1);
                        upoVar2 = upoVar;
                        x340Var3.s0(objT11);
                    } else {
                        objT11 = new mpo(function4, c9nVar, o8nVar7, upoVar, iu30Var, (byte) 1);
                        upoVar2 = upoVar;
                        x340Var3.s0(objT11);
                    }
                    qim0Var5 = qim0VarV;
                    qim0VarV = bin.v(qim0Var5, idn0Var, null, false, null, null, (Function0) objT11, 28);
                    r5 = 0;
                    x340Var3.r(false);
                } else {
                    upoVar2 = upoVar;
                    function4 = function4;
                    o8nVar7 = o8nVar6;
                    qim0Var5 = qim0VarV;
                    i19 = i17;
                    r5 = 0;
                    x340Var3.i0(595264696);
                    x340Var3.r(false);
                }
                t1c.a(qim0VarF5.then(qim0VarV), x340Var3, (int) r5);
                x340Var3.r((boolean) r5);
            } else {
                upoVar2 = upoVar;
                function4 = function4;
                o8nVar7 = o8nVar6;
                qim0Var5 = qim0VarV;
                i19 = i17;
                x340Var3.i0(595342630);
                x340Var3.r(false);
            }
            zI2 = x340Var3.i(upoVar2);
            objT4 = x340Var3.T();
            if (zI2) {
                objT4 = new npo(upoVar2, (byte) 2);
                x340Var3.s0(objT4);
            } else {
                objT4 = new npo(upoVar2, (byte) 2);
                x340Var3.s0(objT4);
            }
            r6v r6vVarC3 = k6v.c((iu30) objT4, x340Var3);
            f5 = fX0;
            zG = x340Var3.g(upoVar2) | x340Var3.d(f5) | x340Var3.g(o8nVar7);
            objT5 = x340Var3.T();
            if (zG) {
                hnf hnfVar4 = new hnf(ven0VarS, (byte) 18);
                vu30Var3 = vu30Var;
                o8n o8nVar18 = o8nVar7;
                vu30Var4 = vu30Var2;
                c9nVar2 = c9nVar;
                x340Var2 = x340Var3;
                f6 = 1.0f;
                rpo rpoVar4 = new rpo(new l811(), upoVar, new l811(), c9nVar2, o8nVar18, f5, new hnf(ven0VarS2, (byte) 19), hnfVar4);
                upoVar2 = upoVar;
                f5 = f5;
                o8nVar7 = o8nVar18;
                x340Var2.s0(rpoVar4);
                objT5 = rpoVar4;
            } else {
                hnf hnfVar5 = new hnf(ven0VarS, (byte) 18);
                vu30Var3 = vu30Var;
                o8n o8nVar19 = o8nVar7;
                vu30Var4 = vu30Var2;
                c9nVar2 = c9nVar;
                x340Var2 = x340Var3;
                f6 = 1.0f;
                rpo rpoVar5 = new rpo(new l811(), upoVar, new l811(), c9nVar2, o8nVar19, f5, new hnf(ven0VarS2, (byte) 19), hnfVar5);
                upoVar2 = upoVar;
                f5 = f5;
                o8nVar7 = o8nVar19;
                x340Var2.s0(rpoVar5);
                objT5 = rpoVar5;
            }
            d6o0Var = (d6o0) objT5;
            gra graVar4 = een.X;
            h2c h2cVar3 = h2c.a;
            qim0 qim0VarC7 = u291.c(u291.f(u291.x(0.0f, f4, 1, h2cVar3.a(qim0Var5, graVar4)), f6), f6);
            zI3 = x340Var2.i(upoVar2);
            objT6 = x340Var2.T();
            if (zI3) {
                objT6 = new npo(upoVar2, (byte) 0);
                x340Var2.s0(objT6);
            } else {
                objT6 = new npo(upoVar2, (byte) 0);
                x340Var2.s0(objT6);
            }
            qim0 qim0VarC8 = i541.C(qim0VarC7, (iu30) objT6);
            zI4 = x340Var2.i(upoVar2);
            objT7 = x340Var2.T();
            if (zI4) {
                objT7 = new npo(upoVar2, (byte) 1);
                x340Var2.s0(objT7);
            } else {
                objT7 = new npo(upoVar2, (byte) 1);
                x340Var2.s0(objT7);
            }
            qim0 qim0VarF6 = dug.f(lrn1.u(qim0VarC8, (iu30) objT7), j2, hw61Var3);
            if (z11) {
                qim0VarL = bmq0.L(qim0Var5, d6o0Var, (g6o0) null);
            } else {
                qim0VarL = qim0Var5;
            }
            float f9 = f5;
            upo upoVar6 = upoVar2;
            Function0 function10 = function4;
            o8n o8nVar110 = o8nVar7;
            upoVar3 = upoVar6;
            qim0 qim0VarX3 = ern1.x(k6v.b(qim0VarF6.then(qim0VarL), r6vVarC3, qqq0.a, false, (idn0) null, false, new xx0(upoVar2, (lnm) null, (byte) 3), new ppo(c9nVar2, o8nVar110, upoVar6, f9, function10, iu30Var, null), false, 156), new y0o(upoVar3, view, (byte) 5));
            mbh mbhVarA3 = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode7 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM7 = x340Var2.m();
            qim0 qim0VarE7 = zr7.E(x340Var2, qim0VarX3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA3, x340Var2, vu30Var3);
            nko1.H(xos0VarM7, x340Var2, lljVar5);
            x0d.q(iHashCode7, x340Var2, lljVar6, x340Var2);
            nko1.H(qim0VarE7, x340Var2, vu30Var4);
            if (z14) {
                x340Var2.i0(-1873966098);
                z17 = false;
                i(0, 0L, x340Var2, null);
                x340Var2.r(false);
            } else {
                z17 = false;
                x340Var2.i0(-1873933424);
                x340Var2.r(false);
            }
            j2iVar2 = j2iVar;
            j2iVar2.invoke(pbh.a, x340Var2, 54);
            x340Var2.r(true);
            x340Var2.r(true);
            if (upoVar3.d() > 0) {
                z17 = true;
            }
            qim0 qim0VarA3 = h2cVar3.a(qim0Var5, graVar4);
            zH = x340Var2.h(z17);
            objT8 = x340Var2.T();
            if (zH) {
                objT8 = new gy((byte) 17, z17);
                x340Var2.s0(objT8);
            } else {
                objT8 = new gy((byte) 17, z17);
                x340Var2.s0(objT8);
            }
            qim0 qim0VarC9 = i541.C(qim0VarA3, (iu30) objT8);
            j3 = j2;
            e((i19 >> 18) & 14, j3, x340Var2, qim0VarC9);
            x340Var2.r(true);
            function1 = function10;
            o8nVar2 = o8nVar110;
            hw61Var2 = hw61Var3;
            x340Var = x340Var2;
            f2 = f4;
            z6 = z12;
            z7 = z13;
            z9 = z14;
            z8 = z11;
        } else {
            j2iVar2 = j2iVar;
            j3 = j2;
            x340Var3.b0();
            z6 = z;
            z7 = z2;
            z8 = z4;
            f2 = f;
            function1 = function0;
            o8nVar2 = o8nVar;
            qim0Var3 = qim0Var2;
            x340Var = x340Var3;
            hw61Var2 = hw61Var;
            z9 = z3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new opo(upoVar3, i, iu30Var, qim0Var3, j, hw61Var2, j3, z6, z7, z9, z8, f2, function1, o8nVar2, j2iVar2, i2, i3);
        }
    }

    public static final void o(rze1 rze1Var, Function0 function0, phc1 phc1Var, phc1 phc1Var2, qim0 qim0Var, boolean z, hvf hvfVar, b0k b0kVar, int i) {
        int i2;
        bqg1 bqg1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-406243761);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(rze1Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(phc1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(phc1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g(hvfVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.g((Object) null) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            bqg1 bqg1Var2 = nim0.a;
            if (function0 != null) {
                ci31 ci31VarA = ai31.a(nvf.a / 2.0f, 4, false);
                pm31 pm31Var = new pm31(1);
                if (ci31VarA != null) {
                    bqg1Var = new bqg1(rze1Var, (idn0) null, ci31VarA, z, pm31Var, function0);
                } else {
                    bqg1Var = ci31VarA == null ? new bqg1(rze1Var, (idn0) null, (ga80) null, z, pm31Var, function0) : zr7.i(bqg1Var2, new fhg((ga80) ci31VarA, rze1Var, z, pm31Var, function0));
                }
            } else {
                bqg1Var = bqg1Var2;
            }
            if (function0 != null) {
                vq60 vq60Var = jw80.a;
                bqg1Var2 = tsj0.a;
            }
            int i4 = i3 << 6;
            g(z, rze1Var, uyn1.x(qim0Var.then(bqg1Var2).then(bqg1Var), 2.0f), hvfVar, phc1Var, phc1Var2, x340Var, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i4) | (i4 & 458752));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kvf(rze1Var, function0, phc1Var, phc1Var2, qim0Var, z, hvfVar, i);
        }
    }

    public static final dr31 p(FontWeight fontWeight, float f, int i, lee1 lee1Var) {
        return new dr31(f, new lee1(0L, fc11.G(i), fontWeight, r5b1.a(fontWeight.a, f, i), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), lee1.a(lee1Var, 0L, fc11.G(i), fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777209));
    }

    public static final Iterable q(Iterable iterable) {
        if (iterable instanceof b380) {
            if (!((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (!(((y570) it.next()) instanceof gd70)) {
                    }
                }
            }
            return iterable;
        }
        ArrayList<y570> arrayListO0 = o7h.o0(iterable);
        ArrayList arrayList = new ArrayList(q7h.U(arrayListO0, 10));
        for (y570 y570Var : arrayListO0) {
            gd70 gd70Var = gd70.c;
            arrayList.add(cyo1.p(y570Var));
        }
        return arrayList;
    }

    public static final b380 r(List list) {
        if (list != null && !list.isEmpty()) {
            b380 b380VarO = b380.o(q(list));
            b380VarO.getClass();
            return b380VarO;
        }
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        bg11Var.getClass();
        return bg11Var;
    }

    public static final String s(cr01 cr01Var) {
        String str = cr01Var.b;
        if (str.length() != 0) {
            return str;
        }
        String str2 = cr01Var.z;
        return str2 == null ? "" : str2;
    }

    public static final boolean t(long j, long j2) {
        return j == j2;
    }

    public static final dr31 u(uyx uyxVar, float f, int i) {
        uwr uwrVar = cbx.a;
        return p((FontWeight) ((bjx) ajx.a.c).e, f, i, uyxVar.a);
    }

    public static final mih1 v(b0k b0kVar) {
        u85 u85VarE = cev0.E(b0kVar);
        WeakHashMap weakHashMap = osl1.x;
        return new mih1(u85VarE, lhc.g(b0kVar).b);
    }

    public static final boolean w(String str) {
        if (eyo1.t(str) || eyo1.o(str) || eyo1.n(str) || eyo1.u(str) || eyo1.q(str)) {
            return true;
        }
        Set set = s4b1.f;
        return uic.h(str, new blc0[]{blc0.ti, blc0.ui}) || uic.g(str, blc0.C8);
    }

    public static final String x(zuc0 zuc0Var) {
        String str;
        jo70 jo70VarA = zuc0Var.q.a(jo70.class);
        if (jo70VarA != null && (str = jo70VarA.a) != null) {
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return zuc0Var.i;
    }

    public static final go80 y(klm klmVar, sbp0 sbp0Var, sbp0 sbp0Var2, sbp0 sbp0Var3, sbp0 sbp0Var4, sap0 sap0Var, sbp0 sbp0Var5, sbp0 sbp0Var6, sbp0 sbp0Var7, sbp0 sbp0Var8) {
        return klmVar.a("EngageRecommendationsClusterDaemon", new ang(sbp0Var, sbp0Var2, sbp0Var3, sbp0Var4, sap0Var, sbp0Var5, sbp0Var6, sbp0Var7, sbp0Var8, (byte) 6));
    }

    public static final boolean z(HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2) {
        if (hubsImmutableComponentBundle == hubsImmutableComponentBundle2) {
            return true;
        }
        if (hubsImmutableComponentBundle.s().isEmpty()) {
            return hubsImmutableComponentBundle2 == null || hubsImmutableComponentBundle2.s().isEmpty();
        }
        return false;
    }
}
