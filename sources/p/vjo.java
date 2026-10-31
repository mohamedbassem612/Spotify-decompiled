package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class vjo {
    public static final pk1 a = new pk1(qk1.b, false, null, null, null, 30);

    public static final void a(sjo sjoVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1141293429);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(sjoVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = sjoVar.ordinal();
            if (iOrdinal != 0) {
                nim0 nim0Var = nim0.a;
                if (iOrdinal == 1) {
                    x340Var.i0(-1566317889);
                    boolean z = (i2 & 112) == 32;
                    Object objT = x340Var.T();
                    if (z || objT == m4cVar) {
                        objT = new qzn(iu30Var, (byte) 9);
                        x340Var.s0(objT);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT);
                    qim0 qim0VarN = anm1.N("curation_row_action", nim0Var);
                    float fM = dsa0.m(x340Var, 2131166882);
                    float fM2 = dsa0.m(x340Var, 2131166881);
                    gdx gdxVarR = yla.r(x340Var);
                    boolean zD = x340Var.d(fM) | x340Var.d(fM2) | x340Var.g(gdxVarR);
                    Object objT2 = x340Var.T();
                    if (zD || objT2 == m4cVar) {
                        objT2 = gdx.b(gdxVarR, (zzq0) null, fM2, fM, fM - (2.0f * fM2), 49);
                        x340Var.s0(objT2);
                    }
                    h7p1.a(a, gbxVar, qim0VarN, (max) null, (gdx) objT2, x340Var, 384, 8);
                    x340Var.r(false);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw p3d1.k(x340Var, -1566319073, false);
                    }
                    x340Var.i0(-1566278033);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1310843882);
                    String strO0 = cwl1.o0(x340Var, 2131956548);
                    float fM3 = dsa0.m(x340Var, 2131166882);
                    gdx gdxVarS = yla.s(x340Var);
                    boolean zD2 = x340Var.d(fM3) | x340Var.g(gdxVarS);
                    Object objT3 = x340Var.T();
                    if (zD2 || objT3 == m4cVar) {
                        objT3 = gdx.b(gdxVarS, (zzq0) null, 0.0f, fM3, 0.0f, 59);
                        x340Var.s0(objT3);
                    }
                    gdx gdxVar = (gdx) objT3;
                    boolean z2 = (i2 & 112) == 32;
                    Object objT4 = x340Var.T();
                    if (z2 || objT4 == m4cVar) {
                        objT4 = new qzn(iu30Var, (byte) 10);
                        x340Var.s0(objT4);
                    }
                    Function0 function0 = (Function0) objT4;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    } else {
                        wro1.h(new gbx(new y50(strO0), function0), ldx.c, anm1.N("curation_row_action", nim0Var), (max) null, gdxVar, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-500813565, new i4o(gdxVar, (byte) 1), x340Var), x340Var, 432, 6, 984);
                        x340Var.r(false);
                    }
                }
            } else {
                x340Var.i0(-1566278033);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(sjoVar, iu30Var, i, (byte) 15);
        }
    }
}
