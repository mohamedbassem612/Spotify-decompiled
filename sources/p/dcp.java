package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dcp implements kv51 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ dcp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final mv51 a(iu30 iu30Var) {
        byte b = this.a;
        thq thqVar = this.b;
        switch (b) {
            case 0:
                udv udvVar = (udv) ((e93) ((lbp) thqVar).c).c;
                Context context = (Context) udvVar.b.get();
                c8o.l(context);
                quc0 quc0Var = (quc0) udvVar.c.get();
                c8o.l(quc0Var);
                agc0 agc0Var = (agc0) udvVar.d.get();
                c8o.l(agc0Var);
                return new mv51(iu30Var, new aru0(context, quc0Var, agc0Var, (byte) 3));
            case 1:
                s7q s7qVar = ((r7q) thqVar).d;
                daq daqVar = s7qVar.b;
                return new mv51(iu30Var, new aru0((Context) daqVar.x1.a, (quc0) s7qVar.w9.get(), (agc0) daqVar.B7.get(), (byte) 3));
            default:
                ziq ziqVar = thqVar.c.a;
                daq daqVar2 = ziqVar.a;
                return new mv51(iu30Var, new aru0((Context) daqVar2.x1.a, (quc0) ziqVar.b.Mb.get(), (agc0) daqVar2.B7.get(), (byte) 3));
        }
    }
}
