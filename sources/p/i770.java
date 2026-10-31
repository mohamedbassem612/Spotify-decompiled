package p;

import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class i770 extends f770 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i770(Class cls, byte b) {
        super(EnumSet.noneOf(ix40.class), cls, (byte) 0);
        switch (b) {
            case 1:
                super(EnumSet.of(ix40.c), cls, (byte) 0);
                new jh51();
                break;
            default:
                break;
        }
    }

    @Override // p.f770
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void f(bh51 bh51Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        bh51Var.c = ((id70) y570Var.n()).a.a;
        bh51Var.a();
    }
}
