package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iga0 implements h661 {
    public final idd1 a;

    public iga0(Function0 function0) {
        this.a = new idd1(function0);
    }

    public final h661 a() {
        return (h661) this.a.getValue();
    }

    @Override // p.h661
    public final int c(String str) {
        return a().c(str);
    }

    @Override // p.h661
    public final int d() {
        return a().d();
    }

    @Override // p.h661
    public final String e(int i) {
        return a().e(i);
    }

    @Override // p.h661
    public final List f(int i) {
        return a().f(i);
    }

    @Override // p.h661
    public final h661 g(int i) {
        return a().g(i);
    }

    @Override // p.h661
    public final yoi1 getKind() {
        return a().getKind();
    }

    @Override // p.h661
    public final String h() {
        return a().h();
    }

    @Override // p.h661
    public final boolean i(int i) {
        return a().i(i);
    }
}
