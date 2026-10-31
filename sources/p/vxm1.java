package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vxm1 implements rhh0 {
    public final mwm1 a;
    public final e821 b;
    public final Observable c;
    public final o241 d;
    public final zxl1 e;
    public final r2a1 f;
    public final Context g;

    public vxm1(mwm1 mwm1Var, e821 e821Var, Observable observable, o241 o241Var, rh11 rh11Var, zxl1 zxl1Var, r2a1 r2a1Var, Context context) {
        this.a = mwm1Var;
        this.b = e821Var;
        this.c = observable;
        this.d = o241Var;
        this.e = zxl1Var;
        this.f = r2a1Var;
        this.g = context;
    }

    public static ksm1 c(r9c r9cVar) {
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x(r9cVar.e()).d;
        if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, bzu0.f)) {
            String strE = r9cVar.e();
            if (u890.j(strE, "com.spotify.your-albums")) {
                return ksm1.b;
            }
            if (u890.j(strE, "com.spotify.your-artists")) {
                return ksm1.c;
            }
            if (!u890.j(strE, "com.spotify.your-playlists")) {
                if (u890.j(strE, "com.spotify.your-podcasts")) {
                    return ksm1.e;
                }
                if (u890.j(strE, "com.spotify.your-audiobooks")) {
                    return ksm1.f;
                }
                if (u890.j(strE, "com.spotify.downloaded")) {
                    return ksm1.i;
                }
                u890.j(strE, "com.spotify.your-library");
                return null;
            }
        }
        return ksm1.d;
    }

    @Override // p.w310
    public final Observable a(r9c r9cVar) {
        return this.c.flatMap(new qpj1(this, r9cVar, (byte) 28)).switchMap(new ghk1(this, (byte) 5)).withLatestFrom((ObservableSource) this.d.a, (BiFunction) new uxm1(this, r9cVar));
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        return this.d.a.firstOrError().flatMap(new zxl1(this, r9cVar, (byte) 7));
    }
}
