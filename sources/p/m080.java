package p;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m080 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ n080 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ dx70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m080(iu30 iu30Var, n080 n080Var, String str, dx70 dx70Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = iu30Var;
        this.c = n080Var;
        this.d = str;
        this.e = dx70Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        m080 m080Var = new m080(this.b, this.c, this.d, this.e, lnmVar);
        m080Var.a = obj;
        return m080Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        i080 m231Var;
        hm5.M(obj);
        iu30 iu30Var = this.b;
        n080 n080Var = this.c;
        String str = this.d;
        dx70 dx70Var = this.e;
        try {
            iu30Var.invoke(new Float(0.1f));
            Bitmap bitmapA = n080Var.a(str);
            if (Build.VERSION.SDK_INT >= 34) {
                bitmapA.setGainmap(null);
            }
            try {
                iu30Var.invoke(new Float(0.3f));
                String strConcat = dx70Var.a.concat(".jpg");
                File file = new File(strConcat);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                long jLongValue = dx70Var.b.longValue() - 51200;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i = 85;
                bitmapA.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                if (byteArrayOutputStream.size() > jLongValue) {
                    int i2 = 60;
                    int i3 = 95;
                    int i4 = 60;
                    while (i2 <= i3) {
                        int i5 = (i2 + i3) / 2;
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        bitmapA.compress(Bitmap.CompressFormat.JPEG, i5, byteArrayOutputStream2);
                        if (byteArrayOutputStream2.size() <= jLongValue) {
                            i2 = i5 + 5;
                            i4 = i5;
                        } else {
                            i3 = i5 - 5;
                        }
                        if (i3 - i2 < 5) {
                            break;
                        }
                    }
                    i = i4;
                }
                iu30Var.invoke(new Float(0.6f));
                n080.b(bitmapA, file, i);
                iu30Var.invoke(new Float(1.0f));
                m231Var = new i080(strConcat, bitmapA.getWidth(), bitmapA.getHeight());
            } finally {
                bitmapA.recycle();
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return new e331(m231Var);
    }
}
