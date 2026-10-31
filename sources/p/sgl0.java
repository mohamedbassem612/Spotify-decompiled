package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sgl0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ jpk0 c;

    public sgl0(jpk0 jpk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = jpk0Var;
                x6h1 x6h1VarC = jpk0Var.b.c();
                x6h1VarC.i.add(new a7h1("pause_resume_action", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 2:
                this.c = jpk0Var;
                x6h1 x6h1VarC2 = jpk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("seek_forward_action", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            case 3:
                this.c = jpk0Var;
                x6h1 x6h1VarC3 = jpk0Var.b.c();
                x6h1VarC3.i.add(new a7h1("skip_next_action", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
            case 4:
                this.c = jpk0Var;
                x6h1 x6h1VarC4 = jpk0Var.b.c();
                x6h1VarC4.i.add(new a7h1("skip_prev_action", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                this.b = x6h1VarC4.a();
                break;
            default:
                this.c = jpk0Var;
                x6h1 x6h1VarC5 = jpk0Var.b.c();
                x6h1VarC5.i.add(new a7h1("heart_action", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                this.b = x6h1VarC5.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        jpk0 jpk0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = jpk0Var.c.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = jpk0Var.c.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
            case 2:
                r6h1 r6h1Var5 = r6h1.c;
                r6h1 r6h1Var6 = jpk0Var.c.b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var6.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var6.b);
            case 3:
                r6h1 r6h1Var7 = r6h1.c;
                r6h1 r6h1Var8 = jpk0Var.c.b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var8.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var8.b);
            default:
                r6h1 r6h1Var9 = r6h1.c;
                r6h1 r6h1Var10 = jpk0Var.c.b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(r6h1Var10.a);
                arrayList5.add(y6h1Var);
                return new r6h1(arrayList5, r6h1Var10.b);
        }
    }

    public w7h1 e(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str)), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public w7h1 h(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str)), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public w7h1 i(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str)), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public w7h1 j(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str)), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public w7h1 k(Integer num) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public w7h1 l(Integer num, String str, Integer num2) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(num2.intValue());
        return new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public w7h1 m(Integer num, String str, Integer num2) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(num2.intValue());
        return new w7h1("", "", z7h1Var, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), this.b, this.c.c.b, System.currentTimeMillis());
    }
}
