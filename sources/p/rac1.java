package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rac1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qy7 b;
    public final /* synthetic */ xq81 c;
    public final /* synthetic */ r2a1 d;

    public /* synthetic */ rac1(qy7 qy7Var, xq81 xq81Var, r2a1 r2a1Var, byte b) {
        this.a = b;
        this.b = qy7Var;
        this.c = xq81Var;
        this.d = r2a1Var;
    }

    public final void run() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        r2a1 r2a1Var = this.d;
        xq81 xq81Var = this.c;
        z6m0 z6m0Var = this.b;
        switch (b) {
            case 0:
                zhq0 zhq0Var = z6m0Var.f;
                if (zhq0Var == null) {
                    u890.C("playCommandHandler");
                    throw null;
                }
                zhq0Var.o(jgt0.a);
                ((v6c1) xq81Var.b).a.onNext(new u6c1(1));
                ((i8h1) r2a1Var.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), ((h4l0) r2a1Var.c).b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            default:
                zhq0 zhq0Var2 = z6m0Var.f;
                if (zhq0Var2 == null) {
                    u890.C("playCommandHandler");
                    throw null;
                }
                zhq0Var2.o(qgt0.a);
                ((v6c1) xq81Var.b).a.onNext(new u6c1(2));
                ((i8h1) r2a1Var.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), ((h4l0) r2a1Var.c).b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
        }
    }
}
