package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ttv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kvv b;
    public final /* synthetic */ kp5 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ttv(kvv kvvVar, kp5 kp5Var, iu30 iu30Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = kvvVar;
        this.c = kp5Var;
        this.d = iu30Var;
        this.e = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        b7x b7xVar = b7x.a;
        kp5 kp5Var = this.c;
        kvv kvvVar = this.b;
        ven0 ven0Var = this.e;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (!((Boolean) ven0Var.getValue()).booleanValue() && !u890.j(kvvVar.b, str)) {
                    ven0Var.setValue(Boolean.TRUE);
                    zeu zeuVar = (zeu) kp5Var.h;
                    i8h1 i8h1Var = (i8h1) zeuVar.a;
                    g5l0 g5l0Var = (g5l0) zeuVar.c;
                    x6h1 x6h1VarC = g5l0Var.c.c();
                    x6h1VarC.i.add(new a7h1("name_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("rename_playlist", 1, Collections.singletonMap("playlist_to_be_renamed", (String) zeuVar.b)), x6h1VarC.a(), g5l0Var.b, System.currentTimeMillis()), (xj61) null);
                }
                iu30Var.invoke(new xuv(str));
                break;
            default:
                String str2 = (String) obj;
                if (!((Boolean) ven0Var.getValue()).booleanValue() && !u890.j(kvvVar.Y, str2)) {
                    ven0Var.setValue(Boolean.TRUE);
                    zeu zeuVar2 = (zeu) kp5Var.h;
                    i8h1 i8h1Var2 = (i8h1) zeuVar2.a;
                    g5l0 g5l0Var2 = (g5l0) zeuVar2.c;
                    x6h1 x6h1VarC2 = g5l0Var2.c.c();
                    x6h1VarC2.i.add(new a7h1("description_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("set_playlist_description", 1, Collections.singletonMap("playlist_to_change_description_on", (String) zeuVar2.b)), x6h1VarC2.a(), g5l0Var2.b, System.currentTimeMillis()), (xj61) null);
                }
                iu30Var.invoke(new wuv(str2));
                break;
        }
        return rih1Var;
    }
}
