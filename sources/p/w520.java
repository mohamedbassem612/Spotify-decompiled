package p;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w520 extends FileWriter {
    public final FileWriter a;
    public final String b;
    public final boolean c;
    public final v520 d;

    public w520(FileWriter fileWriter, String str, hfb hfbVar, boolean z, v520 v520Var) {
        super(str);
        this.a = fileWriter;
        this.b = str;
        this.c = z;
        this.d = v520Var;
    }

    public final void a(char c) throws Exception {
        System.currentTimeMillis();
        try {
            this.a.append(c);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            new Date().getTime();
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Writer append(char c) throws Exception {
        a(c);
        return this;
    }

    public final void c(int i, int i2, CharSequence charSequence) throws Exception {
        System.currentTimeMillis();
        try {
            this.a.append(charSequence, i, i2);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            new Date().getTime();
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.OutputStreamWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final void d(CharSequence charSequence) throws Exception {
        System.currentTimeMillis();
        try {
            this.a.append(charSequence);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            if (e == null && charSequence != null) {
                charSequence.length();
            }
            gvg.s();
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.OutputStreamWriter, java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // java.io.OutputStreamWriter, java.io.Writer
    public final void write(int i) throws Exception {
        System.currentTimeMillis();
        try {
            this.a.write(i);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            new Date().getTime();
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Writer append(CharSequence charSequence) throws Exception {
        d(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Writer append(CharSequence charSequence, int i, int i2) throws Exception {
        c(i, i2, charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) throws Exception {
        a(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws Exception {
        d(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws Exception {
        c(i, i2, charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) throws Exception {
        System.currentTimeMillis();
        try {
            this.a.write(str);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            new Date().getTime();
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.OutputStreamWriter, java.io.Writer
    public final void write(String str, int i, int i2) throws Exception {
        System.currentTimeMillis();
        try {
            this.a.write(str, i, i2);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            new Date().getTime();
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws Exception {
        System.currentTimeMillis();
        try {
            this.a.write(cArr);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            new Date().getTime();
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.OutputStreamWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws Exception {
        System.currentTimeMillis();
        try {
            this.a.write(cArr, i, i2);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        System.currentTimeMillis();
        if (this.c) {
            this.d.r(this.b);
            new Date().getTime();
        }
        if (e != null) {
            throw e;
        }
    }
}
