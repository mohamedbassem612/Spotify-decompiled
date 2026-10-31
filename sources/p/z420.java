package p;

import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z420 extends FileReader {
    public final FileReader a;
    public final String b;
    public final boolean c;
    public final v520 d;

    public z420(FileReader fileReader, String str, hfb hfbVar, boolean z, v520 v520Var) {
        super(str);
        this.a = fileReader;
        this.b = str;
        this.c = z;
        this.d = v520Var;
    }

    @Override // java.io.InputStreamReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.Reader
    public final void mark(int i) throws IOException {
        this.a.mark(i);
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStreamReader, java.io.Reader
    public final int read() throws Exception {
        System.currentTimeMillis();
        Integer numValueOf = null;
        try {
            e = null;
            numValueOf = Integer.valueOf(this.a.read());
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                numValueOf.getClass();
            }
            gvg.s();
        }
        if (e != null) {
            throw e;
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    @Override // java.io.InputStreamReader, java.io.Reader
    public final boolean ready() {
        return this.a.ready();
    }

    @Override // java.io.Reader
    public final void reset() throws IOException {
        this.a.reset();
    }

    @Override // java.io.Reader
    public final long skip(long j) throws Exception {
        System.currentTimeMillis();
        Long lValueOf = null;
        try {
            lValueOf = Long.valueOf(this.a.skip(j));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                lValueOf.getClass();
            }
            gvg.s();
        }
        if (e != null) {
            throw e;
        }
        lValueOf.getClass();
        return lValueOf.longValue();
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) throws Exception {
        System.currentTimeMillis();
        Integer numValueOf = null;
        try {
            numValueOf = Integer.valueOf(this.a.read(charBuffer));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                numValueOf.getClass();
            }
            gvg.s();
        }
        if (e == null) {
            numValueOf.getClass();
            return numValueOf.intValue();
        }
        throw e;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr) throws Exception {
        System.currentTimeMillis();
        Integer numValueOf = null;
        try {
            numValueOf = Integer.valueOf(this.a.read(cArr));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                numValueOf.getClass();
            }
            gvg.s();
        }
        if (e == null) {
            numValueOf.getClass();
            return numValueOf.intValue();
        }
        throw e;
    }

    @Override // java.io.InputStreamReader, java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws Exception {
        System.currentTimeMillis();
        Integer numValueOf = null;
        try {
            numValueOf = Integer.valueOf(this.a.read(cArr, i, i2));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null) {
                numValueOf.getClass();
            }
            gvg.s();
        }
        if (e == null) {
            numValueOf.getClass();
            return numValueOf.intValue();
        }
        throw e;
    }
}
