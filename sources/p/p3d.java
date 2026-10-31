package p;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p3d implements bh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r3d b;

    public /* synthetic */ p3d(r3d r3dVar, byte b) {
        this.a = b;
        this.b = r3dVar;
    }

    public final void a(Object obj) {
        byte b = this.a;
        fod eodVar = bod.a;
        r3d r3dVar = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Uri uri = r3dVar.d;
                if (!zBooleanValue) {
                    if (uri != null) {
                    }
                    File file = r3dVar.e;
                    if (file != null) {
                        file.delete();
                    }
                } else if (uri != null) {
                    eodVar = new eod(uri);
                }
                r3dVar.d = null;
                r3dVar.e = null;
                r3dVar.f(eodVar);
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    r3dVar.f(!ag0.C0(r3dVar.b, "android.permission.CAMERA") ? dod.a : cod.a);
                } else {
                    int i = r3dVar.f;
                    int i2 = i == 0 ? -1 : q3d.a[l1d.C(i)];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            r3dVar.b();
                        } else if (i2 != 2) {
                            eg.o();
                        } else {
                            r3dVar.c();
                        }
                    }
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Uri uri2 = r3dVar.d;
                if (!zBooleanValue2) {
                    if (uri2 != null) {
                    }
                    File file2 = r3dVar.e;
                    if (file2 != null) {
                        file2.delete();
                    }
                } else if (uri2 != null) {
                    eodVar = new eod(uri2);
                }
                r3dVar.d = null;
                r3dVar.e = null;
                r3dVar.f(eodVar);
                break;
        }
    }
}
