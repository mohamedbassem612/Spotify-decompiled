package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qid implements o1i {
    public final b9l1 a;
    public final q9l1 b;
    public final wdm c;
    public final m0t d;
    public final t75 e;
    public final uwm0 f;
    public final c2u0 g;
    public final boolean h;

    public qid(pe peVar, b9l1 b9l1Var, q9l1 q9l1Var, wdm wdmVar, q3c q3cVar, m0t m0tVar, t75 t75Var, uwm0 uwm0Var, c2u0 c2u0Var) {
        this.a = b9l1Var;
        this.b = q9l1Var;
        this.c = wdmVar;
        this.d = m0tVar;
        this.e = t75Var;
        this.f = uwm0Var;
        this.g = c2u0Var;
        this.h = peVar.b(4);
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        return new x0i(new w0i(o0iVar.e, "canvas_content", ((oid) z0iVar).a, null, 8));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(oid oidVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        Object ny7Var;
        int i3;
        ven0 ven0Var;
        boolean z;
        m4c m4cVar = fkj0.X;
        String str = oidVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1127850982);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(oidVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            int i5 = i4 & 14;
            boolean z2 = i5 == 4;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = v8r.q(UUID.randomUUID().toString());
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var3 = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new cy7(ven0Var3, (byte) 14);
                x340Var.s0(objT3);
            }
            t75 t75Var = this.e;
            xzn1.a(oidVar, (iu30) objT3, qim0Var2, t75Var.e(), x340Var, i5 | 48 | (i4 & 896));
            boolean zG = x340Var.g(ven0Var2) | x340Var.i(this);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new ztb(this, ven0Var2, (byte) 12);
                x340Var.s0(objT4);
            }
            int i6 = i4 & 112;
            oto1.c(oidVar, o0iVar, (iu30) objT4, x340Var, i5 | 64 | i6);
            boolean z3 = i5 == 4;
            Object objT5 = x340Var.T();
            if (z3 || objT5 == m4cVar) {
                i3 = i4;
                ven0Var = ven0Var2;
                z = false;
                ny7Var = new ny7(oidVar.c, str, oidVar.g, oidVar.e, oidVar.f ? 5 : null, null, 96);
                x340Var.s0(ny7Var);
            } else {
                i3 = i4;
                ven0Var = ven0Var2;
                ny7Var = objT5;
                z = false;
            }
            ny7 ny7Var2 = (ny7) ny7Var;
            boolean zG2 = x340Var.g(ven0Var);
            Object objT6 = x340Var.T();
            if (zG2 || objT6 == m4cVar) {
                objT6 = new bp9(ven0Var, (byte) 11);
                x340Var.s0(objT6);
            }
            boolean z4 = z;
            ven0 ven0Var4 = ven0Var;
            sto1.a(this.c, o0iVar, ny7Var2, (Function0) objT6, x340Var, i6 | 64, 0);
            if (this.h) {
                x340Var.i0(-278223311);
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ven0Var3.getValue();
                clj1 clj1Var = oidVar.b;
                boolean z5 = !t75Var.d();
                boolean zG3 = x340Var.g(ven0Var4);
                Object objT7 = x340Var.T();
                if (zG3 || objT7 == m4cVar) {
                    objT7 = new bp9(ven0Var4, (byte) 12);
                    x340Var.s0(objT7);
                }
                Function0 function0 = (Function0) objT7;
                uwm0 uwm0Var = this.f;
                boolean zI = x340Var.i(uwm0Var);
                Object objT8 = x340Var.T();
                if (zI || objT8 == m4cVar) {
                    objT8 = new qka(1, uwm0Var, uwm0.class, "interactionLoggingResult", "interactionLoggingResult(Ljava/lang/String;)Lcom/spotify/ubi/logger/InteractionLoggingResult;", 0, (byte) 16);
                    x340Var.s0(objT8);
                }
                vby0.g(this.a, this.b, this.d, videoSurfaceView, o0iVar, clj1Var, z5, function0, (iu30) objT8, this.g, str, x340Var, 32768 | ((i3 << 9) & 57344));
                x340Var = x340Var;
                x340Var.r(z4);
            } else {
                x340Var.i0(-277678424);
                x340Var.r(z4);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, oidVar, o0iVar, qim0Var, (byte) 13);
        }
    }
}
