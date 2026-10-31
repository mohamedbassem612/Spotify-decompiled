package p;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qvt {
    public final Executor a;
    public final b8x0 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public r0u[] g;
    public byte[] h;

    public qvt(AssetManager assetManager, Executor executor, b8x0 b8x0Var, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = b8x0Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = b3o1.e;
                    break;
                case 26:
                    bArr = b3o1.d;
                    break;
                case 27:
                    bArr = b3o1.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = b3o1.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = b3o1.a;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new pvt(this, i, serializable, (byte) 0));
    }
}
