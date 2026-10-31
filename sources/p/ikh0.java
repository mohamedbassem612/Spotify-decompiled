package p;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.exoplayer.video.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ikh0 implements v1k1 {
    public final /* synthetic */ b b;

    public ikh0(b bVar) {
        this.b = bVar;
    }

    @Override // p.v1k1
    public final void a() {
        b bVar = this.b;
        Surface surface = bVar.C2;
        if (surface != null) {
            bih1 bih1Var = bVar.j2;
            Handler handler = (Handler) bih1Var.b;
            if (handler != null) {
                handler.post(new xdh(bih1Var, surface, SystemClock.elapsedRealtime(), (byte) 4));
            }
            bVar.F2 = true;
        }
    }

    @Override // p.v1k1
    public final void c(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        ie30 ie30Var = videoSink$VideoSinkException.a;
        b bVar = this.b;
        bVar.V1 = bVar.c(videoSink$VideoSinkException, ie30Var, false, 7001);
    }

    @Override // p.v1k1
    public final void d() {
        b bVar = this.b;
        if (bVar.C2 != null) {
            bVar.j1(0, 1);
        }
    }

    @Override // p.v1k1
    public final void e() {
        zo00 zo00Var = this.b.i1;
        if (zo00Var != null) {
            zo00Var.a();
        }
    }

    @Override // p.v1k1
    public final void b(z1k1 z1k1Var) {
    }
}
