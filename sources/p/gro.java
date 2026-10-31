package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gro implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hro b;

    public gro(hro hroVar, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.a = (byte) 8;
        this.b = hroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hro hroVar = this.b;
        switch (b) {
            case 0:
                hroVar.l.getClass();
                break;
            case 1:
                hroVar.l.getClass();
                break;
            case 2:
                hroVar.l.getClass();
                break;
            case 3:
                hroVar.l.getClass();
                break;
            case 4:
                hroVar.l.getClass();
                break;
            case 5:
                hroVar.l.getClass();
                break;
            case 6:
                hroVar.l.getClass();
                break;
            case 7:
                hroVar.l.getClass();
                break;
            case 8:
                hroVar.l.getClass();
                break;
            default:
                hroVar.l.getClass();
                break;
        }
    }

    public /* synthetic */ gro(hro hroVar, String str, Bundle bundle, byte b) {
        this.a = b;
        this.b = hroVar;
    }

    public gro(hro hroVar, int i, Bundle bundle) {
        this.a = (byte) 1;
        this.b = hroVar;
    }

    public gro(hro hroVar, int i, Uri uri, boolean z, Bundle bundle) {
        this.a = (byte) 5;
        this.b = hroVar;
    }

    public gro(hro hroVar, int i, int i2, Bundle bundle) {
        this.a = (byte) 6;
        this.b = hroVar;
    }

    public /* synthetic */ gro(hro hroVar, Bundle bundle, byte b) {
        this.a = b;
        this.b = hroVar;
    }
}
