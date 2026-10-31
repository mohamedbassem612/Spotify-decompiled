package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wgb0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wgb0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                y861 y861Var = (y861) this.b;
                Object obj2 = y861Var.b;
                ohd ohdVar = (ohd) this.c;
                synchronized (obj2) {
                    ((ArrayList) y861Var.c).remove(ohdVar);
                }
                return rih1.a;
            default:
                ((mgo1) this.b).t((jyc) this.c, (jyc) obj);
                return rih1.a;
        }
    }
}
