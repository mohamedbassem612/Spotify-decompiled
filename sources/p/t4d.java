package p;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t4d implements wc31 {
    public final /* synthetic */ byte b;
    public final wc31 c;

    public t4d(byte b, long j) {
        this.b = b;
        switch (b) {
            case 1:
                this.c = new kve1(j, new s4d(j));
                break;
            default:
                this.c = new t4d((byte) 1, j);
                break;
        }
    }

    @Override // p.wc31
    public final uc31 a(r4d r4dVar) {
        byte b = this.b;
        wc31 wc31Var = this.c;
        switch (b) {
            case 0:
                if (((kve1) ((t4d) wc31Var).c).a(r4dVar).b) {
                    return uc31.e;
                }
                Throwable th = r4dVar.c;
                if (th instanceof CameraValidator$CameraIdListIncorrectException) {
                    j2h1.p("CameraX");
                    if (((CameraValidator$CameraIdListIncorrectException) th).a > 0) {
                        return uc31.f;
                    }
                }
                return uc31.d;
            default:
                return ((kve1) wc31Var).a(r4dVar);
        }
    }

    @Override // p.wc31
    public final long b() {
        byte b = this.b;
        wc31 wc31Var = this.c;
        switch (b) {
            case 0:
                return ((kve1) ((t4d) wc31Var).c).b;
            default:
                return ((kve1) wc31Var).b;
        }
    }
}
