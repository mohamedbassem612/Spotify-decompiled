package p;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wxq0 implements IntConsumer {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ ye5 b;
    public final /* synthetic */ StringBuilder c;
    public final /* synthetic */ p811 d;
    public final /* synthetic */ p811 e;
    public final /* synthetic */ iu30 f;

    public wxq0(p811 p811Var, ye5 ye5Var, StringBuilder sb, p811 p811Var2, p811 p811Var3, iu30 iu30Var) {
        this.a = p811Var;
        this.b = ye5Var;
        this.c = sb;
        this.d = p811Var2;
        this.e = p811Var3;
        this.f = iu30Var;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        p811 p811Var = this.a;
        int iOrdinal = ((qdh0) p811Var.a).ordinal();
        ye5 ye5Var = this.b;
        StringBuilder sb = this.c;
        if (iOrdinal == 0) {
            if (i != 91) {
                sb.append((char) i);
                return;
            }
            ye5Var.g(sb.toString());
            sb.setLength(0);
            p811Var.a = qdh0.b;
            return;
        }
        p811 p811Var2 = this.d;
        if (iOrdinal == 1) {
            if (i == 40) {
                sb.setLength(0);
                p811Var.a = qdh0.c;
                return;
            } else if (i != 93) {
                sb.append((char) i);
                return;
            } else {
                p811Var2.a = sb.toString();
                return;
            }
        }
        if (iOrdinal != 2) {
            eg.o();
            return;
        }
        if (i != 41) {
            sb.append((char) i);
            return;
        }
        String string = sb.toString();
        this.e.a = string;
        vhg.d(ye5Var, (String) p811Var2.a, string, this.f);
        sb.setLength(0);
        p811Var.a = qdh0.a;
    }
}
