package p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wjz extends qx81 {
    public final h0h1 b;
    public final wiz c;
    public final zjz d;
    public final List e;
    public final boolean f;
    public final String[] g;
    public final String h;

    public wjz(h0h1 h0h1Var, wiz wizVar, zjz zjzVar, List list, boolean z, String... strArr) {
        this.b = h0h1Var;
        this.c = wizVar;
        this.d = zjzVar;
        this.e = list;
        this.f = z;
        this.g = strArr;
        String str = zjzVar.a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.h = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // p.qx81, p.gmh1
    /* JADX INFO: renamed from: A0 */
    public final qx81 x0(boolean z) {
        String[] strArr = this.g;
        return new wjz(this.b, this.c, this.d, this.e, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // p.a8b0
    public final zpi0 E() {
        return this.c;
    }

    @Override // p.a8b0
    public final List r0() {
        return this.e;
    }

    @Override // p.a8b0
    public final h0h1 t0() {
        return this.b;
    }

    @Override // p.a8b0
    public final boolean u0() {
        return this.f;
    }
}
