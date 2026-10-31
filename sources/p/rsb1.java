package p;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rsb1 implements o2r {
    public final o2r a;
    public long b;
    public Uri c;
    public Map d;

    public rsb1(o2r o2rVar) {
        o2rVar.getClass();
        this.a = o2rVar;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // p.o2r
    public final void a(yeg1 yeg1Var) {
        yeg1Var.getClass();
        this.a.a(yeg1Var);
    }

    public final long c() {
        return this.b;
    }

    @Override // p.o2r
    public final void close() {
        this.a.close();
    }

    @Override // p.o2r
    public final Map e() {
        return this.a.e();
    }

    @Override // p.o2r
    public final Uri getUri() {
        return this.a.getUri();
    }

    public final Uri i() {
        return this.c;
    }

    public final Map l() {
        return this.d;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }

    @Override // p.o2r
    public final long t(n3r n3rVar) {
        o2r o2rVar = this.a;
        this.c = n3rVar.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return o2rVar.t(n3rVar);
        } finally {
            Uri uri = o2rVar.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = o2rVar.e();
        }
    }
}
