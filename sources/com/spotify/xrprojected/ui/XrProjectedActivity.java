package com.spotify.xrprojected.ui;

import android.os.Bundle;
import java.util.Map;
import kotlin.Metadata;
import p.b0k;
import p.c4m1;
import p.eth;
import p.f95;
import p.fkj0;
import p.gbm1;
import p.gon0;
import p.gw70;
import p.h0i;
import p.h311;
import p.i8h1;
import p.imm1;
import p.ipb1;
import p.iu30;
import p.j2i;
import p.jhc1;
import p.kkm1;
import p.klm1;
import p.l6h1;
import p.lnm;
import p.m4c;
import p.mmm1;
import p.mzn0;
import p.omm1;
import p.otw;
import p.qeh1;
import p.qim0;
import p.qmm1;
import p.qxd0;
import p.s7p0;
import p.smm1;
import p.t3b1;
import p.tl3;
import p.u7p0;
import p.u890;
import p.umf0;
import p.vu30;
import p.wpb1;
import p.x340;
import p.xm41;
import p.xw0;
import p.yon1;
import p.yqg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/xrprojected/ui/XrProjectedActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_xrprojected_ui-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class XrProjectedActivity extends t3b1 {
    public static final /* synthetic */ int p1 = 0;
    public imm1 f1;
    public u7p0 g1;
    public umf0 h1;
    public gw70 i1;
    public yqg j1;
    public klm1 k1;
    public xm41 l1;
    public f95 m1;
    public i8h1 n1;
    public l6h1 o1;

    public final void o0(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2040660375);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            s7p0 s7p0Var = new s7p0();
            String name = u7p0.class.getName();
            u7p0 u7p0Var = this.g1;
            if (u7p0Var == null) {
                u890.C("npvAudioOnlyPageElement");
                throw null;
            }
            ipb1 ipb1VarC = wpb1.C(name, u7p0Var, s7p0Var, x340Var, 0, 8);
            u7p0 u7p0Var2 = this.g1;
            if (u7p0Var2 == null) {
                u890.C("npvAudioOnlyPageElement");
                throw null;
            }
            otw.c(u7p0Var2, s7p0Var, (qim0) null, ipb1VarC, x340Var, 0, 4);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mmm1(this, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f95 f95Var = this.m1;
        if (f95Var == null) {
            u890.C("xrGlassesProperties");
            throw null;
        }
        if (f95Var.b()) {
            f95 f95Var2 = this.m1;
            if (f95Var2 == null) {
                u890.C("xrGlassesProperties");
                throw null;
            }
            if (f95Var2.c()) {
                xm41 xm41Var = this.l1;
                if (xm41Var == null) {
                    u890.C("sessionScope");
                    throw null;
                }
                smm1 smm1Var = (smm1) eth.z(xm41Var, gbm1.R0);
                qmm1 qmm1Var = smm1Var instanceof qmm1 ? (qmm1) smm1Var : null;
                h0i.a(this, new j2i(1692271857, new omm1(this, qmm1Var != null ? qmm1Var.b : false, (byte) 3), true));
                return;
            }
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1435300617);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gon0 gon0VarQ4 = yon1.Q4(new mzn0[0], x340Var);
            klm1 klm1Var = this.k1;
            if (klm1Var == null) {
                u890.C("navigatorProvider");
                throw null;
            }
            klm1Var.a = new qeh1(gon0VarQ4, (byte) 14);
            String stringExtra = getIntent().getStringExtra("extra_start_destination");
            boolean zG = x340Var.g(stringExtra) | x340Var.i(gon0VarQ4);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new xw0(stringExtra, gon0VarQ4, (lnm) null, (byte) 17);
                x340Var.s0(objT);
            }
            qxd0.t(stringExtra, x340Var, (vu30) objT);
            kkm1 kkm1Var = kkm1.INSTANCE;
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new c4m1(this, (byte) 10);
                x340Var.s0(objT2);
            }
            jhc1.i(gon0VarQ4, kkm1Var, (qim0) null, (tl3) null, (Map) null, (iu30) null, (iu30) null, (iu30) null, (iu30) null, (iu30) objT2, x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mmm1(this, i, (byte) 1);
        }
    }
}
