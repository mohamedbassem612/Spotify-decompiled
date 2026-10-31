package p;

import com.google.android.gms.cast.CastDevice;
import com.spotify.connect.castbasic.CastBasicException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b5j0 implements o2e {
    public final /* synthetic */ iir a;

    public b5j0(iir iirVar) {
        this.a = iirVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.connect.castbasic.CastBasicException */
    public final void a(CastDevice castDevice, String str) throws CastBasicException {
        int i;
        castDevice.toString();
        iir iirVar = this.a;
        vkr vkrVar = (vkr) iirVar.b;
        vkrVar.f.a(new u2e(str));
        j4e j4eVar = (j4e) iirVar.c;
        dt71 dt71Var = vkrVar.f;
        try {
            bh8 bh8Var = (bh8) vkrVar.c.a(str, m5n1.z(bh8.Companion.serializer()));
            String str2 = bh8Var != null ? bh8Var.a : null;
            if (u890.j(str2, xcg1.d(4))) {
                i = 1;
            } else {
                i = u890.j(str2, xcg1.d(5)) ? 2 : 3;
            }
            int iC = l1d.C(i);
            if (iC == 0) {
                dt71Var.a(new v2e(j4eVar));
            } else if (iC == 1) {
                dt71Var.a(new s2e(j4eVar));
            } else {
                if (iC == 2) {
                    return;
                }
                eg.o();
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Another exception occurred";
            }
            throw new CastBasicException(4, e, message);
        }
    }
}
