package p;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gn8 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hn8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn8(hn8 hn8Var, byte b) {
        super(0);
        this.a = b;
        this.b = hn8Var;
    }

    public final Object invoke() {
        byte b = this.a;
        hn8 hn8Var = this.b;
        switch (b) {
            case 0:
                wm8 wm8Var = hn8Var.c2;
                if (wm8Var != null) {
                    return new xm8(wm8Var, hn8Var.O0().getString("authorUri"), (byte) 0);
                }
                u890.C("authorBioApiService");
                throw null;
            case 1:
                e2p e2pVar = hn8Var.d2;
                if (e2pVar == null) {
                    u890.C("bottomSheetTransitionLoggerFactory");
                    throw null;
                }
                lik1 lik1Var = new lik1(hn8Var.O0().getString("authorUri").concat(":biography"));
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                p6r0 p6r0VarG1 = yon1.G1("AUTHOR_BIOGRAPHY", "author/biography", 209, "author");
                ou80 serializable = hn8Var.O0().getSerializable("interactionId");
                oql oqlVar = (oql) e2pVar.a.b;
                mwn0 mwn0Var = (mwn0) ((fn8) oqlVar.b).d.get();
                c8o.l(mwn0Var);
                vkg vkgVar = (Activity) ((fn8) oqlVar.b).a.get();
                c8o.l(vkgVar);
                return new qyb(mwn0Var, vkgVar, lik1Var, p6r0VarG1, serializable);
            default:
                hn8Var.dismiss();
                return rih1.a;
        }
    }
}
