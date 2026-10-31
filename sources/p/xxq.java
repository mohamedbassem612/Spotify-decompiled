package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xxq {
    public final j7p a;
    public final yok0 b;
    public final wqk0 c;
    public final idd1 d = new idd1(new z5o(this, (byte) 6));

    public xxq(j7p j7pVar, yok0 yok0Var, wqk0 wqk0Var) {
        this.a = j7pVar;
        this.b = yok0Var;
        this.c = wqk0Var;
    }

    public final i8h1 a() {
        return (i8h1) this.d.getValue();
    }

    public final void b(boolean z, DataSectionType dataSectionType) {
        char c;
        String str;
        int i = wxq.a[dataSectionType.ordinal()];
        if (i == 1) {
            c = 1;
        } else if (i == 2) {
            c = 2;
        } else {
            if (i != 3) {
                eg.o();
                return;
            }
            c = 3;
        }
        mmr0 mmr0Var = z ? new mmr0(wkl0.ENABLED, vkl0.DISABLED) : new mmr0(wkl0.DISABLED, vkl0.ENABLED);
        wkl0 wkl0Var = (wkl0) mmr0Var.a;
        vkl0 vkl0Var = (vkl0) mmr0Var.b;
        i8h1 i8h1VarA = a();
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("data_sections", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        if (c == 1) {
            str = "account_data";
        } else if (c == 2) {
            str = "extended_streaming_history";
        } else {
            if (c != 3) {
                throw null;
            }
            str = "technical_log_information";
        }
        x6h1VarC2.i.add(new a7h1("data_section_select_toggle", str, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", wkl0Var.a), new mmr0("state_after_toggle", vkl0Var.a)})), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void c() {
        i8h1 i8h1VarA = a();
        wqk0 wqk0Var = this.c;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void d() {
        i8h1 i8h1VarA = a();
        wqk0 wqk0Var = this.c;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
    }
}
