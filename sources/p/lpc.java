package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lpc extends hf30 {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ uz21 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpc(uyp0 uyp0Var, gbc gbcVar) {
        super(gbcVar);
        this.c = uyp0Var;
    }

    @Override // p.hf30, p.fka1
    public long O0(nac nacVar, long j) throws IOException {
        switch (this.b) {
            case 1:
                try {
                    return this.a.O0(nacVar, j);
                } catch (IOException e) {
                    ((uyp0) this.c).d = e;
                    throw e;
                }
            default:
                return super.O0(nacVar, j);
        }
    }

    @Override // p.hf30, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.b) {
            case 0:
                ((mpc) this.c).b.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpc(fka1 fka1Var, mpc mpcVar) {
        super(fka1Var);
        this.c = mpcVar;
    }
}
