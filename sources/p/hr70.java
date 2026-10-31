package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.media3.common.ParserException;
import androidx.media3.transformer.ExportException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hr70 implements b67 {
    public final Context a;
    public final e4w b;
    public final q2r c;
    public final a67 d;
    public final boolean e;
    public final ScheduledExecutorService f;
    public d541 g;
    public byte h;
    public volatile byte i;

    public hr70(Context context, e4w e4wVar, a67 a67Var, q2r q2rVar, boolean z) {
        dm5.y(e4wVar.d != -9223372036854775807L);
        dm5.y(e4wVar.e != -2147483647);
        this.a = context;
        this.b = e4wVar;
        this.d = a67Var;
        this.c = q2rVar;
        this.e = z;
        this.f = Executors.newSingleThreadScheduledExecutor();
        this.h = (byte) 0;
    }

    public final void a(final Bitmap bitmap, final ie30 ie30Var) {
        try {
            d541 d541Var = this.g;
            final byte b = 0;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (d541Var == null) {
                this.g = this.d.e(ie30Var);
                this.f.schedule(new Runnable(this) { // from class: p.fr70
                    public final /* synthetic */ hr70 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        ie30 ie30Var2 = ie30Var;
                        Bitmap bitmap2 = bitmap;
                        hr70 hr70Var = this.b;
                        switch (b2) {
                            case 0:
                                hr70Var.a(bitmap2, ie30Var2);
                                break;
                            default:
                                hr70Var.a(bitmap2, ie30Var2);
                                break;
                        }
                    }
                }, 10L, timeUnit);
                return;
            }
            e4w e4wVar = this.b;
            int i = d541Var.i(bitmap, new rgl(e4wVar.d, e4wVar.e, 0));
            final byte b2 = 1;
            if (i == 1) {
                this.i = (byte) 100;
                this.g.g();
            } else if (i == 2) {
                this.f.schedule(new Runnable(this) { // from class: p.fr70
                    public final /* synthetic */ hr70 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        ie30 ie30Var2 = ie30Var;
                        Bitmap bitmap2 = bitmap;
                        hr70 hr70Var = this.b;
                        switch (b3) {
                            case 0:
                                hr70Var.a(bitmap2, ie30Var2);
                                break;
                            default:
                                hr70Var.a(bitmap2, ie30Var2);
                                break;
                        }
                    }
                }, 10L, timeUnit);
            } else {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                this.i = (byte) 100;
            }
        } catch (ExportException e) {
            this.d.b(e);
        } catch (RuntimeException e2) {
            this.d.b(ExportException.a(1000, e2));
        }
    }

    @Override // p.b67
    public final int c(ij81 ij81Var) {
        if (this.h == 2) {
            ij81Var.b = this.i;
        }
        return this.h;
    }

    @Override // p.b67
    public final j380 g() {
        return gg11.g;
    }

    @Override // p.b67
    public final void release() {
        this.h = (byte) 0;
        this.f.shutdownNow();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0095, please report this as an issue */
    @Override // p.b67
    public final void start() {
        n8d0 c280Var;
        byte b = 2;
        this.h = (byte) 2;
        e4w e4wVar = this.b;
        long j = e4wVar.d;
        a67 a67Var = this.d;
        a67Var.f(j);
        boolean z = true;
        a67Var.a(1);
        yoh0 yoh0Var = e4wVar.a;
        String strB = mue1.B(this.a, yoh0Var);
        if (strB != null) {
            String str = zoi1.a;
            switch (strB.hashCode()) {
                case -1487656890:
                    b = !strB.equals("image/avif") ? (byte) -1 : (byte) 0;
                    break;
                case -1487464693:
                    b = !strB.equals("image/heic") ? (byte) -1 : (byte) 1;
                    break;
                case -1487464690:
                    if (!strB.equals("image/heif")) {
                        b = -1;
                    }
                    break;
                case -1487394660:
                    b = !strB.equals("image/jpeg") ? (byte) -1 : (byte) 3;
                    break;
                case -1487018032:
                    b = !strB.equals("image/webp") ? (byte) -1 : (byte) 4;
                    break;
                case -879272239:
                    b = !strB.equals("image/bmp") ? (byte) -1 : (byte) 5;
                    break;
                case -879258763:
                    b = !strB.equals("image/png") ? (byte) -1 : (byte) 6;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    if (Build.VERSION.SDK_INT < 34) {
                        z = false;
                    }
                    break;
                case 1:
                case 2:
                    if (Build.VERSION.SDK_INT < 26) {
                        z = false;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                soh0 soh0Var = yoh0Var.b;
                soh0Var.getClass();
                c280Var = this.c.m(soh0Var.a);
            } else {
                c280Var = new c280(ParserException.d("Attempted to load a Bitmap from unsupported MIME type: " + strB));
            }
        } else {
            c280Var = new c280(ParserException.d("Attempted to load a Bitmap from unsupported MIME type: " + strB));
        }
        c280Var.b(new nx30(c280Var, new gr70(this), (byte) 24), this.f);
    }
}
