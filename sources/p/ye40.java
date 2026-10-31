package p;

import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ye40 implements Cloneable {
    public final e a;
    public e b;
    public boolean c = false;

    public ye40(e eVar) {
        this.a = eVar;
        this.b = (e) eVar.d(4);
    }

    public static void e(e eVar, e eVar2) {
        piy0 piy0Var = piy0.c;
        piy0Var.getClass();
        piy0Var.a(eVar.getClass()).e(eVar, eVar2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.UninitializedMessageException */
    public final e a() throws UninitializedMessageException {
        e eVarB = b();
        if (eVarB.g()) {
            return eVarB;
        }
        throw new UninitializedMessageException();
    }

    public final e b() {
        boolean z = this.c;
        e eVar = this.b;
        if (z) {
            return eVar;
        }
        eVar.getClass();
        piy0 piy0Var = piy0.c;
        piy0Var.getClass();
        piy0Var.a(eVar.getClass()).a(eVar);
        this.c = true;
        return this.b;
    }

    public final Object clone() {
        ye40 ye40Var = (ye40) this.a.d(5);
        e eVarB = b();
        ye40Var.d();
        e(ye40Var.b, eVarB);
        return ye40Var;
    }

    public final void d() {
        if (this.c) {
            e eVar = (e) this.b.d(4);
            e(eVar, this.b);
            this.b = eVar;
            this.c = false;
        }
    }
}
