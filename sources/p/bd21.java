package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bd21 extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ float X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ rkb Z;
    public Bitmap a;
    public float b;
    public int c;
    public int d;
    public int e;
    public byte f;
    public final /* synthetic */ be50 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd21(float f, float f2, float f3, long j, rkb rkbVar, lnm lnmVar, be50 be50Var, ven0 ven0Var, ven0 ven0Var2) {
        super(2, lnmVar);
        this.g = be50Var;
        this.h = f;
        this.i = j;
        this.t = f2;
        this.X = f3;
        this.Y = ven0Var;
        this.Z = rkbVar;
        this.N0 = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new bd21(this.h, this.t, this.X, this.i, this.Z, lnmVar, this.g, this.Y, this.N0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01d1 A[Catch: Exception -> 0x022a, TryCatch #0 {Exception -> 0x022a, blocks: (B:62:0x01cd, B:64:0x01d1, B:66:0x01d6, B:68:0x01dc, B:70:0x01ec, B:72:0x01f0, B:74:0x01fc, B:75:0x01ff, B:36:0x00e1, B:39:0x00ff, B:41:0x0105, B:42:0x0108, B:44:0x0119, B:46:0x0125, B:48:0x014f, B:49:0x0152, B:57:0x019e, B:58:0x01a1, B:52:0x016a, B:54:0x0170, B:55:0x0172), top: B:79:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec A[Catch: Exception -> 0x022a, TryCatch #0 {Exception -> 0x022a, blocks: (B:62:0x01cd, B:64:0x01d1, B:66:0x01d6, B:68:0x01dc, B:70:0x01ec, B:72:0x01f0, B:74:0x01fc, B:75:0x01ff, B:36:0x00e1, B:39:0x00ff, B:41:0x0105, B:42:0x0108, B:44:0x0119, B:46:0x0125, B:48:0x014f, B:49:0x0152, B:57:0x019e, B:58:0x01a1, B:52:0x016a, B:54:0x0170, B:55:0x0172), top: B:79:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01fc A[Catch: Exception -> 0x022a, TryCatch #0 {Exception -> 0x022a, blocks: (B:62:0x01cd, B:64:0x01d1, B:66:0x01d6, B:68:0x01dc, B:70:0x01ec, B:72:0x01f0, B:74:0x01fc, B:75:0x01ff, B:36:0x00e1, B:39:0x00ff, B:41:0x0105, B:42:0x0108, B:44:0x0119, B:46:0x0125, B:48:0x014f, B:49:0x0152, B:57:0x019e, B:58:0x01a1, B:52:0x016a, B:54:0x0170, B:55:0x0172), top: B:79:0x00e1 }] */
    public final Object invokeSuspend(Object obj) {
        Object objI;
        Bitmap bitmapCopy;
        long j;
        char c;
        long j2;
        int iP;
        rih1 rih1Var;
        float f;
        float f2;
        int iU;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap;
        Object objY;
        int i;
        Bitmap bitmap2;
        Bitmap bitmapJ;
        Bitmap bitmapCreateBitmap2;
        ven0 ven0Var = this.Y;
        float f3 = this.h;
        byte b = this.f;
        rih1 rih1Var2 = rih1.a;
        long j3 = this.i;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                be50 be50Var = this.g;
                this.f = (byte) 1;
                objI = be50Var.i(this);
                if (objI == d9nVar) {
                }
                return d9nVar;
            }
            if (b == 1) {
                hm5.M(obj);
                objI = obj;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iU = this.e;
                f2 = this.b;
                int i2 = this.d;
                i = this.c;
                bitmap = this.a;
                hm5.M(obj);
                rih1Var = rih1Var2;
                c = ' ';
                j2 = j3;
                j = 4294967295L;
                iP = i2;
                objY = obj;
            }
            bitmap2 = (Bitmap) objY;
            if (bitmap != bitmap2) {
                bitmap.recycle();
            }
            if (iU > 0 && bitmap2.getHeight() > iU) {
                bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap2, 0, iU, bitmap2.getWidth(), bitmap2.getHeight() - iU);
                if (bitmapCreateBitmap2 != bitmap2) {
                    bitmap2.recycle();
                }
                bitmap2 = bitmapCreateBitmap2;
            }
            bitmap2.getClass();
            bitmapJ = i8p1.j(bitmap2, this.X * f2);
            if (bitmapJ != bitmap2) {
                bitmap2.recycle();
            }
            ven0 ven0Var2 = this.N0;
            float fIntBitsToFloat = i + Float.intBitsToFloat((int) (j2 >> c));
            ven0Var2.setValue(new tkb(bitmapJ, (((long) Float.floatToRawIntBits(iP + Float.intBitsToFloat((int) (j2 & j)))) & j) | (Float.floatToRawIntBits(fIntBitsToFloat) << c), f2));
            return rih1Var;
            Bitmap bitmapM = no80.m((yk4) objI);
            if (bitmapM.getWidth() > 0 && bitmapM.getHeight() > 0) {
                if (Build.VERSION.SDK_INT < 26 || bitmapM.getConfig() != eg.k()) {
                    bitmapCopy = bitmapM;
                } else {
                    bitmapCopy = bitmapM.copy(Bitmap.Config.ARGB_8888, false);
                    if (bitmapCopy == null) {
                    }
                }
                float f4 = f3 * 2.0f;
                j = 4294967295L;
                int iP2 = yoi1.p(jch0.U((-Float.intBitsToFloat((int) (j3 >> 32))) - f4), 0, bitmapCopy.getWidth() - 1);
                c = ' ';
                j2 = j3;
                iP = yoi1.p(jch0.U(-Float.intBitsToFloat((int) (j2 & 4294967295L))), 0, bitmapCopy.getHeight() - 1);
                int iMin = Math.min(jch0.U((2.0f * f4) + Float.intBitsToFloat((int) (((Size) ven0Var.getValue()).a >> 32))), bitmapCopy.getWidth() - iP2);
                if (iMin < 1) {
                    iMin = 1;
                }
                rih1Var = rih1Var2;
                try {
                    int iMin2 = Math.min(jch0.U(Float.intBitsToFloat((int) (((Size) ven0Var.getValue()).a & 4294967295L)) + this.t + f4), bitmapCopy.getHeight() - iP);
                    if (iMin2 < 1) {
                        iMin2 = 1;
                    }
                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCopy, iP2, iP, iMin, iMin2);
                    if (bitmapCopy != bitmapM) {
                        bitmapCopy.recycle();
                    }
                    m811 m811Var = new m811();
                    float f5 = f3 * 0.3f;
                    m811Var.a = f5;
                    if (f5 > 25.0f) {
                        f2 = (25.0f / f5) * 0.3f;
                        m811Var.a = 25.0f;
                        f = 25.0f;
                    } else {
                        f = f5;
                        f2 = 0.3f;
                    }
                    m811Var.a = yoi1.o(f, 1.0f, 25.0f);
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap3, Math.max(1, jch0.U(bitmapCreateBitmap3.getWidth() * f2)), Math.max(1, jch0.U(bitmapCreateBitmap3.getHeight() * f2)), true);
                    if (bitmapCreateScaledBitmap != bitmapCreateBitmap3) {
                        bitmapCreateBitmap3.recycle();
                    }
                    iU = jch0.U(m811Var.a * ((float) Math.sqrt(3.0d)) * 3.0f);
                    if (iU <= 0) {
                        bitmapCreateBitmap = bitmapCreateScaledBitmap;
                    } else {
                        Bitmap.Config config = bitmapCreateScaledBitmap.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight() + iU, config);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.save();
                        float f6 = iU;
                        canvas.translate(0.0f, f6);
                        canvas.scale(1.0f, -1.0f);
                        canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, f6, (Paint) null);
                    }
                    if (bitmapCreateBitmap != bitmapCreateScaledBitmap) {
                        bitmapCreateScaledBitmap.recycle();
                    }
                    fns fnsVar = igu.a;
                    Bitmap bitmap3 = bitmapCreateBitmap;
                    i3y0 i3y0Var = new i3y0(this.Z, bitmap3, m811Var, (lnm) null, (byte) 14);
                    bitmap = bitmap3;
                    this.a = bitmap;
                    this.c = iP2;
                    this.d = iP;
                    this.b = f2;
                    this.e = iU;
                    this.f = (byte) 2;
                    objY = fn31.Y(fnsVar, i3y0Var, this);
                    if (objY != d9nVar) {
                        i = iP2;
                        bitmap2 = (Bitmap) objY;
                        if (bitmap != bitmap2) {
                            bitmap.recycle();
                        }
                        if (iU > 0) {
                            bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap2, 0, iU, bitmap2.getWidth(), bitmap2.getHeight() - iU);
                            if (bitmapCreateBitmap2 != bitmap2) {
                                bitmap2.recycle();
                            }
                            bitmap2 = bitmapCreateBitmap2;
                        }
                        bitmap2.getClass();
                        bitmapJ = i8p1.j(bitmap2, this.X * f2);
                        if (bitmapJ != bitmap2) {
                            bitmap2.recycle();
                        }
                        ven0 ven0Var3 = this.N0;
                        float fIntBitsToFloat2 = i + Float.intBitsToFloat((int) (j2 >> c));
                        ven0Var3.setValue(new tkb(bitmapJ, (((long) Float.floatToRawIntBits(iP + Float.intBitsToFloat((int) (j2 & j)))) & j) | (Float.floatToRawIntBits(fIntBitsToFloat2) << c), f2));
                        return rih1Var;
                    }
                    return d9nVar;
                } catch (Exception unused) {
                    return rih1Var;
                }
            }
        } catch (Exception unused2) {
        }
        return rih1Var2;
    }
}
