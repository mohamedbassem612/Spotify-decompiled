package p;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q2r implements nxa {
    public static final v0d1 e = zno1.u(new p58((byte) 1));
    public final bid0 a;
    public final lbq b;
    public final BitmapFactory.Options c;
    public final int d;

    public q2r(b8p1 b8p1Var) {
        this.b = new lbq((Context) b8p1Var.c);
        bid0 bid0Var = (bid0) b8p1Var.d;
        if (bid0Var == null) {
            bid0Var = (bid0) e.get();
            bid0Var.getClass();
        }
        this.a = bid0Var;
        this.c = (BitmapFactory.Options) b8p1Var.e;
        this.d = b8p1Var.b;
    }

    public final n8d0 m(Uri uri) {
        return this.a.c(new p2r(this, uri, (byte) 1));
    }

    public final n8d0 q(byte[] bArr) {
        return this.a.c(new p2r(this, bArr, (byte) 0));
    }

    public q2r(bid0 bid0Var, lbq lbqVar) {
        this.a = bid0Var;
        this.b = lbqVar;
        this.c = null;
        this.d = -1;
    }
}
