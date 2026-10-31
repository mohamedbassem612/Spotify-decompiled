package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gbx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o70(gbx gbxVar, byte b) {
        super(1);
        this.a = b;
        this.b = gbxVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gbx gbxVar = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                if (gbxVar != null) {
                    b261.x(e261Var, 0);
                    b261.g(e261Var, gbxVar.c, new n70(gbxVar, (byte) 0));
                }
                break;
            case 1:
                ((Boolean) obj).getClass();
                gbxVar.b.invoke();
                break;
            case 2:
                ((Boolean) obj).getClass();
                gbxVar.b.invoke();
                break;
            case 3:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 0);
                if (gbxVar != null) {
                    b261.g(e261Var2, gbxVar.c, new n70(gbxVar, (byte) 2));
                }
                break;
            case 4:
                e261 e261Var3 = (e261) obj;
                if (gbxVar != null) {
                    b261.p(e261Var3, Collections.singletonList((epo) gbxVar.d.getValue()));
                }
                break;
            case 5:
                ((Boolean) obj).getClass();
                gbxVar.b.invoke();
                break;
            default:
                b261.p((e261) obj, Collections.singletonList((epo) gbxVar.d.getValue()));
                break;
        }
        return rih1Var;
    }
}
