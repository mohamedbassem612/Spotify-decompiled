package app.p000rive;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.j2h1;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class HardwareRenderBuffer$closer$1 extends hab0 implements Function0 {
    final /* synthetic */ HardwareRenderBuffer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareRenderBuffer$closer$1(HardwareRenderBuffer hardwareRenderBuffer) {
        super(0);
        this.this$0 = hardwareRenderBuffer;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m27invoke() throws Throwable {
        Bitmap[] bitmapArr;
        this.this$0.isClosedFlag = true;
        this.this$0.firstFrameLatch.countDown();
        try {
            this.this$0.frameSource.stop();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        Object obj = this.this$0.bitmapLock;
        HardwareRenderBuffer hardwareRenderBuffer = this.this$0;
        synchronized (obj) {
            try {
                Bitmap bitmap = hardwareRenderBuffer.pendingBitmap;
                Bitmap bitmap2 = hardwareRenderBuffer.currentBitmap;
                hardwareRenderBuffer.pendingBitmap = null;
                hardwareRenderBuffer.currentBitmap = null;
                bitmapArr = bitmap == bitmap2 ? new Bitmap[]{bitmap} : new Bitmap[]{bitmap, bitmap2};
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Bitmap bitmap3 : bitmapArr) {
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    bitmap3.recycle();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else if (th3 != th) {
                        j2h1.h(th, th3);
                    }
                }
            }
        }
        try {
            this.this$0.getSurface().close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            } else if (th4 != th) {
                j2h1.h(th, th4);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
        m27invoke();
        return rih1.a;
    }
}
