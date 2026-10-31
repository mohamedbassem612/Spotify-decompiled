package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class wxb0 extends k01 implements iu30 {
    public static final wxb0 h = new wxb0(1, eyb0.class, "<init>", "<init>(Lcom/spotify/adsdisplay/element/leavebehindads/LeaveBehindAdsElement$Props;IIZZZLcom/spotify/leavebehindads/cta/actionhandling/Surface;Lcom/spotify/adsdisplay/elementimpl/leavebehindads/instrumentation/LeaveBehindAdsInstrumentation;)V", 0);

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        boolean z;
        dyb0 dyb0Var;
        vxb0 vxb0Var = (vxb0) obj;
        int i = 1;
        if (fyb0.b(vxb0Var)) {
            i = 3;
        }
        int i2 = fyb0.a;
        boolean zA = fyb0.a(vxb0Var);
        boolean zC = fyb0.c(vxb0Var);
        if (fyb0.a(vxb0Var) || fyb0.c(vxb0Var)) {
            z = 0;
        } else {
            boolean zB = fyb0.b(vxb0Var);
            List list = vxb0Var.b;
            if (zB) {
                if (list.size() > (fyb0.b(vxb0Var) ? 3 : 1)) {
                    z = i;
                } else {
                    z = 0;
                }
            } else if (list.isEmpty()) {
                z = 0;
            } else {
                z = i;
            }
        }
        d3d1 d3d1Var = fyb0.b(vxb0Var) ? d3d1.g : d3d1.f;
        if (fyb0.b(vxb0Var)) {
            dyb0Var = byb0.d;
        } else {
            dyb0Var = fyb0.a(vxb0Var) ? ayb0.d : cyb0.d;
        }
        return new eyb0(vxb0Var, i, i2, zA, zC, z, d3d1Var, dyb0Var);
    }
}
