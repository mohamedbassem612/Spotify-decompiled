package p;

import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class we40 implements Cloneable {
    public final e a;
    public e b;
    public boolean c = false;

    public we40(e eVar) {
        this.a = eVar;
        this.b = (e) eVar.f(4);
    }

    public static void e(e eVar, e eVar2) {
        miy0 miy0Var = miy0.c;
        miy0Var.getClass();
        miy0Var.a(eVar.getClass()).h(eVar, eVar2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.UninitializedMessageException */
    public final e a() throws UninitializedMessageException {
        e eVarB = b();
        if (eVarB.i()) {
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
        miy0 miy0Var = miy0.c;
        miy0Var.getClass();
        miy0Var.a(eVar.getClass()).a(eVar);
        this.c = true;
        return this.b;
    }

    public final Object clone() {
        we40 we40Var = (we40) this.a.f(5);
        e eVarB = b();
        we40Var.d();
        e(we40Var.b, eVarB);
        return we40Var;
    }

    public final void d() {
        if (this.c) {
            e eVar = (e) this.b.f(4);
            e(eVar, this.b);
            this.b = eVar;
            this.c = false;
        }
    }
}
