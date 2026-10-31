package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class inx0 implements syq {
    public final d0r a;
    public final qfv b;
    public final rey0 c;
    public final ia00 d;
    public final nsw e;
    public final iik0 f;

    public inx0(jly0 jly0Var, fnx0 fnx0Var, d0r d0rVar, o3r o3rVar, hbt hbtVar) {
        this.a = d0rVar;
        qfv qfvVarM0 = fdg1.m0(fnx0Var.a(d0rVar, o3rVar, hbtVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        this.b = qfvVarM0;
        this.c = ila0.D();
        this.d = don1.D(this);
        this.e = lnn1.q(this, jly0Var, qfvVarM0);
        this.f = new iik0(this, (byte) 11);
    }

    public final rqw a() {
        return this.d;
    }

    public final rsw c() {
        return this.e;
    }

    @Override // p.wul1
    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.c;
    }

    @Override // p.wul1
    public final f4r getData() {
        return this.f;
    }
}
