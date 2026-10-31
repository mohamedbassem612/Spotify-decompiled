package p;

import android.view.inputmethod.InputMethodManager;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.tome.pageactivity.PageActivity;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fmo implements o2q0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public fmo(tlc tlcVar) {
        this.a = (byte) 2;
        this.b = Collections.singleton(tlcVar);
    }

    public final void b(String str, zf30 zf30Var) {
        Integer num;
        switch (this.a) {
            case 0:
                gmo gmoVar = (gmo) this.b;
                gmoVar.i.m(new emo(gmoVar, (byte) 1));
                return;
            case 1:
                mtr mtrVar = (mtr) this.b;
                if (mtrVar.g) {
                    Set set = ntr.a;
                    Set set2 = s4b1.f;
                    boolean zContains = set.contains(uic.x(str).c);
                    if (!zContains || !u890.j(mtrVar.m, Boolean.FALSE)) {
                        str = null;
                    }
                    mtrVar.n = str;
                    mtrVar.m = Boolean.valueOf(zContains);
                    faa0 faa0Var = mtrVar.k;
                    if (zContains) {
                        if (faa0Var != null) {
                            faa0Var.d((CancellationException) null);
                        }
                        mtrVar.k = null;
                        return;
                    } else {
                        if (faa0Var != null) {
                            faa0Var.d((CancellationException) null);
                        }
                        mtrVar.k = null;
                        mtrVar.k = fn31.T(mtrVar.f, (o8n) null, 0, new cy9(mtrVar.d.b(), mtrVar, (lnm) null), 3);
                        return;
                    }
                }
                return;
            case 2:
                for (tlc tlcVar : (Set) this.b) {
                    tlcVar.getClass();
                    zf30Var.s1.a(new rlc(tlcVar, str, zf30Var));
                }
                return;
            case 3:
                p7h0 p7h0Var = (p7h0) this.b;
                if (p7h0Var.N0) {
                    return;
                }
                if (str.equals(p7h0Var.d)) {
                    p7h0Var.h = p7h0Var.g;
                    Integer num2 = p7h0Var.t;
                    p7h0Var.i = num2 != null ? num2.intValue() : 0;
                    return;
                }
                p7h0Var.g = str;
                if (p7h0Var.X && u890.j(p7h0Var.h, str) && (num = p7h0Var.t) != null && p7h0Var.i == num.intValue() - 1) {
                    p7h0Var.X = false;
                    p7h0Var.c.h(p7h0Var.d);
                    return;
                }
                return;
            case 4:
                ((ssw0) this.b).l(zf30Var);
                return;
            case 5:
                PageActivity pageActivity = (PageActivity) this.b;
                k1c0 k1c0Var = pageActivity.k1;
                if (k1c0Var == null) {
                    u890.C("legacyPropertyResolver");
                    throw null;
                }
                k1c0Var.b(str, zf30Var);
                pageActivity.l1.b(str, zf30Var);
                return;
            case 6:
                svo svoVar = ((jts0) this.b).c;
                if ((svoVar.a != null ? !nhc1.Y(str, "spotify:settings", false) ? 1 : 0 : 0) != 0) {
                    svoVar.a = null;
                    return;
                }
                return;
            case 7:
                if (u890.j(nik1.U6.a, str)) {
                    return;
                }
                qsc qscVar = ((yv41) this.b).a;
                boolean zA = nik1.q.a(str);
                synchronized (qscVar) {
                    try {
                        if (qscVar.d && !zA) {
                            qscVar.c = true;
                        }
                        qscVar.d = zA;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                SpotifyMainActivity spotifyMainActivity = (SpotifyMainActivity) this.b;
                ((InputMethodManager) spotifyMainActivity.getSystemService("input_method")).hideSoftInputFromWindow(spotifyMainActivity.getWindow().getDecorView().getWindowToken(), 0);
                return;
        }
    }

    public /* synthetic */ fmo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
