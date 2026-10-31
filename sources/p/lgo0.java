package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lgo0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ugo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lgo0(ugo0 ugo0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ugo0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ugo0 ugo0Var = this.b;
        switch (b) {
            case 0:
                return ((e1l0) obj).e(ugo0Var.b);
            default:
                e1l0 e1l0Var = (e1l0) obj;
                String str = ugo0Var.b;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str)), e1l0Var.a, r6h1.c, System.currentTimeMillis());
        }
    }
}
