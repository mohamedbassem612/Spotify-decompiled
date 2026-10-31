package p;

import android.opengl.EGLDisplay;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ace implements qoj1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ace(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.qoj1
    public final void run() throws GlUtil.GlException {
        boolean z = true;
        byte b = 0;
        switch (this.a) {
            case 0:
                ((rs40) ((cce) this.b).b).f((ss40) this.c);
                return;
            case 1:
                ((azs) this.b).b((zys) this.c, true);
                return;
            case 2:
                sa10 sa10Var = (sa10) this.b;
                if (((dos) this.c) != sa10Var.f) {
                    return;
                }
                sa10Var.N0++;
                sa10Var.R();
                return;
            case 3:
                cg20 cg20Var = (cg20) this.b;
                o3d1 o3d1Var = (o3d1) this.c;
                if (cg20Var.o == null && !Objects.equals(cg20Var.z, o3d1Var)) {
                    o3d1 o3d1Var2 = cg20Var.z;
                    if (o3d1Var2 != null && (o3d1Var == null || !o3d1Var2.a.equals(o3d1Var.a))) {
                        Executor executor = cg20Var.i;
                        EGLDisplay eGLDisplay = cg20Var.d;
                        if (cg20Var.B != null) {
                            try {
                                try {
                                    try {
                                        dos dosVar = cg20Var.s;
                                        if (dosVar != null) {
                                            dosVar.release();
                                            cg20Var.s = null;
                                        }
                                        fn31.I(eGLDisplay, cg20Var.e, cg20Var.f, 1, 1);
                                        fn31.H(eGLDisplay, cg20Var.B);
                                    } catch (GlUtil.GlException e) {
                                        executor.execute(new e0i((Object) cg20Var, (Object) e, (byte) 29));
                                    }
                                } catch (VideoFrameProcessingException e2) {
                                    executor.execute(new ag20(cg20Var, e2, b));
                                }
                                cg20Var.B = null;
                            } catch (Throwable th) {
                                cg20Var.B = null;
                                throw th;
                            }
                        }
                        break;
                    }
                    o3d1 o3d1Var3 = cg20Var.z;
                    if (o3d1Var3 != null && o3d1Var != null && o3d1Var3.b == o3d1Var.b && o3d1Var3.c == o3d1Var.c && o3d1Var3.d == o3d1Var.d) {
                        z = false;
                    }
                    cg20Var.y = z;
                    cg20Var.z = o3d1Var;
                    return;
                }
                return;
            case 4:
                o0g1 o0g1Var = (o0g1) this.b;
                ype1 ype1Var = (ype1) this.c;
                ((rs40) o0g1Var.d).g((ks40) o0g1Var.c, ype1Var.a, ype1Var.b);
                return;
            case 5:
                lzd1 lzd1Var = (lzd1) this.b;
                ss40 ss40Var = (ss40) this.c;
                hym0 hym0Var = lzd1Var.f;
                hym0Var.getClass();
                int i = ss40Var.a;
                fn31.F();
                mym0 mym0Var = hym0Var.a;
                SparseArray sparseArray = mym0Var.j;
                String str = zoi1.a;
                dm5.y(sparseArray.indexOfKey(i) >= 0);
                lym0 lym0Var = (lym0) sparseArray.get(i);
                lym0Var.a.e(lym0Var.b);
                sparseArray.remove(i);
                mym0Var.p();
                return;
            default:
                roj1 roj1Var = (roj1) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                synchronized (roj1Var.e) {
                    roj1Var.g = false;
                    break;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
