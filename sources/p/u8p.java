package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.contribution.repositoryimpl.a;
import com.spotify.contribution.repositoryimpl.f;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u8p {
    public final vi2 a;
    public final jly0 b = xqu.b(new j7p(this, (byte) 8));

    public u8p(vi2 vi2Var) {
        this.a = vi2Var;
    }

    public final f a() {
        return new f(new a((cqm) ((RetrofitMaker) this.a.f.get()).createWebgateService(cqm.class, "android-contribution-repositoryimpl")), c());
    }

    public final w60 b() {
        vi2 vi2Var = this.a;
        vbo0 vbo0Var = (qpm) eth.z((xm41) vi2Var.d.get(), afm.d1);
        if (vbo0Var == null) {
            vbo0Var = vbo0.a;
        }
        l2r o67Var = new o67(a());
        l2r gvmVar = new gvm((q8n) vi2Var.b.get(), (q8n) vi2Var.c.get(), a(), c());
        l2r l2rVar = (gqm) eth.z((xm41) vi2Var.d.get(), afm.e1);
        if (l2rVar == null) {
            l2rVar = wbo0.a;
        }
        return new w60(new w1k(new l2r[]{vbo0Var, o67Var, gvmVar, l2rVar}), p7h.M(new l20[]{new l20(u2m.Y, new k2(new vd2(a(), (lnm) null, (byte) 9), (lnm) null, (byte) 3)), new l20(u2m.O0, new k2(new vd2(a(), (lnm) null, (byte) 10), (lnm) null, (byte) 3))}), (gnq0) vi2Var.e.get());
    }

    public final urm c() {
        vrm vrmVar = (vrm) eth.z((xm41) this.a.d.get(), xj.e1);
        return vrmVar != null ? vrmVar : xbo0.a;
    }
}
