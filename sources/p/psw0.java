package p;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class psw0 implements nsw0, ven0 {
    public final /* synthetic */ ven0 a;
    public final o8n b;

    public psw0(ven0 ven0Var, o8n o8nVar) {
        this.a = ven0Var;
        this.b = o8nVar;
    }

    public final o8n J() {
        return this.b;
    }

    @Override // p.ven0
    public final iu30 b() {
        return this.a.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void d(Function0 function0, onm onmVar) {
        osw0 osw0Var;
        if (onmVar instanceof osw0) {
            osw0Var = (osw0) onmVar;
            int i = osw0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                osw0Var.d = i - Integer.MIN_VALUE;
            } else {
                osw0Var = new osw0(this, onmVar);
            }
        } else {
            osw0Var = new osw0(this, onmVar);
        }
        Object obj = osw0Var.b;
        int i2 = osw0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                osw0Var.a = (hab0) function0;
                osw0Var.d = 1;
                ohd ohdVar = new ohd(1, aym.t(osw0Var));
                ohdVar.t();
                if (ohdVar.r() == d9n.a) {
                    return;
                }
            } else if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                function0 = (Function0) osw0Var.a;
                hm5.M(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    @Override // p.tob1
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // p.ven0
    public final Object h() {
        return this.a.h();
    }

    @Override // p.ven0
    public final void setValue(Object obj) {
        this.a.setValue(obj);
    }
}
