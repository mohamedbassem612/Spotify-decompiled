package p;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gc9 implements ec10 {
    public final /* synthetic */ byte a;
    public final izr0 b;
    public final j191 c;

    public gc9(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new izr0(4);
                this.c = new j191(-1, -1, "image/webp");
                break;
            default:
                this.b = new izr0(4);
                this.c = new j191(-1, -1, "image/avif");
                break;
        }
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        byte b = this.a;
        j191 j191Var = this.c;
        switch (b) {
            case 0:
                j191Var.a(j, j2);
                break;
            default:
                j191Var.a(j, j2);
                break;
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        byte b = this.a;
        j191 j191Var = this.c;
        switch (b) {
            case 0:
                j191Var.b(gc10Var);
                break;
            default:
                j191Var.b(gc10Var);
                break;
        }
    }

    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) {
        byte b = this.a;
        j191 j191Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return j191Var.c(fc10Var, sfv0Var);
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) throws InterruptedIOException {
        byte b = this.a;
        izr0 izr0Var = this.b;
        switch (b) {
            case 0:
                uyr uyrVar = (uyr) fc10Var;
                uyrVar.v(4, false);
                izr0Var.O(4);
                uyrVar.d(izr0Var.a, 0, 4, false);
                if (izr0Var.G() == 1718909296) {
                    izr0Var.O(4);
                    uyrVar.d(izr0Var.a, 0, 4, false);
                    if (izr0Var.G() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                izr0Var.O(4);
                uyr uyrVar2 = (uyr) fc10Var;
                uyrVar2.d(izr0Var.a, 0, 4, false);
                if (izr0Var.G() == 1380533830) {
                    uyrVar2.v(4, false);
                    izr0Var.O(4);
                    uyrVar2.d(izr0Var.a, 0, 4, false);
                    if (izr0Var.G() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // p.ec10
    public final void release() {
        byte b = this.a;
    }

    private final void f() {
    }

    private final void g() {
    }
}
