package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class owo1 extends k9 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ owo1(byte b) {
        super((byte) 9);
        this.c = b;
    }

    public final Object C0(Object obj) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qok0 qok0VarC = qok0.c();
                return new bwo1(qok0VarC.b(), (ot71) qok0VarC.a(ot71.class), new tvo1(qok0.c().b(), (kvo1) obj));
            case 1:
                qok0 qok0VarC2 = qok0.c();
                Context contextB = qok0.c().b();
                ArrayList arrayList = new ArrayList();
                ((l7p1) obj).getClass();
                jim1 jim1Var = new jim1();
                xhc xhcVar = xhc.e;
                jog1.b(contextB);
                jog1.a().c(xhcVar);
                xhc.d.contains(new bbx("json"));
                arrayList.add(jim1Var);
                return new o8p1(qok0VarC2.b(), (ot71) qok0VarC2.a(ot71.class));
            case 2:
                kbp1 kbp1Var = (kbp1) obj;
                qok0 qok0VarC3 = qok0.c();
                return new ecp1(qok0VarC3.b(), (ot71) qok0VarC3.a(ot71.class), new pbp1(qok0.c().b(), kbp1Var), kbp1Var.a);
            default:
                vfp1 vfp1Var = (vfp1) obj;
                qok0 qok0VarC4 = qok0.c();
                Context contextB2 = qok0.c().b();
                lzm1 lzm1Var = new lzm1();
                ArrayList arrayList2 = new ArrayList();
                vfp1Var.getClass();
                d8n1 d8n1Var = new d8n1();
                xhc xhcVar2 = xhc.e;
                jog1.b(contextB2);
                hog1 hog1VarC = jog1.a().c(xhcVar2);
                if (xhc.d.contains(new bbx("json"))) {
                    new aob0(new gwo1(hog1VarC, (byte) 4));
                }
                new aob0(new gwo1(hog1VarC, (byte) 5));
                arrayList2.add(d8n1Var);
                return new dgp1(qok0VarC4.b(), (ot71) qok0VarC4.a(ot71.class), lzm1Var, vfp1Var.a);
        }
    }
}
