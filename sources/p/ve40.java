package p;

import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import androidx.glance.appwidget.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ve40 implements Cloneable {
    public final e a;
    public e b;

    public ve40(e eVar) {
        this.a = eVar;
        if (eVar.f()) {
            hhg1.n("Default instance must be immutable.");
            throw null;
        }
        this.b = eVar.h();
    }

    public static void e(Object obj, Object obj2) {
        liy0.a().c(obj).d(obj, obj2);
    }

    public final e a() {
        e eVarB = b();
        eVarB.getClass();
        if (e.e(eVarB, true)) {
            return eVarB;
        }
        throw new UninitializedMessageException();
    }

    public final e b() {
        boolean zF = this.b.f();
        e eVar = this.b;
        if (!zF) {
            return eVar;
        }
        eVar.getClass();
        liy0.a().c(eVar).a(eVar);
        eVar.g();
        return this.b;
    }

    public final Object clone() {
        ve40 ve40Var = (ve40) this.a.b(5);
        ve40Var.b = b();
        return ve40Var;
    }

    public final void d() {
        if (this.b.f()) {
            return;
        }
        e eVarH = this.a.h();
        e(eVarH, this.b);
        this.b = eVarH;
    }
}
