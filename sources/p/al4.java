package p;

import android.graphics.Matrix;
import android.media.Image;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class al4 implements zx70 {
    public final Image a;
    public final fl1[] b;
    public final b19 c;

    public al4(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new fl1[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new fl1(planes[i], (byte) 17);
            }
        } else {
            this.b = new fl1[0];
        }
        this.c = new b19(tod1.b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // p.zx70
    public final rt70 Q0() {
        return this.c;
    }

    @Override // p.zx70
    public final Image b() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // p.zx70
    public final int getFormat() {
        return this.a.getFormat();
    }

    @Override // p.zx70
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // p.zx70
    public final int getWidth() {
        return this.a.getWidth();
    }

    @Override // p.zx70
    public final fl1[] r0() {
        return this.b;
    }
}
