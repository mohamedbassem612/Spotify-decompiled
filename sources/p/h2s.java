package p;

import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h2s extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m2s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2s(m2s m2sVar, byte b) {
        super(1);
        this.a = b;
        this.b = m2sVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m2s m2sVar = this.b;
        switch (b) {
            case 0:
                long j = ((yr80) obj).a;
                ComposeView composeView = (ComposeView) m2sVar.i.b;
                if (composeView.getHeight() != ((int) (4294967295L & j))) {
                    composeView.post(new g2s(composeView, j, (byte) 0));
                }
                break;
            default:
                mt70 mt70Var = (mt70) obj;
                iu30 iu30Var = m2sVar.t;
                if (iu30Var != null) {
                    iu30Var.invoke(mt70Var);
                }
                break;
        }
        return rih1Var;
    }
}
