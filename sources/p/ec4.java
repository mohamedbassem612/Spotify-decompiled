package p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.fitness.workoutimpl.domain.effecthandlers.CueAudioPlaybackCancelledException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ec4 {
    public static final po7 f;
    public final bo00 a;
    public final Handler b;
    public yo00 c;
    public volatile ohd d;
    public volatile cc4 e;

    static {
        wa waVar = new wa();
        waVar.c(1);
        waVar.h(12);
        f = waVar.a();
    }

    public ec4(bo00 bo00Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = bo00Var;
        this.b = handler;
    }

    public final void a() {
        yo00 yo00Var;
        ohd ohdVar = this.d;
        cc4 cc4Var = this.e;
        if (ohdVar == null && cc4Var == null) {
            return;
        }
        this.d = null;
        this.e = null;
        if (cc4Var != null && (yo00Var = this.c) != null) {
            yo00Var.P(cc4Var);
        }
        if (ohdVar != null && (ohdVar.s() instanceof ago0)) {
            ohdVar.resumeWith(new m231(new CueAudioPlaybackCancelledException()));
        }
        yo00 yo00Var2 = this.c;
        if (yo00Var2 != null) {
            yo00Var2.stop();
        }
    }

    public final void b(cc4 cc4Var, boolean z) {
        yo00 yo00Var;
        if (this.e != cc4Var) {
            return;
        }
        this.d = null;
        this.e = null;
        yo00 yo00Var2 = this.c;
        if (yo00Var2 != null) {
            yo00Var2.P(cc4Var);
        }
        if (z && (yo00Var = this.c) != null) {
            yo00Var.stop();
        }
        yo00 yo00Var3 = this.c;
        if (yo00Var3 != null) {
            yo00Var3.r(po7.i, false);
        }
    }

    public final Object c(byte[] bArr, ly7 ly7Var) {
        akx0 akx0VarE = new zjx0(new bv40(bArr, (byte) 14)).e(yoh0.d("bytes:///cue.mp3"));
        ohd ohdVar = new ohd(1, aym.t(ly7Var));
        ohdVar.t();
        d(new hh(ohdVar, this, akx0VarE, (byte) 12));
        Object objR = ohdVar.r();
        return objR == d9n.a ? objR : rih1.a;
    }

    public final void d(Function0 function0) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.b;
        if (u890.j(looperMyLooper, handler.getLooper())) {
            function0.invoke();
        } else {
            handler.post(new is3(function0, (byte) 1));
        }
    }

    public final void e() {
        ohd ohdVar = this.d;
        this.d = null;
        if (ohdVar != null && (ohdVar.s() instanceof ago0)) {
            ohdVar.resumeWith(new m231(new CueAudioPlaybackCancelledException()));
        }
        d(new dc4(this, (byte) 1));
    }
}
