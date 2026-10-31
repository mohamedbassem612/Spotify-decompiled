package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pj00 implements o5s {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ pj00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onCreate(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Logger.b("EvoPage :: onCreate", new Object[0]);
                break;
            case 1:
                ((zh30) obj).i.j();
                break;
            case 2:
                ((tac0) obj).g(k8c0.ON_CREATE);
                break;
        }
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Logger.b("EvoPage :: onDestroy", new Object[0]);
                break;
            case 1:
                zh30 zh30Var = (zh30) obj;
                zh30Var.i.k();
                zh30Var.t.g(k8c0.ON_DESTROY);
                break;
            case 2:
                ((tac0) obj).g(k8c0.ON_DESTROY);
                break;
            default:
                ArrayDeque arrayDeque = ((hp41) obj).a;
                Iterator it = new ArrayDeque(arrayDeque).iterator();
                while (it.hasNext()) {
                    hp41.g((ap41) it.next(), true);
                }
                arrayDeque.clear();
                iac0Var.getLifecycle().d(this);
                break;
        }
    }

    public final void onPause(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Logger.b("EvoPage :: onPause", new Object[0]);
                break;
            case 1:
                zh30 zh30Var = (zh30) obj;
                zh30Var.O0 = false;
                zh30Var.i.n();
                zh30Var.t.g(k8c0.ON_PAUSE);
                break;
            case 2:
                ((tac0) obj).g(k8c0.ON_PAUSE);
                break;
            default:
                ap41 ap41Var = (ap41) ((hp41) obj).a.peek();
                if (ap41Var != null) {
                    ap41Var.b(k8c0.ON_PAUSE);
                    break;
                }
                break;
        }
    }

    public final void onResume(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Logger.b("EvoPage :: onResume", new Object[0]);
                break;
            case 1:
                zh30 zh30Var = (zh30) obj;
                lmw lmwVar = zh30Var.i;
                fdc fdcVar = zh30Var.Y;
                if (!fdcVar.b) {
                    fdcVar.b = true;
                    pyp0 pyp0Var = (pyp0) fdcVar.f;
                    if (pyp0Var != null) {
                        ((c8l) fdcVar.e).c(pyp0Var.b, pyp0Var.c, (Intent) pyp0Var.d);
                    }
                    fdcVar.f = null;
                }
                lmwVar.u();
                zh30Var.O0 = true;
                lmwVar.r();
                zh30Var.t.g(k8c0.ON_RESUME);
                lmwVar.o();
                break;
            case 2:
                ((tac0) obj).g(k8c0.ON_RESUME);
                break;
            default:
                ap41 ap41Var = (ap41) ((hp41) obj).a.peek();
                if (ap41Var != null) {
                    ap41Var.b(k8c0.ON_RESUME);
                    break;
                }
                break;
        }
    }

    public final void onStart(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Logger.b(f4i1.c(((Context) obj).getResources().getConfiguration().orientation, "EvoPage :: onStart - orientation: "), new Object[0]);
                break;
            case 1:
                zh30 zh30Var = (zh30) obj;
                lmw lmwVar = zh30Var.i;
                lmwVar.u();
                zh30Var.P0 = false;
                if (!zh30Var.N0) {
                    zh30Var.N0 = true;
                    lmwVar.h();
                }
                lmwVar.r();
                zh30Var.t.g(k8c0.ON_START);
                lmwVar.p();
                break;
            case 2:
                ((tac0) obj).g(k8c0.ON_START);
                break;
            default:
                ap41 ap41Var = (ap41) ((hp41) obj).a.peek();
                if (ap41Var != null) {
                    ap41Var.b(k8c0.ON_START);
                    break;
                }
                break;
        }
    }

    public final void onStop(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Logger.b(f4i1.c(((Context) obj).getResources().getConfiguration().orientation, "EvoPage :: onStop - orientation: "), new Object[0]);
                break;
            case 1:
                zh30 zh30Var = (zh30) obj;
                lmw lmwVar = zh30Var.i;
                zh30Var.P0 = true;
                while (zh30.c(lmwVar.t())) {
                }
                lmwVar.q();
                zh30Var.t.g(k8c0.ON_STOP);
                break;
            case 2:
                ((tac0) obj).g(k8c0.ON_STOP);
                break;
            default:
                ap41 ap41Var = (ap41) ((hp41) obj).a.peek();
                if (ap41Var != null) {
                    ap41Var.b(k8c0.ON_STOP);
                    break;
                }
                break;
        }
    }

    private final void a(iac0 iac0Var) {
    }
}
