package p;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mj7 implements yjh0 {
    public final MediaCodec a;
    public final qj7 b;
    public final akh0 c;
    public final vdf0 d;
    public boolean e;
    public byte f = 0;

    public mj7(MediaCodec mediaCodec, HandlerThread handlerThread, akh0 akh0Var, vdf0 vdf0Var) {
        this.a = mediaCodec;
        this.b = new qj7(handlerThread);
        this.c = akh0Var;
        this.d = vdf0Var;
    }

    public static String f(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public final void a(Bundle bundle) {
        this.c.a(bundle);
    }

    public final void b(long j, int i, int i2, int i3) {
        this.c.b(j, i, i2, i3);
    }

    public final void c(int i, oco ocoVar, long j, int i2) {
        this.c.c(i, ocoVar, j, i2);
    }

    public final void d(lkh0 lkh0Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new kj7(this, lkh0Var, (byte) 0), handler);
    }

    public final MediaFormat e() {
        MediaFormat mediaFormat;
        qj7 qj7Var = this.b;
        synchronized (qj7Var.a) {
            try {
                mediaFormat = qj7Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void flush() {
        this.c.flush();
        this.a.flush();
        qj7 qj7Var = this.b;
        synchronized (qj7Var.a) {
            qj7Var.l++;
            Handler handler = qj7Var.c;
            String str = zoi1.a;
            handler.post(new fe(qj7Var, (byte) 6));
        }
        this.a.start();
    }

    public final void g() {
        this.a.detachOutputSurface();
    }

    public final boolean h(jpa0 jpa0Var) {
        qj7 qj7Var = this.b;
        synchronized (qj7Var.a) {
            qj7Var.o = jpa0Var;
        }
        return true;
    }

    public final ByteBuffer i(int i) {
        return this.a.getInputBuffer(i);
    }

    public final void j(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    public final void k(int i) {
        this.a.setVideoScalingMode(i);
    }

    public final void l(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    public final boolean m() {
        return false;
    }

    public final void n(Runnable runnable) {
        qj7 qj7Var = this.b;
        ny2 ny2Var = new ny2((Object) this, (Object) runnable, (byte) 10);
        synchronized (qj7Var.a) {
            qj7Var.b();
            ny2Var.run();
        }
    }

    public final void o(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    public final int p() {
        this.c.f();
        qj7 qj7Var = this.b;
        synchronized (qj7Var.a) {
            try {
                qj7Var.b();
                int i = -1;
                if (qj7Var.l > 0 || qj7Var.m) {
                    return -1;
                }
                y6b y6bVar = qj7Var.d;
                int i2 = y6bVar.a;
                int i3 = y6bVar.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = ((int[]) y6bVar.d)[i2];
                    y6bVar.a = (i2 + 1) & y6bVar.c;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int q(MediaCodec.BufferInfo bufferInfo) {
        this.c.f();
        qj7 qj7Var = this.b;
        synchronized (qj7Var.a) {
            try {
                qj7Var.b();
                if (qj7Var.l > 0 || qj7Var.m) {
                    return -1;
                }
                y6b y6bVar = qj7Var.e;
                int i = y6bVar.a;
                int i2 = y6bVar.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = ((int[]) y6bVar.d)[i];
                y6bVar.a = y6bVar.c & (i + 1);
                if (i3 >= 0) {
                    qj7Var.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) qj7Var.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    qj7Var.h = (MediaFormat) qj7Var.g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        vdf0 vdf0Var;
        qj7 qj7Var = this.b;
        HandlerThread handlerThread = qj7Var.b;
        dm5.y(qj7Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(qj7Var, handler);
        qj7Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (vdf0Var = this.d) != null) {
            vdf0Var.f(mediaCodec);
        }
        this.f = (byte) 1;
    }

    public final void release() {
        vdf0 vdf0Var;
        vdf0 vdf0Var2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                qj7 qj7Var = this.b;
                synchronized (qj7Var.a) {
                    qj7Var.m = true;
                    qj7Var.b.quit();
                    qj7Var.a();
                }
            }
            this.f = (byte) 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (vdf0Var2 = this.d) != null) {
                    vdf0Var2.r(this.a);
                }
                this.a.release();
                this.e = true;
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (vdf0Var = this.d) != null) {
                        vdf0Var.r(this.a);
                    }
                    this.a.release();
                    this.e = true;
                }
            }
            throw th;
        }
    }

    public final ByteBuffer s(int i) {
        return this.a.getOutputBuffer(i);
    }

    public final void t(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    public final void u(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }
}
