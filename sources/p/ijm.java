package p;

import androidx.compose.ui.text.font.FontFamily;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ijm {
    public static final mdm a;

    static {
        kiv kivVar = sy4.a;
        long j = u7h.f;
        long j2 = u7h.b;
        a = new mdm(j, j2, j2, u7h.b(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14));
    }

    public static final void a(mdm mdmVar, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-527864079);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mdmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fra fraVar = ajm.a;
            qim0 qim0VarH = l6o1.H(uyn1.z(0.0f, ajm.d, 1, sgc1.H(2, dug.f(sto1.o(qim0Var, 3.0f, er31.b(4.0f), false, 0L, 0L, 28), mdmVar.a, d4o1.a))), l6o1.C(0, 0, 1, x340Var), false, 14);
            int i3 = (i2 << 3) & 7168;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            j2iVar.invoke(pbh.a, x340Var, Integer.valueOf(((i3 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | 6));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05((Object) mdmVar, (Object) qim0Var, (cv30) j2iVar, i, (byte) 3);
        }
    }

    public static final void b(qim0 qim0Var, mdm mdmVar, final iu30 iu30Var, b0k b0kVar, final int i, final int i2) {
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (x340Var.g(mdmVar) ? 32 : 16);
        }
        int i7 = i4 | (x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused);
        byte b = 0;
        if (x340Var.Y(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            if (i6 != 0) {
                mdmVar = a;
            }
            a(mdmVar, qim0Var, apo.r(-250345048, new gjm(iu30Var, mdmVar, b), x340Var), x340Var, ((i7 << 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i7 >> 3) & 14) | 384);
        } else {
            x340Var.b0();
        }
        final qim0 qim0Var2 = qim0Var;
        final mdm mdmVar2 = mdmVar;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30(qim0Var2, mdmVar2, iu30Var, i, i2) { // from class: p.hjm
                public final /* synthetic */ qim0 a;
                public final /* synthetic */ mdm b;
                public final /* synthetic */ iu30 c;
                public final /* synthetic */ byte d;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.d = i2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(1);
                    ijm.b(this.a, this.b, this.c, (b0k) obj, iP, this.d);
                    return rih1.a;
                }
            };
        }
    }

    public static final void c(String str, boolean z, mdm mdmVar, qim0 qim0Var, xu30 xu30Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2001167027);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(mdmVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(xu30Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(function0) ? 131072 : 65536;
        }
        int i3 = i2;
        boolean z2 = false;
        if (x340Var2.Y(i3 & 1, (74899 & i3) != 74898)) {
            fra fraVar = ajm.a;
            float f = ajm.c;
            d36 d36Var = new d36(f, true, new um5(z2));
            boolean z3 = ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 458752) == 131072);
            Object objT = x340Var2.T();
            if (z3 || objT == fkj0.X) {
                objT = new jea(z, function0, (byte) 2);
                x340Var2.s0(objT);
            }
            qim0 qim0VarZ = uyn1.z(f, 0.0f, 2, u291.t(u291.f(bin.x(qim0Var, z, str, (pm31) null, (idn0) null, (Function0) objT, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f));
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var2, 54);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z4 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            if (xu30Var == null) {
                x340Var2.i0(-1597947094);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1597947093);
                float f2 = ajm.e;
                qim0 qim0VarO = u291.o(nim0.a, f2, 0.0f, f2, f2, 2);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarO);
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
                xu30Var.invoke(new u7h(z ? mdmVar.c : mdmVar.e), x340Var2, 0);
                x340Var2.r(true);
                x340Var2.r(false);
            }
            long j = z ? mdmVar.b : mdmVar.d;
            jch0.c(str, new wnb0(1.0f, true), new lee1(j, ajm.h, ajm.i, (FontFamily) null, ajm.k, 0L, ajm.b, 0, ajm.j, (shc0) null, 0, 16613240), (iu30) null, 0, false, 1, 0, (x9h) null, (m0e1) null, x340Var2, (i3 & 14) | 1572864, 952);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ifa(str, z, mdmVar, qim0Var, xu30Var, function0, i);
        }
    }
}
