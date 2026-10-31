package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f9h implements sig {
    public final /* synthetic */ byte a;

    public final String a(m210 m210Var) {
        switch (this.a) {
            case 0:
                List list = g9h.a;
                if (g9h.a.contains(m210Var.k)) {
                    return "CgVPcGx1cxIJQXNzaXN0YW50";
                }
                return null;
            case 1:
                if (u890.j(m210Var.k, "com.motorola.partner.music")) {
                    return "CghNb3Rvcm9sYRIEUmF6cg%3D%3D";
                }
                return null;
            case 2:
                String str = m210Var.k;
                if (u890.j(str, "com.samsung.android.smartsuggestions") || u890.j(str, "com.spotify.partnerassistantsai.sample")) {
                    return "CgdTYW1zdW5nEhBTYW1zdW5nIEFJIEJyaWVm";
                }
                return null;
            case 3:
                String str2 = m210Var.k;
                if (u890.j(str2, "com.samsung.android.app.galaxyfinder") || u890.j(str2, "com.sec.android.app.launcher")) {
                    return "CgdTYW1zdW5nEghTLUZpbmRlcg%3D%3D";
                }
                return null;
            case 4:
                if (u890.j(m210Var.k, "com.vivo.globalsearch")) {
                    return "CgRWaXZvEgxHbG9iYWxTZWFyY2g%3D";
                }
                return null;
            default:
                if (zgl.a.contains(m210Var.k)) {
                    return "CgZYaWFvbWkSBkZpbmRlcg%3D%3D";
                }
                return null;
        }
    }
}
