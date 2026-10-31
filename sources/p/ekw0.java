package p;

import android.net.Uri;
import com.spotify.player.model.PlayerState;
import com.spotify.preview.previewapi.events.proto.StartPreview;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ekw0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hkw0 b;

    public /* synthetic */ ekw0(hkw0 hkw0Var, byte b) {
        this.a = b;
        this.b = hkw0Var;
    }

    public final void accept(Object obj) {
        f9v f9vVarM;
        f9v f9vVar;
        byte b = this.a;
        hkw0 hkw0Var = this.b;
        switch (b) {
            case 0:
                u19 u19Var = (u19) obj;
                lkw0 lkw0Var = hkw0Var.a;
                ww81 ww81Var = lkw0Var.c;
                if (ww81Var != null) {
                    lkw0Var.f48p.dispose();
                    u19 u19Var2 = u19.e;
                    u19 u19Var3 = lkw0Var.o;
                    if (u19Var == u19Var2) {
                        if (u19Var3 != null) {
                            lkw0Var.h(true, true);
                            return;
                        }
                        return;
                    }
                    if (u19Var3 != null) {
                        lkw0Var.o = null;
                        lkw0Var.h(false, false);
                    }
                    lkw0Var.o = u19Var;
                    Uri uri = Uri.parse((String) u19Var.c.b());
                    iir iirVar = lkw0Var.d;
                    pjq0 pjq0Var = new pjq0(new vyr(), (byte) 27);
                    Object obj2 = new Object();
                    ij81 ij81Var = new ij81(-1, (byte) 12);
                    yoh0 yoh0VarC = yoh0.c(uri);
                    yoh0VarC.b.getClass();
                    yoh0VarC.b.getClass();
                    poh0 poh0Var = yoh0VarC.b.c;
                    if (poh0Var == null) {
                        f9vVar = f9v.a;
                    } else {
                        synchronized (obj2) {
                            try {
                                f9vVarM = poh0Var.equals((Object) null) ? null : k9r.m(poh0Var);
                                f9vVarM.getClass();
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        f9vVar = f9vVarM;
                    }
                    akx0 akx0Var = new akx0(yoh0VarC, iirVar, pjq0Var, f9vVar, ij81Var, 1048576, true, (ie30) null);
                    ww81Var.j1();
                    yo00 yo00Var = ww81Var.b;
                    yo00Var.J1();
                    yo00Var.W0(akx0Var);
                    yo00Var.e();
                    ww81Var.M(true);
                    ww81Var.h1(5, 0L);
                    hlr hlrVar = lkw0Var.i;
                    String str = u19Var.a;
                    String str2 = (String) u19Var.c.h();
                    hlrVar.getClass();
                    ckb1 ckb1VarN = StartPreview.n();
                    ckb1VarN.n(str);
                    ckb1VarN.q(str2);
                    hlrVar.a.a(ckb1VarN.build());
                    return;
                }
                return;
            default:
                PlayerState playerState = (PlayerState) obj;
                lkw0 lkw0Var2 = hkw0Var.a;
                if (!playerState.isPlaying() || playerState.isPaused() || lkw0Var2.o == null) {
                    return;
                }
                lkw0Var2.h(false, false);
                lkw0Var2.m = false;
                lkw0Var2.n = false;
                return;
        }
    }
}
