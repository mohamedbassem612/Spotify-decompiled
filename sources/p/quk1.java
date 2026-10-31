package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class quk1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tuk1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ quk1(tuk1 tuk1Var, byte b) {
        super(4);
        this.a = b;
        this.b = tuk1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        tuk1 tuk1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new zcl0(((dvk1) obj).c ? 2 : 1, tuk1Var.a, (r6h1) obj4);
            case 1:
                zcl0 zcl0Var = (zcl0) obj;
                syk1 syk1Var = (syk1) obj3;
                if (!((yuk1) obj4).equals(vuk1.a)) {
                    return null;
                }
                qyk1 qyk1Var = syk1Var instanceof qyk1 ? (qyk1) syk1Var : null;
                if (qyk1Var == null || !qyk1Var.e) {
                    return null;
                }
                x6h1 x6h1VarC = zcl0Var.b.c();
                x6h1VarC.i.add(new a7h1("confirm_vote_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("poll_vote", 2, Collections.singletonMap("poll_id", tuk1Var.a)), x6h1VarC.a(), zcl0Var.a, System.currentTimeMillis());
            default:
                ((Number) obj3).intValue();
                return new bdl0(tuk1Var.a, (r6h1) obj4);
        }
    }
}
