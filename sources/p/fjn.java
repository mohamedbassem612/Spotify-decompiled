package p;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import j$.util.Base64;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fjn {
    public static final Charset d = Charset.forName("UTF-8");
    public final Context a;
    public final uln0 b;
    public final d520 c;

    public fjn(Context context, uln0 uln0Var, d520 d520Var) {
        this.a = context;
        this.b = uln0Var;
        this.c = d520Var;
    }

    public static String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(byteArray);
                        gZIPOutputStream.finish();
                        String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream2.toByteArray());
                        gZIPOutputStream.close();
                        byteArrayOutputStream2.close();
                        return strEncodeToString;
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static File c(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static void d(d520 d520Var, String str, String str2, String str3) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        File file = new File(d520Var.H(str), str3);
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), d));
            try {
                bufferedWriter.write(str2);
                file.toString();
                eth.k(bufferedWriter);
            } catch (IOException unused) {
                bufferedWriter2 = bufferedWriter;
                file.toString();
                eth.k(bufferedWriter2);
            } catch (Throwable th2) {
                th = th2;
                file.toString();
                eth.k(bufferedWriter);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
        }
    }

    public final u9c b(String str) {
        d520 d520Var = this.c;
        File fileH = d520Var.H(str);
        File file = new File(fileH, "pending");
        ws10 ws10Var = ws10.Z;
        file.getAbsolutePath();
        ws10Var.g();
        File fileC = c(file, ".dmp");
        "Minidump file ".concat((fileC == null || !fileC.exists()) ? "does not exist" : "exists");
        ws10Var.g();
        dxy dxyVar = new dxy((byte) 24);
        if (fileH.exists() && file.exists()) {
            File fileC2 = c(file, ".dmp");
            xy8 xy8VarA = null;
            String strA = null;
            xy8VarA = null;
            if (Build.VERSION.SDK_INT >= 31) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                long jLastModified = d520Var.K(str, "start-time").lastModified();
                ArrayList arrayList = new ArrayList();
                Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo applicationExitInfoB = k220.b(it.next());
                    if (applicationExitInfoB.getReason() == 5 && applicationExitInfoB.getTimestamp() >= jLastModified) {
                        arrayList.add(applicationExitInfoB);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ApplicationExitInfo applicationExitInfoB2 = k220.b(arrayList.get(0));
                    wy8 wy8Var = new wy8();
                    wy8Var.c(applicationExitInfoB2.getImportance());
                    wy8Var.e(applicationExitInfoB2.getProcessName());
                    wy8Var.g(applicationExitInfoB2.getReason());
                    wy8Var.i(applicationExitInfoB2.getTimestamp());
                    wy8Var.d(applicationExitInfoB2.getPid());
                    wy8Var.f(applicationExitInfoB2.getPss());
                    wy8Var.h(applicationExitInfoB2.getRss());
                    try {
                        strA = a(applicationExitInfoB2.getTraceInputStream());
                    } catch (IOException unused) {
                        ws10Var.j();
                    }
                    wy8Var.j(strA);
                    xy8VarA = wy8Var.a();
                }
            }
            dxyVar.F(new nt21(fileC2, xy8VarA, (byte) 24));
            dxyVar.E(c(fileH, ".device_info"));
            dxyVar.I(new File(fileH, "session.json"));
            dxyVar.p(new File(fileH, "app.json"));
            dxyVar.u(new File(fileH, "device.json"));
            dxyVar.G(new File(fileH, "os.json"));
        }
        return dxyVar.q();
    }
}
