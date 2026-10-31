package p;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y170 implements Function0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public y170(z170 z170Var, c270 c270Var) {
        this.a = (byte) 0;
        this.c = z170Var;
        this.b = c270Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws i9n {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                z170 z170Var = (z170) obj;
                c270 c270Var = (c270) obj2;
                try {
                    if (!c270Var.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (c270Var.a(false, this)) {
                    }
                    z170Var.a(1, 9, null);
                    w4n1.b(c270Var);
                    return rih1.a;
                } catch (IOException e) {
                    z170Var.a(2, 2, e);
                } catch (Throwable th) {
                    z170Var.a(3, 3, null);
                    w4n1.b(c270Var);
                    throw th;
                }
                break;
            case 1:
                bla0 bla0Var = (bla0) obj2;
                yka0 yka0Var = (yka0) obj;
                if (oed1.a()) {
                    Metadata metadata = (Metadata) bla0Var.b.getAnnotation(Metadata.class);
                    if (metadata == null) {
                        return null;
                    }
                    i6b0 i6b0VarA = p2o1.A(metadata);
                    i6b0 i6b0Var = i6b0VarA instanceof i6b0 ? i6b0VarA : null;
                    if (i6b0Var != null) {
                        return i6b0Var.y();
                    }
                    return null;
                }
                lv30 lv30VarB = yka0Var.b();
                if (!(lv30VarB instanceof lv30)) {
                    wht whtVar = lv30VarB instanceof wht ? (wht) lv30VarB : null;
                    if (whtVar != null) {
                        return eso1.F(whtVar.s0(), whtVar.r0().r(), false, 6);
                    }
                    return null;
                }
                lv30 lv30Var = lv30VarB;
                if (lv30Var.s0() instanceof uv30) {
                    return bs51.m(lv30Var.r0());
                }
                throw new i9n("Unsupported function type kind: " + lv30Var.s0() + " (" + lv30VarB + ')');
            default:
                return ((o241) obj2).a.map(new y1t0((Object) this, (byte) 5)).distinctUntilChanged();
        }
    }

    public /* synthetic */ y170(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
