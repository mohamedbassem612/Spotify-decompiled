package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mn50 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nn50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn50(nn50 nn50Var, byte b) {
        super(4);
        this.a = b;
        this.b = nn50Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        nn50 nn50Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new scl0(new g5l0(l1d.m("spotify:chat:", nn50Var.b), (r6h1) obj4, (byte) 17));
            default:
                scl0 scl0Var = (scl0) obj;
                if (((ln50) obj4).equals(ln50.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", l1d.m("spotify:listening-activity:group-audience-selection:", nn50Var.b))), scl0Var.a, scl0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
        }
    }
}
