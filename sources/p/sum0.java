package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sum0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nl9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sum0(nl9 nl9Var, byte b) {
        super(4);
        this.a = b;
        this.b = nl9Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        nl9 nl9Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return (iul0) nl9Var.g;
            default:
                iul0 iul0Var = (iul0) obj;
                if (tum0.a[((lum0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC = iul0Var.a.c();
                x6h1VarC.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                ((gum0) ((ynb0) nl9Var.e).get()).getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:premium-destination?displayReason=multi_song_capping")), y6h1VarA, r6h1.c, System.currentTimeMillis());
        }
    }
}
