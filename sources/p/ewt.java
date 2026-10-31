package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ewt {
    public final /* synthetic */ byte a = 1;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public ewt(zv31 zv31Var, g0l g0lVar) {
        String name;
        String strD;
        l0l l0lVarX = sbl.x(zv31Var, g0lVar);
        this.b = (l0lVarX == null || (strD = l0lVarX.d()) == null) ? zv31Var.a : strD;
        l0l l0lVarX2 = sbl.x(zv31Var, g0lVar);
        this.c = (l0lVarX2 == null || (name = l0lVarX2.getName()) == null) ? zv31Var.b.a : name;
        l0l l0lVarX3 = sbl.x(zv31Var, g0lVar);
        this.d = l0lVarX3 != null ? l0lVarX3.l() : false;
        this.e = zv31Var.e;
    }

    public final String a() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return this.c;
    }

    public final String b() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return this.b;
    }

    public final boolean c() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return this.e;
    }

    public final boolean d() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return this.d;
    }

    public ewt(l0l l0lVar) {
        this.b = l0lVar.d();
        this.c = l0lVar.getName();
        this.d = l0lVar.l();
        this.e = l0lVar.n();
    }
}
