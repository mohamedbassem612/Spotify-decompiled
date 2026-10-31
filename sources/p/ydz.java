package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ydz implements vn90 {
    public final /* synthetic */ byte a = 1;
    public final boolean b;
    public final int c;
    public final int d;
    public final b380 e;

    public ydz(vn90 vn90Var, vn90 vn90Var2) {
        v280 v280VarM = b380.m();
        v280VarM.e(vn90Var.getItems());
        v280VarM.e(vn90Var2.getItems());
        this.e = v280VarM.g();
        this.b = vn90Var.b() || vn90Var2.b();
        this.c = vn90Var2.c() + vn90Var.c();
        this.d = vn90Var2.a() + vn90Var.a();
    }

    @Override // p.vn90
    public final int a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // p.vn90
    public final boolean b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // p.vn90
    public final int c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // p.vn90
    public final List getItems() {
        byte b = this.a;
        bg11 bg11Var = this.e;
        switch (b) {
            case 0:
                break;
        }
        return bg11Var;
    }

    public ydz(b380 b380Var, vn90 vn90Var) {
        b380Var.getClass();
        this.e = b380Var;
        this.b = vn90Var.b();
        this.c = b380Var.size();
        this.d = b380Var.size();
    }
}
