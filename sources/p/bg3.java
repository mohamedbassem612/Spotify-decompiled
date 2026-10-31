package p;

import android.content.Context;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bg3 implements zqw {
    public final /* synthetic */ byte a = 1;
    public final bk90 b;
    public final n381 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public bg3(String str, bk90 bk90Var, p1p p1pVar) {
        this.d = str;
        this.b = bk90Var;
        this.e = p1pVar;
        ge7 ge7Var = ge7.Z;
        n381 n381Var = p381.a;
        this.c = new n381(ge7Var);
        this.f = new x6o0(this, (byte) 27);
        this.g = new i26(this, (byte) 17);
    }

    @Override // p.zqw
    public final m381 c() {
        byte b = this.a;
        return this.c;
    }

    @Override // p.zqw
    public final boolean d(hwq hwqVar) {
        j7e0 j7e0Var;
        switch (this.a) {
            case 0:
                l7e0 l7e0Var = hwqVar.g;
                j7e0Var = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
                if (j7e0Var != null) {
                    Set set = s4b1.f;
                    if (uic.x(j7e0Var.b).c == blc0.ti) {
                        return true;
                    }
                }
                return false;
            default:
                l7e0 l7e0Var2 = hwqVar.g;
                j7e0Var = l7e0Var2 instanceof j7e0 ? (j7e0) l7e0Var2 : null;
                if (j7e0Var != null) {
                    Set set2 = s4b1.f;
                    if (uic.x(j7e0Var.b).c == blc0.fh) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // p.zqw
    public final Function0 e() {
        switch (this.a) {
            case 0:
                return (g82) this.f;
            default:
                return (i26) this.g;
        }
    }

    public bg3(gzo gzoVar, bk90 bk90Var, Context context) {
        this.d = gzoVar;
        this.b = bk90Var;
        this.e = context;
        we3 we3Var = we3.Q0;
        n381 n381Var = p381.a;
        this.c = new n381(we3Var);
        this.f = new g82(this, (byte) 14);
        this.g = new e4b1(this, (byte) 12);
    }
}
