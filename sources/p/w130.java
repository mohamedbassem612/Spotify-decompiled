package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class w130 {
    public static final bpb1 a = gio1.b(j1r.a);
    public static final String b = nik1.C1.a;

    public static final void a(v130 v130Var, me10 me10Var, ke10 ke10Var, float f, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        ke10 ke10Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(146193410);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar2.g(v130Var) : b0kVar2.i(v130Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(me10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            ke10Var2 = ke10Var;
            i2 |= b0kVar2.i(ke10Var2) ? 256 : 128;
        } else {
            ke10Var2 = ke10Var;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 16384 : 8192;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            int i3 = i2;
            qim0 qim0VarN = anm1.N("your_library_page_header_element_test_tag", uyn1.B(u291.f(nim0Var, 1.0f), 8.0f, f, 0.0f, 5.0f, 4));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            otw.c(me10Var, ke10Var2, kk0.q(b0kVar2, qim0VarE, y580.Y, 1.0f, true), (ipb1) null, b0kVar2, (i3 >> 3) & 126, 8);
            b0kVar2 = b0kVar2;
            gpx gpxVar = gpx.c;
            String strO0 = cwl1.o0(b0kVar2, 2131957306);
            int i4 = i3 & 57344;
            boolean z = i4 == 16384;
            Object objT = b0kVar2.T();
            if (z || objT == m4cVar) {
                objT = new y720(iu30Var, (byte) 17);
                b0kVar2.s0(objT);
            }
            b(gpx.d | 3072, strO0, (Function0) objT, b0kVar2, gpxVar, anm1.N("context_menu_button_test_tag", nim0Var));
            hrx hrxVar = hrx.c;
            String strO1 = cwl1.o0(b0kVar2, 2131957246);
            boolean z2 = i4 == 16384;
            Object objT2 = b0kVar2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new y720(iu30Var, (byte) 18);
                b0kVar2.s0(objT2);
            }
            b(hrx.d | 3072, strO1, (Function0) objT2, b0kVar2, hrxVar, anm1.N("create_button_test_tag", nim0Var));
            u130 u130Var = v130Var.c;
            if (u130Var instanceof t130) {
                b0kVar2.i0(-623000494);
                cob1 cob1Var = ((t130) u130Var).a;
                spx spxVar = cob1Var.b() ? spx.c : xpx.c;
                String strO2 = cwl1.o0(b0kVar2, cob1Var.b() ? 2131957250 : 2131957251);
                boolean z3 = i4 == 16384;
                Object objT3 = b0kVar2.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new y720(iu30Var, (byte) 19);
                    b0kVar2.s0(objT3);
                }
                b(3080, strO2, (Function0) objT3, b0kVar2, spxVar, anm1.N("play_button_test_tag", nim0Var));
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-622498852);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new z51(v130Var, me10Var, ke10Var, f, iu30Var, i);
        }
    }

    public static final void b(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2066087923);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ldx ldxVar = ldx.c;
            gdx gdxVarR = yla.r(b0kVar3);
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                wro1.h(new gbx(new y50(str), function0), ldxVar, qim0Var, (max) null, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-1415547548, new f90(huxVar, (byte) 12), b0kVar3), b0kVar2, ((i2 >> 3) & 896) | 48, 6, 984);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new glf(huxVar, str, function0, qim0Var, i, (byte) 2);
        }
    }
}
