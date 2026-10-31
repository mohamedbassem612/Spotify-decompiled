package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pxf0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qxf0 b;

    public /* synthetic */ pxf0(qxf0 qxf0Var, byte b) {
        this.a = b;
        this.b = qxf0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        qxf0 qxf0Var = this.b;
        switch (b) {
            case 0:
                qxf0Var.J1();
                return rih1.a;
            case 1:
                return new Offset(qxf0Var.c1);
            default:
                elb0 elb0Var = (elb0) qxf0Var.a1.getValue();
                return new Offset(elb0Var != null ? elb0Var.O(0L) : 9205357640488583168L);
        }
    }
}
