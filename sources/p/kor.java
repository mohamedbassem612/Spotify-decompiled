package p;

import android.view.KeyEvent;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kor {
    public final ynb0 a;
    public final g0l b;
    public final ssk1 c;
    public final c3s d;
    public final PublishSubject e;
    public final PublishSubject f;

    public kor(ynb0 ynb0Var, g0l g0lVar, ssk1 ssk1Var, c3s c3sVar) {
        this.a = ynb0Var;
        this.b = g0lVar;
        this.c = ssk1Var;
        this.d = c3sVar;
        PublishSubject publishSubject = new PublishSubject();
        this.e = publishSubject;
        this.f = publishSubject;
    }

    public final boolean a(KeyEvent keyEvent, String str, iu30 iu30Var) {
        c1l c1lVarG;
        c1l c1lVarG2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            g0l g0lVar = this.b;
            PublishSubject publishSubject = this.e;
            ssk1 ssk1Var = this.c;
            c3s c3sVar = this.d;
            ynb0 ynb0Var = this.a;
            if (keyCode != 24) {
                if (keyCode == 25) {
                    if (!b()) {
                        publishSubject.onNext(new z7l(false, str, null));
                        return false;
                    }
                    l0l l0lVarC = ((inr) g0lVar).c();
                    ((ark1) ynb0Var.get()).e(str, c3sVar.d() ? null : ssk1Var.g().n((l0lVarC == null || (c1lVarG2 = l0lVarC.G()) == null) ? null : c1lVarG2.a, ((ark1) ynb0Var.get()).c()), new jor(this, str, iu30Var, (byte) 0));
                    return true;
                }
            } else {
                if (b()) {
                    l0l l0lVarC2 = ((inr) g0lVar).c();
                    ((ark1) ynb0Var.get()).h(str, c3sVar.d() ? null : ssk1Var.g().o((l0lVarC2 == null || (c1lVarG = l0lVarC2.G()) == null) ? null : c1lVarG.a, ((ark1) ynb0Var.get()).c()), new jor(this, str, iu30Var, (byte) 1));
                    return true;
                }
                publishSubject.onNext(new z7l(false, str, null));
            }
        }
        return false;
    }

    public final boolean b() {
        l0l l0lVarC = ((inr) this.b).c();
        if (l0lVarC != null) {
            boolean zL = l0lVarC.l();
            boolean z = !l0lVarC.l() && l0lVarC.F() && l0lVarC.A() > 0;
            if (zL || z) {
                return true;
            }
        }
        return false;
    }
}
