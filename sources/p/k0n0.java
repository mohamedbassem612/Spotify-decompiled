package p;

import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k0n0 implements po70 {
    public final j0n0 a;

    public k0n0(j0n0 j0n0Var) {
        this.a = j0n0Var;
    }

    @Override // p.po70
    public final void a(MusicAppLock musicAppLock) {
        dt71 dt71Var = this.a.a;
        if (musicAppLock.equals(yzm0.a)) {
            dt71Var.a(new afn(false));
            return;
        }
        if (musicAppLock.equals(wzm0.a)) {
            dt71Var.a(new rfn(false));
            return;
        }
        if (musicAppLock.equals(xzm0.a)) {
            dt71Var.a(new ggn(false));
        } else if (musicAppLock.equals(lzm0.a)) {
            dt71Var.a(new qen(false));
        } else if (musicAppLock.equals(kzm0.a)) {
            dt71Var.a(new men(false));
        }
    }

    @Override // p.po70
    public final void d(MusicAppLock musicAppLock) {
        dt71 dt71Var = this.a.a;
        if (musicAppLock.equals(yzm0.a)) {
            dt71Var.a(new afn(true));
            return;
        }
        if (musicAppLock.equals(wzm0.a)) {
            dt71Var.a(new rfn(true));
            return;
        }
        if (musicAppLock.equals(xzm0.a)) {
            dt71Var.a(new ggn(true));
        } else if (musicAppLock.equals(lzm0.a)) {
            dt71Var.a(new qen(true));
        } else if (musicAppLock.equals(kzm0.a)) {
            dt71Var.a(new men(true));
        }
    }
}
