package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ior {
    public final apr a;
    public final r2l b;
    public final fur c;

    public ior(apr aprVar, r2l r2lVar, fur furVar) {
        this.a = aprVar;
        this.b = r2lVar;
        this.c = furVar;
    }

    public final void a(String str, boolean z) {
        if (!this.a.c()) {
            this.c.a(str, z);
            return;
        }
        r2l r2lVar = this.b;
        v1k v1kVar = r2lVar.g;
        i8h1 i8h1Var = (i8h1) v1kVar.b;
        dg30 dg30Var = r2lVar.a;
        l0l l0lVarC = r2lVar.e.c();
        if (l0lVarC == null || l0lVarC.l()) {
            r2lVar.b.a().g1(dg30Var.e0(), "ConnectDisabledBluetoothDialogFragment");
            i8h1Var.f(((dsk0) v1kVar.c).e(), (Set) null);
        } else {
            r2lVar.c.a().g1(dg30Var.e0(), "ConnectDisabledBluetoothDialogFragment");
            i8h1Var.f(((dsk0) v1kVar.d).e(), (Set) null);
        }
    }
}
