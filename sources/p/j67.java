package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j67 implements k120 {
    public final /* synthetic */ byte a;

    public final l120 a(Object obj, dqq0 dqq0Var, rf01 rf01Var) {
        switch (this.a) {
            case 0:
                j2i1 j2i1Var = (j2i1) obj;
                Bitmap.Config[] configArr = aqi1.a;
                if (u890.j(j2i1Var.c, "file") && u890.j(o7h.s0(jch0.z(j2i1Var)), "android_asset")) {
                    return new k67(j2i1Var, dqq0Var, (byte) 0);
                }
                return null;
            case 1:
                return new ixa((byte[]) obj, dqq0Var, (byte) 1);
            case 2:
                return new ixa((ByteBuffer) obj, dqq0Var, (byte) 2);
            case 3:
                j2i1 j2i1Var2 = (j2i1) obj;
                if (u890.j(j2i1Var2.c, "content")) {
                    return new mam(j2i1Var2, dqq0Var);
                }
                return null;
            case 4:
                j2i1 j2i1Var3 = (j2i1) obj;
                if (u890.j(j2i1Var3.c, "data")) {
                    return new k67(j2i1Var3, dqq0Var, (byte) 1);
                }
                return null;
            case 5:
                return new ixa((Drawable) obj, dqq0Var, (byte) 3);
            case 6:
                j2i1 j2i1Var4 = (j2i1) obj;
                String str = j2i1Var4.c;
                if ((str != null && !str.equals("file")) || j2i1Var4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = aqi1.a;
                if (u890.j(j2i1Var4.c, "file") && u890.j(o7h.s0(jch0.z(j2i1Var4)), "android_asset")) {
                    return null;
                }
                return new k67(j2i1Var4, dqq0Var, (byte) 2);
            case 7:
                j2i1 j2i1Var5 = (j2i1) obj;
                if (u890.j(j2i1Var5.c, "jar:file")) {
                    return new k67(j2i1Var5, dqq0Var, (byte) 3);
                }
                return null;
            default:
                j2i1 j2i1Var6 = (j2i1) obj;
                if (u890.j(j2i1Var6.c, "android.resource")) {
                    return new k67(j2i1Var6, dqq0Var, (byte) 4);
                }
                return null;
        }
    }
}
