package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class av91 implements mxh0 {
    public final qna1 a;
    public final j2e0 b;
    public final r8l c;
    public final g8q d;

    public av91(qna1 qna1Var, j2e0 j2e0Var, r8l r8lVar, g8q g8qVar) {
        this.a = qna1Var;
        this.b = j2e0Var;
        this.c = r8lVar;
        this.d = g8qVar;
    }

    public final lxh0 a(x610 x610Var, PlayOrigin playOrigin) {
        return new b13(this.d.b(x610Var, playOrigin, 1), this.a, this.b, this.c, (s610) x610Var.a.b.get(), gr81.X);
    }
}
