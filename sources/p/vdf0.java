package p;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vdf0 implements yjh0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public vdf0(MediaCodec mediaCodec, vdf0 vdf0Var) {
        this.a = (byte) 1;
        this.b = mediaCodec;
        this.c = vdf0Var;
        if (Build.VERSION.SDK_INT < 35 || vdf0Var == null) {
            return;
        }
        vdf0Var.f(mediaCodec);
    }

    public void a(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public void b(long j, int i, int i2, int i3) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void c(int i, oco ocoVar, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, ocoVar.i, j, i2);
    }

    public void d(lkh0 lkh0Var, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new kj7(this, lkh0Var, (byte) 1), handler);
    }

    public MediaFormat e() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    public void f(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            dm5.y(((HashSet) this.b).add(mediaCodec));
        }
    }

    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    public void g() {
        ((MediaCodec) this.b).detachOutputSurface();
    }

    public ByteBuffer i(int i) {
        return ((MediaCodec) this.b).getInputBuffer(i);
    }

    public void j(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    public void k(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    public void l(int i) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, false);
    }

    public boolean m() {
        return false;
    }

    public void o(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    public int p() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0L);
    }

    public int q(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    public void r(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void release() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((HashSet) obj).clear();
                LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
                if (loudnessCodecController != null) {
                    loudnessCodecController.close();
                    return;
                }
                return;
            default:
                vdf0 vdf0Var = (vdf0) this.c;
                MediaCodec mediaCodec = (MediaCodec) obj;
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30 && i < 33) {
                        mediaCodec.stop();
                        break;
                    }
                    return;
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && vdf0Var != null) {
                        vdf0Var.r(mediaCodec);
                    }
                    mediaCodec.release();
                }
        }
    }

    public ByteBuffer s(int i) {
        return ((MediaCodec) this.b).getOutputBuffer(i);
    }

    public void t(ArrayList arrayList) {
        ((MediaCodec) this.b).subscribeToVendorParameters(arrayList);
    }

    public void u(ArrayList arrayList) {
        ((MediaCodec) this.b).unsubscribeFromVendorParameters(arrayList);
    }

    public void v(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, l5u.a, new udf0());
        this.c = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public vdf0() {
        this.a = (byte) 0;
        this.b = new HashSet();
    }
}
