package p;

import com.google.protobuf.Duration;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hc41 implements tyq {
    public final js20 X = z0o1.j(new ec41(this, (byte) 0), jh31.t, new ec41(this, (byte) 1), 4);
    public final ia00 Y = n3o1.q(this).a(vs31.i, vs31.t);
    public final psw Z;
    public final a931 a;
    public final kt91 b;
    public final ccc0 c;
    public final n9r0 d;
    public final Flowable e;
    public final w9u0 f;
    public final d0r g;
    public final njm h;
    public final n6r0 i;
    public final o3r t;

    public hc41(a931 a931Var, kt91 kt91Var, ccc0 ccc0Var, n9r0 n9r0Var, Flowable flowable, w9u0 w9u0Var, w8r0 w8r0Var, d0r d0rVar, njm njmVar, n6r0 n6r0Var) {
        this.a = a931Var;
        this.b = kt91Var;
        this.c = ccc0Var;
        this.d = n9r0Var;
        this.e = flowable;
        this.f = w9u0Var;
        this.g = d0rVar;
        this.h = njmVar;
        this.i = n6r0Var;
        this.t = hqn1.l(o641.Q0, o641.R0, w8r0Var.a());
        j2i j2iVar = hej.b;
        ien0 ien0Var = qsw.a;
        this.Z = new psw(j2iVar, (byte) 0);
    }

    public static ProgressPlaybackEsperanto.OnUpdateRequest f(bc41 bc41Var, n6r0 n6r0Var) {
        yhx0 yhx0VarN = ProgressPlaybackEsperanto.OnUpdateRequest.n();
        yhx0VarN.r(n6r0Var.path());
        yhx0VarN.w("page_match");
        yhx0VarN.q(bc41Var.b);
        ifv ifvVarQ = Duration.q();
        ifvVarQ.q(bc41Var.c / 1000);
        yhx0VarN.u(ifvVarQ);
        yhx0VarN.v(zhx0.t);
        return yhx0VarN.build();
    }

    public final rqw a() {
        return this.Y;
    }

    public final jsw c() {
        return this.Z;
    }

    public final d0r e() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, onm onmVar) {
        fc41 fc41Var;
        if (onmVar instanceof fc41) {
            fc41Var = (fc41) onmVar;
            int i = fc41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fc41Var.d = i - Integer.MIN_VALUE;
            } else {
                fc41Var = new fc41(this, onmVar);
            }
        } else {
            fc41Var = new fc41(this, onmVar);
        }
        Object objI = fc41Var.b;
        int i2 = fc41Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            vbm[] vbmVarArr = q601.a;
            kge kgeVar = new kge(this.e);
            fc41Var.a = str;
            fc41Var.d = 1;
            objI = b5p1.i(kgeVar, fc41Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = fc41Var.a;
        hm5.M(objI);
        if (u890.j(((PlayerState) objI).contextUri(), str)) {
            Single singleA = this.f.a(new p9u0());
            fc41Var.a = null;
            fc41Var.d = 2;
            if (fc11.j(singleA, fc41Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    public final mqw getBehavior() {
        return this.X;
    }

    public final f4r getData() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(bc41 bc41Var, n6r0 n6r0Var, onm onmVar) {
        gc41 gc41Var;
        if (onmVar instanceof gc41) {
            gc41Var = (gc41) onmVar;
            int i = gc41Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gc41Var.c = i - Integer.MIN_VALUE;
            } else {
                gc41Var = new gc41(this, onmVar);
            }
        } else {
            gc41Var = new gc41(this, onmVar);
        }
        Object obj = gc41Var.a;
        int i2 = gc41Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                a931 a931Var = this.a;
                ProgressPlaybackEsperanto.OnUpdateRequest onUpdateRequestF = f(bc41Var, n6r0Var);
                gc41Var.c = 1;
                Object objA = a931Var.a(onUpdateRequestF, gc41Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        } catch (Exception e) {
            return new m231(e);
        }
    }
}
