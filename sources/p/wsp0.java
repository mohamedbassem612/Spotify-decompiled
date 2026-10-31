package p;

import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class wsp0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ysp0 b;
    public final /* synthetic */ em61 c;
    public final /* synthetic */ y8v d;

    public /* synthetic */ wsp0(ysp0 ysp0Var, y8v y8vVar, em61 em61Var) {
        this.a = (byte) 2;
        this.b = ysp0Var;
        this.d = y8vVar;
        this.c = em61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        Pair pair;
        byte b = this.a;
        em61 em61Var = this.c;
        y8v y8vVar = this.d;
        ysp0 ysp0Var = this.b;
        switch (b) {
            case 0:
                b9v b9vVar = ysp0Var.e;
                try {
                    Map mapH = y8vVar.h();
                    if (mapH == null) {
                        pair = null;
                    } else {
                        long j2 = -9223372036854775807L;
                        try {
                            String str = (String) mapH.get("LicenseDurationRemaining");
                            j = str != null ? Long.parseLong(str) : -9223372036854775807L;
                            break;
                        } catch (NumberFormatException unused) {
                        }
                        Long lValueOf = Long.valueOf(j);
                        try {
                            String str2 = (String) mapH.get("PlaybackDurationRemaining");
                            if (str2 != null) {
                                j2 = Long.parseLong(str2);
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                        }
                        pair = new Pair(lValueOf, Long.valueOf(j2));
                    }
                    pair.getClass();
                    em61Var.u(pair);
                    break;
                } catch (Throwable th) {
                    try {
                        em61Var.v(th);
                    } finally {
                        y8vVar.c(b9vVar);
                    }
                    break;
                }
                return;
            case 1:
                b9v b9vVar2 = ysp0Var.e;
                try {
                    em61Var.u(y8vVar.e());
                    break;
                } catch (Throwable th2) {
                    try {
                        em61Var.v(th2);
                    } finally {
                        y8vVar.c(b9vVar2);
                    }
                    break;
                }
                return;
            default:
                cwr cwrVar = ysp0Var.b;
                b9v b9vVar3 = ysp0Var.e;
                try {
                    DrmSession.DrmSessionException drmSessionExceptionA = y8vVar.a();
                    if (y8vVar.getState() == 1) {
                        y8vVar.c(b9vVar3);
                        cwrVar.release();
                    }
                    em61Var.u(drmSessionExceptionA);
                    return;
                } catch (Throwable th3) {
                    em61Var.v(th3);
                    y8vVar.c(b9vVar3);
                    cwrVar.release();
                    return;
                }
        }
    }

    public /* synthetic */ wsp0(ysp0 ysp0Var, em61 em61Var, y8v y8vVar, byte b) {
        this.a = b;
        this.b = ysp0Var;
        this.c = em61Var;
        this.d = y8vVar;
    }
}
