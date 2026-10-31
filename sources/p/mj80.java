package p;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mj80 {
    public volatile Bitmap a;
    public volatile ByteBuffer b;
    public volatile ssk1 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public mj80(ByteBuffer byteBuffer, int i, int i2, int i3) {
        zod.s(byteBuffer);
        this.b = byteBuffer;
        zod.j("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
        byteBuffer.rewind();
        this.d = i;
        this.e = i2;
        f(i3);
        this.f = i3;
        this.g = 17;
    }

    public static void f(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        zod.j("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    public static void g(int i, int i2, long j, int i3, int i4, int i5, int i6) throws Throwable {
        bwo1 bwo1Var;
        llo1 llo1Var;
        hfp1 hfp1Var;
        long jElapsedRealtime;
        HashMap map;
        xjo1 xjo1Var;
        sko1 sko1Var;
        String strA;
        synchronized (two1.class) {
            kvo1 kvo1Var = new kvo1();
            synchronized (two1.class) {
                try {
                    owo1 owo1Var = two1.a;
                    if (owo1Var == null) {
                        owo1Var = new owo1((byte) 0);
                        two1.a = owo1Var;
                    }
                    bwo1Var = (bwo1) owo1Var.L0(kvo1Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
            llo1Var = llo1.INPUT_IMAGE_CONSTRUCTION;
            hfp1Var = bwo1Var.e;
            jElapsedRealtime = SystemClock.elapsedRealtime();
            map = bwo1Var.i;
            if (map.get(llo1Var) != null && jElapsedRealtime - ((Long) map.get(llo1Var)).longValue() <= 30000) {
                return;
            }
            map.put(llo1Var, Long.valueOf(jElapsedRealtime));
            mxa1 mxa1Var = new mxa1((byte) 14);
            if (i != -1) {
                xjo1Var = xjo1.BITMAP;
            } else if (i != 35) {
                xjo1Var = xjo1.YUV_420_888;
            } else if (i != 842094169) {
                xjo1Var = xjo1.YV12;
            } else if (i != 16) {
                xjo1Var = xjo1.NV16;
            } else if (i != 17) {
                xjo1Var = xjo1.UNKNOWN_FORMAT;
            } else {
                xjo1Var = xjo1.NV21;
            }
            mxa1Var.c = xjo1Var;
            if (i2 != 1) {
                sko1Var = sko1.BITMAP;
            } else if (i2 != 2) {
                sko1Var = sko1.BYTEARRAY;
            } else if (i2 != 3) {
                sko1Var = sko1.BYTEBUFFER;
            } else if (i2 != 4) {
                sko1Var = sko1.ANDROID_MEDIA_IMAGE;
            } else {
                sko1Var = sko1.FILEPATH;
            }
            mxa1Var.d = sko1Var;
            mxa1Var.e = Integer.valueOf(i5 & Integer.MAX_VALUE);
            mxa1Var.g = Integer.valueOf(i3 & Integer.MAX_VALUE);
            mxa1Var.f = Integer.valueOf(i4 & Integer.MAX_VALUE);
            mxa1Var.b = Long.valueOf(jElapsedRealtime2 & Long.MAX_VALUE);
            mxa1Var.h = Integer.valueOf(i6 & Integer.MAX_VALUE);
            wko1 wko1Var = new wko1(mxa1Var);
            fqn1 fqn1Var = new fqn1((byte) 6);
            fqn1Var.d = wko1Var;
            zxl1 zxl1Var = new zxl1(fqn1Var);
            if (hfp1Var.j()) {
                strA = (String) hfp1Var.g();
            } else {
                strA = a8c0.c.a(bwo1Var.g);
            }
            lqn1.a(1, new sl21(bwo1Var, zxl1Var, strA));
        }
        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - j;
        llo1Var = llo1.INPUT_IMAGE_CONSTRUCTION;
        hfp1Var = bwo1Var.e;
        jElapsedRealtime = SystemClock.elapsedRealtime();
        map = bwo1Var.i;
        if (map.get(llo1Var) != null) {
            return;
        }
        map.put(llo1Var, Long.valueOf(jElapsedRealtime));
        mxa1 mxa1Var2 = new mxa1((byte) 14);
        if (i != -1) {
            xjo1Var = xjo1.BITMAP;
        } else if (i != 35) {
            xjo1Var = xjo1.YUV_420_888;
        } else if (i != 842094169) {
            xjo1Var = xjo1.YV12;
        } else if (i != 16) {
            xjo1Var = xjo1.NV16;
        } else if (i != 17) {
            xjo1Var = xjo1.UNKNOWN_FORMAT;
        } else {
            xjo1Var = xjo1.NV21;
        }
        mxa1Var2.c = xjo1Var;
        if (i2 != 1) {
            sko1Var = sko1.BITMAP;
        } else if (i2 != 2) {
            sko1Var = sko1.BYTEARRAY;
        } else if (i2 != 3) {
            sko1Var = sko1.BYTEBUFFER;
        } else if (i2 != 4) {
            sko1Var = sko1.ANDROID_MEDIA_IMAGE;
        } else {
            sko1Var = sko1.FILEPATH;
        }
        mxa1Var2.d = sko1Var;
        mxa1Var2.e = Integer.valueOf(i5 & Integer.MAX_VALUE);
        mxa1Var2.g = Integer.valueOf(i3 & Integer.MAX_VALUE);
        mxa1Var2.f = Integer.valueOf(i4 & Integer.MAX_VALUE);
        mxa1Var2.b = Long.valueOf(jElapsedRealtime3 & Long.MAX_VALUE);
        mxa1Var2.h = Integer.valueOf(i6 & Integer.MAX_VALUE);
        wko1 wko1Var2 = new wko1(mxa1Var2);
        fqn1 fqn1Var2 = new fqn1((byte) 6);
        fqn1Var2.d = wko1Var2;
        zxl1 zxl1Var2 = new zxl1(fqn1Var2);
        if (hfp1Var.j()) {
            strA = (String) hfp1Var.g();
        } else {
            strA = a8c0.c.a(bwo1Var.g);
        }
        lqn1.a(1, new sl21(bwo1Var, zxl1Var2, strA));
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.e;
    }

    public final Image.Plane[] c() {
        if (this.c == null) {
            return null;
        }
        return ((Image) this.c.a).getPlanes();
    }

    public final int d() {
        return this.f;
    }

    public final int e() {
        return this.d;
    }

    public mj80(Image image, int i, int i2, int i3) {
        this.c = new ssk1(image);
        this.d = i;
        this.e = i2;
        f(i3);
        this.f = i3;
        this.g = 35;
    }

    public mj80(Bitmap bitmap) {
        zod.s(bitmap);
        this.a = bitmap;
        this.d = bitmap.getWidth();
        this.e = bitmap.getHeight();
        f(0);
        this.f = 0;
        this.g = -1;
    }
}
