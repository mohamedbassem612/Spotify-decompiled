package p;

import android.content.Context;
import android.view.ViewGroup;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class igb0 implements byf0 {
    public static final /* synthetic */ mma0[] i = {new een0(igb0.class, "shortcutDetails", "getShortcutDetails()Lcom/spotify/customshortcuts/lastvisitedpage/LastVisitedPageShortcutPlugin$Companion$ShortcutDetails;", 0)};
    public final egb0 a;
    public final uo5 b;
    public Context c;
    public final idd1 d;
    public final idd1 e;
    public final idd1 f;
    public Disposable g;
    public final ce0 h = new ce0(this, (byte) 12);

    public igb0(bbr0 bbr0Var, egb0 egb0Var, uo5 uo5Var) {
        this.a = egb0Var;
        this.b = uo5Var;
        this.d = new idd1(new ik30(bbr0Var, (byte) 2));
        this.e = new idd1(new cc00(bbr0Var, (byte) 20));
        this.f = new idd1(new ik30(bbr0Var, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    public final void d() {
        String str;
        String strR;
        ryn1 ryn1Var;
        lik1 lik1Var;
        bn70 bn70VarA = ((war0) this.d.getValue()).a();
        ggb0 ggb0Var = null;
        if (bn70VarA == null || (lik1Var = bn70VarA.b) == null || (str = lik1Var.a) == null || ihc1.y0(str)) {
            str = null;
        }
        yxe1 yxe1VarA = ((war0) this.e.getValue()).a();
        if (yxe1VarA == null || (ryn1Var = yxe1VarA.a) == null) {
            strR = null;
        } else {
            Context context = this.c;
            if (context == null) {
                u890.C("context");
                throw null;
            }
            strR = uyn1.r(ryn1Var, context);
            if (strR == null || ihc1.y0(strR)) {
                strR = null;
            }
        }
        u17 u17VarA = ((war0) this.f.getValue()).a();
        wz6 wz6Var = u17VarA != null ? u17VarA.a : uz6.a;
        if (str != null && strR != null) {
            ggb0Var = new ggb0(str, strR, wz6Var);
        }
        this.h.c(i[0], this, ggb0Var);
    }

    public final void g(ViewGroup viewGroup) {
        this.c = viewGroup.getContext();
    }

    public final void c() {
    }
}
