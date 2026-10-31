package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vxj1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wxj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxj1(wxj1 wxj1Var, byte b) {
        super(3);
        this.a = b;
        this.b = wxj1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        wxj1 wxj1Var = this.b;
        switch (b) {
            case 0:
                wxj1Var.b.invoke();
                return rih1.a;
            default:
                wzj1 wzj1Var = wxj1Var.a;
                String str = ((uxj1) obj).b;
                x6h1 x6h1VarC = wzj1Var.a.b.c();
                x6h1VarC.i.add(new a7h1("download_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("download", 1, Collections.singletonMap("item_to_download", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        }
    }
}
