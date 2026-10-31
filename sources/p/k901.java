package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k901 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l901 b;

    public /* synthetic */ k901(l901 l901Var, byte b) {
        this.a = b;
        this.b = l901Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        l901 l901Var = this.b;
        switch (b) {
            case 0:
                a1r0 a1r0Var = l901Var.c;
                if (!a1r0Var.h(l901Var.a)) {
                    l901Var.b.e();
                } else {
                    a1r0Var.g();
                }
                break;
            default:
                z801 z801Var = (z801) obj;
                uxy0 uxy0Var = l901Var.f;
                th30 th30Var = (th30) uxy0Var.b;
                uww0 uww0Var = (uww0) uxy0Var.c;
                String str = z801Var.a;
                String str2 = z801Var.b;
                if (!th30Var.U()) {
                    y901 y901VarA = uww0Var.a();
                    y901VarA.T0(mno1.h(new mmr0[]{new mmr0("episode_uri", str), new mmr0("transcript_uri", str2)}));
                    y901VarA.g1(th30Var, "read_along_report_issue_dialog");
                }
                break;
        }
    }
}
