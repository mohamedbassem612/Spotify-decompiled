package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iij1 implements o1i {
    public final b9l1 a;
    public final tcl1 b;
    public final fal1 c;
    public final m0t d;
    public final q9l1 e;
    public final cce f;
    public final t75 g;
    public final uwm0 h;
    public final c2u0 i;

    public iij1(b9l1 b9l1Var, tcl1 tcl1Var, fal1 fal1Var, m0t m0tVar, q9l1 q9l1Var, cce cceVar, t75 t75Var, uwm0 uwm0Var, c2u0 c2u0Var) {
        this.a = b9l1Var;
        this.b = tcl1Var;
        this.c = fal1Var;
        this.d = m0tVar;
        this.e = q9l1Var;
        this.f = cceVar;
        this.g = t75Var;
        this.h = uwm0Var;
        this.i = c2u0Var;
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        return new x0i(new w0i(o0iVar.e, "video_content", ((gij1) z0iVar).a, null, 8));
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108  */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(gij1 gij1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1017240154);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(gij1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new xaj1(this, (byte) 11);
                x340Var.s0(objT3);
            }
            iu30 iu30Var = (iu30) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = new i2g1(ven0Var2, (byte) 9);
                x340Var.s0(objT4);
            }
            l6m l6mVar = (l6m) ven0Var.getValue();
            t75 t75Var = this.g;
            int i5 = i3 << 12;
            z1p1.h(gij1Var, iu30Var, (iu30) objT4, this.f, o0iVar, l6mVar, qim0Var, t75Var.e(), x340Var, i4 | 33200 | ((i3 << 9) & 57344) | (i5 & 3670016));
            int iC = l1d.C(gij1Var.b.b);
            if (iC != 0) {
                if (iC != 1) {
                    eg.o();
                    return;
                } else if (t75Var.c()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (t75Var.d()) {
                z = false;
            } else {
                z = true;
            }
            if (((VideoSurfaceView) ven0Var2.getValue()) != null) {
                x340Var.i0(688840476);
                fp80 fp80VarB = o0iVar.e.b();
                Integer numValueOf = fp80VarB != null ? Integer.valueOf(fp80VarB.a) : null;
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ven0Var2.getValue();
                vm70 vm70Var = videoSurfaceView instanceof vm70 ? (vm70) videoSurfaceView : null;
                boolean zG = x340Var.g(ven0Var);
                Object objT5 = x340Var.T();
                if (zG || objT5 == m4cVar) {
                    objT5 = new xd2(ven0Var, (byte) 23);
                    x340Var.s0(objT5);
                }
                vu30 vu30Var = (vu30) objT5;
                boolean zI = x340Var.i(this) | x340Var.g(numValueOf);
                Object objT6 = x340Var.T();
                if (zI || objT6 == m4cVar) {
                    z2 = false;
                    objT6 = new hij1(this, numValueOf, (byte) 0);
                    x340Var.s0(objT6);
                } else {
                    z2 = false;
                }
                poz0.h(this.a, this.e, this.c, this.d, vm70Var, o0iVar, gij1Var, z, vu30Var, (iu30) objT6, this.i, x340Var, (i5 & 458752) | 262144 | ((i3 << 18) & 3670016));
                x340Var = x340Var;
                x340Var.r(z2);
            } else {
                x340Var.i0(689578524);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, gij1Var, o0iVar, qim0Var, (byte) 23);
        }
    }
}
