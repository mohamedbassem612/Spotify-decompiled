package p;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface yjh0 {
    void a(Bundle bundle);

    void b(long j, int i, int i2, int i3);

    void c(int i, oco ocoVar, long j, int i2);

    void d(lkh0 lkh0Var, Handler handler);

    MediaFormat e();

    void flush();

    void g();

    default boolean h(jpa0 jpa0Var) {
        return false;
    }

    ByteBuffer i(int i);

    void j(Surface surface);

    void k(int i);

    void l(int i);

    boolean m();

    default void n(Runnable runnable) {
        runnable.run();
    }

    void o(int i, long j);

    int p();

    int q(MediaCodec.BufferInfo bufferInfo);

    void release();

    ByteBuffer s(int i);

    void t(ArrayList arrayList);

    void u(ArrayList arrayList);
}
