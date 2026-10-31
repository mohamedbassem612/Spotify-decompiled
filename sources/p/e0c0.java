package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e0c0 {
    public final c0c0 a;

    public e0c0(c0c0 c0c0Var) {
        this.a = c0c0Var;
    }

    public final void a() {
        int size;
        c0c0 c0c0Var = this.a;
        if (c0c0Var.a.G("dialog_presenter") == null) {
            th30 th30Var = c0c0Var.a;
            d0c0 d0c0Var = c0c0Var.b;
            h3u h3uVar = new h3u();
            List listU = th30Var.c.u();
            d0c0Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("playback_error_dialog_fragment", zyt0.class);
            linkedHashMap.put("offline_sync_error_fragment", gxp0.class);
            linkedHashMap.put("disk_almost_full_fragment", odu.class);
            try {
                linkedHashMap.put("uninstall_release_version", Class.forName("com.spotify.debugtools.uninstallrelease.UninstallReleaseVersionDialogFragment"));
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                eg.f(e);
                return;
            }
            linkedHashMap.put("google_assistant_linking_debug_fragment", rz40.class);
            nu9 nu9Var = new nu9(th30Var);
            nu9Var.k(0, h3uVar, "dialog_presenter", 1);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Class cls = (Class) entry.getValue();
                nu9Var.k(0, nu9Var.j((Bundle) null, cls), (String) entry.getKey(), 1);
            }
            nu9Var.f();
            th30Var.D();
            ArrayList<zf30> arrayList = new ArrayList(th30Var.c.u());
            arrayList.removeAll(listU);
            for (zf30 zf30Var : arrayList) {
                if (zf30Var instanceof s5w0) {
                    s5w0 s5w0Var = (s5w0) zf30Var;
                    String str = ((zf30) s5w0Var).a1;
                    if (str == null || str.length() == 0) {
                        hhg1.n("Fragment must be added to a transaction with a specific tag before being registered in DialogPresenter.");
                        return;
                    }
                    s5w0Var.F1 = h3uVar;
                    synchronized (h3uVar) {
                        h3uVar.F1.add(new g3u(((zf30) s5w0Var).a1));
                        size = h3uVar.F1.size();
                    }
                    s5w0Var.G1 = size;
                }
            }
        }
    }
}
