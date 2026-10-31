package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jun implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public jun(ug3 ug3Var, Consumer consumer) {
        this.a = (byte) 5;
        this.b = consumer;
    }

    public final void b(Object obj) {
        vga1 vga1VarF;
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(new xtn((CharSequence) obj));
                break;
            case 1:
                fun funVar = (fun) obj;
                funVar.getClass();
                consumer.accept(new wtn(funVar));
                break;
            case 2:
                consumer.accept(new rtn(((tb2) obj).a));
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                consumer.accept(new ztn(str));
                break;
            case 4:
                mqc0 mqc0Var = (mqc0) obj;
                if (mqc0Var instanceof kqc0) {
                    consumer.accept(new npc0(new kpc0(((kqc0) mqc0Var).a)));
                } else if (!(mqc0Var instanceof lqc0)) {
                    eg.o();
                } else {
                    consumer.accept(new npc0(lpc0.a));
                }
                break;
            default:
                ob31 ob31Var = (pb31) obj;
                if (ob31Var instanceof kb31) {
                    vga1VarF = new vga1((uga1) null, (sga1) null, false, (cga1) null, 15);
                } else if (ob31Var instanceof ob31) {
                    vga1VarF = ug3.f(ob31Var.d());
                } else if (!(ob31Var instanceof lb31)) {
                    eg.o();
                } else {
                    vga1VarF = ug3.f(((lb31) ob31Var).d);
                }
                pga1 pga1Var = new pga1(vga1VarF);
                consumer.getClass();
                consumer.accept(pga1Var);
                break;
        }
    }

    public /* synthetic */ jun(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }
}
