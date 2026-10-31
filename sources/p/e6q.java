package p;

import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e6q implements pj3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ e6q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final oj3 a(r290 r290Var) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                r7q r7qVar = (r7q) jly0Var;
                jnq jnqVarQ0 = r7qVar.d.Q0();
                daq daqVar = r7qVar.b;
                return new oj3(jnqVarQ0, Optional.of(daqVar.s8), (q8n) daqVar.E1.get(), r290Var);
            default:
                daq daqVar2 = ((caq) jly0Var).a;
                daqVar2.getClass();
                h380 h380VarB = j380.b(8);
                h380VarB.e(blc0.CLIP, daqVar2.E());
                h380VarB.e(blc0.SHOW_EPISODE, new k3z((byte) 0));
                h380VarB.e(blc0.KALLAX, new k3z((byte) 1));
                h380VarB.e(blc0.PODCAST_CHAPTER, new img((xrm1) daqVar2.l7.get(), (byte) 1));
                h380VarB.e(blc0.SHOW_SHOW, new img((p981) daqVar2.i8.get(), (byte) 2));
                h380VarB.e(blc0.TRACK, new xmf1((agc0) daqVar2.B7.get(), (nwf1) daqVar2.o8.get()));
                h380VarB.e(blc0.TRANSITION, daqVar2.e2());
                h380VarB.e(blc0.TRANSITION_WITH_REVISION, daqVar2.e2());
                return new oj3(new jnq(new a0m(h380VarB.b(true), (byte) 28), daqVar2.X(), daqVar2.O(), new rjn(daqVar2.R(), (byte) 19), new lqc((byte) 3)), Optional.of(daqVar2.s8), (q8n) daqVar2.E1.get(), r290Var);
        }
    }
}
