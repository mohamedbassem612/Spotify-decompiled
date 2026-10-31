package p;

import android.os.Build;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p250 implements a4l {
    public final tzt a;
    public final ay40 b;
    public final mk4 c;
    public final yqg d;
    public final llm e;
    public final bpb1 f = gio1.b(new k250());

    public p250(tzt tztVar, ay40 ay40Var, mk4 mk4Var, yqg yqgVar, q8n q8nVar) {
        this.a = tztVar;
        this.b = ay40Var;
        this.c = mk4Var;
        this.d = yqgVar;
        this.e = l1d.x(q8nVar);
    }

    @Override // p.a4l
    public final void a() {
        if (c()) {
            this.f.m((Object) null, new k250());
            llm llmVar = this.e;
            op71.r(llmVar.a);
            c921.y(llmVar, (o8n) null, 0, new o250(this, (lnm) null, (byte) 2), 3);
        }
    }

    @Override // p.a4l
    public final void b() {
        if (c()) {
            o250 o250Var = new o250(this, (lnm) null, (byte) 0);
            llm llmVar = this.e;
            c921.y(llmVar, (o8n) null, 0, o250Var, 3);
            c921.y(llmVar, (o8n) null, 0, new o250(this, (lnm) null, (byte) 1), 3);
        }
    }

    public final boolean c() {
        return this.c.d() && Build.VERSION.SDK_INT >= 34;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void d(onm onmVar) throws KotlinNothingValueException {
        n250 n250Var;
        if (onmVar instanceof n250) {
            n250Var = (n250) onmVar;
            int i = n250Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n250Var.c = i - Integer.MIN_VALUE;
            } else {
                n250Var = new n250(this, onmVar);
            }
        } else {
            n250Var = new n250(this, onmVar);
        }
        Object obj = n250Var.a;
        int i2 = n250Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            ve01 ve01VarG = d5p1.g(this.b.e);
            xp10 xp10Var = new xp10(this, (byte) 10);
            n250Var.c = 1;
            if (ve01VarG.a.collect(xp10Var, n250Var) == d9n.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            hm5.M(obj);
        }
        jah.d();
    }
}
