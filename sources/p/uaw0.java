package p;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uaw0 extends a8d1 implements vu30 {
    public s2t a;
    public Bitmap b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Uri e;
    public final /* synthetic */ k3i0 f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Uri h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uaw0(Uri uri, k3i0 k3i0Var, int i, Uri uri2, lnm lnmVar) {
        super(2, lnmVar);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        this.e = uri;
        this.f = k3i0Var;
        this.g = i;
        this.h = uri2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        uaw0 uaw0Var = new uaw0(this.e, this.f, this.g, this.h, lnmVar);
        uaw0Var.d = obj;
        return uaw0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        s2t s2tVarQ;
        Bitmap bitmap;
        Bitmap bitmap2;
        mmr0 mmr0Var;
        Object objC;
        c9n c9nVar = (c9n) this.d;
        byte b = this.c;
        k3i0 k3i0Var = this.f;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new taw0(k3i0Var, this.h, (lnm) null, (byte) 2), 3);
            Uri uri = this.e;
            s2tVarQ = uri != null ? fn31.q(c9nVar, (o8n) null, 0, new taw0(k3i0Var, uri, (lnm) null, (byte) 3), 3) : null;
            this.d = null;
            this.a = s2tVarQ;
            this.c = (byte) 1;
            obj = s2tVarQ2.Q(this);
            if (obj != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            s2tVarQ = this.a;
            hm5.M(obj);
        } else {
            if (b != 2) {
                if (b == 3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bitmap = this.b;
            hm5.M(obj);
        }
        bitmap2 = (Bitmap) obj;
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap2 == null) {
            mmr0Var = new mmr0(0, 0);
        } else {
            mmr0Var = new mmr0(0, Integer.valueOf((bitmap.getHeight() - bitmap.getWidth()) / 2));
        }
        Bitmap bitmapF = k3i0.f(Bitmap.createBitmap(bitmap, ((Number) mmr0Var.a).intValue(), ((Number) mmr0Var.b).intValue(), iMin, iMin), bitmap2, this.g);
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        zxa zxaVar = (zxa) k3i0Var.a;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = (byte) 3;
        objC = zxaVar.c(bitmapF, compressFormat, 80, this);
        if (objC == d9nVar) {
            return d9nVar;
        }
        return objC;
        Bitmap bitmap3 = (Bitmap) obj;
        if (s2tVarQ != null) {
            this.d = null;
            this.a = null;
            this.b = bitmap3;
            this.c = (byte) 2;
            Object objE = s2tVarQ.E(this);
            if (objE != d9nVar) {
                bitmap = bitmap3;
                obj = objE;
                bitmap2 = (Bitmap) obj;
                int iMin2 = Math.min(bitmap.getWidth(), bitmap.getHeight());
                if (bitmap2 == null) {
                    mmr0Var = new mmr0(0, 0);
                } else {
                    mmr0Var = new mmr0(0, Integer.valueOf((bitmap.getHeight() - bitmap.getWidth()) / 2));
                }
                Bitmap bitmapF2 = k3i0.f(Bitmap.createBitmap(bitmap, ((Number) mmr0Var.a).intValue(), ((Number) mmr0Var.b).intValue(), iMin2, iMin2), bitmap2, this.g);
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                zxa zxaVar2 = (zxa) k3i0Var.a;
                Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
                this.d = null;
                this.a = null;
                this.b = null;
                this.c = (byte) 3;
                objC = zxaVar2.c(bitmapF2, compressFormat2, 80, this);
                if (objC == d9nVar) {
                    return objC;
                }
            }
        } else {
            bitmap = bitmap3;
            bitmap2 = null;
            int iMin3 = Math.min(bitmap.getWidth(), bitmap.getHeight());
            if (bitmap2 == null) {
                mmr0Var = new mmr0(0, 0);
            } else {
                mmr0Var = new mmr0(0, Integer.valueOf((bitmap.getHeight() - bitmap.getWidth()) / 2));
            }
            Bitmap bitmapF3 = k3i0.f(Bitmap.createBitmap(bitmap, ((Number) mmr0Var.a).intValue(), ((Number) mmr0Var.b).intValue(), iMin3, iMin3), bitmap2, this.g);
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            zxa zxaVar3 = (zxa) k3i0Var.a;
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.JPEG;
            this.d = null;
            this.a = null;
            this.b = null;
            this.c = (byte) 3;
            objC = zxaVar3.c(bitmapF3, compressFormat3, 80, this);
            if (objC == d9nVar) {
                return objC;
            }
        }
        return d9nVar;
    }
}
