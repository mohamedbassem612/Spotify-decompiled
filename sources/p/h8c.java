package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h8c implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ h8c(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        o6p1 ge80Var;
        cyo1 j7j0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                if (obj != null) {
                    consumer.accept(obj);
                    return rih1Var;
                }
                hhg1.n("Required value was null.");
                return null;
            case 1:
                consumer.accept(plh.a);
                return rih1Var;
            case 2:
                consumer.accept(new fw00(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 3:
                consumer.accept(obj);
                return rih1Var;
            case 4:
                if80 if80Var = (jf80) obj;
                if (if80Var instanceof if80) {
                    ge80Var = new ge80(if80Var.a.d().b);
                } else {
                    boolean z = if80Var instanceof hf80;
                    ee80 ee80Var = ee80.c;
                    if (!z && !(if80Var instanceof gf80)) {
                        eg.o();
                        return null;
                    }
                    ge80Var = ee80Var;
                }
                consumer.accept(new le80(ge80Var));
                return rih1Var;
            case 5:
                if80 if80Var2 = (jf80) obj;
                if (if80Var2 instanceof if80) {
                    j7j0Var = new j7j0(if80Var2.a.d().b);
                } else {
                    boolean z2 = if80Var2 instanceof hf80;
                    h7j0 h7j0Var = h7j0.c;
                    if (!z2 && !(if80Var2 instanceof gf80)) {
                        eg.o();
                        return null;
                    }
                    j7j0Var = h7j0Var;
                }
                consumer.accept(new z6j0(j7j0Var));
                return rih1Var;
            case 6:
                consumer.accept(new ew00((jx00) obj));
                return rih1Var;
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    consumer.accept(dw00.a);
                }
                return rih1Var;
            default:
                consumer.accept(new tw00(((Boolean) obj).booleanValue()));
                return rih1Var;
        }
    }
}
