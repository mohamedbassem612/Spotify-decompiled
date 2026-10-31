package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ljm1 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    public static final m8m1 a(o6 o6Var, qzj qzjVar, j2i j2iVar) {
        ha4 ha4Var;
        m8m1 m8m1Var;
        if (sv40.a.compareAndSet(false, true)) {
            bbc bbcVarA = mno1.a(1, 0, 6);
            idd1 idd1Var = w55.Z;
            c921.y(smo1.e(ton1.u()), (o8n) null, 0, new f530(bbcVarA, (lnm) null, (byte) 10), 3);
            ekb.B(new gv20(bbcVarA, (byte) 2));
        }
        if (o6Var.getChildCount() > 0) {
            View childAt = o6Var.getChildAt(0);
            ha4Var = childAt instanceof ha4 ? (ha4) childAt : null;
            if (ha4Var != null) {
                ha4Var.setComposeViewContext(qzjVar);
            }
            if (ha4Var == null) {
                ha4Var = new ha4(o6Var.getContext(), qzjVar);
                o6Var.addView(ha4Var.getView(), a);
            }
            ha4Var.setComposeViewContext(qzjVar);
            if (o6Var.getComposeViewContext$ui() != null) {
                qzjVar.e();
                ha4Var.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = ha4Var.getTag(2131431714);
            m8m1Var = tag instanceof m8m1 ? (m8m1) tag : null;
            if (m8m1Var == null) {
                m8m1Var = new m8m1(ha4Var, h7w.d(new wch1(ha4Var.getRoot()), qzjVar.c()));
                ha4Var.setTag(2131431714, m8m1Var);
            }
            m8m1Var.a(j2iVar);
            ha4Var.setFrameEndScheduler$ui(new kjm1(qzjVar.c()));
            return m8m1Var;
        }
        o6Var.removeAllViews();
        ha4Var = null;
        if (ha4Var == null) {
            ha4Var = new ha4(o6Var.getContext(), qzjVar);
            o6Var.addView(ha4Var.getView(), a);
        }
        ha4Var.setComposeViewContext(qzjVar);
        if (o6Var.getComposeViewContext$ui() != null) {
            qzjVar.e();
            ha4Var.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = ha4Var.getTag(2131431714);
        if (tag2 instanceof m8m1) {
        }
        if (m8m1Var == null) {
            m8m1Var = new m8m1(ha4Var, h7w.d(new wch1(ha4Var.getRoot()), qzjVar.c()));
            ha4Var.setTag(2131431714, m8m1Var);
        }
        m8m1Var.a(j2iVar);
        ha4Var.setFrameEndScheduler$ui(new kjm1(qzjVar.c()));
        return m8m1Var;
    }
}
