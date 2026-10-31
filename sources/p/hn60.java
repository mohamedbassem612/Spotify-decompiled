package p;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hn60 implements f420 {
    public final /* synthetic */ byte a;
    public final oi b;

    public /* synthetic */ hn60(oi oiVar, byte b) {
        this.a = b;
        this.b = oiVar;
    }

    public m420 a() {
        FileInputStream fileInputStream = new FileInputStream("/proc/mounts");
        oi oiVar = this.b;
        return new m420(fileInputStream, (hfb) oiVar.c, new File("/proc/mounts").getAbsolutePath(), oiVar.b, (v520) oiVar.d);
    }

    public final m420 j(l420 l420Var) {
        byte b = this.a;
        oi oiVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return oiVar.j(l420Var);
    }

    public final l420 k(String str) {
        byte b = this.a;
        oi oiVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return oiVar.k(str);
    }

    public final r420 l(l420 l420Var) {
        byte b = this.a;
        oi oiVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return oiVar.l(l420Var);
    }
}
