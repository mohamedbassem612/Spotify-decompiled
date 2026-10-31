package p;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yil1 implements jlq0 {
    public final File a;
    public final int b;
    public final iu30 c;

    public yil1(File file, int i) {
        lcl1 lcl1Var = lcl1.t;
        this.a = file;
        this.b = i;
        this.c = lcl1Var;
    }

    public final List a() {
        Integer numC0;
        File[] fileArrListFiles = this.a.listFiles();
        if (fileArrListFiles == null) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.isDirectory() && nhc1.Y(file.getName(), "app_webview_main_", false) && (numC0 = nhc1.c0(ihc1.H0(file.getName(), "app_webview_main_"))) != null && numC0.intValue() != this.b && !((Boolean) this.c.invoke(numC0)).booleanValue()) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public final void c() {
        try {
            Iterator it = a().iterator();
            while (it.hasNext()) {
                y520.E((File) it.next());
            }
        } catch (Exception unused) {
        }
    }

    public final String getName() {
        return "WebViewDirCleanupOperation";
    }
}
