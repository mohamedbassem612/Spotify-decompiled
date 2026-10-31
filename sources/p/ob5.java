package p;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ob5 implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ car c;

    public /* synthetic */ ob5(car carVar, l811 l811Var, byte b) {
        this.a = b;
        this.c = carVar;
        this.b = l811Var;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        byte b = this.a;
        l811 l811Var = this.b;
        trb1 trb1Var = this.c;
        switch (b) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                dqq0 dqq0Var = ((rb5) trb1Var).b;
                long jT = fc11.t(width, height, dqq0Var.b, dqq0Var.c, (k291) kto1.v(dqq0Var, cz70.b));
                int i = (int) (jT >> 32);
                int i2 = (int) (jT & 4294967295L);
                if (width > 0 && height > 0 && (width != i || height != i2)) {
                    double dU = fc11.u(width, height, i, i2, ((rb5) trb1Var).b.c);
                    boolean z = dU < 1.0d;
                    l811Var.a = z;
                    if (z || ((rb5) trb1Var).b.d == 1) {
                        imageDecoder.setTargetSize(jch0.S(((double) width) * dU), jch0.S(dU * ((double) height)));
                    }
                }
                dqq0 dqq0Var2 = ((rb5) trb1Var).b;
                imageDecoder.setAllocator(fpi1.x(dz70.a(dqq0Var2)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) kto1.v(dqq0Var2, dz70.g)).booleanValue() ? 1 : 0);
                jc10 jc10Var = dz70.c;
                if (q58.d(kto1.v(dqq0Var2, jc10Var)) != null) {
                    imageDecoder.setTargetColorSpace(q58.d(kto1.v(dqq0Var2, jc10Var)));
                }
                if (kto1.v(dqq0Var2, vpb1.b) != null) {
                    bhn0.d();
                } else {
                    imageDecoder.setPostProcessor(null);
                }
                break;
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                dqq0 dqq0Var3 = trb1Var.c;
                long jT2 = fc11.t(width2, height2, dqq0Var3.b, dqq0Var3.c, (k291) kto1.v(dqq0Var3, cz70.b));
                int i3 = (int) (jT2 >> 32);
                int i4 = (int) (jT2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i3 || height2 != i4)) {
                    double dU2 = fc11.u(width2, height2, i3, i4, trb1Var.c.c);
                    boolean z2 = dU2 < 1.0d;
                    l811Var.a = z2;
                    if (z2 || trb1Var.c.d == 1) {
                        imageDecoder.setTargetSize(jch0.S(((double) width2) * dU2), jch0.S(dU2 * ((double) height2)));
                    }
                }
                imageDecoder.setOnPartialImageListener(new qrb1());
                dqq0 dqq0Var4 = trb1Var.c;
                imageDecoder.setAllocator(fpi1.x(dz70.a(dqq0Var4)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) kto1.v(dqq0Var4, dz70.g)).booleanValue() ? 1 : 0);
                jc10 jc10Var2 = dz70.c;
                if (q58.d(kto1.v(dqq0Var4, jc10Var2)) != null) {
                    imageDecoder.setTargetColorSpace(q58.d(kto1.v(dqq0Var4, jc10Var2)));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) kto1.v(dqq0Var4, dz70.d)).booleanValue());
                break;
        }
    }
}
