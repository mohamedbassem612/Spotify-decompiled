package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.service.IapException;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h090 implements f080 {
    public final int a;
    public final pyp0 b;
    public final Uri c;
    public final ixg d;
    public boolean e;
    public final boolean f;
    public final /* synthetic */ i090 g;

    public h090(i090 i090Var, pyp0 pyp0Var, Uri uri, int i, int i2, int i3, boolean z) {
        this.g = i090Var;
        this.b = pyp0Var;
        this.c = uri;
        this.a = i;
        this.f = z;
        String string = UUID.randomUUID().toString();
        ixg ixgVarB = i090Var.b.b(uri);
        ixgVarB.p(i2, i3, 3);
        ixgVarB.r(string);
        this.d = ixgVarB;
    }

    public final void a() {
        if (this.f) {
            Logger.k("Throttled an outstanding image request with uri = \"%s\".", new Object[]{this.c});
            this.e = true;
            SingleEmitter singleEmitter = (SingleEmitter) this.b.d;
            if (!singleEmitter.isDisposed()) {
                singleEmitter.onError(new IapException(new es5("Image was cancelled due to throttling."), "wamp.error"));
            }
            synchronized (this.g.c) {
                this.g.c.remove(this);
            }
        }
    }

    public final void e(int i, Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat;
        dm5.m(!bitmap.isRecycled());
        if (!this.e && !this.g.d) {
            int i2 = this.a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) (((double) (bitmap.getHeight() * bitmap.getWidth() * 3)) * 0.5d));
            int iC = l1d.C(i2);
            if (iC == 0) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                if (iC != 1) {
                    hhg1.n("Invalid image format.");
                    return;
                }
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            bitmap.compress(compressFormat, 90, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            pyp0 pyp0Var = this.b;
            paa paaVar = raa.a;
            paaVar.getClass();
            String strC = paaVar.c(byteArray, byteArray.length);
            Integer numValueOf = Integer.valueOf(pyp0Var.b);
            Integer numValueOf2 = Integer.valueOf(pyp0Var.c);
            mr5 mr5Var = new mr5();
            mr5Var.b = strC;
            mr5Var.c = numValueOf;
            mr5Var.d = numValueOf2;
            ((SingleEmitter) pyp0Var.d).onSuccess(mr5Var);
        }
        synchronized (this.g.c) {
            this.g.c.remove(this);
        }
        dm5.m(!bitmap.isRecycled());
    }

    public final void m(Drawable drawable) {
        if (!this.e && !this.g.d) {
            Logger.d("Failed to load image with uri = \"%s\".", new Object[]{this.c});
            SingleEmitter singleEmitter = (SingleEmitter) this.b.d;
            if (!singleEmitter.isDisposed()) {
                singleEmitter.onError(new IapException(new es5("Failed to load image."), "wamp.error"));
            }
        }
        synchronized (this.g.c) {
            this.g.c.remove(this);
        }
    }

    public final void g(Drawable drawable) {
    }
}
