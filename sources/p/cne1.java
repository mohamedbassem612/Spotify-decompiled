package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cne1 extends hab0 implements iu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ h290 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cne1(String str, h290 h290Var, int i, iu30 iu30Var) {
        super(1);
        this.a = str;
        this.b = h290Var;
        this.c = i;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj) {
        e261 e261Var = (e261) obj;
        String str = this.a;
        if (str.length() > 0) {
            b261.n(e261Var, str);
        }
        h290 h290Var = this.b;
        int i = this.c;
        b261.A(e261Var, lbf1.a(((SceneTemplate.TimeMachineContent.Card2.YearEntry) h290Var.get(i)).p()));
        smc0 smc0VarN = k4p1.n();
        int size = h290Var.size() - 1;
        iu30 iu30Var = this.d;
        if (i < size) {
            smc0VarN.add(new epo(String.valueOf(((SceneTemplate.TimeMachineContent.Card2.YearEntry) h290Var.get(i + 1)).getYear()), new ck0(iu30Var, i, (byte) 25)));
        }
        if (i > 0) {
            smc0VarN.add(new epo(String.valueOf(((SceneTemplate.TimeMachineContent.Card2.YearEntry) h290Var.get(i - 1)).getYear()), new ck0(iu30Var, i, (byte) 26)));
        }
        b261.p(e261Var, k4p1.k(smc0VarN));
        return rih1.a;
    }
}
