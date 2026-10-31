package p;

import com.spotify.wrapped.v1.proto.ConsumerShareRequestParameters;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mec implements eec {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rec b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mec(rec recVar, String str, Object obj, byte b) {
        this.a = b;
        this.b = recVar;
        this.c = str;
        this.d = obj;
    }

    @Override // p.eec
    public final void a() {
        byte b = this.a;
        Object obj = this.d;
        b7x b7xVar = b7x.a;
        String str = this.c;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                rec recVar = this.b;
                o0i o0iVar = (o0i) recVar.e.c.getValue();
                if (o0iVar != null) {
                    mub mubVar = recVar.d;
                    hp80 hp80Var = o0iVar.e;
                    str2.getClass();
                    i8h1 i8h1Var = mubVar.c;
                    opl0 opl0VarA = mubVar.a(str, hp80Var);
                    x6h1 x6h1VarC = opl0VarA.c.c();
                    x6h1VarC.i.add(new a7h1("center_button", "like", (Integer) null, (String) null, "not_saved"));
                    x6h1VarC.j = true;
                    fn31.T(o0iVar.a, (o8n) null, 0, new sxa(recVar, str2, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str2)), x6h1VarC.a(), opl0VarA.b, System.currentTimeMillis()), (xj61) null), (lnm) null, (byte) 9), 3);
                    break;
                }
                break;
            default:
                rec recVar2 = this.b;
                mub mubVar2 = recVar2.d;
                hp80 hp80VarB = recVar2.b();
                i8h1 i8h1Var2 = mubVar2.c;
                opl0 opl0VarA2 = mubVar2.a(str, hp80VarB);
                x6h1 x6h1VarC2 = opl0VarA2.c.c();
                x6h1VarC2.i.add(new a7h1("center_button", "share", (Integer) null, (String) null, "not_saved"));
                x6h1VarC2.j = true;
                tv80 tv80VarM = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), opl0VarA2.b, System.currentTimeMillis()), (xj61) null);
                q8m1 q8m1Var = (q8m1) obj;
                q8m1Var.e.invoke();
                recVar2.b.n(2, q8m1Var.a, q8m1Var.b, (ConsumerShareRequestParameters) null, q8m1Var.d, tv80VarM);
                break;
        }
    }
}
