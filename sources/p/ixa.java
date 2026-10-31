package p;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ixa implements l120 {
    public final /* synthetic */ byte a;
    public final dqq0 b;
    public final Object c;

    public /* synthetic */ ixa(Object obj, dqq0 dqq0Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = dqq0Var;
    }

    public final Object a(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        dqq0 dqq0Var = this.b;
        switch (b) {
            case 0:
                return new ss70(x2p1.h(new BitmapDrawable(dqq0Var.a.getResources(), (Bitmap) obj)), false, 2);
            case 1:
                nac nacVar = new nac();
                byte[] bArr = (byte[]) obj;
                nacVar.write(bArr, 0, bArr.length);
                return new oka1(jhc1.g(nacVar, dqq0Var.f), (String) null, 2);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new oka1(new qka1(new ff01(new pgc(byteBuffer)), dqq0Var.f, new qgc(byteBuffer)), (String) null, 2);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = aqi1.a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof zti1);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(dqq0Var.a.getResources(), zno1.e(bitmapDrawable, dz70.a(dqq0Var), dqq0Var.b, dqq0Var.c, dqq0Var.d == 2));
                }
                return new ss70(x2p1.h(bitmapDrawable), z, 2);
        }
    }
}
