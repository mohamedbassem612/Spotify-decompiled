package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ien0 implements u601 {
    public final bpb1 a;

    public ien0(Object obj) {
        this.a = gio1.b(obj);
    }

    public final mr20 a() {
        return this.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(vu30 vu30Var, lnm lnmVar) throws KotlinNothingValueException {
        hen0 hen0Var;
        if (lnmVar instanceof hen0) {
            hen0Var = (hen0) lnmVar;
            int i = hen0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hen0Var.c = i - Integer.MIN_VALUE;
            } else {
                hen0Var = new hen0(this, lnmVar);
            }
        } else {
            hen0Var = new hen0(this, lnmVar);
        }
        Object obj = hen0Var.a;
        int i2 = hen0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        t940 t940Var = new t940(vu30Var, (byte) 1);
        hen0Var.c = 1;
        this.a.collect(t940Var, hen0Var);
        return d9n.a;
    }

    public final void c(Object obj) {
        this.a.l(obj);
    }

    public final Object getValue() {
        return this.a.getValue();
    }
}
