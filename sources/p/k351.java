package p;

import com.spotify.allboarding.allboardingimpl.search.SearchFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k351 implements s151 {
    public final /* synthetic */ SearchFragment a;

    public k351(SearchFragment searchFragment) {
        this.a = searchFragment;
    }

    public final void a() {
        ffe1 ffe1VarZ0 = this.a.Z0();
        i8h1 i8h1Var = (i8h1) ffe1VarZ0.b;
        x6h1 x6h1VarC = ((bqk0) ffe1VarZ0.c).b.c();
        x6h1VarC.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void c(String str) {
        SearchFragment searchFragment = this.a;
        searchFragment.b1().T(str);
        searchFragment.Y1 = true;
    }
}
