package p;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m420 extends InputStream implements InputStreamRetargetInterface {
    public final FileInputStream a;
    public final hfb b;
    public final String c;
    public final boolean d;
    public final v520 e;

    public m420(FileInputStream fileInputStream, hfb hfbVar, String str, boolean z, v520 v520Var) {
        this.a = fileInputStream;
        this.b = hfbVar;
        this.c = str;
        this.d = z;
        this.e = v520Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Integer numValueOf = null;
        try {
            e = null;
            numValueOf = Integer.valueOf(this.a.read());
        } catch (Exception e) {
            e = e;
        }
        jpi1 jpi1Var = new jpi1(numValueOf, System.currentTimeMillis() - jCurrentTimeMillis, e);
        Integer num = (Integer) jpi1Var.a();
        Exception excB = jpi1Var.b();
        if (this.d) {
            this.e.r(this.c);
            if (excB == null) {
                num.getClass();
                num.intValue();
            }
            gvg.s();
        }
        if (excB != null) {
            throw excB;
        }
        num.getClass();
        return num.intValue();
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf = null;
        try {
            lValueOf = Long.valueOf(this.a.skip(j));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        jpi1 jpi1Var = new jpi1(lValueOf, System.currentTimeMillis() - jCurrentTimeMillis, e);
        Long l = (Long) jpi1Var.a();
        Exception excB = jpi1Var.b();
        if (this.d) {
            this.e.r(this.c);
            if (excB == null) {
                l.getClass();
            }
            gvg.s();
        }
        if (excB != null) {
            throw excB;
        }
        l.getClass();
        return l.longValue();
    }

    @Override // java.io.InputStream
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Integer numValueOf = null;
        try {
            numValueOf = Integer.valueOf(this.a.read(bArr));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        jpi1 jpi1Var = new jpi1(numValueOf, System.currentTimeMillis() - jCurrentTimeMillis, e);
        Integer num = (Integer) jpi1Var.a();
        Exception excB = jpi1Var.b();
        if (this.d) {
            this.e.r(this.c);
            if (excB == null) {
                num.getClass();
            }
            gvg.s();
        }
        if (excB == null) {
            num.getClass();
            return num.intValue();
        }
        throw excB;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Integer numValueOf = null;
        try {
            numValueOf = Integer.valueOf(this.a.read(bArr, i, i2));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        jpi1 jpi1Var = new jpi1(numValueOf, System.currentTimeMillis() - jCurrentTimeMillis, e);
        Integer num = (Integer) jpi1Var.a();
        Exception excB = jpi1Var.b();
        if (this.d) {
            this.e.r(this.c);
            if (excB == null) {
                num.getClass();
            }
            gvg.s();
        }
        if (excB == null) {
            num.getClass();
            return num.intValue();
        }
        throw excB;
    }
}
