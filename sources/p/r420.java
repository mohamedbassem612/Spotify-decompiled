package p;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r420 extends OutputStream {
    public final FileOutputStream a;
    public final hfb b;
    public final String c;
    public final boolean d;
    public final v520 e;

    public r420(FileOutputStream fileOutputStream, hfb hfbVar, String str, boolean z, v520 v520Var) {
        this.a = fileOutputStream;
        this.b = hfbVar;
        this.c = str;
        this.d = z;
        this.e = v520Var;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        rih1 rih1Var = null;
        try {
            this.a.write(i);
            rih1Var = rih1.a;
            e = null;
        } catch (Exception e) {
            e = e;
        }
        Exception excB = new jpi1(rih1Var, System.currentTimeMillis() - jCurrentTimeMillis, e).b();
        if (this.d) {
            this.e.r(this.c);
            new Date().getTime();
        }
        if (excB != null) {
            throw excB;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        rih1 rih1Var = null;
        try {
            this.a.write(bArr);
            rih1Var = rih1.a;
            e = null;
        } catch (Exception e) {
            e = e;
        }
        Exception excB = new jpi1(rih1Var, System.currentTimeMillis() - jCurrentTimeMillis, e).b();
        if (this.d) {
            this.e.r(this.c);
            new Date().getTime();
        }
        if (excB != null) {
            throw excB;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        rih1 rih1Var = null;
        try {
            this.a.write(bArr, i, i2);
            rih1Var = rih1.a;
            e = null;
        } catch (Exception e) {
            e = e;
        }
        Exception excB = new jpi1(rih1Var, System.currentTimeMillis() - jCurrentTimeMillis, e).b();
        if (this.d) {
            this.e.r(this.c);
            new Date().getTime();
        }
        if (excB != null) {
            throw excB;
        }
    }
}
