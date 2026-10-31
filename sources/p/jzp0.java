package p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jzp0 {
    public final cxc a;

    public jzp0(cxc cxcVar) {
        this.a = cxcVar;
    }

    public final void a(File file, String str) throws IOException {
        ne neVar = new ne((byte) 9);
        neVar.e0(str);
        ry21 ry21VarE = this.a.a(new ln21(neVar)).e();
        uz21 uz21Var = ry21VarE.g;
        if (!ry21VarE.Q0) {
            try {
                uz21Var.close();
            } catch (Throwable unused) {
            }
            eg.m("Request was not successful");
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        InputStream inputStreamA = uz21Var.a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                o0c.w(inputStreamA, fileOutputStream);
                fileOutputStream.close();
                inputStreamA.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(inputStreamA, th3);
                throw th4;
            }
        }
    }
}
