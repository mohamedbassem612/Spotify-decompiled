package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tal0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ bbl0 c;

    public tal0(bbl0 bbl0Var, String str, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.c = bbl0Var;
                x6h1 x6h1VarC = bbl0Var.b.c();
                x6h1VarC.i.add(new a7h1("join_session_failed_full_popup", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            case 3:
                this.c = bbl0Var;
                x6h1 x6h1VarC2 = bbl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("join_session_failed_generic_popup", str, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
            case 4:
                this.c = bbl0Var;
                x6h1 x6h1VarC3 = bbl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("you_were_kicked_popup", str, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                this.b = x6h1VarC3.a();
                break;
            default:
                this.c = bbl0Var;
                x6h1 x6h1VarC4 = bbl0Var.b.c();
                x6h1VarC4.i.add(new a7h1("host_ended_session_popup", str, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                this.b = x6h1VarC4.a();
                break;
        }
    }

    public w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.b, this.c.a, System.currentTimeMillis());
    }

    public final r6h1 b() {
        byte b = this.a;
        bbl0 bbl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = bbl0Var.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = bbl0Var.a;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
            case 2:
                r6h1 r6h1Var5 = r6h1.c;
                r6h1 r6h1Var6 = bbl0Var.a;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var6.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var6.b);
            case 3:
                r6h1 r6h1Var7 = r6h1.c;
                r6h1 r6h1Var8 = bbl0Var.a;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var8.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var8.b);
            default:
                r6h1 r6h1Var9 = r6h1.c;
                r6h1 r6h1Var10 = bbl0Var.a;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(r6h1Var10.a);
                arrayList5.add(y6h1Var);
                return new r6h1(arrayList5, r6h1Var10.b);
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        bbl0 bbl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).b = bbl0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).b = bbl0Var.a;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 2:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).b = bbl0Var.a;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var3.a();
            case 3:
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1Var;
                ((xjn) k7h1Var4).b = bbl0Var.a;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            default:
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1Var;
                ((xjn) k7h1Var5).b = bbl0Var.a;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var5.a();
        }
    }

    public xal0 h() {
        return new xal0(this, (byte) 0);
    }

    public yal0 i() {
        return new yal0(this, (byte) 0);
    }

    public abl0 j() {
        return new abl0(this, (byte) 0);
    }

    public ual0 k() {
        return new ual0(this, (byte) 0);
    }

    public ual0 l() {
        return new ual0(this, (byte) 1);
    }

    public xal0 m() {
        return new xal0(this, (byte) 1);
    }

    public yal0 n() {
        return new yal0(this, (byte) 1);
    }

    public abl0 o() {
        return new abl0(this, (byte) 1);
    }

    public tal0(bbl0 bbl0Var) {
        this.a = (byte) 0;
        this.c = bbl0Var;
        x6h1 x6h1VarC = bbl0Var.b.c();
        x6h1VarC.i.add(new a7h1("host_approved_request_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }
}
