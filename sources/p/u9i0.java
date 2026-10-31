package p;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u9i0 extends tn21 {
    public final /* synthetic */ r8i0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public u9i0(r8i0 r8i0Var, long j, String str, long j2) {
        this.a = r8i0Var;
        this.b = j;
        this.c = str;
        this.d = j2;
    }

    public final long a() {
        return this.b;
    }

    public final r8i0 b() {
        return this.a;
    }

    public final void d(fbc fbcVar) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.c);
        long j = this.d;
        long j2 = this.b;
        try {
            fileInputStream.getChannel().position(j);
            ff01 ff01Var = new ff01(si1.v(fileInputStream));
            try {
                fbcVar.P(ff01Var, j2);
                ff01Var.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(ff01Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(fileInputStream, th3);
                throw th4;
            }
        }
    }
}
