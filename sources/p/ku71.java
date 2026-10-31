package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ku71 {
    public static final bma1 d = bma1.b.u("preview_player_progress_storage_key");
    public final dma1 a;
    public final nfa0 b;
    public final bpb1 c = gio1.b(b7x.a);

    public ku71(dma1 dma1Var, nfa0 nfa0Var, du71 du71Var) {
        this.a = dma1Var;
        this.b = nfa0Var;
    }

    public final Long a(String str) {
        long jA = ((gu71) ((Map) this.c.getValue()).getOrDefault(str, new gu71(0L, 0L))).a();
        Long lValueOf = Long.valueOf(jA);
        if (jA > 0) {
            return lValueOf;
        }
        return null;
    }

    public final void b() {
        bpb1 bpb1Var = this.c;
        boolean zIsEmpty = ((Map) bpb1Var.getValue()).isEmpty();
        bma1 bma1Var = d;
        dma1 dma1Var = this.a;
        if (zIsEmpty) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.f(bma1Var);
            hma1VarEdit.g();
        } else {
            Map mapT = sqg0.T(o7h.d1(o7h.a1(sqg0.S((Map) bpb1Var.getValue()), new be21((byte) 9)), 40));
            hma1 hma1VarEdit2 = dma1Var.edit();
            hma1VarEdit2.d(bma1Var, this.b.b(ju71.Companion.serializer(), new ju71(mapT)));
            hma1VarEdit2.g();
        }
    }
}
