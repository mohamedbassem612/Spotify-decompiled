package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y1w extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;
    public final /* synthetic */ a2w c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1w(Consumer consumer, a2w a2wVar, byte b) {
        super(1);
        this.a = b;
        this.b = consumer;
        this.c = a2wVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        a2w a2wVar = this.c;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                d1w d1wVar = (d1w) obj;
                if (d1wVar instanceof c1w) {
                    consumer.accept(new wzv(((c1w) d1wVar).a));
                    return rih1Var;
                }
                if (!(d1wVar instanceof a1w)) {
                    if (d1wVar instanceof b1w) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                r0w r0wVar = a2wVar.e;
                i8h1 i8h1Var = r0wVar.a;
                x6h1 x6h1VarC = r0wVar.b.b.c();
                x6h1VarC.i.add(new a7h1("user_displayname_text", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("user_clear_displayname_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                return rih1Var;
            default:
                consumer.accept(qzv.a);
                r0w r0wVar2 = a2wVar.e;
                i8h1 i8h1Var2 = r0wVar2.a;
                x6h1 x6h1VarC3 = r0wVar2.b.b.c();
                x6h1VarC3.i.add(new a7h1("change_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                String str2 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                return rih1Var;
        }
    }
}
