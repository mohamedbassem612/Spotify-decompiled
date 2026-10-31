package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wdm1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cem1 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wdm1(cem1 cem1Var, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(1);
        this.a = b;
        this.b = cem1Var;
        this.c = ven0Var;
        this.d = ven0Var2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ven0 ven0Var = this.d;
        ven0 ven0Var2 = this.c;
        cem1 cem1Var = this.b;
        switch (b) {
            case 0:
                fem1 fem1Var = new fem1((Context) obj);
                fem1Var.setOnVideoSurfaceReady(new vdm1(cem1Var, (byte) 0));
                fem1Var.setOnFallbackFrameRendered(new e7m1(ven0Var2, (byte) 8));
                fem1Var.setOnVideoFrameRendered(new e7m1(ven0Var, (byte) 9));
                return fem1Var;
            default:
                fem1 fem1Var2 = (fem1) obj;
                fem1Var2.setOnVideoSurfaceReady((iu30) null);
                fem1Var2.setOnFallbackFrameRendered((iu30) null);
                fem1Var2.setOnVideoFrameRendered((iu30) null);
                qem1 qem1Var = cem1Var.d;
                if (qem1Var != null) {
                    qem1Var.f = null;
                    yo00 yo00Var = qem1Var.e;
                    if (yo00Var != null) {
                        yo00Var.l1();
                    }
                }
                fem1Var2.queueEvent(new eem1(fem1Var2, (byte) 2));
                Boolean bool = Boolean.FALSE;
                ven0Var2.setValue(bool);
                ven0Var.setValue(bool);
                return rih1.a;
        }
    }
}
