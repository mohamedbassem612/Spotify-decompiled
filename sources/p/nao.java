package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nao extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nao(bs0 bs0Var, byte b) {
        super(4);
        this.a = b;
        this.b = bs0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        bs0 bs0Var = this.b;
        switch (b) {
            case 0:
                mao maoVar = (mao) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var = maoVar.c;
                lvl0 lvl0Var = new lvl0(new mjl0(new mjl0((urk0) bs0Var.b, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), maoVar.d, (byte) 3);
                int i = maoVar.b;
                Integer numValueOf = Integer.valueOf(i);
                String str = maoVar.a;
                return new awl0(new gwl0(lvl0Var, numValueOf, "crossword", str), Integer.valueOf(i), str);
            default:
                bpb1 bpb1VarB = gio1.b(z6x.a);
                return new oao((Context) obj2, (ViewGroup) obj3, new ne(3, new y0o(bpb1VarB, bs0Var, (byte) 2)), bpb1VarB, (byte) 0);
        }
    }
}
