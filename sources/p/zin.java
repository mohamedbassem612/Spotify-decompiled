package p;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zin {
    public static final Charset e = Charset.forName("UTF-8");
    public static final byte f = 15;
    public static final xin g = new xin();
    public static final fhn h = new fhn((byte) 1);
    public static final ehn i = new ehn((byte) 2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final d520 b;
    public final s880 c;
    public final ghn d;

    public zin(d520 d520Var, s880 s880Var, ghn ghnVar) {
        this.b = d520Var;
        this.c = s880Var;
        this.d = ghnVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void e(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        d520 d520Var = this.b;
        arrayList.addAll(d520Var.I());
        arrayList.addAll(d520Var.G());
        fhn fhnVar = h;
        Collections.sort(arrayList, fhnVar);
        List listJ = d520Var.J();
        Collections.sort(listJ, fhnVar);
        arrayList.addAll(listJ);
        return arrayList;
    }

    public final void c(rin rinVar, String str, boolean z) {
        d520 d520Var = this.b;
        int i2 = this.c.l().a.a;
        g.getClass();
        try {
            e(d520Var.K(str, f4i1.f("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), xin.a.e(rinVar));
        } catch (IOException unused) {
            ws10.Z.h();
        }
        List<File> listL = d520Var.L(str, new yin((byte) 0));
        Collections.sort(listL, new m((byte) 6));
        int size = listL.size();
        for (File file : listL) {
            if (size <= i2) {
                return;
            }
            d520.a0(file);
            size--;
        }
    }
}
