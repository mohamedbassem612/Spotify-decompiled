package p;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h9z0 implements n420 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public g9z0 b;

    public h9z0(File file) {
        this.a = file;
    }

    @Override // p.n420
    public final void a() {
        eth.k(this.b);
        this.b = null;
    }

    public final void b() {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new g9z0(file);
            } catch (IOException unused) {
                ws10 ws10Var = ws10.Z;
                file.toString();
                ws10Var.d();
            }
        }
    }

    @Override // p.n420
    public final String d() {
        byte[] bArrE = e();
        if (bArrE != null) {
            return new String(bArrE, c);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // p.n420
    public final byte[] e() {
        b9a b9aVar;
        if (this.a.exists()) {
            b();
            g9z0 g9z0Var = this.b;
            if (g9z0Var == null) {
                b9aVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr = new byte[g9z0Var.m()];
                try {
                    this.b.d(new hyy0(bArr, iArr, (byte) 3));
                } catch (IOException unused) {
                    ws10.Z.d();
                }
                b9aVar = new b9a(bArr, iArr[0]);
            }
        } else {
            b9aVar = null;
        }
        if (b9aVar == null) {
            return null;
        }
        int i = b9aVar.b;
        byte[] bArr2 = new byte[i];
        System.arraycopy(b9aVar.a, 0, bArr2, 0, i);
        return bArr2;
    }

    @Override // p.n420
    public final void f() {
        a();
        this.a.delete();
    }

    @Override // p.n420
    public final void h(long j, String str) {
        b();
        if (this.b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.e() && this.b.m() > 65536) {
                this.b.h();
            }
        } catch (IOException unused) {
            ws10.Z.d();
        }
    }
}
